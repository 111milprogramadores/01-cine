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
public class Elenco {
    
    private String nombreEnPelicula;
    private Personaje personaje;
    private Rol rol;

    /**
     * Constructor por Defecto
     */
    public Elenco() {
    }
    
    /**
     * Este constructor incluye todos los atributos de la clase Elenco
     * 
     * @param nombreEnPelicula
     * @param personaje
     * @param rol 
     */
    public Elenco(String nombreEnPelicula, Personaje personaje, Rol rol) {
        this.nombreEnPelicula = nombreEnPelicula;
        this.personaje = personaje;
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

    public Personaje getPersonaje() {
        return personaje;
    }

    public void setPersonaje(Personaje personaje) {
        this.personaje = personaje;
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }
    
}
