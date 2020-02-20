package modelo;

import java.util.ArrayList;
import java.util.List;

public class Sistema {
    
    private final String nombre;
    
    private List<Cliente> clientes = new ArrayList<>();
    private List<Contacto> contactos = new ArrayList<>();
    private List<Contrato> contratos = new ArrayList<>();
    private List<Empleado> empleados = new ArrayList<>();
    private List<Estado> estados = new ArrayList<>();
    private List<Historial> historiales = new ArrayList<>();
    //private List<Persona> personas = new ArrayList<>();
    private List<Reclamo> reclamos = new ArrayList<>();
    private List<Servicio> servicios = new ArrayList<>();
    private List<TipoReclamo> tiposReclamos = new ArrayList<>();
    
    public Sistema(String version, String nombre){
        this.nombre= nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public List<Contacto> getContactos() {
        return contactos;
    }

    public List<Contrato> getContratos() {
        return contratos;
    }

    public List<Empleado> getEmpleados() {
        return empleados;
    }

    public List<Estado> getEstados() {
        return estados;
    }

    public List<Historial> getHistoriales() {
        return historiales;
    }

   /* public List<Persona> getPersonas() {
        return personas;
    }*/

    public List<Reclamo> getReclamos() {
        return reclamos;
    }

    public List<Servicio> getServicios() {
        return servicios;
    }

    public List<TipoReclamo> getTiposReclamos() {
        return tiposReclamos;
    }

    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }

    public void setContactos(List<Contacto> contactos) {
        this.contactos = contactos;
    }

    public void setContratos(List<Contrato> contratos) {
        this.contratos = contratos;
    }

    public void setEmpleados(List<Empleado> empleados) {
        this.empleados = empleados;
    }

    public void setEstados(List<Estado> estados) {
        this.estados = estados;
    }

    public void setHistoriales(List<Historial> historiales) {
        this.historiales = historiales;
    }

    /*public void setPersonas(List<Persona> personas) {
        this.personas = personas;
    }*/

    public void setReclamos(List<Reclamo> reclamos) {
        this.reclamos = reclamos;
    }

    public void setServicios(List<Servicio> servicios) {
        this.servicios = servicios;
    }

    public void setTiposReclamos(List<TipoReclamo> tiposReclamos) {
        this.tiposReclamos = tiposReclamos;
    }
}
