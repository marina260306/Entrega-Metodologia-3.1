package main.test;

import main.java.es.uah.matcomp.mp.el3.a.ejemplo.Main;
import org.junit.jupiter.api.Test;

import java.io.File;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test básico para la clase Main.
 */
public class TestMain {

    @Test
    void testInitCreaArchivo() {
        String ruta = "main_init_test.json";

        // Simula: java -jar ... init ruta
        Main.main(new String[]{"init", ruta});

        File archivo = new File(ruta);
        assertTrue(archivo.exists(), "El archivo debe haberse creado.");
        assertTrue(archivo.length() > 0);

        archivo.delete();
    }

    @Test
    void testShowArchivoNoExiste() {
        // Simula: java -jar ... show archivo_inexistente
        // No lanza excepción, solo imprime "No se pudieron cargar los datos..."
        assertDoesNotThrow(() -> Main.main(new String[]{"show", "noexiste_main.json"}));
    }

    @Test
    void testUsoIncorrecto() {
        assertDoesNotThrow(() -> Main.main(new String[]{}));
    }
}
