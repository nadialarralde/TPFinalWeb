package controlador;

import controladorJPA.ReclamoJpaController;
import exception.Notificaciones;
import modelo.Reclamo;
import modelo.Cliente;
import modelo.Servicio;
import modelo.TipoReclamo;
import modelo.Historial;
import modelo.Empleado;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import modelo.Estado;

public class ControlReclamo {
    
    private ControlSistema controlSistema;
    private ReclamoJpaController jpaControl = new ReclamoJpaController();
    private String mensaje="";
    
    public ControlReclamo(ControlSistema controlSistema){
        this.controlSistema = controlSistema;
    }
    
    public String nuevoReclamo(Cliente cliente, Servicio servicio, String descripcion,
            String urgencia, Empleado empleadoRegistro, Historial historial, TipoReclamo tipoReclamo)throws Notificaciones{
        Reclamo nuevoReclamo = null;
        Timestamp fecha = new Timestamp(System.currentTimeMillis());
        nuevoReclamo = new Reclamo(cliente, servicio, descripcion, urgencia, fecha, empleadoRegistro, historial, tipoReclamo);
        if(nuevoReclamo==null){
            throw new Notificaciones("Error en la creacion del nuevo reclamo, por favor intente denuevo.");
        }
        insertarReclamo(nuevoReclamo);
        this.controlSistema.getmSistema().getReclamos().add(nuevoReclamo);
        this.mensaje= "El reclamo ha sido generado exitosamente. El codigo es: " + Integer.toString(nuevoReclamo.getIdReclamo()) + ".";
        return mensaje;
    }
    
    
    public boolean existeReclamo(int idReclamo){
        boolean existe=false;
        List<Reclamo> listaReclamos = new ArrayList<>(controlSistema.getmSistema().getReclamos());
        for(Reclamo r: listaReclamos){
            if(idReclamo==r.getIdReclamo()){
                existe=true;
            }
        }
        return existe;
    }
    
    public Reclamo getReclamo(int idReclamo){
        Reclamo reclamo=null;
        List<Reclamo> listaReclamos = new ArrayList<>(controlSistema.getmSistema().getReclamos());
        for(Reclamo r: listaReclamos){
            if(idReclamo==r.getIdReclamo()){
                reclamo=r;
            }
        }
        return reclamo;
    }
    
    
     /*  - - - - - Manejo de JPA - - - - -   */
    public String insertarReclamo(Reclamo reclamo) {
		try {
			jpaControl.create(reclamo);
			mensaje = "Reclamo agregado correctamente.";
		}
		catch (Exception e) {
			System.out.println("Mensaje en guardar: " + e.getMessage());
			mensaje = "Error al almacenar el Reclamo.";
		}
		return mensaje;
    }
    
    public String actualizarReclamo(Reclamo reclamo) {
        try {
			jpaControl.edit(reclamo);
			mensaje = "Reclamo actualizado correctamente.";
		}
		catch (Exception e) {
			System.out.println("Mensaje en actualizar: " + e.getMessage());
			mensaje = "Error al actualizar el Reclamo.";
		}
		return mensaje;
    }
    
    public String eliminarReclamo(Reclamo reclamo) {
    	try
        {
            jpaControl.destroy(reclamo.getIdReclamo());
            mensaje = "Reclamo eliminado correctamente";
        }
        catch (Exception e) {
            System.out.println("Mensaje en eliminar: " + e.getMessage());
            mensaje = "Error al eliminar el Reclamo.";
        }
        return mensaje;
    }
    
    
    //Listar empleados**********************************************************************************************
        public List<Integer> listarEmpleados() {
        List<Integer> dniEmpleados=new ArrayList<>();
        List<Empleado> empleados=controlSistema.getmSistema().getEmpleados();
        for(Empleado e:empleados){
            dniEmpleados.add(e.getDni());
        }
        return dniEmpleados;
    }
        
    //Buscar reclamos pendientes de un empleado*********************************************************************
        public List<String> reclamosPendientes(int dniEmpleado){
            int ultimoEmpleado;
            List<Reclamo> reclamosPendientes=new ArrayList<>();
            List<Reclamo>reclamos=jpaControl.reclamosOrdenadosFecha();
            for(Reclamo e:reclamos){
                ultimoEmpleado=Integer.parseInt(e.getHistorial().getEmpleadosAsignados().get(e.getHistorial().getEmpleadosAsignados().size()-1).substring(2, 10));
                if(dniEmpleado==ultimoEmpleado ){  /*&& !e.getHistorial().getEstado().getDescripcion().equalsIgnoreCase("finalizado")*/
                    reclamosPendientes.add(e);
                }
            }
            return reclamosPendientes;
        }
}
