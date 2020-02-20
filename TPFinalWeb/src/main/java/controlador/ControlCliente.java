package controlador;

import controladorJPA.ClienteJpaController;
import modelo.Cliente;
import java.util.List;
import java.util.ArrayList;
import modelo.Reclamo;

public class ControlCliente {
    
    private ControlSistema controlSistema;
    private ClienteJpaController jpaControl = new ClienteJpaController();
    private String mensaje="";
    
    public ControlCliente(ControlSistema controlSistema){
        this.controlSistema = controlSistema;
    }
    //Consulta de todos los reclamos de un cliente*********************************************************************
    
    public List<Reclamo> listarReclamos(int dniCliente){
        List<Integer> numerosReclamo=new ArrayList<>();
        List<Reclamo> reclamos=controlSistema.getmSistema().getReclamos();
        for(Reclamo e:reclamos) {
            if(e.getCliente().getDni() == dniCliente){
                numerosReclamo.add(e.getIdReclamo());
            }
        }
        List<Reclamo> lista=datosReclamo(numerosReclamo);
        return lista;
    }
    
    //Enviar todos los datos de un reclamo*****************************************************************************
    
     public List<Reclamo> datosReclamo(List<Integer> numerosReclamo){
        List<Reclamo>datos=new ArrayList<>();
        List<Reclamo> reclamos=controlSistema.getmSistema().getReclamos();
        for(Integer a:numerosReclamo){
            for(Reclamo e:reclamos) {
                if(e.getIdReclamo()== a){
                    datos.add(e);
                }
            }
        }
        return datos;
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
