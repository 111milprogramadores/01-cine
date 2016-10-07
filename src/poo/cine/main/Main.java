package poo.cine.main;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import poo.cine.Actor;
import poo.cine.Calificacion;
import poo.cine.Cine;
import poo.cine.Funcion;
import poo.cine.Genero;
import poo.cine.PaisDeOrigen;
import poo.cine.Pelicula;
import poo.cine.Personaje;
import poo.cine.Programacion;
import poo.cine.Rol;
import poo.cine.Sexo;
import poo.cine.HorarioFuncion;
import poo.cine.Sala;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author joaquinleonelrobles
 */
public class Main {
    
    public static void main (String[] args) {
        Calendar ahora = Calendar.getInstance();
        
        // creamos instancias de Cines
        Cine cine1 = new Cine("Marcelo T. de Alvear 820", ahora.getTime(), "Gran Cine");
        Cine cine2 = new Cine("Padre Lozano 1122", ahora.getTime(), "El Cine de Polo");

        // creamos las salas
        Sala sala1 = new Sala(100, 1);
        Sala sala2 = new Sala(200, 2);

        // creamos las horas de inicio y fin de las funciones
        Calendar inicioFuncion = Calendar.getInstance();
        inicioFuncion.set(Calendar.HOUR, 17);
        inicioFuncion.set(Calendar.MINUTE, 0);
        inicioFuncion.set(Calendar.SECOND, 0);
        
        Calendar finFuncion = Calendar.getInstance();
        finFuncion.set(Calendar.HOUR, 23);
        finFuncion.set(Calendar.MINUTE, 0);
        finFuncion.set(Calendar.SECOND, 0);

        // creamos los horarios disponibles para las funciones
        HorarioFuncion horariosLunes     = new HorarioFuncion(Calendar.MONDAY, 20, 10, false, inicioFuncion.getTime(), finFuncion.getTime());
        HorarioFuncion horariosMartes    = new HorarioFuncion(Calendar.MONDAY, 20, 10, false, inicioFuncion.getTime(), finFuncion.getTime());
        HorarioFuncion horariosMiercoles = new HorarioFuncion(Calendar.MONDAY, 20, 10, false, inicioFuncion.getTime(), finFuncion.getTime());
        HorarioFuncion horariosJueves    = new HorarioFuncion(Calendar.MONDAY, 20, 10, false, inicioFuncion.getTime(), finFuncion.getTime());
        HorarioFuncion horariosViernes   = new HorarioFuncion(Calendar.MONDAY, 20, 10, false, inicioFuncion.getTime(), finFuncion.getTime());
        HorarioFuncion horariosSabado    = new HorarioFuncion(Calendar.MONDAY, 20, 10, false, inicioFuncion.getTime(), finFuncion.getTime());
        HorarioFuncion horariosDomingo   = new HorarioFuncion(Calendar.MONDAY, 20, 10, false, inicioFuncion.getTime(), finFuncion.getTime());
        
        // creamos los sexos
        Sexo masculino = new Sexo("Masculino");
        Sexo femenino = new Sexo("Femenino");
        
        // creamos los roles
        Rol protagonista = new Rol("Protagonista");
        Rol secundario = new Rol("Secundario");
        
        // creamos los actores
        Actor leonardo = new Actor(false, "Di Caprio", "Leonardo", masculino);
        Actor adelaida = new Actor(false, "Clemens", "Adelaide", femenino);
        Actor gerardo = new Actor(false, "Buttler", "Gerard", masculino);
        Actor lena = new Actor(false, "Headey", "Lena", femenino);
        Actor margot = new Actor(false, "Robbie", "Margot", femenino);
        Actor erica = new Actor(false, "Rivas", "Erica", femenino);
        Actor ricardo = new Actor(false, "Darín", "Ricardo", masculino);
        Actor marlon = new Actor(false, "Brando", "Marlon", masculino);
        
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
        
        // creamos las peliculas
        Pelicula elGranGatsby = new Pelicula(2013, true, 143, "El Gran Gatsby", "The Great Gatsby");
        elGranGatsby.setPaisDeOrigen(australia);
        elGranGatsby.setGenero(drama);
        elGranGatsby.setCalificacion(muybuena);
        elGranGatsby.getPersonajes().add(new Personaje("Gatsby", leonardo, protagonista));
        elGranGatsby.getPersonajes().add(new Personaje("Catherine", adelaida, secundario));
        
        Pelicula elPadrino = new Pelicula(1993, false, 175, "El Padrino", "The Godfather");
        elGranGatsby.setPaisDeOrigen(eeuu);
        elGranGatsby.setGenero(drama);
        elGranGatsby.setCalificacion(excelente);
        elGranGatsby.getPersonajes().add(new Personaje("Vito Corleone", marlon, protagonista));
        
        Pelicula elLoboDeWallStreet = new Pelicula(2013, true, 180, "El Lobo de Wall Street", "The Wolf of Wall Street");
        elLoboDeWallStreet.setPaisDeOrigen(eeuu);
        elLoboDeWallStreet.setGenero(drama);
        elLoboDeWallStreet.setCalificacion(excelente);
        elLoboDeWallStreet.getPersonajes().add(new Personaje("Jordan Belfort", leonardo, protagonista));
        elLoboDeWallStreet.getPersonajes().add(new Personaje("Naomi Lapaglia", margot, secundario));
        
        Pelicula relatosSalvajes = new Pelicula(2014, true, 122, "Relatos Salvajes", "Relatos Salvajes");
        relatosSalvajes.setPaisDeOrigen(argentina);
        relatosSalvajes.setGenero(comedia);
        relatosSalvajes.setCalificacion(excelente);
        relatosSalvajes.getPersonajes().add(new Personaje("Bombita", ricardo, protagonista));
        relatosSalvajes.getPersonajes().add(new Personaje("Romina", erica, protagonista));
        
        Pelicula trescientos = new Pelicula(2006, true, 117, "300", "300");
        trescientos.setPaisDeOrigen(eeuu);
        trescientos.setGenero(accion);
        trescientos.setCalificacion(buena);
        trescientos.getPersonajes().add(new Personaje("Leonidas", gerardo, protagonista));
        trescientos.getPersonajes().add(new Personaje("Reina Gorgo", lena, secundario));
        
        // vamos a crear las funciones para el Gran Gatsby
        Calendar inicioProgramacion = Calendar.getInstance();
        inicioProgramacion.set(Calendar.DAY_OF_MONTH, 1);
        inicioProgramacion.set(Calendar.MONTH, Calendar.OCTOBER);
        inicioProgramacion.set(Calendar.YEAR, 2016);
        
        Calendar finProgramacion = Calendar.getInstance();
        finProgramacion.set(Calendar.DAY_OF_MONTH, 31);
        finProgramacion.set(Calendar.MONTH, Calendar.OCTOBER);
        finProgramacion.set(Calendar.YEAR, 2016);
        
        // creamos el listado de funciones de octubre
        List<Funcion> funcionesOctubre = new ArrayList<Funcion>();

        // creamos los horarios de las funciones
        Calendar segundaFuncion = Calendar.getInstance();
        segundaFuncion.set(Calendar.HOUR, 19);
        segundaFuncion.set(Calendar.MINUTE, 0);
        segundaFuncion.set(Calendar.SECOND, 0);
        
        Calendar terceraFuncion = Calendar.getInstance();
        terceraFuncion.set(Calendar.HOUR, 21);
        terceraFuncion.set(Calendar.MINUTE, 0);
        terceraFuncion.set(Calendar.SECOND, 0);
        
        // creamos las Funciones del LUNES
        Funcion lunes1 = new Funcion(Calendar.MONDAY, elLoboDeWallStreet.calcularDuracionEnFuncion(horariosLunes), inicioFuncion.getTime(), 1, elLoboDeWallStreet, sala1);
        Funcion lunes2 = new Funcion(Calendar.MONDAY, elGranGatsby.calcularDuracionEnFuncion(horariosLunes), segundaFuncion.getTime(), 2, elGranGatsby, sala2);
        Funcion lunes3 = new Funcion(Calendar.MONDAY, relatosSalvajes.calcularDuracionEnFuncion(horariosLunes), terceraFuncion.getTime(), 3, relatosSalvajes, sala1);
        Funcion lunes4 = new Funcion(Calendar.MONDAY, trescientos.calcularDuracionEnFuncion(horariosLunes), finFuncion.getTime(), 4, trescientos, sala2);

        // creamos las Funciones del MARTES
        Funcion martes1 = new Funcion(Calendar.TUESDAY, elGranGatsby.calcularDuracionEnFuncion(horariosMartes), inicioFuncion.getTime(), 5, elGranGatsby, sala2);
        Funcion martes2 = new Funcion(Calendar.TUESDAY, trescientos.calcularDuracionEnFuncion(horariosMartes), segundaFuncion.getTime(), 6, trescientos, sala2);
        Funcion martes3 = new Funcion(Calendar.TUESDAY, relatosSalvajes.calcularDuracionEnFuncion(horariosMartes), terceraFuncion.getTime(), 7, relatosSalvajes, sala1);
        Funcion martes4 = new Funcion(Calendar.TUESDAY, elLoboDeWallStreet.calcularDuracionEnFuncion(horariosMartes), finFuncion.getTime(), 8, elLoboDeWallStreet, sala1);
        
        // creamos las Funciones del MIERCOLES
        Funcion miercoles1 = new Funcion(Calendar.WEDNESDAY, relatosSalvajes.calcularDuracionEnFuncion(horariosMiercoles), inicioFuncion.getTime(), 9, relatosSalvajes, sala1);
        Funcion miercoles2 = new Funcion(Calendar.WEDNESDAY, elGranGatsby.calcularDuracionEnFuncion(horariosMiercoles), segundaFuncion.getTime(), 10, elGranGatsby, sala2);
        Funcion miercoles3 = new Funcion(Calendar.WEDNESDAY, elLoboDeWallStreet.calcularDuracionEnFuncion(horariosMiercoles), terceraFuncion.getTime(), 11, elLoboDeWallStreet, sala1);
        Funcion miercoles4 = new Funcion(Calendar.WEDNESDAY, trescientos.calcularDuracionEnFuncion(horariosMiercoles), finFuncion.getTime(), 12, trescientos, sala2);
       
         // creamos las Funciones del JUEVES
        Funcion jueves1 = new Funcion(Calendar.THURSDAY, trescientos.calcularDuracionEnFuncion(horariosJueves), inicioFuncion.getTime(), 13, trescientos, sala2);
        Funcion jueves2 = new Funcion(Calendar.THURSDAY, elGranGatsby.calcularDuracionEnFuncion(horariosJueves), segundaFuncion.getTime(), 14, elGranGatsby, sala2);
        Funcion jueves3 = new Funcion(Calendar.THURSDAY, elLoboDeWallStreet.calcularDuracionEnFuncion(horariosJueves), terceraFuncion.getTime(), 15, elLoboDeWallStreet, sala1);
        Funcion jueves4 = new Funcion(Calendar.THURSDAY, relatosSalvajes.calcularDuracionEnFuncion(horariosJueves), finFuncion.getTime(), 16, relatosSalvajes, sala1);
        
        // creamos las Funciones del VIERNES
        Funcion viernes1 = new Funcion(Calendar.FRIDAY, relatosSalvajes.calcularDuracionEnFuncion(horariosViernes), inicioFuncion.getTime(), 17, relatosSalvajes, sala1);
        Funcion viernes2 = new Funcion(Calendar.FRIDAY, elGranGatsby.calcularDuracionEnFuncion(horariosViernes), segundaFuncion.getTime(), 18, elGranGatsby, sala2);
        Funcion viernes3 = new Funcion(Calendar.FRIDAY, trescientos.calcularDuracionEnFuncion(horariosViernes), terceraFuncion.getTime(), 19, trescientos, sala1);
        Funcion viernes4 = new Funcion(Calendar.FRIDAY, elLoboDeWallStreet.calcularDuracionEnFuncion(horariosViernes), finFuncion.getTime(), 20, elLoboDeWallStreet, sala2);
        
        // creamos las Funciones del SÁBADO
        Funcion sabado1 = new Funcion(Calendar.SATURDAY, elLoboDeWallStreet.calcularDuracionEnFuncion(horariosSabado), inicioFuncion.getTime(), 21, elLoboDeWallStreet, sala1);
        Funcion sabado2 = new Funcion(Calendar.SATURDAY, trescientos.calcularDuracionEnFuncion(horariosSabado), segundaFuncion.getTime(), 22, trescientos, sala1);
        Funcion sabado3 = new Funcion(Calendar.SATURDAY, relatosSalvajes.calcularDuracionEnFuncion(horariosSabado), terceraFuncion.getTime(), 23, relatosSalvajes, sala2);
        Funcion sabado4 = new Funcion(Calendar.SATURDAY, elGranGatsby.calcularDuracionEnFuncion(horariosSabado), finFuncion.getTime(), 24, elGranGatsby, sala2);
        
        // creamos las Funciones del DOMINGO
        Funcion domingo1 = new Funcion(Calendar.SUNDAY, relatosSalvajes.calcularDuracionEnFuncion(horariosDomingo), inicioFuncion.getTime(), 25, relatosSalvajes, sala2);
        Funcion domingo2 = new Funcion(Calendar.SUNDAY, elLoboDeWallStreet.calcularDuracionEnFuncion(horariosDomingo), segundaFuncion.getTime(), 26, elLoboDeWallStreet, sala1);
        Funcion domingo3 = new Funcion(Calendar.SUNDAY, trescientos.calcularDuracionEnFuncion(horariosDomingo), terceraFuncion.getTime(), 27, trescientos, sala1);
        Funcion domingo4 = new Funcion(Calendar.SUNDAY, elGranGatsby.calcularDuracionEnFuncion(horariosDomingo), finFuncion.getTime(), 28, elGranGatsby, sala2);
        
        // asignamos cada una de las funciones creadas a la lista de funciones: funcionesOctubre
        funcionesOctubre.add(lunes1);
        funcionesOctubre.add(lunes2);
        funcionesOctubre.add(lunes3);
        funcionesOctubre.add(lunes4);
        
        funcionesOctubre.add(martes1);
        funcionesOctubre.add(martes2);
        funcionesOctubre.add(martes3);
        funcionesOctubre.add(martes4);
        
        funcionesOctubre.add(miercoles1);
        funcionesOctubre.add(miercoles2);
        funcionesOctubre.add(miercoles3);
        funcionesOctubre.add(miercoles4);
        
        funcionesOctubre.add(jueves1);
        funcionesOctubre.add(jueves2);
        funcionesOctubre.add(jueves3);
        funcionesOctubre.add(jueves4);
        
        funcionesOctubre.add(viernes1);
        funcionesOctubre.add(viernes2);
        funcionesOctubre.add(viernes3);
        funcionesOctubre.add(viernes4);
        
        funcionesOctubre.add(sabado1);
        funcionesOctubre.add(sabado2);
        funcionesOctubre.add(sabado3);
        funcionesOctubre.add(sabado4);
        
        funcionesOctubre.add(domingo1);
        funcionesOctubre.add(domingo2);
        funcionesOctubre.add(domingo3);
        funcionesOctubre.add(domingo4);
        
        
        
        // creamos la programacion de octubre con la lista de funciones: funcionesOctubre
        Programacion octubre = new Programacion(inicioProgramacion.getTime(), finProgramacion.getTime(), ahora.getTime(), funcionesOctubre);
        
        // agregamos la programacion de octubre al cine
        cine1.getProgramaciones().add(octubre);
        
        System.out.print(cine1.mostrarCine());
    }
    
}
