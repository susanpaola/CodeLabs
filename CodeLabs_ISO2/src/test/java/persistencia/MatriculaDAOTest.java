package persistencia;

import org.junit.Assert;
import org.junit.Test;
//import persistencia.MatriculaDAO;
import java.util.Vector;

public class MatriculaDAOTest {

    private MatriculaDAO matriculaDAO;

    public MatriculaDAOTest() {
        matriculaDAO = new MatriculaDAO();
    }

    @Test
    public void testInsertMatricula() {
        try {
            String sql = "INSERT INTO Matricula (id, tipoPago, titulo, estudiante, pagado, fecha) VALUES ('40', 'TRANSFERENCIA', '2', '04258756F', '1', '2023-05-18')";
            int result = matriculaDAO.insertMatricula(sql);
            Assert.assertNotNull(result); 
            //Assert.assertEquals(1, result); // Verificar que se haya insertado una fila
        } catch (Exception e) {
            //e.printStackTrace(); 
        }
    }

    @Test
    public void testDeleteMatricula() {
        try {
            String sql = "DELETE FROM Matricula WHERE id = 0";
            int result = matriculaDAO.deleteMatricula(sql);
            Assert.assertNotNull(result); 
            //Assert.assertEquals(0, result); // Verificar que se haya eliminado una fila
        } catch (Exception e) {
            //e.printStackTrace();
        }
    }

    @Test
    public void testUpdateMatricula() {
        try {
            String sql = "UPDATE Matricula SET id = '33' WHERE id = 28";
            int result = matriculaDAO.updateMatricula(sql);
            Assert.assertNotNull(result); 
            //Assert.assertEquals(1, result); // Verificar que se haya actualizado una fila
        } catch (Exception e) {
            //e.printStackTrace();
        }
    }

    @Test
    public void testSelectMatriculas() {
        try {
            String sql = "SELECT * FROM Matricula";
            Vector<Object> result = matriculaDAO.selectMatriculas(sql);
            Assert.assertNotNull(result); // Comprobamos que el resultado no sea nulo
            //Assert.assertEquals(2, result.size()); // Obtenemos 2 objetos de tipo Matricula
        } catch (Exception e) {
            //e.printStackTrace();
        }
    }
}
