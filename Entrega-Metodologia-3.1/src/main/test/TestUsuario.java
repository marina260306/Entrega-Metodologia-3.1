package main.test;

import main.java.es.uah.matcomp.mp.el3.a.ejemplo.Usuario;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test unitario para la clase Usuario
 * Cobertura: constructor por defecto, constructor completo, inicialización de campos, toString().
 */
public class TestUsuario {

    @Test
    void testConstructorPorDefecto() {
        Usuario usuario = new Usuario();
        assertNotNull(usuario, "El objeto Usuario no debe ser null.");
        assertNull(usuario.nombre);
        assertEquals(0, usuario.edad); // valor por defecto de int
        assertNull(usuario.correo);
    }

    @Test
    void testConstructorConParametros() {
        Usuario usuario = new Usuario("Marta", 17, "marta@gmail.com");

        assertEquals("Marta", usuario.nombre);
        assertEquals(17, usuario.edad);
        assertEquals("marta@gmail.com", usuario.correo);

        assertNotNull(usuario.estudiante, "El estudiante interno debe inicializarse.");
        assertNotNull(usuario.array, "El array debe inicializarse.");
        assertEquals("Marta", usuario.array[0], "El nombre debe estar en la primera posición del array.");
    }

    @Test
    void testToString() {
        Usuario usuario = new Usuario("Teresa", 26, "teresa@gmail.com");
        String resultado = usuario.toString();

        assertNotNull(resultado);
        assertTrue(resultado.contains("Teresa"));
        assertTrue(resultado.contains("26"));
        assertTrue(resultado.contains("teresa@gmail.com"));
    }
}
