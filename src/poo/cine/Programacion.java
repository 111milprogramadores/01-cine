/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.cine;

import java.util.ArrayList;
import java.util.Calendar;
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
        funciones = new ArrayList<>();
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
        this.funciones = new ArrayList<>();
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
     * Consultamos si la Programacion está vigente cuando
     * 
     * @return 
     */
    public boolean estaVigente () {
        return estaVigente(Calendar.getInstance().getTime());
    }
    
    /**
     * Comprobamos si la fecha actual se encuentra dentro del periodo de 
     * vigencia de esta Programacion (fecha de inicio y fin), consideramos
     * también que la fecha de inicio y fin también están en el periodo de 
     * vigencia de la Programación
     * 
     * @param fecha
     * @return 
     */
    public boolean estaVigente (Date fecha) {
        Calendar cuando = Calendar.getInstance();
        cuando.setTime(fecha);
        
        Calendar inicio = Calendar.getInstance();
        inicio.setTime(fechaInicio);
        
        Calendar fin = Calendar.getInstance();
        fin.setTime(fechaFin);
        
        // comparamos contra la fecha de inicio y fin de la programacion
        // utilizamos los operadores <= y >= para asegurarnos de que
        // ambos extremos de fecha (inicio y fin) sean incluídos en el chequeo
        return inicio.compareTo(cuando) <= 0 && fin.compareTo(cuando) >= 0;
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

    @Override
    public String toString() {
        return "Programacion{" + "fechaInicio=" + fechaInicio + ", fechaFin=" + fechaFin + ", fechaHoraCreada=" + fechaHoraCreada + ", funciones=" + funciones + '}';
    }
    
    
}
