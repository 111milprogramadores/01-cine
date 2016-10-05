/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.cine;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Candelaria
 */
public class Pelicula {
    
    private int anioEstreno;
    private boolean disponible;
    private float duracion;
    private Date fechaIngreso;
    private String nombre;
    private String tituloOriginal;
    private PaisDeOrigen paisDeOrigen;
    private Elenco elenco;
    private List<Funcion> funciones;
    private Genero genero;
    private Calificacion calificacion;

    /**
     * Constructor por Defecto
     */
    public Pelicula() {
    }
        
    /**
     * Este constructor no incluye los atributos referenciales de la clase Pelicula
     * 
     * @param anioEstreno
     * @param disponible
     * @param duracion
     * @param nombre
     * @param tituloOriginal 
     */
    public Pelicula(int anioEstreno, boolean disponible, float duracion, String nombre, String tituloOriginal) {
        this.anioEstreno = anioEstreno;
        this.disponible = disponible;
        this.duracion = duracion;
        this.nombre = nombre;
        this.tituloOriginal = tituloOriginal;        
        this.fechaIngreso = java.sql.Timestamp.valueOf(LocalDateTime.now());
        
    }
    
    /**
     * Este constructor incluye todos los atributos de la clase Pelicula
     * 
     * @param anioEstreno
     * @param disponible
     * @param duracion
     * @param nombre
     * @param tituloOriginal
     * @param paisDeOrigen
     * @param elenco
     * @param funciones
     * @param genero
     * @param calificacion 
     */
    public Pelicula(int anioEstreno, boolean disponible, float duracion, String nombre, String tituloOriginal, PaisDeOrigen paisDeOrigen, Elenco elenco, List<Funcion> funciones, Genero genero, Calificacion calificacion) {
        this.anioEstreno = anioEstreno;
        this.disponible = disponible;
        this.duracion = duracion;
        this.nombre = nombre;
        this.tituloOriginal = tituloOriginal;
        this.paisDeOrigen = paisDeOrigen;
        this.elenco = elenco;
        this.funciones = funciones;
        this.genero = genero;
        this.calificacion = calificacion;
        this.fechaIngreso = java.sql.Timestamp.valueOf(LocalDateTime.now()); 
    }
    
    public boolean estaDisponible() {
        return disponible;
    }
    
    /**
     * Consultamos si esta Pelicula se encuentra vigente en Cartelera
     * 
     * @return verdadero si está en cartelera
     */
    public boolean estaEnCartelera() {
        // TODO completar
        return true;
    }
    
    /**
     * Consultamos las Funciones habilitadas y las devolvemos en formato
     * de cadena de texto
     * 
     * @return 
     */
    public String mostrarFuncionesHabilitadas() {
        // TODO implementar
        return null;
    }
    
    // A continuación se listan todos los métodos 
    // de seteo de cada atributo de la clase

    public int getAnioEstreno() {
        return anioEstreno;
    }

    public void setAnioEstreno(int anioEstreno) {
        this.anioEstreno = anioEstreno;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public float getDuracion() {
        return duracion;
    }

    public void setDuracion(float duracion) {
        this.duracion = duracion;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTituloOriginal() {
        return tituloOriginal;
    }

    public void setTituloOriginal(String tituloOriginal) {
        this.tituloOriginal = tituloOriginal;
    }

    public PaisDeOrigen getPaisDeOrigen() {
        return paisDeOrigen;
    }

    public void setPaisDeOrigen(PaisDeOrigen paisDeOrigen) {
        this.paisDeOrigen = paisDeOrigen;
    }

    public Elenco getElenco() {
        return elenco;
    }

    public void setElenco(Elenco elenco) {
        this.elenco = elenco;
    }

    public List<Funcion> getFunciones() {
        return funciones;
    }

    public void setFunciones(List<Funcion> funciones) {
        this.funciones = funciones;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public Calificacion getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(Calificacion calificacion) {
        this.calificacion = calificacion;
    }
    
}
