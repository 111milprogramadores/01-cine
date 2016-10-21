/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.cine.dao;

import java.util.ArrayList;
import java.util.List;
import poo.cine.Calificacion;

/**
 *
 * @author joaquinleonelrobles
 */
public class CalificacionesDaoImpl implements CalificacionesDao {
    
    private final List<Calificacion> calificaciones;

    public CalificacionesDaoImpl() {
        this.calificaciones = new ArrayList<>();
        this.calificaciones.add(new Calificacion("ATP"));
        this.calificaciones.add(new Calificacion("Prohibida para menores de 13 años"));
        this.calificaciones.add(new Calificacion("Prohibida para menores de 16 años"));
        this.calificaciones.add(new Calificacion("Prohibida para menores de 18 años"));
    }

    @Override
    public List<Calificacion> obtenerTodas() {
        return calificaciones;
    }
    
}
