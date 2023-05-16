package negocio.controllers;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import negocio.controllers.GestorConsultas;
import negocio.entities.CursoPropio;
import negocio.entities.EstadoCurso;
import negocio.entities.TipoCurso;

public class GestorConsultasTest {

    private GestorConsultas gestorConsultas;

    @Before
    public void setUp() {
        gestorConsultas = new GestorConsultas();
        // Configuración adicional para inicialización y configuración antes de cada prueba
    }

    @Test
    public void testConsultarIngresos() {
        // Prueba de consultarIngresos()
        // Preparación de los datos de prueba
        TipoCurso tipo = TipoCurso.MASTER;
        String fechaInicio = "2023-01-01";
        String fechaFin = "2023-12-31";

        // Ejecución del método a probar
        double ingresos = gestorConsultas.consultarIngresos(tipo, fechaInicio, fechaFin);

        // Comprobación del resultado esperado
        // Utiliza asserEquals(expected, actual, delta) para comparar valores numéricos con una tolerancia delta
        assertEquals(1000.00, ingresos, 0.01);
    }

    @Test
    public void testConsultarEstadoCursos() {
        // Prueba de consultarEstadoCursos()
        // Preparación de los datos de prueba
        EstadoCurso estado = EstadoCurso.VALIDADO;
        String fechaInicio = "2023-01-01";
        String fechaFin = "2023-12-31";

        // Ejecución del método a probar
        List<CursoPropio> cursos = gestorConsultas.consultarEstadoCursos(estado, fechaInicio, fechaFin);

        // Comprobación del resultado esperado
        assertEquals(2, cursos.size());
        // Realiza más asserEquals() u otras comprobaciones para verificar los resultados de la lista de cursos
    }

    @Test
    public void testListarEdicionesCursos() {
        // Prueba de listarEdicionesCursos()
        // Preparación de los datos de prueba
        String fechaInicio = "2023-01-01";
        String fechaFin = "2023-12-31";

        // Ejecución del método a probar
        List<CursoPropio> cursos = gestorConsultas.listarEdicionesCursos(fechaInicio, fechaFin);

        // Comprobación del resultado esperado
        assertEquals(3, cursos.size());
        // Realiza más asserEquals() u otras comprobaciones para verificar los resultados de la lista de cursos
    }

    // Agrega más métodos de prueba para cubrir otras funcionalidades de GestorConsultas

}

