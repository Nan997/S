package ut.com.session;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.ut.titulacionentities.entity.Persona;


/**
 * Clase de JSF que almacena la informacion en sesion del usario
 */

@ManagedBean
@SessionScoped
public class SessionBean {

	/**
	 * Objeto del empleado que inicia la sesion
	 */
	private Persona persona;

	public Persona getPersona() {
		return persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}


	

}
