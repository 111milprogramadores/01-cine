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
public class Personaje {
    
    private String nombreEnPelicula;
    private Actor actor;
    private Rol rol;

    /**
     * Constructor por Defecto
     */
    public Personaje() {
    }
    
    /**
     * Este constructor incluye todos los atributos de la clase Elenco
     * 
     * @param nombreEnPelicula
     * @param personaje
     * @param rol 
     */
    public Personaje(String nombreEnPelicula, Actor personaje, Rol rol) {
        this.nombreEnPelicula = nombreEnPelicula;
        this.actor = personaje;
        this.rol = rol;
    }

    // A continuación se listan todos los métodos de seteo 
    // de cada atributo de la clase
    
    public String getNombreEnPelicula() {
        return nombreEnPelicula;
    }

    public void setNombreEnPelicula(String nombreEnPelicula) {
        this.nombreEnPelicula = nombreEnPelicula;
    }

    public Actor getPersonaje() {
        return actor;
    }

    public void setPersonaje(Actor personaje) {
        this.actor = personaje;
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }

    @Override
    public String toString() {
        return nombreEnPelicula + " interpretado por " + actor;
    }
    
}
