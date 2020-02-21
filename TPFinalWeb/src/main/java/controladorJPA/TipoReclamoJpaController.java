/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladorJPA;

import controladorJPA.exceptions.NonexistentEntityException;
import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import modelo.TipoReclamo;

public class TipoReclamoJpaController implements Serializable {

    public TipoReclamoJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("Persistence");

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public TipoReclamoJpaController() {
    }

    public void create(TipoReclamo tipoReclamo) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(tipoReclamo);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(TipoReclamo tipoReclamo) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            tipoReclamo = em.merge(tipoReclamo);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = tipoReclamo.getIdTipo();
                if (findTipoReclamo(id) == null) {
                    throw new NonexistentEntityException("The tipoReclamo with id " + id + " no longer exists.");
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
            TipoReclamo tipoReclamo;
            try {
                tipoReclamo = em.getReference(TipoReclamo.class, id);
                tipoReclamo.getIdTipo();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The tipoReclamo with id " + id + " no longer exists.", enfe);
            }
            em.remove(tipoReclamo);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public TipoReclamo findTipoReclamo(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(TipoReclamo.class, id);
        } finally {
            em.close();
        }
    } 
}
