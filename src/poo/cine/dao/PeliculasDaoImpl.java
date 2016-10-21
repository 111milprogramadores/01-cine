/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.cine.dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import poo.cine.Pelicula;

/**
 *
 * @author joaquinleonelrobles
 */
public class PeliculasDaoImpl implements PeliculasDao {
    
    private final List<Pelicula> peliculas;

    public PeliculasDaoImpl() {
        this.peliculas = new ArrayList<>();
    }

    @Override
    public Pelicula buscarPorNombre(String nombre) {
        System.out.println("Buscando película por nombre: " + nombre);

        Iterator<Pelicula> iter = peliculas.iterator();
        Pelicula encontrada = null;
        
        while (iter.hasNext()) {
            Pelicula actual = iter.next();
            
            if (actual.getNombre().equalsIgnoreCase(nombre)) {
                encontrada = actual;
                break;
            }
        }
        
        return encontrada;
    }

    @Override
    public void guardar(Pelicula pelicula) {
        this.peliculas.add(pelicula);
        
        System.out.println("Película agregada: " + pelicula);
    }
    
}
