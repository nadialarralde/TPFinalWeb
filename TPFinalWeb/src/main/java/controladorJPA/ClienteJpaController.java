/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladorJPA;

import controladorJPA.exceptions.NonexistentEntityException;
import controladorJPA.exceptions.PreexistingEntityException;
import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import modelo.Cliente;
import modelo.Contrato;


public class ClienteJpaController implements Serializable {

    public ClienteJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("Persistence");

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }
    
    public ClienteJpaController(){
        
    }

    public void create(Cliente cliente) throws PreexistingEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Contrato contrato = cliente.getContrato();
            if (contrato != null) {
                contrato = em.getReference(contrato.getClass(), contrato.getIdContrato());
                cliente.setContrato(contrato);
            }
            em.persist(cliente);
            if (contrato != null) {
                Cliente oldClienteOfContrato = contrato.getCliente();
                if (oldClienteOfContrato != null) {
                    oldClienteOfContrato.setContrato(null);
                    oldClienteOfContrato = em.merge(oldClienteOfContrato);
                }
                contrato.setCliente(cliente);
                contrato = em.merge(contrato);
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            if (findCliente(cliente.getDni()) != null) {
                throw new PreexistingEntityException("Cliente " + cliente + " already exists.", ex);
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Cliente cliente) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Cliente persistentCliente = em.find(Cliente.class, cliente.getDni());
            Contrato contratoOld = persistentCliente.getContrato();
            Contrato contratoNew = cliente.getContrato();
            if (contratoNew != null) {
                contratoNew = em.getReference(contratoNew.getClass(), contratoNew.getIdContrato());
                cliente.setContrato(contratoNew);
            }
            cliente = em.merge(cliente);
            if (contratoOld != null && !contratoOld.equals(contratoNew)) {
                contratoOld.setCliente(null);
                contratoOld = em.merge(contratoOld);
            }
            if (contratoNew != null && !contratoNew.equals(contratoOld)) {
                Cliente oldClienteOfContrato = contratoNew.getCliente();
                if (oldClienteOfContrato != null) {
                    oldClienteOfContrato.setContrato(null);
                    oldClienteOfContrato = em.merge(oldClienteOfContrato);
                }
                contratoNew.setCliente(cliente);
                contratoNew = em.merge(contratoNew);
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = cliente.getDni();
                if (findCliente(id) == null) {
                    throw new NonexistentEntityException("The cliente with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(int id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Cliente cliente;
            try {
                cliente = em.getReference(Cliente.class, id);
                cliente.getDni();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The cliente with id " + id + " no longer exists.", enfe);
            }
            Contrato contrato = cliente.getContrato();
            if (contrato != null) {
                contrato.setCliente(null);
                contrato = em.merge(contrato);
            }
            em.remove(cliente);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public Cliente findCliente(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Cliente.class, id);
        } finally {
            em.close();
        }
    }
    
}
