package com.ut.titulacion.dao;

import java.sql.SQLException;
import java.util.List;

import com.ut.titulacionentities.entity.Documentacion;

public interface DocumentacionDAO {

	/**
	 * Metodo que permite guardar registros de tipos de restaurantes.
	 * 
	 * @param tipoRestaurante objeto a guardar.
	 * @return 1 o mas en caso de ser exitoso, 0 en caso de no guardarlo.
	 * @throws SQLException Excepcion generada en caso de error al ejecutar la
	 *                      sentencia SQL
	 */
	int guardar(Documentacion documentacion) throws SQLException;

	/**
	 * Metodo que permite actualizar registros de tipos de restaurantes.
	 * 
	 * @param tipoRestaurante objeto a actualizar.
	 * @return 1 o mas en caso de ser exitoso, 0 en caso de no actualizarlo.
	 * @throws SQLException Excepcion generada en caso de error al ejecutar la
	 *                      sentencia SQL
	 */
	int actualizar(Documentacion documentacion) throws SQLException;

	/**
	 * Metodo que permite eliminar registros de tipos de restaurantes.
	 * 
	 * @param idTipoRestaurante identificador del tipo a eliminar.
	 * @return 1 o mas en caso de ser exitoso, 0 en caso de no eliminarlo.
	 * @throws SQLException Excepcion generada en caso de error al ejecutar la
	 *                      sentencia SQL
	 */
	int eliminar(int idDocuemntacion) throws SQLException;

	/**
	 * Metodo que permite consultar los registros de tipos de restaurantes.
	 * 
	 * @return lista de tipos de restaurantes o null.
	 * @throws SQLException Excepcion generada en caso de error al ejecutar la
	 *                      sentencia SQL
	 */
	List<Documentacion> consultar() throws SQLException;

	/**
	 * Metodo que permite consultar un registro de tipo de restaurante por
	 * identificador.
	 * 
	 * @param idTipoRestaurante identificador del tipo.
	 * @return tipo de restaurante consultado o null.
	 * @throws SQLException         Excepcion generada en caso de error al ejecutar
	 *                              la sentencia SQL
	 * @throws RestauranteException excepcion personalizada que genera un mensaje
	 *                              mas especifico
	 */
	Documentacion consultarPorId(int idDocuemntacion) throws SQLException;

}
