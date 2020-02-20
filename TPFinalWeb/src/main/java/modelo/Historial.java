/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import exception.Notificaciones;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.persistence.*;

@ManagedBean(name="historial")
@RequestScoped
@Entity
@Table (name = "HISTORIAL")
public class Historial implements Serializable{
    
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private int idHistorial;
    
    
    @Column
    @ElementCollection(targetClass=String.class)
    private List<String> empleadosAsignados;
    
    @Column
    private String descripcion;
    
    @ManyToOne
    @JoinColumn
    private Estado estado;

    public Historial() {
    }

    public Historial(String empleadosAsignados, String descripcion, Estado estado)throws Notificaciones {
        this.empleadosAsignados= new ArrayList<>();
        this.empleadosAsignados.add(empleadosAsignados);
        this.descripcion = descripcion;
        this.estado = estado;
    }



    public int getIdHistorial() {
        return idHistorial;
    }

    public void setIdHistorial(int idHistorial) {
        this.idHistorial = idHistorial;
    }

    public List<String> getEmpleadosAsignados() {
        return empleadosAsignados;
    }

    public void setEmpleadosAsignados(String nuevoEmpleado) {
        this.empleadosAsignados.add(nuevoEmpleado);
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Historial{" + "id=" + idHistorial + ", empleadosAsignados=" + empleadosAsignados + ", descripcion=" + descripcion + ", estado=" + estado + '}';
    }


   

    
    
    
    
    
}
