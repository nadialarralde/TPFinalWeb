package controlador;

import controladorJPA.EmpleadoJpaController;
import exception.Notificaciones;
import java.util.ArrayList;
import java.util.List;
import modelo.Empleado;
import modelo.Historial;
import modelo.Reclamo;
import modelo.TipoReclamo;


public class ControlEmpleado {
    
    private ControlSistema controlSistema;
    private String mensaje  = "";
    private EmpleadoJpaController jpaControl = new EmpleadoJpaController();
   
    
    public ControlEmpleado(ControlSistema controlSistema){
        this.controlSistema = controlSistema;
    }
    
    //Asignacion de empelado en base  a la urgencia **********************************************************************
    public String asignarEmpleado(String urgencia ,String tipoReclamo ){
        List<Historial> list=controlSistema.getmSistema().getHistoriales();
        int aux1=0 ,aux2 = 0, cont1=0 , cont2=0 ;
        if(urgencia.equalsIgnoreCase("urgente")){
         List<Integer> ultimos=new ArrayList<>();
         list.forEach((e) -> {
            ultimos.add(Integer.parseInt(e.getEmpleadosAsignados().get(e.getEmpleadosAsignados().size()-1).substring(2, 10 )));
        });
         List<Integer> ultimosExpertos=seleccionExpertos(tipoReclamo , ultimos);
         for(int e:ultimosExpertos){
                if(cont1 == 0){
                    aux1 = e;
                }else if(cont2 == 0){
                    aux2=e;
                    }else if(cont1 <= cont2){
                        aux2=e;
                        cont2=0;
                        }else{
                        aux1=aux2;
                        cont1=cont2;
                        aux2=e;
                        cont2=0; 
                        }
                for(int a:ultimos){
                    if(aux2 == 0){
                        if(aux1 == a){
                            cont1++;
                        }
                    }else{
                        if(aux2 == a){
                            cont2++;
                        }
                    }
                }
        }
        }else{
            List<String> todos=new ArrayList<>();
            List<Integer> todosInt=new ArrayList<>();
            list.forEach((e) -> {
                todos.addAll(e.getEmpleadosAsignados());
            });
            todos.forEach((a)  ->{
                todosInt.add(Integer.parseInt(a.substring(2, 10)));
            });
            List<Integer> todosExpertos=seleccionExpertos(tipoReclamo , todosInt);
            for(int e:todosExpertos){
                if(cont1 == 0){
                    aux1 = e;
                }else if(cont2 == 0){
                    aux2=e;
                    }else if(cont1 >= cont2){
                        aux2=e;
                        cont2=0;
                        }else{
                        aux1=aux2;
                        cont1=cont2;
                        aux2=e;
                        cont2=0; 
                        }
                for(int a:todosInt){
                    if(aux2 == 0){
                        if(aux1 == a){
                            cont1++;
                        }
                    }else{
                        if(aux2 == a){
                            cont2++;
                        }
                    }
                }
            }
        }
        
        String empleadoAsignar ="1-"+aux1;
        return empleadoAsignar;
    }
    
    
    
    //Filtar solo los expertos para finalizacion empeleado**********************************************************
    public List<Integer> seleccionExpertos(String tipoReclamo, List<Integer> ultimos) {
        List<Integer> expertos=new ArrayList<>();
        List<Empleado> empleados=controlSistema.getmSistema().getEmpleados();
        ultimos.forEach((e) -> {
            empleados.forEach((a)->{
                if(e == a.getDni()){
                    a.getTipoReclamo().forEach((i)->{
                        if(tipoReclamo.equalsIgnoreCase(i.getDescripcion())){
                            expertos.add(e);
                        }
                    });
                }
            });
        });
        return expertos;
    }
    
    //Obtencion del orden del historial de empelados asignados en un historial****************************************
    public int transferirReclamoOrden(int numeroReclamo )throws Notificaciones{
        List<Reclamo> reclamos=controlSistema.getmSistema().getReclamos();
        Historial unHistorial = null;
        int aux ;
        for(Reclamo e:reclamos) {
            if(e.getIdReclamo() == numeroReclamo){
                unHistorial=e.getHistorial();
            }
        }
        if(unHistorial==null){
            throw new Notificaciones("No existe el reclamo a buscar.");
        }
        aux=Integer.parseInt(unHistorial.getEmpleadosAsignados().get(unHistorial.getEmpleadosAsignados().size()-1).substring(0, 1 ));
        aux++;
        return aux;
    }
    //Filtracion de expertos disponibles para transferir***********************************************************
    public List<Integer> expertosTransferir(int idTipo){
        List<Integer> expertos=new ArrayList<>();
        List<Empleado> empleados=controlSistema.getmSistema().getEmpleados();
        empleados.forEach((a)->{
                    a.getTipoReclamo().forEach((i)->{
                        if(idTipo==(i.getIdTipo())){
                            expertos.add(a.getDni());
                        }
                    });
            });
        return expertos;
    }
    //Obtencion de la lista de expertos para tranferir el reclamo***************************************************
        public List<Integer> transferirReclamoLista(int numeroReclamo )throws Notificaciones{
        List<Reclamo> reclamos=controlSistema.getmSistema().getReclamos();
        TipoReclamo tReclamo = null;
        int idTReclamo;
        for(Reclamo e:reclamos) {
            if(e.getIdReclamo() == numeroReclamo){
                tReclamo=e.getTipoReclamo();
            }
        }
        if(tReclamo==null){
            throw new Notificaciones("No existe el reclamo a buscar.");
        }
        idTReclamo=tReclamo.getIdTipo();
        List<Integer> expertos=expertosTransferir(idTReclamo);
        if(expertos.isEmpty()){
            throw new Notificaciones("No existen expertos para este tipo de reclamo. (NO DEBERIA PASAR ESTO!)");
        }
        return expertos;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    //MANEJO DE JPA***************************************************************************************************
    
    public String insertarEmpleado(Empleado empleado) {
        try {
            jpaControl.create(empleado);
            mensaje = "Reclamo agregado correctamente.";
        }
        catch (Exception e) {
            System.out.println("Mensaje en guardar: " + e.getMessage());
            mensaje = "Error al almacenar el reclamo.";
        }
        return mensaje;
    }
    
    public String actualizarEmpleado(Empleado empleado) {
        try {
            jpaControl.edit(empleado);
            mensaje = "Reclamo actualizado correctamente.";
        }
        catch (Exception e) {
            System.out.println("Mensaje en actualizar: " + e.getMessage());
            mensaje = "Error al actualizar el reclamo.";
        }
        return mensaje;
    }
    
    public String eliminarEmpleado(Empleado empleado) {
        try {
            jpaControl.destroy(empleado.getDni());
            mensaje = "Reclamo eliminado correctamente";
        }
        catch (Exception e) {
            System.out.println("Mensaje en eliminar: " + e.getMessage());
            mensaje = "Error al eliminar el reclamo";
        }
        return mensaje;
    }


    
}
