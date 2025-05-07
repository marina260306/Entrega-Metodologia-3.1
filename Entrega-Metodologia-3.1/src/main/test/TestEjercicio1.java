package main.test;

import main.java.es.uah.matcomp.mp.el3.a.ejemplo.Ejercicio1;
import main.java.es.uah.matcomp.mp.el3.a.ejemplo.Usuario;
import main.java.es.uah.matcomp.mp.el3.a.ejemplo.Estudiante;
import org.junit.jupiter.api.Test;

import java.io.File;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test unitario para la clase Ejercicio1.
 * Valida el guardado correcto de objetos con Gson.
 */
public class TestEjercicio1 {

    @Test
    void testGuardarUsuario() {
        Usuario usuario = new Usuario("Marta", 17, "marta@gmail.com");
        String ruta = "test_usuario_ej1.json";

        Ejercicio1.guardarObjetoEnArchivo(ruta, usuario);

        File archivo = new File(ruta);
        assertTrue(archivo.exists());
        assertTrue(archivo.length() > 0, "El archivo JSON debe contener datos.");

        archivo.delete(); // Limpieza
    }

    @Test
    void testGuardarEstudiante() {
        Estudiante estudiante = new Estudiante("Miguel", 20, 8.5);
        String ruta = "test_estudiante_ej1.json";

        Ejercicio1.guardarObjetoEnArchivo(ruta, estudiante);

        File archivo = new File(ruta);
        assertTrue(archivo.exists());
        assertTrue(archivo.length() > 0);

        archivo.delete(); // Limpieza
    }
}
