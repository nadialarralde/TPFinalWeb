package modelo;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@ManagedBean(name="servicio")
@RequestScoped
@Entity
@Table(name="SERVICIO")
public class Servicio implements Serializable{
    
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private int idServicio;
    
    @Column
    private String descripcion;
    
    @Column
    private float precio;

    //CONSTRUCTOR VACIO********************************************************************************************
    
    public Servicio() {
    }

    //CONSTRUCTOR SERVICIO******************************************************************************************

    public Servicio(String descripcion, float precio) {
        this.descripcion = descripcion;
        this.precio = precio;
    }

    //GETTERS Y SETTERS**************************************************************************************************
    
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
    
    
    public int getIdServicio() {
        return idServicio;
    }

    public void setIdServicio(int idServicio) {
        this.idServicio = idServicio;
    }
    
}
