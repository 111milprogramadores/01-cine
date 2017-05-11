/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.cine.dao;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import poo.cine.Genero;

/**
 *
 * @author joaquinleonelrobles
 */
public class GenerosDaoHibernateImpl implements GenerosDao {
    
    private final SessionFactory sessionFactory;

    public GenerosDaoHibernateImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public List<Genero> obtenerTodos() {
        Session session = sessionFactory.openSession();
        List<Genero> retorno = session.createQuery("from Genero").list();
        session.close();
        
        return retorno;
    }
    
}
