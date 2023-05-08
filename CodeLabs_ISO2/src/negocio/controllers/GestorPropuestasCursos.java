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
	public void editarPropuestaCurso(CursoPropio curso, int tipo) {
		CursoPropioDAO agenteCursoPropioDAO = new CursoPropioDAO();
		if (tipo == 0) { //edita todo
			try {
				String sql = "UPDATE CursoPropio SET nombre='" + curso.getNombre() + "', ECTS=" + curso.getECTS() + ", fechaIni='" + curso.getFechaInicio() + "', fechaFin='" + curso.getFechaFin() + "', tasa=" + curso.getTasaMatricula() + ", edicion=" + curso.getEdicion() + ", centro='" + curso.getCentro() + "', director='" + curso.getDirector() + "', secretario='" + curso.getSecretario() + "', estado='" + curso.getEstadoCurso().toString() + "', tipo='" + curso.getTipoCurso().toString() + "' WHERE id=" + curso.getId();
				agenteCursoPropioDAO.editarCurso(sql);
			
			} catch (Exception e) {
				System.out.println(e);
			}  	
		} else { //edita sólo el curso
			try {
				String sql = "UPDATE CursoPropio SET estado='" + curso.getEstadoCurso().toString() + "' WHERE id=" + curso.getId();
				agenteCursoPropioDAO.editarCurso(sql);
			} catch (Exception e) {
				System.out.println(e);
			} 
		}
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