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
    
    private List<Integer> listarReclamos(int dniCliente){
        List<Integer> numerosReclamo=new ArrayList<>();
        List<Reclamo> reclamos=controlSistema.getmSistema().getReclamos();
        for(Reclamo e:reclamos) {
            if(e.getCliente().getDni() == dniCliente){
                numerosReclamo.add(e.getIdReclamo());
            }
        }
        return numerosReclamo;
    }
    
    //Enviar todos los datos de un reclamo*****************************************************************************
    
     private List<String> datosReclamo(int numeroReclamo){
        List<String>datos=new ArrayList<>();
        List<Reclamo> reclamos=controlSistema.getmSistema().getReclamos();
        for(Reclamo e:reclamos) {
            if(e.getIdReclamo()== numeroReclamo){
                datos.add("Numero Reclamo:"+String.valueOf(numeroReclamo));
                datos.add("Servicio:"+e.getServicio().getDescripcion());
                datos.add("Descripcion:"+e.getDescripcion());
                datos.add("urgencia:"+e.getUrgencia());
                datos.add("Fecha:"+e.getFecha().toString());
                datos.add("Empelado Registro:"+e.getEmpleadoRegistro().getNombre());
                datos.add("Estado:"+e.getHistorial().getEstado().getDescripcion());
                datos.add("Tipo Reclamo:"+e.getTipoReclamo().getDescripcion());
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
