/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.cine;

/**
 *
 * @author Candelaria
 */
public class Sala {
    
    private int capacidad;
    private int numero;

    /**
     * Constructor por Defecto
     */
    public Sala() {
    }
    
    /**
     * Este constructor incluye todos los atributos de la clase Sala
     * 
     * @param capacidad
     * @param numero 
     */
    public Sala(int capacidad, int numero) {
        this.capacidad = capacidad;
        this.numero = numero;
    }

    // A continuación se listan todos los métodos de seteo 
    // de cada atributo de la clase
    
    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public int getNumero() {
        return numero;
    }
   
    public void setNumero(int numero) {
        this.numero = numero;
    }     

    @Override
    public String toString() {
        return "Sala " + numero + " (" + capacidad + " butacas)";
    }    
}
