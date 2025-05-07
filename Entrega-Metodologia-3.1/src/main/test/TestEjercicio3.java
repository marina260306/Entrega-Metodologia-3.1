package main.test;

import main.java.es.uah.matcomp.mp.el3.a.ejemplo.Ejercicio3;
import main.java.es.uah.matcomp.mp.el3.a.ejemplo.Usuario;
import org.junit.jupiter.api.Test;

import java.io.File;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test para Ejercicio3: guardar un Usuario en JSON.
 */
public class TestEjercicio3 {

    @Test
    void testGuardarUsuarioEjercicio3() {
        Usuario usuario = new Usuario("Teresa", 26, "teresa@gmail.com");
        String ruta = "test_usuario_ej3.json";

        Ejercicio3.guardarObjetoEnArchivo(ruta, usuario);

        File archivo = new File(ruta);
        assertTrue(archivo.exists());
        assertTrue(archivo.length() > 0);

        archivo.delete();
    }
}
