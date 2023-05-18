package negocio.controllers;

import static org.junit.Assert.assertTrue;

import java.util.List;
import java.util.Vector;

import org.junit.Assert;
import org.junit.Test;

import negocio.entities.CursoPropio;
import negocio.entities.EstadoCurso;
import negocio.entities.TipoCurso;
import persistencia.CursoPropioDAO;

public class GestorConsultasTest {

    @Test
    public void testConsultarEstadoCursos() {
        GestorConsultas gestorConsultas = new GestorConsultas();
        List<CursoPropio> cursos = gestorConsultas.consultarEstadoCursos(EstadoCurso.VALIDADO, "2023-01-01", "2023-12-31");
        int expectedCursoCount = 1; 
        Assert.assertEquals(expectedCursoCount, cursos.size());

    }
    
    @Test
    public void testConsultarIngresos_Datos() {
        // Caso de prueba: Probar con datos inválidos
        GestorConsultas gestorConsultas = new GestorConsultas();
        double ingresos = gestorConsultas.consultarIngresos(TipoCurso.EXPERTO, "2022-01-01", "2022-12-31");
        double ingresosEsperados = 0.00; // No se espera ningún ingreso con los datos proporcionados
        Assert.assertEquals(ingresosEsperados, ingresos, 0.01);
    }
    
    @Test
    public void testConsultarIngresos() {
        GestorConsultas gestor = new GestorConsultas();
        //CursoPropio curso = new CursoPropio(100, "curso robotica", 30, "2022-09-10", "2023-07-15", 900.00, 1, "Facultad ciencias sociales",
        	//	"96315247O", "25895175N", EstadoCurso.EN_MATRICULACION, TipoCurso.FORMACION_AVANZADA);

        CursoPropioDAO agenteCursoPropioDAO = new CursoPropioDAO();

        String sql = "SELECT tipo FROM CursoPropio";
        try {
            Vector<Object> listarCursosAntes = agenteCursoPropioDAO.seleccionarCursos(sql);
            gestor.consultarIngresos(TipoCurso.FORMACION_AVANZADA, "2022-09-10", "2023-07-15");
            Vector<Object> listarCursosDespues = agenteCursoPropioDAO.seleccionarCursos(sql);
            assertTrue(listarCursosDespues.size() == listarCursosAntes.size() + 1);

            sql = "DELETE FROM CursoPropio WHERE tipo=FORMACION_AVANZADA";
            agenteCursoPropioDAO.eliminarCurso(sql);
        } catch(Exception e) {
	            e.printStackTrace(); // Para imprimir el error
	        }

    }//

    @Test
    public void testConsultarEstadoCursos_CasosLimite() {
        GestorConsultas gestorConsultas = new GestorConsultas();
        List<CursoPropio> cursos = gestorConsultas.consultarEstadoCursos(EstadoCurso.EN_MATRICULACION, "2023-01-01", "2023-12-31");
        int cantidadCursosEsperada = 0; // No se espera ningún curso en estado de matriculación
        Assert.assertEquals(cantidadCursosEsperada, cursos.size());
    }
}










