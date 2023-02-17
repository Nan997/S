
package com.ut.titulacionentities.entity;



public class Persona extends CommonEntity {

	private Integer idPersona;

	private String nombre;

	private String primerApellido;

	private String segundoApellido;

   private Rol rol; 
   
   private Adeudo adeduo;

    private Universidad universidad;

	private String usuario;

	private String password;


	private String email;
	
	public Adeudo getAdeduo() {
		return adeduo;
	}

	public void setAdeduo(Adeudo adeduo) {
		this.adeduo = adeduo;
	}

	public Universidad getUniversidad() {
		return universidad;
	}

	public void setUniversidad(Universidad universidad) {
		this.universidad = universidad;
	}



	private boolean superadmin;
	
	private boolean esAlumno;

	/**
	 * @return the idPersona
	 */
	public Integer getIdPersona() {
		return idPersona;
	}

	/**
	 * @param idPersona the idPersona to set
	 */
	public void setIdPersona(Integer idPersona) {
		this.idPersona = idPersona;
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
	 * @return the primerApellido
	 */
	public String getPrimerApellido() {
		return primerApellido;
	}

	/**
	 * @param primerApellido the primerApellido to set
	 */
	public void setPrimerApellido(String primerApellido) {
		this.primerApellido = primerApellido;
	}

	/**
	 * @return the segundoApellido
	 */
	public String getSegundoApellido() {
		return segundoApellido;
	}

	/**
	 * @param segundoApellido the segundoApellido to set
	 */
	public void setSegundoApellido(String segundoApellido) {
		this.segundoApellido = segundoApellido;
	}

	/**
	 * @return the usuario
	 */
	public String getUsuario() {
		return usuario;
	}

	/**
	 * @param usuario the usuario to set
	 */
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	/**
	 * @return the passoword
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param passoword the passoword to set
	 */
	public void setPassword(String passoword) {
		this.password = passoword;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the superadmin
	 */
	public boolean isSuperadmin() {
		return superadmin;
	}

	/**
	 * @param superadmin the superadmin to set
	 */
	public void setSuperadmin(boolean superadmin) {
		this.superadmin = superadmin;
	}

	/**
	 * @return the superadminGeneral
	 */

	/**
	 * @return the rol
	 */
	public Rol getRol() {
		return rol;
	}

	/**
	 * @param rol the rol to set
	 */
	public void setRol(Rol rol) {
		this.rol = rol;
	}

	/**
	 * @return the universidad
	 */
	

	/**
	 * @return the esAlumno
	 */
	public boolean isEsAlumno() {
		return esAlumno;
	}



	/**
	 * @param esAlumno the esAlumno to set
	 */
	public void setEsAlumno(boolean esAlumno) {
		this.esAlumno = esAlumno;
	}



}
