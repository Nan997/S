package com.ut.titulacionentities.entity;

public class ProcesoTitulacion extends CommonEntity {
	
	private Integer idProcesoTitulacion;
	
	private String comentarios;
	
	private String nombre;
	
	public String getComentarios() {
		return comentarios;
	}

	public void setComentarios(String comentarios) {
		this.comentarios = comentarios;
	}

	private Persona persona;

	/**
	 * @return the idProcesoTitulacion
	 */
	public Integer getIdProcesoTitulacion() {
		return idProcesoTitulacion;
	}

	/**
	 * @param idProcesoTitulacion the idProcesoTitulacion to set
	 */
	public void setIdProcesoTitulacion(Integer idProcesoTitulacion) {
		this.idProcesoTitulacion = idProcesoTitulacion;
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

	/**
	 * @return the persona
	 */
	public Persona getPersona() {
		return persona;
	}

	/**
	 * @param persona the persona to set
	 */
	public void setPersona(Persona persona) {
		this.persona = persona;
	}

}
