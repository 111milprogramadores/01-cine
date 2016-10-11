/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.cine.ui;

import java.math.BigDecimal;
import java.util.Calendar;
import poo.cine.Calificacion;
import poo.cine.Cine;
import poo.cine.Genero;
import poo.cine.PaisDeOrigen;

/**
 *
 * @author joaquinleonelrobles
 */
public class GestorPelicula {
    
    private static PantallaAdministracionPelicula panel;
    private static Cine cine;
    
    public static void main (String[] args) {
        Calendar ahora = Calendar.getInstance();
        
        // creamos el cine
        cine = new Cine("Marcelo T. de Alvear 820", ahora.getTime(), "Gran Cine", new BigDecimal(57));
        
        // creamos los generos
        Genero drama = new Genero("Drama");
        Genero comedia = new Genero("Comedia");
        Genero accion = new Genero("Acción");
        
        // creamos las calificacciones
        Calificacion excelente = new Calificacion("Excelente");
        Calificacion muybuena = new Calificacion("Muy Buena");
        Calificacion buena = new Calificacion("Buena");
        
        // creamos los paises de origen
        PaisDeOrigen eeuu = new PaisDeOrigen("Inglés", "Estados Unidos");
        PaisDeOrigen australia = new PaisDeOrigen("Inglés", "Australia");
        PaisDeOrigen argentina = new PaisDeOrigen("Español", "Argentina");
        
        // creamos una instancia del formulario y lo mostramos
        panel = new PantallaAdministracionPelicula();
        panel.setVisible(true);
    }
}
