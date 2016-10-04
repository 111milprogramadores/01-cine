/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cine;

import java.time.LocalDateTime;
import java.util.Date;

/**
 *
 * @author Candelaria
 */
public class Funcion {
    private int diaSemana; //Chequear tipo de datos
    private float duracion;
    private Date fechaHabilitacion;
    private Date horaInicio; //Chequear tipo de datos
    private int numero;
    private Pelicula pelicula;
    private Sala sala;

    /**Constructor por Defecto. **/
    public Funcion() {
    }
     /**Este constructor no incluye los atributos referenciales de la clase Funcion. **/
    public Funcion(int diaSemana, float duracion, Date fechaHabilitacion, Date horaInicio, int numero, Pelicula pelicula, Sala sala) {
        this.diaSemana = diaSemana;
        this.duracion = duracion;
        this.fechaHabilitacion = fechaHabilitacion;
        this.horaInicio = horaInicio;
        this.numero = numero;
        this.pelicula = pelicula;
        this.sala = sala;
    }
    
    
    
    public int calcularDisponibilidad()
    {
        //TODO 
        //Supongo que este metodo va a la sala se fija cual es su capacidad, 
        //y despues va a las entradas vendidas para esa funcion y devuelve cuantos lugares quedan.
       return 1;
               
    }
    
    public int capacidadSala()
    {
       return this.sala.getCapacidad();
    }
    
    public boolean controlarHoraFuncion()
    {
        final Date fechaHoraActual = java.sql.Timestamp.valueOf(LocalDateTime.now());
        //Chequear no me acuerdo el compareTo
        return this.horaInicio.compareTo(fechaHoraActual) <= 1;
    }

    //A continuación se listan todos los métodos de seteo de cada atributo de la clase.
    public int getDiaSemana() {
        return diaSemana;
    }

    public void setDiaSemana(int diaSemana) {
        this.diaSemana = diaSemana;
    }

    public float getDuracion() {
        return duracion;
    }

    public void setDuracion(float duracion) {
        this.duracion = duracion;
    }

    public Date getFechaHabilitacion() {
        return fechaHabilitacion;
    }

    public void setFechaHabilitacion(Date fechaHabilitacion) {
        this.fechaHabilitacion = fechaHabilitacion;
    }

    public Date getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(Date horaInicio) {
        this.horaInicio = horaInicio;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }
     
    
    
    
}
