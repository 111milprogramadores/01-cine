/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.cine;

/**
 *
 * @author Candelaria
 */
public class Calificacion {
    
    private Integer id;
    private String nombre;
    
    /**
     * Constructor por Defecto
     */
    public Calificacion() {
    }

    /**
     * Este constructor incluye todos atributos de la clase Calificacion
     * 
     * @param nombre 
     */
    public Calificacion(String nombre) {
        this.nombre = nombre;
    }

    // A continuación se listan todos los métodos de seteo
    // de cada atributo de la clase

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return this.nombre;
    }
    
}
