/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.cine;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Candelaria
 */
public class Pelicula {
    
    private int id;
    private int anioEstreno;
    private boolean disponible;
    private int duracion;
    private Date fechaIngreso;
    private String nombre;
    private String tituloOriginal;
    private PaisDeOrigen paisDeOrigen;
    private List<Personaje> personajes;
    private List<Funcion> funciones;
    private Genero genero;
    private Calificacion calificacion;

    /**
     * Constructor por Defecto
     */
    public Pelicula() {
        personajes = new ArrayList<>();
        funciones = new ArrayList<>();
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
    public Pelicula(int anioEstreno, boolean disponible, int duracion, String nombre, String tituloOriginal) {
        this.anioEstreno = anioEstreno;
        this.disponible = disponible;
        this.duracion = duracion;
        this.nombre = nombre;
        this.tituloOriginal = tituloOriginal;        
        this.fechaIngreso = java.sql.Timestamp.valueOf(LocalDateTime.now());
        this.personajes = new ArrayList<>();
        this.funciones = new ArrayList<>();
        
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
     * @param personajes
     * @param funciones
     * @param genero
     * @param calificacion 
     */
    public Pelicula(int anioEstreno, boolean disponible, int duracion, String nombre, String tituloOriginal, PaisDeOrigen paisDeOrigen, List<Personaje> personajes, List<Funcion> funciones, Genero genero, Calificacion calificacion) {
        this.anioEstreno = anioEstreno;
        this.disponible = disponible;
        this.duracion = duracion;
        this.nombre = nombre;
        this.tituloOriginal = tituloOriginal;
        this.paisDeOrigen = paisDeOrigen;
        this.personajes = personajes;
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
    
    /**
     * Calculamos la duracion total de la Pelicula cuando se asigna a una 
     * Funcion determinada para un Cine contando duración de la publicidad
     * y el intervalo entre Funciones
     * 
     * @param horarioFuncion
     * @return 
     */
    public int calcularDuracionEnFuncion (HorarioFuncion horarioFuncion) {
        return this.duracion + horarioFuncion.getDuracionPublicidad() + 
                horarioFuncion.getDuracionIntervalo();
    }
    
    // A continuación se listan todos los métodos
    // de seteo de cada atributo de la clase

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }

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

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
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

    public List<Personaje> getPersonajes() {
        return personajes;
    }

    public void setPersonajes(List<Personaje> personajes) {
        this.personajes = personajes;
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

    @Override
    public String toString() {
        return nombre; //To change body of generated methods, choose Tools | Templates.
    }
    
}
