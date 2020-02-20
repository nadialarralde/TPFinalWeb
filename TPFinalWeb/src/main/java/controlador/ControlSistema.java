package controlador;

import exception.Notificaciones;
//import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.JOptionPane;
import modelo.*;
import vista.FramePrincipal;


@ManagedBean
@SessionScoped
public class ControlSistema {
    
    /*Instancias de modelo y vista del sistema*/
    private Sistema mSistema;
    private FramePrincipal vPrincipal;
    
    
    /*Instancia de la sesion del empleado loggeado*/
    private Empleado sesion = null;
    
    /*Instancias de controladores del sistema*/
    private ControlCliente controlCliente;
    private ControlContrato controlContrato;
    private ControlContacto controlContacto;
    private ControlEmpleado controlEmpleado;
    private ControlEstado controlEstado;
    private ControlHistorial controlHistorial;
    private ControlLogin controlLogin;
    private ControlReclamo controlReclamo;
    private ControlServicio controlServicio;
    private ControlTipoReclamo controlTipoReclamo;
    
    
    /*Constructor*/
    public ControlSistema(Sistema mSistema) {
        this.mSistema = mSistema;
        this.controlCliente = new ControlCliente(this);
        this.controlContrato = new ControlContrato(this);
        this.controlContacto = new ControlContacto(this);
        this.controlEmpleado = new ControlEmpleado(this);
        this.controlEstado = new ControlEstado(this);
        this.controlHistorial = new ControlHistorial(this);
        this.controlLogin = new ControlLogin(this);
        this.controlReclamo = new ControlReclamo(this);
        this.controlServicio = new ControlServicio(this);
        this.controlTipoReclamo = new ControlTipoReclamo(this);

        this.cargarDatosDesdeBD();
    }

    public List<String> getListaServicios (int dniCliente)throws Notificaciones{
        List<String> listaServicios;
        listaServicios = this.controlContrato.listarServicio(dniCliente);
        return listaServicios;
    }
    
    public List<String> getListaTipoReclamo(){
        return this.controlTipoReclamo.getListaTiposReclamos();
    }

    
    public void controlLogin(String usuario, String clave, FramePrincipal vistaPrincipal)throws Notificaciones{
        this.vPrincipal = vistaPrincipal;
        this.sesion = this.getControlLogin().getEmpleadoLogin(usuario, clave);
        if(sesion != null){
            /* Comprobar el  de usuario para mostrar su correspondiente vista */
            if(sesion.getSupervisor()==1){
                this.vPrincipal.crearSupervisor();
            }else{
                this.vPrincipal.crearEmpComun();
            }
        }
    }

    public void agregarReclamo(int dniCliente, String servicio, String descripcion, String urgencia
    , String tipoReclamo) throws Notificaciones{
        String mensaje;
        if(servicio.isBlank() || descripcion.isBlank() || urgencia.isBlank() || tipoReclamo.isBlank()){
            throw new Notificaciones("Por favor complete todos los campos.");
        }
        Cliente cliente= this.controlCliente.getCliente(dniCliente);
        if(cliente==null){
            throw new Notificaciones("El dni ingresado no corresponde con un cliente en servicio.");
        }
        Servicio servicioAgregar= this.controlServicio.getServicio(servicio);
        if(servicioAgregar==null){
            throw new Notificaciones("Error en la busqueda, no se encuentra el servicio.");
        }
        TipoReclamo tipoReclamoAgregar= this.controlTipoReclamo.getTipoReclamo(tipoReclamo);
        if(tipoReclamoAgregar==null){
            throw new Notificaciones("Error en la busqueda, no se encuentra el tipo de reclamo.");
        }
        String estado="Alta";
        Estado estadoAgregar= this.getControlEstado().getEstado(estado);
        if(estadoAgregar==null){
            throw new Notificaciones("Error en el Estado asignado (NO DEBE PASAR).");
        }
        /*generar la asignacion de empleado*/
        String empleadoAsignar=controlEmpleado.asignarEmpleado(urgencia, tipoReclamo);
        /*---------------------------------*/
        String descripcionHistorial="";
        Historial historial= this.controlHistorial.agregarHistorial(empleadoAsignar, descripcionHistorial, estadoAgregar);
        mensaje= this.controlReclamo.nuevoReclamo(cliente, servicioAgregar, descripcion, urgencia, sesion, historial, tipoReclamoAgregar);
        JOptionPane.showMessageDialog(this.vPrincipal, mensaje);
    }
    
    
    public void vistaExisteReclamo(int idReclamo)throws Notificaciones{
        if(!this.controlReclamo.existeReclamo(idReclamo)){
            throw new Notificaciones("No existe el reclamo.");
        }
    }
    
    public void finalizarReclamo(int idReclamo, String descripcion)throws Notificaciones{
        String mensaje;
        if(descripcion.isBlank()){
            throw new Notificaciones("Por favor complete todos los campos.");
        }
        Estado estado = this.getControlEstado().getEstado("finalizado");
        mensaje= this.controlHistorial.finalizarReclamo(idReclamo, descripcion, estado);
        JOptionPane.showMessageDialog(this.vPrincipal, mensaje);
    }
    
    public List<Integer> getListaTransferir(int numeroReclamo)throws Notificaciones{
        List<Integer> listaTransferir= controlEmpleado.transferirReclamoLista(numeroReclamo);
        return listaTransferir;
    }
    
    public void transferirReclamo(int numeroReclamo, int numeroEmpleado, String estado, String descripcion)throws Notificaciones{
        if(estado.isBlank() || descripcion.isBlank()){
            throw new Notificaciones("Por favor complete todos los campos");
        }
        int numeroOrden= controlEmpleado.transferirReclamoOrden(numeroReclamo);
        Estado estadoACambiar= controlEstado.getEstado(estado);
        String empleadoAsignar= numeroOrden + "-" + numeroEmpleado;
        Reclamo reclamo= controlReclamo.getReclamo(numeroReclamo);
        Historial historial= reclamo.getHistorial();
        descripcion= historial.getDescripcion() + descripcion;
        historial.setDescripcion(descripcion);
        historial.setEstado(estadoACambiar);
        historial.setEmpleadosAsignados(empleadoAsignar);
        int index= this.getmSistema().getReclamos().indexOf(reclamo);
        this.getmSistema().getReclamos().get(index).setHistorial(historial);
        controlHistorial.actualizarHistorial(historial);
        JOptionPane.showMessageDialog(this.vPrincipal, "Reclamo transferido correctamente.");
    }
    
    
    
    
    
    
    public FramePrincipal getvPrincipal() {
        return vPrincipal;
    }

    public void setvSistema(FramePrincipal vPrincipal) {
        this.vPrincipal = vPrincipal;
    }

    public Empleado getSesion() {
        return sesion;
    }

    public void setSesion(Empleado sesion) {
        this.sesion = sesion;
    }

    public ControlLogin getControlLogin() {
        return controlLogin;
    }

    public void setControlLogin(ControlLogin controlLogin) {
        this.controlLogin = controlLogin;
    }
    
    public Sistema getmSistema() {
        return mSistema;
    }

    public void setmSistema(Sistema mSistema) {
        this.mSistema = mSistema;
    }

    public ControlCliente getControlCliente() {
        return controlCliente;
    }

    public void setControlCliente(ControlCliente controlCliente) {
        this.controlCliente = controlCliente;
    }

    public ControlContrato getControlContrato() {
        return controlContrato;
    }

    public void setControlContrato(ControlContrato controlContrato) {
        this.controlContrato = controlContrato;
    }

    public ControlContacto getControlContacto() {
        return controlContacto;
    }

    public void setControlContacto(ControlContacto controlContacto) {
        this.controlContacto = controlContacto;
    }

    public ControlEmpleado getControlEmpleado() {
        return controlEmpleado;
    }

    public void setControlEmpleado(ControlEmpleado controlEmpleado) {
        this.controlEmpleado = controlEmpleado;
    }

    public ControlEstado getControlEstado() {
        return controlEstado;
    }

    public void setControlEstado(ControlEstado controlEstado) {
        this.controlEstado = controlEstado;
    }

    public ControlHistorial getControlHistorial() {
        return controlHistorial;
    }

    public void setControlHistorial(ControlHistorial controlHistorial) {
        this.controlHistorial = controlHistorial;
    }

    public ControlReclamo getControlReclamo() {
        return controlReclamo;
    }

    public void setControlReclamo(ControlReclamo controlReclamo) {
        this.controlReclamo = controlReclamo;
    }

    public ControlServicio getControlServicio() {
        return controlServicio;
    }

    public void setControlServicio(ControlServicio controlServicio) {
        this.controlServicio = controlServicio;
    }

    public ControlTipoReclamo getControlTipoReclamo() {
        return controlTipoReclamo;
    }

    public void setControlTipoReclamo(ControlTipoReclamo controlTipoReclamo) {
        this.controlTipoReclamo = controlTipoReclamo;
    }
   
    
    
    private void cargarDatosDesdeBD() {
    	EntityManagerFactory emf = Persistence.createEntityManagerFactory("Persistence");
    	EntityManager manager = emf.createEntityManager();
        
        this.mSistema.setClientes((List<Cliente>)manager.createQuery("FROM Cliente").getResultList());
        this.mSistema.setContratos((List<Contrato>)manager.createQuery("FROM Contrato").getResultList());
        this.mSistema.setContactos((List<Contacto>)manager.createQuery("FROM Contacto").getResultList());
        this.mSistema.setEmpleados((List<Empleado>)manager.createQuery("FROM Empleado").getResultList());
        this.mSistema.setEstados((List<Estado>)manager.createQuery("FROM Estado").getResultList());
        this.mSistema.setHistoriales((List<Historial>)manager.createQuery("FROM Historial").getResultList());
        this.mSistema.setReclamos((List<Reclamo>)manager.createQuery("FROM Reclamo").getResultList());
        this.mSistema.setServicios((List<Servicio>)manager.createQuery("FROM Servicio").getResultList());
        this.mSistema.setTiposReclamos((List<TipoReclamo>)manager.createQuery("FROM TipoReclamo").getResultList());
    }
    
}
