/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.cine;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Candelaria
 */
public class Cine {
    
    private String direccion;
    private Date fechaInauguracion;
    private String nombre;
    private List<Sala> salas;
    private List<HorarioFuncion> horariosFunciones;
    private List<Programacion> programaciones;
    private BigDecimal precioEntrada;
    
    /**
     * Constructor por Defecto
     */
    public Cine() {
        salas = new ArrayList<>();
        horariosFunciones= new ArrayList<>();
        programaciones= new ArrayList<>();
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
        this.salas = sala;
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
        this.salas = new ArrayList<>();
        this.horariosFunciones= new ArrayList<>();
        this.programaciones= new ArrayList<>();
    }
    
    /**
     * Devolvemos una represetación textual de Cine
     * 
     * @return 
     */
    public String mostrarCine () {
        
        StringBuilder sb = new StringBuilder();
        sb.append("Nombre del Cine: ").append(this.nombre).append(" - Dirección: ").append(this.direccion).append("\n");
        sb.append("Fecha Inauguración: ").append(this.fechaInauguracion).append(" - Precio de la Entrada: ").append(this.precioEntrada).append("\n");
        sb.append("Salas: ");
        Iterator salasIt = salas.iterator();
        
        while(salasIt.hasNext()){
            Sala sala = (Sala)salasIt.next();
            sb.append(sala); //llama automaticamenticamente al método toString() de la Sala.            
        }
        
        Iterator horariosIt = horariosFunciones.iterator();
        while(horariosIt.hasNext())
        {
            HorarioFuncion horario = (HorarioFuncion)horariosIt.next();
            sb.append(horario); //llama automaticamenticamente al método toString() de la HorarioFuncion
            
        }
        sb.append("Programaciones: ").append(this.programaciones.toString());
        
        
        return sb.toString();
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

    public List<Sala> getSalas() {
        return salas;
    }

    public void setSalas(List<Sala> salas) {
        this.salas = salas;
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
