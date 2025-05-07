package main.test;

import main.java.es.uah.matcomp.mp.el3.a.ejemplo.Alumno;
import main.java.es.uah.matcomp.mp.el3.a.ejemplo.Asignatura;
import main.java.es.uah.matcomp.mp.el3.a.ejemplo.Estudiante;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test unitario para la clase Asignatura:
 * - Con lista de estudiantes (versión interna de Alumno)
 * - Con array fijo de estudiantes (versión externa)
 * - Lectura/escritura con Gson
 */
public class TestAsignatura {

    // -------------------- TESTS PARA VERSIÓN CON LIST --------------------

    /**
     * Prueba creación de Asignatura con lista de estudiantes.
     */
    @Test
    public void testAsignaturaConLista() {
        List<Alumno.Estudiante> lista = new ArrayList<>();
        lista.add(new Alumno.Estudiante("Ana", 20, 7.5));
        lista.add(new Alumno.Estudiante("Luis", 21, 6.5));

        Alumno.Asignatura asignatura = new Alumno.Asignatura("Historia", lista);

        String texto = asignatura.toString();
        assertNotNull(texto);
        assertTrue(texto.contains("Ana"));
        assertTrue(texto.contains("Luis"));
        assertTrue(texto.contains("Historia"));
    }

    /**
     * Prueba guardado y carga de Asignatura con lista de estudiantes.
     */
    @Test
    public void testGuardarYCargarAsignaturaConLista() {
        List<Alumno.Estudiante> lista = new ArrayList<>();
        lista.add(new Alumno.Estudiante("Ana", 20, 7.5));
        lista.add(new Alumno.Estudiante("Luis", 21, 6.5));

        Alumno.Asignatura original = new Alumno.Asignatura("Historia", lista);
        String ruta = "test_asignatura_lista.json";

        Alumno.guardarObjetoEnArchivo(ruta, original);
        Alumno.Asignatura cargada = Alumno.cargarObjetoDesdeArchivo(ruta, Alumno.Asignatura.class);

        assertNotNull(cargada);
        String texto = cargada.toString();
        assertTrue(texto.contains("Ana"));
        assertTrue(texto.contains("Luis"));
        assertTrue(texto.contains("Historia"));

        new File(ruta).delete(); // Limpieza
    }

    // -------------------- TESTS PARA VERSIÓN CON ARRAY --------------------

    /**
     * Prueba creación de Asignatura con array interno de estudiantes.
     */
    @Test
    public void testAsignaturaConArrayInterno() {
        Asignatura asignatura = new Asignatura("Literatura");

        String texto = asignatura.toString();
        assertNotNull(texto);
        assertTrue(texto.contains("Pablo"));
        assertTrue(texto.contains("Hugo"));
        assertTrue(texto.contains("Literatura"));
    }

    /**
     * Prueba guardado y carga de Asignatura con array interno.
     */
    @Test
    public void testGuardarYCargarAsignaturaConArrayInterno() {
        Asignatura original = new Asignatura("Literatura");
        String ruta = "test_asignatura_array.json";

        Alumno.guardarObjetoEnArchivo(ruta, original);
        Asignatura cargada = Alumno.cargarObjetoDesdeArchivo(ruta, Asignatura.class);

        assertNotNull(cargada);
        String texto = cargada.toString();
        assertTrue(texto.contains("Pablo"));
        assertTrue(texto.contains("Hugo"));
        assertTrue(texto.contains("Literatura"));

        new File(ruta).delete(); // Limpieza
    }
}

