package controlador;

import controladorJPA.EstadoJpaController;
import modelo.Estado;
import java.util.List;
import java.util.ArrayList;

public class ControlEstado {
    
    private ControlSistema controlSistema;
    private EstadoJpaController jpaControl = new EstadoJpaController();
    private String mensaje="";
    
    public ControlEstado(ControlSistema controlSistema){
        this.controlSistema = controlSistema;
    }
    
    public Estado getEstado(String descripcion){
        Estado resultado= null;
        List<Estado> tiposEstados = new ArrayList(controlSistema.getmSistema().getEstados());
        for(Estado e: tiposEstados){
            if(e.getDescripcion().equalsIgnoreCase(descripcion)){
                resultado=e;
            }
        }
        return resultado;
    }
}
