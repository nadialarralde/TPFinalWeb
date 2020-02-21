package controlador;

import controladorJPA.ClienteJpaController;
import modelo.Cliente;
import java.util.List;
import java.util.ArrayList;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import modelo.Reclamo;
import modelo.Sistema;

@ManagedBean(name="cliente_controller")
@RequestScoped
public class ControlCliente {
    
    private ControlSistema controlSistema;
    private ClienteJpaController jpaControl = new ClienteJpaController();
    private String mensaje="";
    private List<Reclamo> reclamosCliente= new ArrayList<>();
    
    public ControlCliente(ControlSistema controlSistema){
        this.controlSistema = controlSistema;
    }
    
    public ControlCliente() {
    	   Sistema sistema = new Sistema("2.0", "Sist. de Informacion de Telecomunicaciones S.A.");
        this.controlSistema =  new ControlSistema(sistema);
    }
    
    //Consulta de todos los reclamos de un cliente*********************************************************************
    
    public void listarReclamos(String stringDniCliente){
        int dniCliente= Integer.parseInt(stringDniCliente);
        //List<Integer> numerosReclamo=new ArrayList<>();
        boolean existeCliente=false;
        List<Reclamo> lista=new ArrayList<>();
        List<Reclamo> reclamos=controlSistema.getmSistema().getReclamos();
        for(Reclamo e:reclamos) {
            if(e.getCliente().getDni() == dniCliente){
                if(!existeCliente){
                    existeCliente=true;
                }
                lista.add(e);
            }
        }
        
        if (!existeCliente) {
    		FacesContext.getCurrentInstance().addMessage(
  					"form:dni",
  					new FacesMessage(FacesMessage.SEVERITY_WARN,
  							"Cliente inexistente",
  							"Ingrese el dni nuevamente")
  			);
                
    	}else if (lista.isEmpty()) {
    		FacesContext.getCurrentInstance().addMessage(
  					null,
  					new FacesMessage(FacesMessage.SEVERITY_WARN,
  							"El cliente no posee reclamos",
  							"")
  			);
                
    	}else{
                   this.reclamosCliente=lista;
        }
    }
    
    
    public List<Reclamo> getListaReclamos(){
        return this.reclamosCliente;
    }
    
    
    //Recuperar instancia de Cliente***********************************************************************************
    
    public Cliente getCliente(int dni){
        Cliente clienteBuscado = null;
        List<Cliente> listaClientes = new ArrayList<>(controlSistema.getmSistema().getClientes());
        for(Cliente c: listaClientes){
            if(c.getDni()== dni){
                clienteBuscado = c;
            }
        }
        return clienteBuscado;
    }
     /*  - - - - - Manejo de JPA - - - - -   */
    public String insertarCliente(Cliente cliente) {
		try {
			jpaControl.create(cliente);
			mensaje = "Cliente agregado correctamente.";
		}
		catch (Exception e) {
			System.out.println("Mensaje en guardar: " + e.getMessage());
			mensaje = "Error al almacenar el Cliente.";
		}
		return mensaje;
    }
    
    public String actualizarCliente(Cliente cliente) {
        try {
			jpaControl.edit(cliente);
			mensaje = "Cliente actualizado correctamente.";
		}
		catch (Exception e) {
			System.out.println("Mensaje en actualizar: " + e.getMessage());
			mensaje = "Error al actualizar el Cliente.";
		}
		return mensaje;
    }
    
    public String eliminarCliente(Cliente cliente) {
    	try
        {
            jpaControl.destroy(cliente.getDni());
            mensaje = "Cliente eliminado correctamente";
        }
        catch (Exception e) {
            System.out.println("Mensaje en eliminar: " + e.getMessage());
            mensaje = "Error al eliminar el Cliente";
        }
        return mensaje;
    }
}
