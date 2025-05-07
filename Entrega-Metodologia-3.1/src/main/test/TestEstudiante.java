package main.test;

import main.java.es.uah.matcomp.mp.el3.a.ejemplo.Estudiante;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Test unitario para la clase Estudiante.
 * Cobertura:
 * - Constructor con nombre, edad y nota.
 * - toString().
 */
public class TestEstudiante {

    @Test
    public void testConstructorYToString() {
        Estudiante estudiante = new Estudiante("Juan Pérez", 20, 8.5);

        String resultado = estudiante.toString();

        assertNotNull(resultado);
        assertTrue(resultado.contains("Juan Pérez"));
        assertTrue(resultado.contains("20"));
        assertTrue(resultado.contains("8.5"));
    }
}
