package persistencia;

import java.sql.SQLException;
import java.util.List;
import java.util.Vector;

public class MatriculaDAO {
	private GestorBD agenteBD;

	public MatriculaDAO() {
		try {
			this.agenteBD = this.agenteBD.getAgente();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	//Gestor
	public GestorBD getAgenteBD() {
		return this.agenteBD;	
	}
	
	public int insertMatricula(String sql) throws Exception {
		return agenteBD.insert(sql);
	}
	
	public int deleteMatricula(String sql) throws Exception {
		return agenteBD.delete(sql);
	}
	
	public int updateMatricula(String sql) throws SQLException, Exception {
		return agenteBD.update(sql);
	}
	
	public Vector<Object> selectMatriculas(String sql) throws Exception{
		return agenteBD.select(sql);
	}

}
