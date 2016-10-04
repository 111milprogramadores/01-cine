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
public class Rol {
    private String nombre;
    private String descripcion;

    /**Constructor por Defecto. **/
    
    public Rol() {
    }
   
    /**Este constructor incluye todos los atributos de la clase. **/
    public Rol(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

  //A continuación se listan todos los métodos de seteo de cada atributo de la clase.
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    
    
    
    
}
