package main.test;

import main.java.es.uah.matcomp.mp.el3.a.ejemplo.GsonUtilEjemplo;
import main.java.es.uah.matcomp.mp.el3.a.ejemplo.Usuario;
import org.junit.jupiter.api.Test;

import java.io.File;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test para los métodos genéricos de GsonUtilEjemplo.
 */
public class TestGsonUtilEjemplo {

    @Test
    void testGuardarYCargarUsuario() {
        Usuario usuario = new Usuario("Lucía", 22, "lucia@mail.com");
        String ruta = "usuario_gsonutil.json";

        // Guardar
        GsonUtilEjemplo.guardarObjetoEnArchivo(ruta, usuario);

        // Cargar
        Usuario cargado = GsonUtilEjemplo.cargarObjetoDesdeArchivo(ruta, Usuario.class);

        assertNotNull(cargado);
        assertEquals("Lucía", cargado.nombre);
        assertEquals(22, cargado.edad);
        assertEquals("lucia@mail.com", cargado.correo);

        new File(ruta).delete();
    }

    @Test
    void testCargarArchivoInexistente() {
        Usuario usuario = GsonUtilEjemplo.cargarObjetoDesdeArchivo("no_existe_gson.json", Usuario.class);
        assertNull(usuario, "Debe devolver null si el archivo no existe.");
    }
}
