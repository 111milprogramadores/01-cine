/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.cine;

import java.util.Date;
import java.util.List;

/**
 *
 * @author Candelaria
 */
public class Programacion {
    
    private Date fechaInicio;
    private Date fechaFin;
    private Date fechaHoraCreada;
    private List<Funcion> funciones;

    /**
     * Constructor por Defecto
     */
    public Programacion() {
    }

    /**
     * Este constructor todos los atributos de la clase Programacion
     * 
     * @param fechaInicio
     * @param fechaFin
     * @param fechaHoraCreada
     * @param funciones 
     */
    public Programacion(Date fechaInicio, Date fechaFin, Date fechaHoraCreada, List<Funcion> funciones) {
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.fechaHoraCreada = fechaHoraCreada;
        this.funciones = funciones;
    }
    
    /**
     * Recorremos las Funciones y armamos una cadena de texto con la 
     * representación de cada una de ellas.
     * 
     * @return cadena de texto con las funciones
     */
    public String mostrarProgramacion() {
        // TODO recorrer funciones y mostrar sus datos
        return "Falta implementar";
    }
    
    /**
     * Comprobamos si todos los días de esta programación tienen al menos una
     * Función asignada.
     * 
     * @return 
     */
    public boolean estaCompleta () {
        return false;
    }
    
    /**
     * Comprobamos si la fecha actual se encuentra dentro del periodo de 
     * vigencia de esta Programacion (fecha de inicio y fin)
     * 
     * @return 
     */
    public boolean estaVigente () {
       return false; 
    }
  
    // A continuación se listan todos los métodos 
    // de seteo de cada atributo de la clase

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public Date getFechaHoraCreada() {
        return fechaHoraCreada;
    }

    public void setFechaHoraCreada(Date fechaHoraCreada) {
        this.fechaHoraCreada = fechaHoraCreada;
    }

    public List<Funcion> getFunciones() {
        return funciones;
    }

    public void setFunciones(List<Funcion> funciones) {
        this.funciones = funciones;
    }
   
}
