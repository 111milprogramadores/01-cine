/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.cine.test;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import poo.cine.Funcion;
import poo.cine.Programacion;

/**
 *
 * @author joaquinleonelrobles
 */
public class ProgramacionTest {
    
    private Programacion programacion;
    
    public ProgramacionTest() {
    }
    
    @Before
    public void setUp() {
        // creamos las fechas de inicio y fin
        // INICIO 17/10/2016 00:00:00
        Calendar inicio = Calendar.getInstance();
        inicio.set(2016, 10, 17, 0, 0, 0);
        inicio.set(Calendar.MILLISECOND, 0);
        
        // FIN 23/10/2016 23:59:59
        Calendar fin = Calendar.getInstance();
        fin.set(2016, 10, 23, 23, 59, 59);
        fin.set(Calendar.MILLISECOND, 999);
        
        Calendar hoy = Calendar.getInstance();
        hoy.set(2016, 10, 10, 18, 0, 0);
        hoy.set(Calendar.MILLISECOND, 0);
        
        // creamos la lista de funciones
        List<Funcion> funciones = new ArrayList<>();
        
        programacion = new Programacion(inicio.getTime(), fin.getTime(), hoy.getTime(), funciones);
    }
    
    /**
     * Probamos el cálculo de vigencia de la programación en distintas fechas
     * usando las estrategias de Análisis de Valores Límite y Particiones de 
     * Equivalencia, probamos fechas antes, durante y después del inicio y 
     * fin de la Programación y también probamos en los mismos momentos de 
     * inicio y fin.
     */
    @Test
    public void probarEstaVigente () {
        // probamos en una fecha anterior al inicio
        Calendar antes = Calendar.getInstance();
        antes.set(2015, 4, 11, 13, 14, 15);
        assertFalse(programacion.estaVigente(antes.getTime()));
        
        // probamos el mismo momento de inicio
        Calendar inicio = Calendar.getInstance();
        inicio.set(2016, 10, 17, 0, 0, 0);
        assertTrue(programacion.estaVigente(inicio.getTime()));
        
        // probamos entre las fechas de inicio y fin
        Calendar durante = Calendar.getInstance();
        durante.set(2016, 10, 20, 0, 0, 0);
        assertTrue(programacion.estaVigente(durante.getTime()));
        
        // probamos el mismo momento de fin
        Calendar fin = Calendar.getInstance();
        fin.set(2016, 10, 23, 23, 59, 59);
        fin.set(Calendar.MILLISECOND, 999);
        assertTrue(programacion.estaVigente(fin.getTime()));
        
        // probamos despues del fin
        Calendar despues = Calendar.getInstance();
        despues.set(2016, 10, 24, 0, 0, 0);
        assertFalse(programacion.estaVigente(despues.getTime()));
    }
}
