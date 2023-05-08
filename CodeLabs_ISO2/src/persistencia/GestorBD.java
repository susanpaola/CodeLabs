package persistencia;

import java.sql.DriverManager;
import java.util.Vector;

public class GestorBD {
	
	// Driven para conectar con bases de datos MySQL
	private static String driver= "com.mysql.cj.jdbc.Driver";
	private static String user= "proyecto_iso";
	private static String password="contrase\u00f1a";
	
	public GestorBD() throws Exception {
		connect();
	}
	
	public static void connect() {
		try {
			Class.forName(driver);
			mBD = DriverManager.getConnection(url, user, password);
			mBD.setAutoCommit(true);
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	public static void disconnect() throws Exception {
		mBD.close();
	}
	
	/**
	 * Metodo insertar
	 * @param sql
	 */
	public  int insert(String SQL) {
		int res = -1;
		try {
			connect();
			PreparedStatement stmt = mBD.prepareStatement(SQL);
			res = stmt.executeUpdate(SQL);
			stmt.close();
			disconnect();
		} catch (Exception e) {
			System.out.println(e);
		} 
		return res;
	}

	/**
	 * Metodo seleccionar
	 * @param sql
	 * @return 
	 */
	public Vector<Object>  select(String SQL) throws Exception {
		
		Vector<Object> vectoradevolver = new Vector<Object>();
		connect();
		Statement stmt = mBD.createStatement();
		ResultSet res = stmt.executeQuery(SQL);
		ResultSetMetaData rsmd = res.getMetaData();
		int columns = rsmd.getColumnCount();
	
		while (res.next()) {
			Vector<Object> v = new Vector<Object>();
			for(int i=1; i<=columns; i++) {
				try {
					v.add(res.getObject(i));
				}
				catch(SQLException ex) {
					continue;
				}
			}
			vectoradevolver.add(v);
		}
		stmt.close();
		disconnect();
		return vectoradevolver;
	}
	

	/**
	 * Metodo actualizar
	 * @param sql
	 */
	public int update(String SQL) throws SQLException, Exception {
		connect();
		PreparedStatement stmt = mBD.prepareStatement(SQL);
		int res = stmt.executeUpdate(SQL);
		stmt.close();
		disconnect();
		return res;
	}

	/**
	 * Metodo eliminar
	 * @param sql
	 */
	public int delete(String SQL) {
		int res = -1;
		try {
			connect();
			PreparedStatement stmt = mBD.prepareStatement(SQL);
			res = stmt.executeUpdate(SQL);
			stmt.close();
			disconnect();
		} catch (Exception e) {
			System.out.println(e);
		} 
		return res;
	}

	public void operation() {
		// TODO - implement GestorBD.operation
		throw new UnsupportedOperationException();
	}

	public static GestorBD getAgente() throws Exception {
		if (mInstancia == null) {
			mInstancia = new GestorBD();
		}
		return mInstancia;
	}
}