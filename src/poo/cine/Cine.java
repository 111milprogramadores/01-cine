/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.cine;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
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
        horariosFunciones = new ArrayList<>();
        programaciones = new ArrayList<>();
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
     * @param precioEntrada 
     */
    public Cine(String direccion, Date fechaInauguracion, String nombre, BigDecimal precioEntrada) {
        this.direccion = direccion;
        this.fechaInauguracion = fechaInauguracion;
        this.nombre = nombre;
        this.precioEntrada = precioEntrada;
        
        // inicializamos las colecciones vacias
        this.salas = new ArrayList<>();
        this.horariosFunciones = new ArrayList<>();
        this.programaciones = new ArrayList<>();
    }
    
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
    
    /**
     * Obtenemos la Programacion vigente para este Cine
     * 
     * @return 
     */
    public Programacion obtenerProgramacionVigente () {
        Programacion vigente = null;
        
        Iterator<Programacion> iter = programaciones.iterator();
        while (iter.hasNext()) {
            Programacion p = iter.next();
            
            // si esta vigente la devolvemos
            if (p.estaVigente()) {
                vigente = p;
                break;
            }
        }
        
        return vigente;
    }
 
    /**
     * Devolvemos una represetación textual de Cine
     * 
     * @return 
     */
    @Override
    public String toString () {
        // creamos una instancia del formateador de fechas
        SimpleDateFormat sdf = new SimpleDateFormat("d/M/y");
        
        StringBuilder sb = new StringBuilder();
        sb.append("Nombre del Cine: ").append(nombre).append(" - Dirección: ").append(direccion).append("\n");
        sb.append("Fecha Inauguración: ").append(sdf.format(fechaInauguracion)).append(" - Precio de la Entrada: $").append(precioEntrada).append("\n");
        sb.append("Salas: \n");
        
        // iteramos sobre las salas del cine
        Iterator<Sala> salasIt = salas.iterator();
        while (salasIt.hasNext()) {
            // llama automaticamenticamente al método toString() de la Sala
            sb.append(salasIt.next()).append("\n"); 
        }
        
        // iteramos sobre los horarios posibles de las funciones
        Iterator<HorarioFuncion> horariosIt = horariosFunciones.iterator();
        while (horariosIt.hasNext()) {
            // llama automaticamenticamente al método toString() de HorarioFuncion
            sb.append(horariosIt.next()).append("\n");
        }
        
        // agregamos las programacion vigente de este Cine
        sb.append("Programación vigente: \n").append(obtenerProgramacionVigente().toString());
        
        // devolvemos toda la cadena de texto resultante
        return sb.toString();
    }
}
