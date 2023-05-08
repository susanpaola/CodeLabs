package negocio.controllers;

import negocio.entities.*;
import persistencia.CursoPropioDAO;

public class GestorPropuestasCursos {

	public void realizarPropuestaCurso(CursoPropio curso) {
		CursoPropioDAO agenteCursoPropioDAO = new CursoPropioDAO();
		
		try {
			String sql = "INSERT INTO CursoPropio VALUES (" + curso.getId() + ",'" + curso.getNombre() + "'," + curso.getECTS() + ",'" + curso.getFechaInicio() + "','" + curso.getFechaFin() + "'," + curso.getTasaMatricula() + "," + curso.getEdicion() + ",'" + curso.getCentro() + "','" + curso.getDirector() + "','" + curso.getSecretario() + "','" + curso.getEstadoCurso().toString() + "','" + curso.getTipoCurso().toString() + "')";
			agenteCursoPropioDAO.insertarCurso(sql);
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	/**
	 * 
	 * @param curso
	 */
	public void editarPropuestaCurso(CursoPropio curso) {
		// TODO - implement GestorPropuestasCursos.editarPropuestaCurso
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param curso
	 */
	public EstadoCurso evaluarPropuesta(CursoPropio curso) {
		// TODO - implement GestorPropuestasCursos.evaluarPropuesta
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param curso
	 */
	public void altaCursoAprobado(CursoPropio curso) {
		// TODO - implement GestorPropuestasCursos.altaCursoAprobado
		throw new UnsupportedOperationException();
	}

}