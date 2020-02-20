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
import modelo.Reclamo;

/**
 *
 * @author gonza
 */
public class ReclamoJpaController implements Serializable {

    public ReclamoJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("Persistence");

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public ReclamoJpaController() {
    }

    public void create(Reclamo reclamo) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(reclamo);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Reclamo reclamo) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            reclamo = em.merge(reclamo);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = reclamo.getIdReclamo();
                if (findReclamo(id) == null) {
                    throw new NonexistentEntityException("The reclamo with id " + id + " no longer exists.");
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
            Reclamo reclamo;
            try {
                reclamo = em.getReference(Reclamo.class, id);
                reclamo.getIdReclamo();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The reclamo with id " + id + " no longer exists.", enfe);
            }
            em.remove(reclamo);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Reclamo> findReclamoEntities() {
        return findReclamoEntities(true, -1, -1);
    }

    public List<Reclamo> findReclamoEntities(int maxResults, int firstResult) {
        return findReclamoEntities(false, maxResults, firstResult);
    }

    private List<Reclamo> findReclamoEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Reclamo.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public Reclamo findReclamo(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Reclamo.class, id);
        } finally {
            em.close();
        }
    }

    public int getReclamoCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Reclamo> rt = cq.from(Reclamo.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
    public List<Reclamo> reclamosOrdenadosFecha(){
        EntityManager manager = emf.createEntityManager();
        Query query=manager.createQuery("FROM Reclamo r ORDER BY r.fecha");
        List<Reclamo>ordenados=query.getResultList();
        return ordenados;
    }
    
}
