package com.ut.titulacion.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.TimeZone;

/**
 * 
 *  Clase que se encarga de realizar la conexion y
 *         configuracion y habilitar las transacciones de una base de datos
 */
public class ConnectionFactory {

	/**
	 * Objeto encargado de mantener la conexion de base datos
	 */
	private static Connection connection;

	/**
	 * Objeto encargado de habilitar y ejecutar la senetencia SQL
	 */
	private static Statement statement;

	/**
	 * Metodo que permite conectarse a la base de datos
	 * 
	 * @return objeto Connection con la informacion de la base de datos conectada o null
	 * @throws ClassNotFoundException Excepcion generada al no cargar el driver de conexion
	 * @throws SQLException           Excepcion generada al no conecatrse a la base
	 *                                de datos
	 */
	public static Connection conectar() throws ClassNotFoundException, SQLException {

		// Paso1: Cargar el driver de conexion

		Class.forName("com.mysql.cj.jdbc.Driver");

		// Paso2: Establecer los datos de conexion

		String url = "jdbc:mysql://localhost:3306/titulacion?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=" + TimeZone.getDefault().getID();
		String user = "root";
		String password = "root";

		// Paso3: Establecer la conexion

		connection = DriverManager.getConnection(url, user, password);

		statement = connection.createStatement(); // Permite habilitar el proceso para ejecutar secuencias SQL

		return connection;
	}

	
	/**
	 * Permiete ejecutar setencias INSERT UPDATE DELETE
	 * @param sql parametro con la sentencia a ejecutarse
	 * @return 1 en caso de ser exitoso, 0 en caso de error
	 * @throws SQLException Excepcion en caso de error en la sentencia SQL
	 */
	public static int ejecutarSQL(String sql) throws SQLException {
		System.out.println("Query: " + sql);
		
		return statement.executeUpdate(sql);
		     
	}

	/**
	 * Permite ejecutar setencias SELECT
	 * @param sql parametro con la sentencia a ejecutarse
	 * @return Objeto con la informacion obtenida de la setencia SELECT
	 * @throws SQLException Excepcion en caso de error en la sentencia SQL
	 */
	public static  ResultSet ejecutarSQLSelect(String sql) throws SQLException {
		
		System.out.println("Query" + sql);
		return statement.executeQuery(sql);
	}
}
