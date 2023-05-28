package negocio.controllers;


import negocio.entities.Matricula;
import negocio.entities.ModoPago;
import org.junit.Test;
import persistencia.MatriculaDAO;
import static org.junit.Assert.assertTrue;
import java.util.Vector;

public class GestorMatriculacionTest {
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
			System.out.println(e);
		}
	}
	
}