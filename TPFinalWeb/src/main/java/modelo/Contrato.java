package modelo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@ManagedBean(name="contrato")
@RequestScoped
@Entity
@Table (name="CONTRATO")
public class Contrato implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private int idContrato;
    
    @OneToOne
    @JoinColumn
    private Cliente cliente;
    
    @ManyToMany
    @JoinColumn
    private List<Servicio> servicio=new ArrayList<>();
    
    @Column
    private float ValorPrecio;
    
    //CONSTRUCTOR VACIO********************************************************************************************

    public Contrato() {
    }
    
    //CONSTRUCTOR CONTRATO****************************************************************************************

    public Contrato(Cliente cliente, List<Servicio> servicio, float ValorPrecio) {
        this.cliente = cliente;
        this.servicio = servicio;
        this.ValorPrecio = ValorPrecio;
    }

    //GETTERS************************************************************************************************************

    public int getIdContrato() {
        return idContrato;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public List<Servicio> getServicio() {
        return servicio;
    }

    public float getValorPrecio() {
        return ValorPrecio;
    }
    
    //SETTERS************************************************************************************************************

    public void setIdContrato(int idContrato) {
        this.idContrato = idContrato;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setServicio(List<Servicio> servicio) {
        this.servicio = servicio;
    }

    public void setValorPrecio(float ValorPrecio) {
        this.ValorPrecio = ValorPrecio;
    }
    
    //TO STRING*********************************************************************************************************

    @Override
    public String toString() {
        return "Contrato{" + "cliente=" + cliente + ", servicio=" + servicio + ", ValorPrecio=" + ValorPrecio + '}';
    }
    
}
