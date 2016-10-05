/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.cine;

import java.util.Date;

/**
 *
 * @author Candelaria
 */
public class HorarioFuncion {
    
    private int diaDeSemana;
    private float duracionIntervaloFunc;
    private float duracionPublicidad;
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
     * @param duracionIntervaloFunc
     * @param duracionPublicidad
     * @param esTrasnoche
     * @param horaPrimeraFuncion
     * @param horaUltimaFuncion 
     */
    public HorarioFuncion(int diaDeSemana, float duracionIntervaloFunc, float duracionPublicidad, boolean esTrasnoche, Date horaPrimeraFuncion, Date horaUltimaFuncion) {
        this.diaDeSemana = diaDeSemana;
        this.duracionIntervaloFunc = duracionIntervaloFunc;
        this.duracionPublicidad = duracionPublicidad;
        this.esTrasnoche = esTrasnoche;
        this.horaPrimeraFuncion = horaPrimeraFuncion;
        this.horaUltimaFuncion = horaUltimaFuncion;
    }
    
    /**
     * Devolvemos una cadena de texto indicando los horarios de las funciones
     * 
     * @return 
     */
    public String mostrarHorarioFuncion() {
       return "El horario de la primera función es: " +  this.horaPrimeraFuncion
           + " El horario de la última función es: " + this.horaUltimaFuncion;
    }
    

    // A continuación se listan todos los métodos de seteo 
    // de cada atributo de la clase 
    
    public int getDiaDeSemana() {
        return diaDeSemana;
    }

    public void setDiaDeSemana(int diaDeSemana) {
        this.diaDeSemana = diaDeSemana;
    }

    public float getDuracionIntervaloFunc() {
        return duracionIntervaloFunc;
    }

    public void setDuracionIntervaloFunc(float duracionIntervaloFunc) {
        this.duracionIntervaloFunc = duracionIntervaloFunc;
    }

    public float getDuracionPublicidad() {
        return duracionPublicidad;
    }

    public void setDuracionPublicidad(float duracionPublicidad) {
        this.duracionPublicidad = duracionPublicidad;
    }

    public boolean isEsTrasnoche() {
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
    
}
