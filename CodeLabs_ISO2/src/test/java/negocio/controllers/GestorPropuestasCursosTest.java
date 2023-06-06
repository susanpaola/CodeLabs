package negocio.controllers;

import negocio.entities.CursoPropio;
import negocio.entities.EstadoCurso;
import negocio.entities.TipoCurso;
import persistencia.CursoPropioDAO;
import org.junit.Test;
import static org.junit.Assert.assertTrue;

import java.util.Vector;

public class GestorPropuestasCursosTest {
	@Test
	public void realizarPropuestaCursoTest() {
		// Crear instancia del DAO para acceder a la capa de persistencia
		CursoPropioDAO agenteCursoPropioDAO = new CursoPropioDAO();
		// Definir el estado y tipo de curso para la prueba
		EstadoCurso estado = EstadoCurso.PROPUESTA_RECHAZADA;
		TipoCurso tipo = TipoCurso.FORMACION_AVANZADA;
		// Crear un objeto de curso propio para la prueba
		CursoPropio curso = new CursoPropio(1000, "Curso_Test", 100, "2022-12-20", "2022-12-29", 900.0, 1, "Facultad de ciencias sociales", "76943196M", "25895175N", estado, tipo);
		
		// Crear una instancia del gestor de propuestas de cursos
		GestorPropuestasCursos gestor = new GestorPropuestasCursos();
		
		// Consultar los cursos existentes antes de realizar la propuesta
		String sql = "SELECT * FROM CursoPropio";
		
		try {
			Vector<Object> cursosAntes = agenteCursoPropioDAO.seleccionarCursos(sql);
		
			// Realizar la propuesta del curso
			gestor.realizarPropuestaCurso(curso);
			
			// Consultar los cursos existentes después de realizar la propuesta
			Vector<Object> cursosDespues = agenteCursoPropioDAO.seleccionarCursos(sql);
			
			// Verificar que se agregó un curso nuevo
			assertTrue(cursosDespues.size()==cursosAntes.size()+1);
		
			// Eliminar el curso de prueba de la base de datos
			sql = "DELETE FROM CursoPropio WHERE nombre='Curso_Test'";
			agenteCursoPropioDAO.eliminarCurso(sql);
		
		} catch (Exception e) {
			//System.out.println(e);
		}
	}
	
	@Test
	public void editarPropuestaCursoTest() {
		CursoPropioDAO agenteCursoPropioDAO = new CursoPropioDAO();
		EstadoCurso estado = EstadoCurso.PROPUESTA_RECHAZADA;
		TipoCurso tipo = TipoCurso.FORMACION_AVANZADA;
		CursoPropio curso = new CursoPropio(1001, "Curso_Test", 100, "2022-12-20", "2022-12-29", 900.0, 1, "Facultad de ciencias sociales", "76943196M", "25895175N", estado, tipo);
		
		GestorPropuestasCursos gestor = new GestorPropuestasCursos();
		
		String sql = null;
		try {
			// Realizar la propuesta del curso
			gestor.realizarPropuestaCurso(curso);
			
			// Modificar los datos del curso y cambiar el estado
			curso.setTasaMatricula(700.0);
			curso.setEstadoCurso(EstadoCurso.VALIDADO);
			
			// Editar la propuesta del curso
			gestor.editarPropuestaCurso(curso, 0); 
			
			// Consultar la tasa del curso modificado en la base de datos
			sql = "SELECT tasa FROM CursoPropio WHERE nombre='Curso_Test'";
			Vector<Object> cursoModificado = agenteCursoPropioDAO.seleccionarCursos(sql);
			
			// Obtener la tasa del vector y eliminar caracteres no deseados
			String nuevaTasaCadena = cursoModificado.get(0).toString();
			String charsToRemove = "[] ";
			
			for (char c : charsToRemove.toCharArray()) {
				nuevaTasaCadena = nuevaTasaCadena.replace(String.valueOf(c), "");
	       	}
			
			// Convertir la tasa a un valor numérico
			double nuevaTasa = Double.parseDouble(nuevaTasaCadena);
			
			// Verificar que la tasa se haya modificado correctamente y Eliminar el curso de prueba de la base de datos
			assertTrue(700.0==nuevaTasa);
			
			sql = "DELETE FROM CursoPropio WHERE nombre='Curso_Test'";
			agenteCursoPropioDAO.eliminarCurso(sql);
		
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	
	@Test
	public void evaluarPropuestaTest() {
		CursoPropioDAO agenteCursoPropioDAO = new CursoPropioDAO();
		EstadoCurso estado = EstadoCurso.PROPUESTA_RECHAZADA;
		TipoCurso tipo = TipoCurso.FORMACION_AVANZADA;
		CursoPropio curso = new CursoPropio(1002, "Curso_Test", 100, "2022-12-20", "2022-12-29", 900.0, 1, "Facultad de ciencias sociales", "76943196M", "25895175N", estado, tipo);
		
		GestorPropuestasCursos gestor = new GestorPropuestasCursos();
		String sql = null;
		try {
			// Realizar la propuesta del curso
			gestor.realizarPropuestaCurso(curso);
			EstadoCurso estadoCurso = gestor.evaluarPropuesta(curso);
			
			
			int idCurso = curso.getId();
			String estadoCadena = estado.name();
			
			// Verificar que el estado resultante sea igual al estado esperado
			assertTrue(estadoCadena.equals(estadoCurso.name()));
			
			sql = "DELETE FROM CursoPropio WHERE nombre='Curso_Test'";
			agenteCursoPropioDAO.eliminarCurso(sql);
		
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	@Test
	public void altaCursoAprobadoTest() {
		CursoPropioDAO agenteCursoPropioDAO = new CursoPropioDAO();
		EstadoCurso estado = EstadoCurso.PROPUESTA_RECHAZADA;
		TipoCurso tipo = TipoCurso.FORMACION_AVANZADA;
		CursoPropio curso = new CursoPropio(1003, "Curso_Test", 100, "2022-12-20", "2022-12-29", 900.0, 1, "Facultad de ciencias sociales", "76943196M", "25895175N", estado, tipo);
		
		GestorPropuestasCursos gestor = new GestorPropuestasCursos();
		String sql = null;
		try {
			gestor.realizarPropuestaCurso(curso);
			curso.setEstadoCurso(EstadoCurso.VALIDADO);
			gestor.altaCursoAprobado(curso);
			
			// Consultar el estado del curso en la base de datos
			sql = "SELECT estado FROM CursoPropio WHERE nombre='Curso_Test'";
			
			Vector<Object> cursoModificado = agenteCursoPropioDAO.seleccionarCursos(sql);
			
			// Obtener el estado del vector y eliminar caracteres no deseados
			String nuevoEstadoCadena = cursoModificado.get(0).toString();
			String charsToRemove = "[] ";
			
			for (char c : charsToRemove.toCharArray()) {
				nuevoEstadoCadena = nuevoEstadoCadena.replace(String.valueOf(c), "");
	       	}
			
			assertTrue(nuevoEstadoCadena.equals("VALIDADO"));
			
			sql = "DELETE FROM CursoPropio WHERE nombre='Curso_Test'";
			agenteCursoPropioDAO.eliminarCurso(sql);
		
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}


