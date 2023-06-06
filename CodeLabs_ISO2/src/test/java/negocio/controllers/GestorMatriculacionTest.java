package negocio.controllers;


import negocio.entities.Matricula;
import negocio.entities.ModoPago;

import org.junit.Before;
import org.junit.Test;
import persistencia.MatriculaDAO;
import static org.junit.Assert.assertTrue;
import java.util.Vector;

import static org.junit.Assert.*;
import negocio.controllers.GestorMatriculacion;
import negocio.entities.CursoPropio;
import negocio.entities.Estudiante;



public class GestorMatriculacionTest {
	private GestorMatriculacion gestorMatriculacion;

    @Before
    public void setUp() {
        gestorMatriculacion = new GestorMatriculacion();
    }

	
	@Test
	public void realizarMatriculacionTest() {
		MatriculaDAO agenteMatriculaDAO = new MatriculaDAO();
		Matricula matricula = new Matricula(1000, "2023-05-12", false, 15, ModoPago.TRANSFERENCIA, 3, "04258756F");
		GestorMatriculacion gestor = new GestorMatriculacion();

		String sql = "SELECT * FROM Matricula";
		try {
		Vector<Object> listarMatriculasAntes = agenteMatriculaDAO.selectMatriculas(sql);
		gestor.realizarMatriculacion(null, null, matricula);

		Vector<Object> listarMatriculasDespues = agenteMatriculaDAO.selectMatriculas(sql);
		assertTrue(listarMatriculasDespues.size() == listarMatriculasAntes.size() + 1);

		sql = "DELETE FROM Matricula WHERE id=1000";
		agenteMatriculaDAO.deleteMatricula(sql);
		
		} catch(Exception e) {
			//System.out.println(e);
		}
	}
	
	 @Test
	    public void testRealizarPagoMatricula() {
	        // Crear objetos necesarios para la prueba
	        CursoPropio curso = new CursoPropio();
	        Estudiante estudiante = new Estudiante("04258756F", "Victor", "Gil Guzman", null, null);
	        Matricula matricula = new Matricula();

	        // Llamar al método a probar
	        int resultado = gestorMatriculacion.realizarPagoMatricula(curso, estudiante, matricula);

	        // Verificar el resultado esperado
	        assertEquals(0, resultado); 
	    }
}