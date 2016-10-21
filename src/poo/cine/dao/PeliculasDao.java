/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.cine.dao;

import poo.cine.Pelicula;

/**
 *
 * @author joaquinleonelrobles
 */
public interface PeliculasDao {
    
    public Pelicula buscarPorNombre (String nombre);
    
    public void guardar (Pelicula pelicula);
    
}
