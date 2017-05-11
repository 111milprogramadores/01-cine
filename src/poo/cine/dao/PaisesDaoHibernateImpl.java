/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.cine.dao;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import poo.cine.PaisDeOrigen;

/**
 *
 * @author joaquinleonelrobles
 */
public class PaisesDaoHibernateImpl implements PaisesDao {
    
    private final SessionFactory sessionFactory;

    public PaisesDaoHibernateImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public List<PaisDeOrigen> obtenerTodos() {
        Session session = sessionFactory.openSession();
        List<PaisDeOrigen> retorno = session.createQuery("from PaisDeOrigen").list();
        session.close();
        
        return retorno;
    }
    
}
