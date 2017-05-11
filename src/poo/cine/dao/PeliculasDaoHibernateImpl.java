/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.cine.dao;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import poo.cine.Pelicula;

/**
 *
 * @author joaquinleonelrobles
 */
public class PeliculasDaoHibernateImpl implements PeliculasDao {
    
    private final SessionFactory sessionFactory;

    public PeliculasDaoHibernateImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public Pelicula buscarPorNombre(String nombre) {
        Session session = sessionFactory.openSession();
        
        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<Pelicula> query = builder.createQuery(Pelicula.class);
        Root<Pelicula> root = query.from(Pelicula.class);
        query.select(root);
        query.where(builder.equal(root.get("nombre"), nombre));
        
        Pelicula pelicula = session.createQuery(query).uniqueResult();
        
        session.close();
        
        return pelicula;
    }

    @Override
    public void guardar(Pelicula pelicula) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(pelicula);
        session.getTransaction().commit();
        session.close();
    }
    
}
