package com.ut.titulacionentities.entity;

public class Documentacion {

	
	private Integer idDocumentacion;

	private Persona persona;

	private Adeudo adeudo;

	private String expedienteAlumno;
	
	private String nombre;

	private String primerApellido;

	private String segundoApellido;
	

	public Integer getIdDocumentacion() {
		return idDocumentacion;
	}

	public void setIdDocumentacion(Integer idDocumentacion) {
		this.idDocumentacion = idDocumentacion;
	}

	public Persona getPersona() {
		return persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}

	public Adeudo getAdeudo() {
		return adeudo;
	}

	public void setAdeudo(Adeudo adeudo) {
		this.adeudo = adeudo;
	}

	public String getExpedienteAlumno() {
		return expedienteAlumno;
	}

	public void setExpedienteAlumno(String expedienteAlumno) {
		this.expedienteAlumno = expedienteAlumno;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPrimerApellido() {
		return primerApellido;
	}

	public void setPrimerApellido(String primerApellido) {
		this.primerApellido = primerApellido;
	}

	public String getSegundoApellido() {
		return segundoApellido;
	}

	public void setSegundoApellido(String segundoApellido) {
		this.segundoApellido = segundoApellido;
	}

	

}
