package main.test;

import main.java.es.uah.matcomp.mp.el3.a.ejemplo.Ejercicio2;
import main.java.es.uah.matcomp.mp.el3.a.ejemplo.Usuario;
import org.junit.jupiter.api.Test;

import java.io.File;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test para Ejercicio2: guardar un Usuario en JSON.
 */
public class TestEjercicio2 {

    @Test
    void testGuardarUsuarioEjercicio2() {
        Usuario usuario = new Usuario("Sara", 10, "sara@gmail.com");
        String ruta = "test_usuario_ej2.json";

        Ejercicio2.guardarObjetoEnArchivo(ruta, usuario);

        File archivo = new File(ruta);
        assertTrue(archivo.exists());
        assertTrue(archivo.length() > 0);

        archivo.delete();
    }
}
