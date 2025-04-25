package main.test;

import main.java.es.uah.matcomp.mp.el3.a.ejemplo.Alumno;
import main.java.es.uah.matcomp.mp.el3.a.ejemplo.Usuario;
import main.java.es.uah.matcomp.mp.el3.a.ejemplo.Estudiante;
import org.junit.jupiter.api.Test;

import java.io.File;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test unitario para la clase Alumno.
 * Cubre los métodos genéricos:
 * - guardarObjetoEnArchivo
 * - cargarObjetoDesdeArchivo
 */
public class TestAlumno {

    @Test
    void testGuardarYCargarUsuario() {
        Usuario original = new Usuario("Mario", 19, "mario@example.com");
        String ruta = "usuario_test_alumno.json";

        Alumno.guardarObjetoEnArchivo(ruta, original);
        Usuario cargado = Alumno.cargarObjetoDesdeArchivo(ruta, Usuario.class);

        assertNotNull(cargado);
        assertEquals("Mario", cargado.nombre);
        assertEquals(19, cargado.edad);
        assertEquals("mario@example.com", cargado.correo);

        new File(ruta).delete();
    }

    @Test
    void testGuardarYCargarEstudiante() {
        Estudiante original = new Estudiante("Claudia", 18, 9.2);
        String ruta = "estudiante_test_alumno.json";

        Alumno.guardarObjetoEnArchivo(ruta, original);
        Estudiante cargado = Alumno.cargarObjetoDesdeArchivo(ruta, Estudiante.class);

        assertNotNull(cargado);

        new File(ruta).delete();
    }

    @Test
    void testCargarDesdeArchivoInexistente() {
        Estudiante estudiante = Alumno.cargarObjetoDesdeArchivo("archivo_que_no_existe.json", Estudiante.class);
        assertNull(estudiante, "Debe retornar null si el archivo no existe.");
    }
}
