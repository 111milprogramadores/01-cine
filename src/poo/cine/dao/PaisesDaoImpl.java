/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.cine.dao;

import java.util.ArrayList;
import java.util.List;
import poo.cine.PaisDeOrigen;

/**
 *
 * @author joaquinleonelrobles
 */
public class PaisesDaoImpl implements PaisesDao {
    
    private final List<PaisDeOrigen> paises;

    public PaisesDaoImpl() {
        this.paises = new ArrayList<>();
        this.paises.add(new PaisDeOrigen("Inglés", "Estados Unidos"));
        this.paises.add(new PaisDeOrigen("Inglés", "Australia"));
        this.paises.add(new PaisDeOrigen("Español", "Argentina"));
    }

    @Override
    public List<PaisDeOrigen> obtenerTodos() {
        return paises;
    }

}
