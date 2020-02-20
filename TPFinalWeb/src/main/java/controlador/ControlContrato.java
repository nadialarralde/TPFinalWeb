package controlador;

import controladorJPA.ContratoJpaController;
import exception.Notificaciones;
import java.util.ArrayList;
import java.util.List;
import modelo.Cliente;
import modelo.Servicio;

public class ControlContrato {
    
    private ControlSistema controlSistema;
    private ContratoJpaController jpaControl = new ContratoJpaController();
    private String mensaje="";
    
    public ControlContrato(ControlSistema controlSistema){
        this.controlSistema = controlSistema;
    }
    
    
    
    
    /* Recuperar lista de tipos de servicio contratados por un cliente, como lista de String para la vista */
    public List<String> listarServicio(int dniCliente) throws Notificaciones{
        List<String> listaServicios = new ArrayList();
        Cliente cliente = controlSistema.getControlCliente().getCliente(dniCliente);
        if(cliente != null){
            
            for(Servicio s: cliente.getContrato().getServicio()){
                listaServicios.add(s.getDescripcion());
            }
        }
        else{
            mensaje = "No se ha encontrado al cliente.";
            throw new Notificaciones(mensaje);
        }
        
        if(listaServicios.isEmpty()){
                mensaje = "El cliente no posee servicios contratados.";
                throw new Notificaciones(mensaje);
        }
        
        return listaServicios;
    }
    
}
