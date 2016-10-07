/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.cine;

import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Candelaria
 */
public class HorarioFuncion {
    
    private int diaDeSemana;
    private int duracionIntervalo;
    private int duracionPublicidad;
    private boolean esTrasnoche;
    private Date horaPrimeraFuncion;
    private Date horaUltimaFuncion;
    
    /**
     * Constructor por Defecto
     */
    public HorarioFuncion() {
    }

    /**
     * Este constructor incluye todos los atributos de la clase HorarioFuncion
     * 
     * @param diaDeSemana
     * @param duracionIntervalo
     * @param duracionPublicidad
     * @param esTrasnoche
     * @param horaPrimeraFuncion
     * @param horaUltimaFuncion 
     */
    public HorarioFuncion(int diaDeSemana, int duracionIntervalo, int duracionPublicidad, boolean esTrasnoche, Date horaPrimeraFuncion, Date horaUltimaFuncion) {
        this.diaDeSemana = diaDeSemana;
        this.duracionIntervalo = duracionIntervalo;
        this.duracionPublicidad = duracionPublicidad;
        this.esTrasnoche = esTrasnoche;
        this.horaPrimeraFuncion = horaPrimeraFuncion;
        this.horaUltimaFuncion = horaUltimaFuncion;
    }
   
 
    /**
     * Método que devuelve el nombre del día correspondiente al int del mismo.
     * 
     * @return String
     */
    
    private String obtenerDescripcionDia(){
        
        String dia;
        switch(this.diaDeSemana)
        {
            case Calendar.MONDAY: 
                dia="Lunes";
                break;
            case Calendar.TUESDAY:
                dia="Martes";
                break;
            case Calendar.WEDNESDAY: 
                dia="Miércoles";
                break;
            case Calendar.THURSDAY:
                dia="Jueves";
            case Calendar.FRIDAY: 
                dia="Viernes";
                break;
            case Calendar.SATURDAY:
                dia="Sábado";
                break;
            case Calendar.SUNDAY: 
                dia="Domingo";
                break;
            default: 
                dia="No es un día";  
        }
        return dia;
    }

    // A continuación se listan todos los métodos de seteo 
    // de cada atributo de la clase 
    
    public int getDiaDeSemana() {
        return diaDeSemana;
    }

    public void setDiaDeSemana(int diaDeSemana) {
        this.diaDeSemana = diaDeSemana;
    }

    public int getDuracionIntervalo() {
        return duracionIntervalo;
    }

    public void setDuracionIntervalo(int duracionIntervalo) {
        this.duracionIntervalo = duracionIntervalo;
    }

    public int getDuracionPublicidad() {
        return duracionPublicidad;
    }

    public void setDuracionPublicidad(int duracionPublicidad) {
        this.duracionPublicidad = duracionPublicidad;
    }

    public boolean esTrasnoche() {
        return esTrasnoche;
    }

    public void setEsTrasnoche(boolean esTrasnoche) {
        this.esTrasnoche = esTrasnoche;
    }

    public Date getHoraPrimeraFuncion() {
        return horaPrimeraFuncion;
    }

    public void setHoraPrimeraFuncion(Date horaPrimeraFuncion) {
        this.horaPrimeraFuncion = horaPrimeraFuncion;
    }

    public Date getHoraUltimaFuncion() {
        return horaUltimaFuncion;
    }

    public void setHoraUltimaFuncion(Date horaUltimaFuncion) {
        this.horaUltimaFuncion = horaUltimaFuncion;
    }
    
    /**
     * Devolvemos una cadena de texto indicando los horarios de las funciones
     * 
     * @return String
     */
    @Override
    public String toString() {
        // TODO implementar
        StringBuilder sb = new StringBuilder();
        sb.append("Los horarios para el día: ").append(obtenerDescripcionDia()).append("son: ");
        sb.append("Duración del Intervalo: ").append(duracionIntervalo).append("\n");
        sb.append("Duración de la Publicidad: ").append(duracionPublicidad).append("\n");
        sb.append("Acepta Trasnoche: ").append(esTrasnoche).append("\n");
        sb.append("Horario Primera Función: ").append(horaPrimeraFuncion).append("\n");
        sb.append("Horario Última Función: ").append(horaUltimaFuncion).append("\n");        
        return sb.toString();
    }
}
