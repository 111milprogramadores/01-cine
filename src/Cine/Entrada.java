/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cine;

import java.util.Date;

/**
 *
 * @author Candelaria
 */
public class Entrada {

    private Date fechaFuncion;
    private Date fechaVenta;
    private Date horaFuncion;
    private Date horaVenta;
    private Pelicula pelicula;
    private float precioCobrado;
    private Sala sala;
    private int ticketNro; //Singleton posible

     /**Constructor por Defecto. **/
    public Entrada() {
    }
    
     /**Este constructor incluye todos los atributos de la clase Entrada. **/
   
    public Entrada(Date fechaFuncion, Date fechaVenta, Date horaFuncion, Date horaVenta, Pelicula pelicula, float precioCobrado, Sala sala, int ticketNro) {
        this.fechaFuncion = fechaFuncion;
        this.fechaVenta = fechaVenta;
        this.horaFuncion = horaFuncion;
        this.horaVenta = horaVenta;
        this.pelicula = pelicula;
        this.precioCobrado = precioCobrado;
        this.sala = sala;
        this.ticketNro = ticketNro;
    }

     //A continuación se listan todos los métodos de seteo de cada atributo de la clase.
   
    public Date getFechaFuncion() {
        return fechaFuncion;
    }

    public void setFechaFuncion(Date fechaFuncion) {
        this.fechaFuncion = fechaFuncion;
    }

    public Date getFechaVenta() {
        return fechaVenta;
    }

    public void setFechaVenta(Date fechaVenta) {
        this.fechaVenta = fechaVenta;
    }

    public Date getHoraFuncion() {
        return horaFuncion;
    }

    public void setHoraFuncion(Date horaFuncion) {
        this.horaFuncion = horaFuncion;
    }

    public Date getHoraVenta() {
        return horaVenta;
    }

    public void setHoraVenta(Date horaVenta) {
        this.horaVenta = horaVenta;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    public float getPrecioCobrado() {
        return precioCobrado;
    }

    public void setPrecioCobrado(float precioCobrado) {
        this.precioCobrado = precioCobrado;
    }

    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }

    public int getTicketNro() {
        return ticketNro;
    }

    public void setTicketNro(int ticketNro) {
        this.ticketNro = ticketNro;
    }
    
    
}
