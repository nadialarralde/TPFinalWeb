package controlador;

import controladorJPA.ServicioJpaController;
import java.util.List;
import java.util.ArrayList;
import modelo.Servicio;

public class ControlServicio {
    
    private ControlSistema controlSistema;
    private ServicioJpaController jpaControl = new ServicioJpaController();
    private String mensaje="";
    
    public ControlServicio(ControlSistema controlSistema){
        this.controlSistema = controlSistema;
    }
    
    public Servicio getServicio(String descripcion){
        Servicio resultado= null;
        List<Servicio> tiposServicios = new ArrayList(controlSistema.getmSistema().getServicios());
        for(Servicio s: tiposServicios){
            if(s.getDescripcion().equalsIgnoreCase(descripcion)){
                resultado=s;
            }
        }
        return resultado;
    }
    
}
