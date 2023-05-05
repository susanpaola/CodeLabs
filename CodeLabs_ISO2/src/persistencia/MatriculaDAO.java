package persistencia;

public class MatriculaDAO {
	private GestorBD agenteBD;

	public MatriculaDAO() {
		try {
			this.agenteBD = this.agenteBD.getAgente();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	public int insertMatricula(String sql) {
		return agenteBD.insert(sql);
	}
	
	public int deleteMatricula(String sql) {
		return agenteBD.delete(sql);
	}

}
