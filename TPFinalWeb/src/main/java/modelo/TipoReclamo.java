package modelo;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.persistence.*;

@ManagedBean(name="tipoReclamo")
@RequestScoped
@Entity
@Table (name = "TIPORECLAMO")
public class TipoReclamo implements Serializable{
    
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private int idTipo;
    
    @Column
    private String descripcion;

    //CONSTRUCTOR TIPO RECLAMO************************************************************************************
    
    public TipoReclamo(String descripcion) {
        this.descripcion = descripcion;
    }

    //GETTERS Y SETTERS**************************************************************************************************
    
    public int getIdTipo() {
        return idTipo;
    }

    public void setIdTipo(int idTipo) {
        this.idTipo = idTipo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    //CONSTRUCTOR VACIO********************************************************************************************
    
    public TipoReclamo() {
    }
    
    //TO STRING*********************************************************************************************************

    @Override
    public String toString() {
        return "TipoReclamo{" + "idTipo=" + idTipo + ", descripcion=" + descripcion + '}';
    }
    
}
