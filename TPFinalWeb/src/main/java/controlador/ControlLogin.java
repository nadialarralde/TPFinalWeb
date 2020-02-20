/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import exception.Notificaciones;
import java.util.ArrayList;
import java.util.List;
import modelo.Empleado;

/**
 *
 * @author gonza
 */
public class ControlLogin {
    
    private ControlSistema controlSistema;
    
    public ControlLogin(ControlSistema controlSistema){
        this.controlSistema = controlSistema;
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
}
