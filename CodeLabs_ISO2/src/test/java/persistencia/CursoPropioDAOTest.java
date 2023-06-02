package persistencia;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import java.sql.SQLException;
import java.util.Vector;

public class CursoPropioDAOTest {

    private CursoPropioDAO cursoPropioDAO;

    @Before
    public void setUp() {
        cursoPropioDAO = new CursoPropioDAO();
    }

    @Test
    public void testEliminarCurso() throws Exception {
        try {
            int resultado = cursoPropioDAO.eliminarCurso("DELETE FROM CursoPropio WHERE id = 200");
            assertEquals(0, resultado); //Porque en la BBDD no existe un curso con id=200
        } catch (SQLException e) {
        	
        }
            
    }

    @Test
    public void testInsertarCurso() {
        try {
            int resultado = cursoPropioDAO.insertarCurso("INSERT INTO CursoPropio (id, nombre, ECTS, fechaIni, fechaFin, tasa, edicion, centro, director, secretario, estado, tipo) VALUES ('100', 'Curso de robotica', '30', '2023-01-01', '2023-07-28', '1200.0', '1', 'Facultad de ciencias sociales', '96315247O', '25895175N', 'VALIDADO', 'CORTA_DURACION')");
            Assert.assertEquals(0, resultado); // se espera 0 insert porque el curso ya lo hemos insertado desde aquí. Cuando hacemos la cobertura sale rojo porque ya existe
        } catch (Exception e) {
            
        }
    }
    
    @Test
    public void testEditarCurso() {
        try {
            int resultado = cursoPropioDAO.editarCurso("UPDATE CursoPropio SET nombre = 'Ingenieria Informatica' WHERE id = 1");
            assertEquals(1, resultado);
        } catch (Exception e) {
            
        } 
    }
    
    @Test
    public void testSeleccionarCursos() {
        try {
            Vector<Object> cursos = cursoPropioDAO.seleccionarCursos("SELECT * FROM CursoPropio");
            assertNotNull(cursos);
            assertEquals(6, cursos.size()); // Asumiendo que se esperan 5 cursos en la base de datos
        } catch (Exception e) {
           
        }
    }
}


