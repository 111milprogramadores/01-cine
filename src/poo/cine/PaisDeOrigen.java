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
public class PaisDeOrigen {
    
    private Integer id;
    private String idioma;
    private String nombre;

    /**
     * Constructor por Defecto
     */
    public PaisDeOrigen() {
    }

    /**
     * Este constructor incluye todos los parametros de la clase PaisDeOrigen
     * 
     * @param idioma
     * @param nombre 
     */
    public PaisDeOrigen(String idioma, String nombre) {
        this.idioma = idioma;
        this.nombre = nombre;
    }

    // A continuación se listan todos los métodos de seteo 
    // de cada atributo de la clase
    
    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

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
