package negocio.controllers;

import negocio.entities.*;
import persistencia.MatriculaDAO;

public class GestorMatriculacion {

	/**
	 * 
	 * @param curso
	 * @param estudiante
	 * @param matricula
	 */
	
	//CursoPropio curso, Estudiante estudiante, 
	public int realizarMatriculacion(CursoPropio curso, Estudiante estudiante, Matricula matricula) {
		// TODO - implement GestorMatriculacion.realizarMatriculacion
		MatriculaDAO agenteMatriculaDAO = new MatriculaDAO();
		int res = 0;
		try {
			String sql = "INSERT INTO Matricula VALUES (" + matricula.getIdMatricula() + ",'" + matricula.getTipoPago().toString() + "'," + matricula.getIdTitulo() + ",'" + matricula.getIdEstudiante() + "'," + matricula.isPagado() + ",'" + matricula.getFecha() + "')";
			res = agenteMatriculaDAO.insertMatricula(sql);
			
		} catch (Exception e) {
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
			System.out.println(e);
		}
		
		return res;
	}

	
	
	
	/**
	 * 
	 * @param curso
	 * @param estudiante
	 */
	//private
	void realizarPagoTarjeta(CursoPropio curso, Estudiante estudiante) {
		// TODO - implement GestorMatriculacion.realizarPagoTarjeta
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param curso
	 * @param estudiante
	 */
	//private
	void realizarPagoTransferencia(CursoPropio curso, Estudiante estudiante) {
		// TODO - implement GestorMatriculacion.realizarPagoTransferencia
		throw new UnsupportedOperationException();
	}

	private void operation() {
		// TODO - implement GestorMatriculacion.operation
		throw new UnsupportedOperationException();
	}


}