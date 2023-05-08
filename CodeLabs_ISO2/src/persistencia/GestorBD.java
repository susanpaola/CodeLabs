package persistencia;

import java.sql.DriverManager;
import java.util.Vector;

public class GestorBD {
	
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
	 * 
	 * @param sql
	 */
	public int update(String sql) {
		// TODO - implement GestorBD.update
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param sql
	 */
	public int delete(String sql) {
		// TODO - implement GestorBD.delete
		throw new UnsupportedOperationException();
	}

	public void operation() {
		// TODO - implement GestorBD.operation
		throw new UnsupportedOperationException();
	}

	public GestorBD getAgente() {
		// TODO Auto-generated method stub
		return null;
	}


}