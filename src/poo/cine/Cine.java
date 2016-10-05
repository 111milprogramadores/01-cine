/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.cine;

import java.math.BigDecimal;
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
    private List<HorarioFuncion> horariosFunciones;
    private List<Programacion> programaciones;
    private BigDecimal precioEntrada;
    
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
     * @param horariosFunciones
     * @param programaciones
     */
    public Cine(String direccion, Date fechaInauguracion, String nombre, List<Sala> sala, List<HorarioFuncion> horariosFunciones, List<Programacion> programaciones) {
        this.direccion = direccion;
        this.fechaInauguracion = fechaInauguracion;
        this.nombre = nombre;
        this.sala = sala;
        this.horariosFunciones = horariosFunciones;
        this.programaciones = programaciones;
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
    
    /**
     * Devolvemos una represetación textual de Cine
     * 
     * @return 
     */
    public String mostrarCine () {
        return null;
    }
    
    /**
     * Obtenemos una representación textual de los horarios de las distintas
     * Funciones disponibles por día para este Cine
     * 
     * @return 
     */
    public String mostrarHorariosFunciones () {
        return null;
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

    public List<HorarioFuncion> getHorariosFunciones() {
        return horariosFunciones;
    }

    public void setHorariosFunciones(List<HorarioFuncion> horariosFunciones) {
        this.horariosFunciones = horariosFunciones;
    }

    public List<Programacion> getProgramaciones() {
        return programaciones;
    }

    public void setProgramaciones(List<Programacion> programaciones) {
        this.programaciones = programaciones;
    }

    public BigDecimal getPrecioEntrada() {
        return precioEntrada;
    }

    public void setPrecioEntrada(BigDecimal precioEntrada) {
        this.precioEntrada = precioEntrada;
    }
    
}
