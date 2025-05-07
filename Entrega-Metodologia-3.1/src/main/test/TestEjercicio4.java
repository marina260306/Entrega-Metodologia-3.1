package main.test;

import main.java.es.uah.matcomp.mp.el3.a.ejemplo.Ejercicio4;
import main.java.es.uah.matcomp.mp.el3.a.ejemplo.Asignatura;
import org.junit.jupiter.api.Test;

import java.io.File;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test para Ejercicio4: guardar una Asignatura en JSON.
 */
public class TestEjercicio4 {

    @Test
    void testGuardarAsignaturaEjercicio4() {
        Asignatura asignatura = new Asignatura("Matemáticas");
        String ruta = "test_asignatura_ej4.json";

        Ejercicio4.guardarObjetoEnArchivo(ruta, asignatura);

        File archivo = new File(ruta);
        assertTrue(archivo.exists());
        assertTrue(archivo.length() > 0);

        archivo.delete();
    }
}
