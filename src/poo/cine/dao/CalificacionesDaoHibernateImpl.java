/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.cine.dao;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import poo.cine.Calificacion;

/**
 *
 * @author joaquinleonelrobles
 */
public class CalificacionesDaoHibernateImpl implements CalificacionesDao {
    
    private final SessionFactory sessionFactory;

    public CalificacionesDaoHibernateImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
    
    @Override
    public List<Calificacion> obtenerTodas() {
        Session session = sessionFactory.openSession();
        List<Calificacion> retorno = session.createQuery("from Calificacion").list();
        session.close();
        
        return retorno;
    }
    
}
