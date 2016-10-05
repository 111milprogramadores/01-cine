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
    
    private Date fechaFinProgramacion;
    private Date fechaInicioProgramacion;
    private Date fechaProgramacion;
    private Date horaProgramacion;
    private List<Funcion> funciones;

    /**
     * Constructor por Defecto
     */
    public Programacion() {
    }

    /**
     * Este constructor todos los atributos de la clase Programacion
     * 
     * @param fechaFinProgramacion
     * @param fechaInicioProgramacion
     * @param fechaProgramacion
     * @param horaProgramacion 
     */
    public Programacion(Date fechaFinProgramacion, Date fechaInicioProgramacion, Date fechaProgramacion, Date horaProgramacion) {
        this.fechaFinProgramacion = fechaFinProgramacion;
        this.fechaInicioProgramacion = fechaInicioProgramacion;
        this.fechaProgramacion = fechaProgramacion;
        this.horaProgramacion = horaProgramacion;
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
  
    // A continuación se listan todos los métodos 
    // de seteo de cada atributo de la clase.

    public Date getFechaFinProgramacion() {
        return fechaFinProgramacion;
    }

    public void setFechaFinProgramacion(Date fechaFinProgramacion) {
        this.fechaFinProgramacion = fechaFinProgramacion;
    }

    public Date getFechaInicioProgramacion() {
        return fechaInicioProgramacion;
    }

    public void setFechaInicioProgramacion(Date fechaInicioProgramacion) {
        this.fechaInicioProgramacion = fechaInicioProgramacion;
    }

    public Date getFechaProgramacion() {
        return fechaProgramacion;
    }

    public void setFechaProgramacion(Date fechaProgramacion) {
        this.fechaProgramacion = fechaProgramacion;
    }

    public Date getHoraProgramacion() {
        return horaProgramacion;
    }

    public void setHoraProgramacion(Date horaProgramacion) {
        this.horaProgramacion = horaProgramacion;
    }

    public List<Funcion> getFunciones() {
        return funciones;
    }

    public void setFunciones(List<Funcion> funciones) {
        this.funciones = funciones;
    }
   
}
