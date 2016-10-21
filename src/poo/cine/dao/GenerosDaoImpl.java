/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.cine.dao;

import java.util.ArrayList;
import java.util.List;
import poo.cine.Genero;

/**
 *
 * @author joaquinleonelrobles
 */
public class GenerosDaoImpl implements GenerosDao {
    
    private final List<Genero> generos;

    public GenerosDaoImpl() {
        this.generos = new ArrayList<>();
        this.generos.add(new Genero("Drama"));
        this.generos.add(new Genero("Comedia"));
        this.generos.add(new Genero("Acción"));
    }

    @Override
    public List<Genero> obtenerTodos() {
        return generos;
    }
    
}
