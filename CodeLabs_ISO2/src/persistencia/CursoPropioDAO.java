package persistencia;

import java.util.Date;
import java.util.List;

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
	public int eliminarCurso(String sql) throws SQLException, Exception {
		return agenteBD.delete(sql);
	}


}