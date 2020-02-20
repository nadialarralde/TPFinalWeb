package controlador;

import controladorJPA.ContactoJpaController;

public class ControlContacto {
    
    private ControlSistema controlSistema;
    private ContactoJpaController jpaControl = new ContactoJpaController();
    private String mensaje="";
    
    public ControlContacto(ControlSistema controlSistema){
        this.controlSistema = controlSistema;
    }
    
}
