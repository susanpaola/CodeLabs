package persistencia;

import java.sql.SQLException;
import java.util.Date;
import java.util.List;
import java.util.Vector;

import negocio.entities.*;

public class CursoPropioDAO{
	
	private GestorBD agenteBD;
	
	public CursoPropioDAO() {
		try {
			this.agenteBD = this.agenteBD.getAgente();
		}catch (Exception e) {
			System.out.println(e);
		}
	}
	
	//eliminar curso
	public int eliminarCurso(String sql) throws SQLException, Exception {
		return agenteBD.delete(sql);
	}
	
	//actualizar curso
	public int actualizar(String sql) {
		return agenteBD.insert(sql);
	}

	//insertar curso
	public int insertarCurso(String sql) {
		return agenteBD.insert(sql);
	}
	
	//editar curso
	public int editarCurso(String sql) throws SQLException, Exception {
		return agenteBD.update(sql);
	}
	
	//seleccionar curso
	public Vector<Object> seleccionarCursos(String sql) throws Exception {
		return agenteBD.select(sql);
	}

}