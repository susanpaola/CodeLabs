package negocio.controllers;

import java.util.Vector;

import negocio.entities.*;
import persistencia.CursoPropioDAO;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GestorPropuestasCursos {
	
	private static final Logger logger = LoggerFactory.getLogger(GestorConsultas.class);
	private static final String WHERE_ID = "' WHERE id=";


	public void realizarPropuestaCurso(CursoPropio curso) {
		CursoPropioDAO agenteCursoPropioDAO = new CursoPropioDAO();
		
		try {
			String sql = "INSERT INTO CursoPropio VALUES (" + curso.getId() + ",'" + curso.getNombre() + "'," + curso.getECTS() + ",'" + curso.getFechaInicio() + "','" + curso.getFechaFin() + "'," + curso.getTasaMatricula() + "," + curso.getEdicion() + ",'" + curso.getCentro() + "','" + curso.getDirector() + "','" + curso.getSecretario() + "','" + curso.getEstadoCurso().toString() + "','" + curso.getTipoCurso().toString() + "')";
			agenteCursoPropioDAO.insertarCurso(sql);
			
		} catch (Exception e) {
			logger.error("Ocurrió una excepción: ", e);
		}
	}

	/**
	 * 
	 * @param curso
	 */
	public void editarPropuestaCurso(CursoPropio curso, int tipo) {
		CursoPropioDAO agenteCursoPropioDAO = new CursoPropioDAO();
		if (tipo == 0) { 
			try {
	            String sql = "UPDATE CursoPropio SET nombre='" + curso.getNombre() + "', ECTS=" + curso.getECTS() + ", fechaIni='" + curso.getFechaInicio() + "', fechaFin='" + curso.getFechaFin() + "', tasa=" + curso.getTasaMatricula() + ", edicion=" + curso.getEdicion() + ", centro='" + curso.getCentro() + "', director='" + curso.getDirector() + "', secretario='" + curso.getSecretario() + "', estado='" + curso.getEstadoCurso().toString() + "', tipo='" + curso.getTipoCurso().toString() + WHERE_ID + curso.getId();	   

				agenteCursoPropioDAO.editarCurso(sql);
			
			} catch (Exception e) {
				logger.error("Ocurrió una excepción: ", e);
			}  	
		} else {
			try {
				String sql = "UPDATE CursoPropio SET estado='" + curso.getEstadoCurso().toString() +
	                    WHERE_ID + curso.getId();
				agenteCursoPropioDAO.editarCurso(sql);
			} catch (Exception e) {
				logger.error("Ocurrió una excepción: ", e);
			} 
		}
	}

	/**
	 * 
	 * @param curso
	 */
	public EstadoCurso evaluarPropuesta(CursoPropio curso) {
		CursoPropioDAO agenteCursoPropioDAO = new CursoPropioDAO();
	    Vector<Object> res = null;
	    try {
	        String sql = "SELECT estado FROM CursoPropio WHERE id=" + curso.getId();
	        res = agenteCursoPropioDAO.seleccionarCursos(sql);
	    } catch (Exception e) {
	    	logger.error("Ocurrió una excepción: ", e);
	    }

	    if (res != null && !res.isEmpty()) {
	        String estado = res.get(0).toString();
	        String charsToRemove = "[]";
	        for (char c : charsToRemove.toCharArray()) {
	            estado = estado.replace(String.valueOf(c), "");
	        }

	        EstadoCurso ec = null;
	        switch (estado) {
	            case "PROPUESTO":
	                ec = EstadoCurso.PROPUESTO;
	                break;
	            case "VALIDADO":
	                ec = EstadoCurso.VALIDADO;
	                break;
	            case "PROPUESTA_RECHAZADA":
	                ec = EstadoCurso.PROPUESTA_RECHAZADA;
	                break;
	            case "EN_MATRICULACION":
	                ec = EstadoCurso.EN_MATRICULACION;
	                break;
	            case "EN_IMPARTIZICION":
	                ec = EstadoCurso.EN_IMPARTIZICION;
	                break;
	            case "TERMINADO":
	                ec = EstadoCurso.TERMINADO;
	                break;
	            default:
	                
	                throw new IllegalArgumentException("Estado no reconocido: " + estado);
	        }
	        return ec;
	    } else {
	        throw new RuntimeException("No se encontró ningún resultado para la consulta: " + curso.getId());
	    }
	}

	/**
	 * 
	 * @param curso
	 */
	public void altaCursoAprobado(CursoPropio curso) {
		CursoPropioDAO agenteCursoPropioDAO = new CursoPropioDAO();
		
		try {
			String sql = "UPDATE CursoPropio SET estado='" + curso.getEstadoCurso().toString() +
	                WHERE_ID + curso.getId();
			agenteCursoPropioDAO.editarCurso(sql);
			
		} catch (Exception e) {
			logger.error("Ocurrió una excepción: ", e);
		}
	}

}