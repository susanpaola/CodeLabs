package persistencia;

import java.sql.*;
import java.util.Vector;

public class GestorBD {
	
	// Driven para conectar con bases de datos MySQL
	private static String driver= "com.mysql.cj.jdbc.Driver";
	private static String user= "proyecto_iso";
	private static String password="contrase\u00f1a";
	private static String url = "jdbc:mysql://db4free.net:3306/proyecto_iso";
	
	//Instancia 
	protected static GestorBD mInstancia = null;
	
	// Conexion con la base de datos
	protected static Connection mBD;
	
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
	 * @throws Exception 
	 */
	public  int insert(String SQL) throws Exception {
		int res = -1;
	    try {
	        connect();
	        try (PreparedStatement stmt = mBD.prepareStatement(SQL)) {
	            res = stmt.executeUpdate(SQL);
	        }
	    } catch (Exception e) {
	        System.out.println(e);
	    } finally {
	        disconnect();
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
	    try (Statement stmt = mBD.createStatement(); ResultSet res = stmt.executeQuery(SQL)) {
	        ResultSetMetaData rsmd = res.getMetaData();
	        int columns = rsmd.getColumnCount();

	        while (res.next()) {
	            Vector<Object> v = new Vector<Object>();
	            for (int i = 1; i <= columns; i++) {
	                try {
	                    v.add(res.getObject(i));
	                } catch (SQLException ex) {
	                    continue;
	                }
	            }
	            vectoradevolver.add(v);
	        }
	    } catch (SQLException e) {
	        System.out.println(e);
	    }
	    disconnect();
	    return vectoradevolver;
	}
	

	/**
	 * Metodo actualizar
	 * @param sql
	 */
	public int update(String SQL) throws SQLException, Exception {
		connect();
	    int res = -1;
	    try (PreparedStatement stmt = mBD.prepareStatement(SQL)) {
	        res = stmt.executeUpdate(SQL);
	    }
	    disconnect();
	    return res;
	}

	/**
	 * Metodo eliminar
	 * @param sql
	 * @throws Exception 
	 */
	public int delete(String SQL) throws Exception {
		int res = -1;
	    try {
	        connect();
	        try (PreparedStatement stmt = mBD.prepareStatement(SQL)) {
	            res = stmt.executeUpdate(SQL);
	        }
	    } catch (Exception e) {
	        System.out.println(e);
	    } finally {
	        disconnect();
	    }
	    return res;
	}

	public static GestorBD getAgente() throws Exception {
		if (mInstancia == null) {
			mInstancia = new GestorBD();
		}
		return mInstancia;
	}
}