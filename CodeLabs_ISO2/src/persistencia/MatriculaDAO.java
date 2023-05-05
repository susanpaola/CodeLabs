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

}
