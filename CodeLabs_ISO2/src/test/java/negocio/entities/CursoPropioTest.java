package negocio.entities;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class CursoPropioTest {

    private CursoPropio cursoPropio;

    @Before
    public void setUp() {
        // Configuración inicial para las pruebas
        cursoPropio = new CursoPropio(1, "Curso de robotica", 30, "2023-01-01", "2023-07-28",
                1200.0, 1, "Facultad de ciencias sociales", "96315247O", "25895175N",
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
    
    @Test
    public void testToString() {
        String expectedString = "CursoPropio [centro=Facultad de ciencias sociales, director=96315247O, estado=VALIDADO, tipo=CORTA_DURACION, id=1, nombre=Curso de robotica, ECTS=30, fechaInicio=2023-01-01, fechaFin=2023-07-28, tasaMatricula=1200.0, edicion=1]";
        assertEquals(expectedString, cursoPropio.toString());
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