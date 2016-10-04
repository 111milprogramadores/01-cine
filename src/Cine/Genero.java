/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cine;

/**
 *
 * @author Candelaria
 */
public class Genero {
    private String descripcion;
    private String nombre;

    /**Constructor por Defecto. **/
    public Genero() {
    }

    /**Este constructor incluye todos atributos de la clase Genero. **/
    
    public Genero(String descripcion, String nombre) {
        this.descripcion = descripcion;
        this.nombre = nombre;
    }

    //A continuación se listan todos los métodos de seteo de cada atributo de la clase.
    
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}
