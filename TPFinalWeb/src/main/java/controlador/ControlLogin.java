/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import exception.Notificaciones;
import java.util.ArrayList;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import modelo.Empleado;
import modelo.Sistema;

@ManagedBean(name="login_controller")
@SessionScoped
public class ControlLogin {
    
    private ControlSistema controlSistema;
    
    public ControlLogin(ControlSistema controlSistema){
        this.controlSistema = controlSistema;
    }
    
    public ControlLogin() {
    	   Sistema sistema = new Sistema("2.0", "Sist. de Informacion de Telecomunicaciones S.A.");
        this.controlSistema =  new ControlSistema(sistema);
		
    }
    
    /*Retorna la instancia del empleado que se esta loggeando*/
    public Empleado getEmpleadoLogin(String usuario, String clave) throws Notificaciones {
        Empleado empleadoLogin = null;
        boolean camposIngresados = this.comprobacionCampos(usuario, clave);
        
        if(camposIngresados){     //si los campos no se encuentran vacios
            empleadoLogin = comprobarCredenciales(usuario, clave);
        }
        return empleadoLogin;
    }
    
    /*Comprobar que se haya ingresado datos en los campos usuario y clave*/
    private boolean comprobacionCampos(String usuario, String clave) throws Notificaciones{
        boolean resultado = false;
        
        if(usuario.isBlank() || clave.isBlank()){
            throw new Notificaciones("Ingrese el usuario y clave para poder continuar");
        }
        else {
        	resultado = true;
        }
        
        return resultado;
    }
    
    /*Comprobar que existe el usuario ingresado. Si existe devuelve su instancia*/
    private Empleado comprobarCredenciales(String usuario, String clave) throws Notificaciones{
        Empleado empleadoSesion = null;
        boolean existe = false;
        String mensaje = "";
        
        List<Empleado> listaEmpleados = new ArrayList(this.controlSistema.getmSistema().getEmpleados());
        
        for(Empleado e: listaEmpleados){
            
            if(e.getUsuario().equalsIgnoreCase(usuario)){
                existe = true;
                
                /*Si se encuentra al usuario, se comprueba su clave*/
                if(e.getContraseña().equalsIgnoreCase(clave)){
                    empleadoSesion = e;
                    break;
                }
                else{
                    mensaje = "La clave ingresada es incorrecta.";
                    throw new Notificaciones(mensaje);
                }
            }
        }
        
        if(!existe){
            mensaje = "Nombre de usuario inexistente.";
            throw new Notificaciones(mensaje);
        }
            
        return empleadoSesion;
    }
    
    
    
    
    
    
    
    
    
    //validate login
  	public String validarLoginAdministrador(String usuario, String clave) {
  		boolean valid = false;
  		HttpSession session = null;
  		for (Empleado empleado : this.controlSistema.getmSistema().getEmpleados()) {
  			if (empleado.getUsuario().equals(usuario)) {
  				if (!empleado.getContraseña().equals(clave)) {
  					break;
  				}
  				session = getSession();
  				valid = true;
  			}
  		}
  		
  		if (valid) {
  			session.setAttribute("usuario", usuario);
  			return "menu_principal";
  		} else {
  			FacesContext.getCurrentInstance().addMessage(
  					null,
  					new FacesMessage(FacesMessage.SEVERITY_WARN,
  							"Incorrect Username and Passowrd",
  							"Please enter correct username and Password")
  					);
  			return "login";
  		}
  	}
    
    
    public static HttpSession getSession() {
		return (HttpSession) FacesContext.getCurrentInstance()
				.getExternalContext().getSession(false);
	}

	public static HttpServletRequest getRequest() {
		return (HttpServletRequest) FacesContext.getCurrentInstance()
				.getExternalContext().getRequest();
	}

	public static String getUserName() {
		HttpSession session = (HttpSession) FacesContext.getCurrentInstance()
				.getExternalContext().getSession(false);
		return session.getAttribute("username").toString();
	}

	public static String getUserId() {
		HttpSession session = getSession();
		if (session != null)
			return (String) session.getAttribute("userid");
		else
			return null;
	} 
    
    
}
