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
public class Cine {
    private String direccion;
    private Date fechaInauguracion;
    private String nombre;
    private List<Sala> sala;
    private List<HorarioFuncion> horarioFuncion;
    private List<Programacion> programacion;
    
    /**
     * Constructor por Defecto
     */
    public Cine() {
    }

    /**
     * Este constructor incluye todos los atributos de la clase Cine
     * 
     * @param direccion
     * @param fechaInauguracion
     * @param nombre
     * @param sala
     * @param horarioFuncion
     * @param programacion 
     */
    public Cine(String direccion, Date fechaInauguracion, String nombre, List<Sala> sala, List<HorarioFuncion> horarioFuncion, List<Programacion> programacion) {
        this.direccion = direccion;
        this.fechaInauguracion = fechaInauguracion;
        this.nombre = nombre;
        this.sala = sala;
        this.horarioFuncion = horarioFuncion;
        this.programacion = programacion;
    }
    
    /**
     * Este constructor no incluye los atributos referenciales de la clase Cine
     * 
     * @param direccion
     * @param fechaInauguracion
     * @param nombre 
     */
    public Cine(String direccion, Date fechaInauguracion, String nombre) {
        this.direccion = direccion;
        this.fechaInauguracion = fechaInauguracion;
        this.nombre = nombre;
    }
    
    // A continuación se listan todos los métodos de seteo 
    // de cada atributo de la clase
    
    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Date getFechaInauguracion() {
        return fechaInauguracion;
    }

    public void setFechaInauguracion(Date fechaInauguracion) {
        this.fechaInauguracion = fechaInauguracion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Sala> getSala() {
        return sala;
    }

    public void setSala(List<Sala> sala) {
        this.sala = sala;
    }

    public List<HorarioFuncion> getHorarioFuncion() {
        return horarioFuncion;
    }

    public void setHorarioFuncion(List<HorarioFuncion> horarioFuncion) {
        this.horarioFuncion = horarioFuncion;
    }

    public List<Programacion> getProgramacion() {
        return programacion;
    }

    public void setProgramacion(List<Programacion> programacion) {
        this.programacion = programacion;
    }
    
}
