package com.ut.titulacionentities.entity;

public class Rol extends CommonEntity {
	
	private Integer idRol;
	
	private String nombre;

	/**
	 * @return the idRol
	 */
	public Integer getIdRol() {
		return idRol;
	}

	/**
	 * @param idRol the idRol to set
	 */
	public void setIdRol(Integer idRol) {
		this.idRol = idRol;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
