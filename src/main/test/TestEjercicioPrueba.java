package main.test;

import main.java.es.uah.matcomp.mp.el3.a.ejemplo.EjercicioPrueba;
import main.java.es.uah.matcomp.mp.el3.a.ejemplo.Usuario;
import main.java.es.uah.matcomp.mp.el3.a.ejemplo.Estudiante;
import org.junit.jupiter.api.Test;

import java.io.File;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test unitario para la clase EjercicioPrueba.
 * Cubre los métodos genéricos y ejecución simulada del main.
 */
public class TestEjercicioPrueba {

    @Test
    void testGuardarYCargarUsuario() {
        Usuario original = new Usuario("Sara", 23, "sara@mail.com");
        String ruta = "test_usuario.json";

        // Guardar
        EjercicioPrueba.guardarObjetoEnArchivo(ruta, original);

        // Cargar
        Usuario cargado = EjercicioPrueba.cargarObjetoDesdeArchivo(ruta, Usuario.class);

        assertNotNull(cargado);
        assertEquals("Sara", cargado.nombre);
        assertEquals(23, cargado.edad);
        assertEquals("sara@mail.com", cargado.correo);

        new File(ruta).delete();
    }

    @Test
    void testGuardarYCargarEstudianteDesdeInit() {
        String ruta = "test_estudiante.json";

        // Simula ejecución de main con "init"
        EjercicioPrueba.main(new String[]{"init", ruta});

        Estudiante estudiante = EjercicioPrueba.cargarObjetoDesdeArchivo(ruta, Estudiante.class);
        assertNotNull(estudiante);

        new File(ruta).delete();
    }

    @Test
    void testMostrarUsuarioDesdeShowArchivoNoExiste() {
        String ruta = "no_existe.json";

        Usuario usuario = EjercicioPrueba.cargarObjetoDesdeArchivo(ruta, Usuario.class);
        assertNull(usuario, "Si el archivo no existe, debe devolver null.");
    }
}
