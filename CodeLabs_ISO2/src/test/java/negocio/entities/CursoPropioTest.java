package negocio.entities;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class CursoPropioTest {

    private CursoPropio cursoPropio;

    @Before
    public void setUp() {
        // Configuración inicial para las pruebas
        cursoPropio = new CursoPropio(1, "Curso de robotica", 3, "2023-01-01", "2023-06-30",
                100.0, 1, "Centro de Prueba", "Director de Prueba", "Secretario de Prueba",
                EstadoCurso.VALIDADO, TipoCurso.CORTA_DURACION);
    }

    @Test
    public void testGetId() {
        // Prueba para obtener el ID del curso
        assertEquals(1, cursoPropio.getId());
    }

    @Test
    public void testGetNombre() {
        // Prueba para obtener el nombre del curso
        assertEquals("Curso de robotica", cursoPropio.getNombre());
    }

    @Test
    public void testSetNombre() {
        // Prueba para establecer el nombre del curso
        cursoPropio.setNombre("Curso cuantico");
        assertEquals("Curso cuantico", cursoPropio.getNombre());
    }
/*
 * 	//CP de conjetura de error
    @Test(expected = IllegalArgumentException.class)
    public void testSetFechaInicio_InvalidFormat() {
        // Prueba para establecer una fecha de inicio inválida
        cursoPropio.setFechaInicio("20230101");  // Formato inválido (debería ser "YYYY-MM-DD")
    }
*/
}