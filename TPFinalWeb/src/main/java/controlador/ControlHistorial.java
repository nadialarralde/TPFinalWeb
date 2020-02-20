package controlador;

import controladorJPA.HistorialJpaController;
import modelo.Estado;
import modelo.Historial;
import exception.Notificaciones;
import java.util.ArrayList;
import java.util.List;
import modelo.Reclamo;

public class ControlHistorial {
    
    private ControlSistema controlSistema;
    private HistorialJpaController jpaControl = new HistorialJpaController();
    private String mensaje="";
    
    public ControlHistorial(ControlSistema controlSistema){
        this.controlSistema = controlSistema;
    }
    
    public Historial agregarHistorial(String empleadoAsignado, String descripcion, Estado estado)throws Notificaciones{
        Historial nuevoHistorial= null;
        nuevoHistorial= new Historial(empleadoAsignado, descripcion, estado);
        if(nuevoHistorial==null){
            throw new Notificaciones("Error en la creacion del nuevo reclamo(historial), por favor intente denuevo.");
        }
        insertarHistorial(nuevoHistorial);
        this.controlSistema.getmSistema().getHistoriales().add(nuevoHistorial);
        return nuevoHistorial;
    }
    
    public String finalizarReclamo(int idReclamo, String descripcion, Estado estado)throws Notificaciones{
        Reclamo actualizar=null;
        List<Reclamo> listaReclamos = new ArrayList<>(controlSistema.getmSistema().getReclamos());
        for(Reclamo r: listaReclamos){
            if(idReclamo==r.getIdReclamo()){
                actualizar = r;
            }
        }
        if (actualizar==null){
            throw new Notificaciones("ESTO NO DEBERIA PASAR.");
        }
        int indexReclamo= listaReclamos.indexOf(actualizar);
       
        descripcion= actualizar.getHistorial().getDescripcion() + descripcion;
        controlSistema.getmSistema().getReclamos().get(indexReclamo).getHistorial().setDescripcion(descripcion);
        controlSistema.getmSistema().getReclamos().get(indexReclamo).getHistorial().setEstado(estado);
        actualizarHistorial(controlSistema.getmSistema().getReclamos().get(indexReclamo).getHistorial());
        return "El reclamo ha finalizado correctamente.";
    }
    

    
    
    
    
    
    /*  - - - - - Manejo de JPA - - - - -   */
    public String insertarHistorial(Historial historial) {
		try {
			jpaControl.create(historial);
			mensaje = "Historial agregado correctamente.";
		}
		catch (Exception e) {
			System.out.println("Mensaje en guardar: " + e.getMessage());
			mensaje = "Error al almacenar el Historial.";
		}
		return mensaje;
    }
    
    public String actualizarHistorial(Historial historial) {
        try {
            jpaControl.edit(historial);
            mensaje = "Historial actualizado correctamente.";
		}
	catch (Exception e) {
            System.out.println("Mensaje en actualizar: " + e.getMessage());
            mensaje = "Error al actualizar el Historial.";
	}
	return mensaje;
    }
    
    public String eliminarHistorial(Historial historial) {
    	try
        {
            jpaControl.destroy(historial.getIdHistorial());
            mensaje = "Historial eliminado correctamente";
        }
        catch (Exception e) {
            System.out.println("Mensaje en eliminar: " + e.getMessage());
            mensaje = "Error al eliminar el Historial.";
        }
        return mensaje;
    }
}
