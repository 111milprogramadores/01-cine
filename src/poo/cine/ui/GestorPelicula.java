/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.cine.ui;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import poo.cine.Actor;
import poo.cine.Calificacion;
import poo.cine.Cine;
import poo.cine.Genero;
import poo.cine.PaisDeOrigen;
import poo.cine.Pelicula;
import poo.cine.Personaje;
import poo.cine.Rol;
import poo.cine.Sexo;
import poo.cine.dao.CalificacionesDao;
import poo.cine.dao.CalificacionesDaoImpl;
import poo.cine.dao.GenerosDao;
import poo.cine.dao.GenerosDaoImpl;
import poo.cine.dao.PaisesDao;
import poo.cine.dao.PaisesDaoImpl;
import poo.cine.dao.PeliculasDao;
import poo.cine.dao.PeliculasDaoImpl;

/**
 *
 * @author joaquinleonelrobles
 */
public class GestorPelicula {
    
    private Cine cine;
    
    private GenerosDao generosDao;
    private CalificacionesDao calificacionesDao;
    private PaisesDao paisesDao;
    private PeliculasDao peliculasDao;

    public GestorPelicula() {
        Calendar ahora = Calendar.getInstance();
        
        // creamos el cine
        cine = new Cine("Marcelo T. de Alvear 820", ahora.getTime(), "Gran Cine", new BigDecimal(57));
        
        // creamos las instancias de los objetos de acceso a datos
        this.generosDao = new GenerosDaoImpl();
        this.calificacionesDao = new CalificacionesDaoImpl();
        this.paisesDao = new PaisesDaoImpl();
        this.peliculasDao = new PeliculasDaoImpl();
    }
    
    public void run () {
        // obtenemos los objetos para completar las listas de seleccion
        List<Genero> generos = generosDao.obtenerTodos();
        List<Calificacion> calificaciones = calificacionesDao.obtenerTodas();
        List<PaisDeOrigen> paises = paisesDao.obtenerTodos();
        
        // creamos una instancia del formulario y lo mostramos
        PantallaAdministracionPelicula panel = new PantallaAdministracionPelicula(generos, calificaciones, paises, this);
        panel.setVisible(true);
    }
    
    public List<Personaje> obtenerElenco () {
        // mockup del resultado de la llamada al caso de uso "Registrar Elenco"
        Sexo masculino = new Sexo("Masculino");
        Actor ricardo = new Actor(false, "Darín", "Ricardo", masculino);
        Rol protagonista = new Rol("Protagonista");
        
        List<Personaje> personajes = new ArrayList<>();                
        personajes.add(new Personaje("Bombita", ricardo, protagonista));
        
        return personajes;
    }

    public Pelicula buscarPeliculaPorNombre(String nombre) {
        return peliculasDao.buscarPorNombre(nombre);
    }
    
    public void guardarPelicula (Pelicula pelicula) {
        peliculasDao.guardar(pelicula);
    }
}
