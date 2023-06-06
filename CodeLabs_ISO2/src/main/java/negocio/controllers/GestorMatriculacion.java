package negocio.controllers;

import negocio.entities.*;
import persistencia.MatriculaDAO;

//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;

public class GestorMatriculacion {
	
	//private static final Logger logger = LoggerFactory.getLogger(GestorConsultas.class);

	/**
	 * 
	 * @param curso
	 * @param estudiante
	 * @param matricula
	 */
	public int realizarMatriculacion(CursoPropio curso, Estudiante estudiante, Matricula matricula) {
		MatriculaDAO agenteMatriculaDAO = new MatriculaDAO();
		int res = 0;
		try {
			String sql = "INSERT INTO Matricula VALUES (" + matricula.getIdMatricula() + ",'" + matricula.getTipoPago().toString() + "'," + matricula.getIdTitulo() + ",'" + matricula.getIdEstudiante() + "'," + matricula.isPagado() + ",'" + matricula.getFecha() + "')";
			res = agenteMatriculaDAO.insertMatricula(sql);
			
		} catch (Exception e) {
			//logger.error("Ocurrió una excepción: ", e);
			System.out.println(e);
		}
		
		return res;
	}

	/**
	 * 
	 * @param curso
	 * @param estudiante
	 * @param matricula
	 */
	public int realizarPagoMatricula(CursoPropio curso, Estudiante estudiante, Matricula matricula) {
		MatriculaDAO agenteMatriculaDAO = new MatriculaDAO();
		int res = 0;
		
		try {
			String sql = "UPDATE Matricula SET pagado=" + matricula.isPagado() +", tipoPago=" + "'" + matricula.getTipoPago().toString() + "'" + " WHERE id=" +  matricula.getIdMatricula();
			res = agenteMatriculaDAO.updateMatricula(sql);
			
		} catch (Exception e) {
			//logger.error("Ocurrió una excepción: ", e);
			System.out.println(e);
		}
		
		return res;
	}

	
	
	
	/**
	 * 
	 * @param curso
	 * @param estudiante
	 */
	private void realizarPagoTarjeta(CursoPropio curso, Estudiante estudiante) {
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param curso
	 * @param estudiante
	 */
	private void realizarPagoTransferencia(CursoPropio curso, Estudiante estudiante) {
		throw new UnsupportedOperationException();
	}

	private void operation() {
		throw new UnsupportedOperationException();
	}

}
