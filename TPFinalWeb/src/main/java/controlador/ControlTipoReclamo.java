package controlador;

import controladorJPA.TipoReclamoJpaController;
import java.util.ArrayList;
import java.util.List;
import modelo.TipoReclamo;

public class ControlTipoReclamo {
    
    private ControlSistema controlSistema;
    private TipoReclamoJpaController jpaControl = new TipoReclamoJpaController();
    private String mensaje="";
    
    public ControlTipoReclamo(ControlSistema controlSistema){
        this.controlSistema = controlSistema;
    }
    
    /*Recuperar lista de los tipos de reclamos posibles, como lista de String*/
    public List<String> getListaTiposReclamos (){
        List<String> listaTiposReclamos = new ArrayList();
        List<TipoReclamo> tiposReclamos = new ArrayList(controlSistema.getmSistema().getTiposReclamos());
        for(TipoReclamo tr: tiposReclamos){
            listaTiposReclamos.add(tr.getDescripcion());
        }
        return listaTiposReclamos;
    }
    
    public TipoReclamo getTipoReclamo(String descripcion){
        TipoReclamo resultado= null;
        List<TipoReclamo> tiposReclamos = new ArrayList(controlSistema.getmSistema().getTiposReclamos());
        for(TipoReclamo tr: tiposReclamos){
            if(tr.getDescripcion().equalsIgnoreCase(descripcion)){
                resultado=tr;
            }
        }
        return resultado;
    }
    
}
