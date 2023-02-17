package ut.com.controllers;

import java.io.IOException;
import java.sql.SQLException;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

import com.ut.titulacionentities.entity.Persona;
import com.ut.titulacionservice.services.LoginService;

import ut.com.session.SessionBean;
import ut.com.utils.ControllerUtilis;

@ManagedBean
@ViewScoped
public class Login {

	/**
	 * Usuario capturado por el usuario final
	 */
	private String username;
	/**
	 * Contraseña capturada por el usuario final.
	 */
	private String password;
	/**
	 * Indicador para saber si el usuario a ingresar es un administrador general.
	 */
	private boolean esSuperAdmin;
	
	
	/**
	 * Objeto que mantiene la informacion en sesion del aplicativo.
	 */
	@ManagedProperty("#{sessionBean}")
	private SessionBean sessionBean;
	
	/**
	 * Objeto para obtener la informacion de la logica de negocio del login.
	 */
	private LoginService loginService = new LoginService();
	


	public void iniciarSesion() throws IOException {

		ControllerUtilis.redireccionar("/index.xhtml");
	}

	public void entrar() {

		try {
			Persona personaConsultada = this.loginService.consultarPorUsarioYPassword(this.username, this.password,
					esSuperAdmin);

			if (personaConsultada != null) {

				if (personaConsultada.isEstatus()) {

					if (personaConsultada.isSuperadmin()) {

						ControllerUtilis.redireccionar("/tablaproceso.xhtml");
						
					} 
					
					this.sessionBean.setPersona(personaConsultada);
	
				} else {
					ControllerUtilis.mostrarMensaje(FacesMessage.SEVERITY_ERROR, "Error", "El usario esta deshabilitado del sistema");
					System.out.println("El usario esta desahabilitado");
				
				} 						
			} else {
				
				ControllerUtilis.mostrarMensaje(FacesMessage.SEVERITY_ERROR, "Error", "El usario y/o contraseña son incorrectas");	
				System.out.println("Contra incorrecta");
			}
												
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			ControllerUtilis.mostrarMensaje(FacesMessage.SEVERITY_ERROR, "Error", "Hubo un problema al solicitar su solicitud favor de intenarlo mas tarde");				

			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			ControllerUtilis.mostrarMensaje(FacesMessage.SEVERITY_ERROR, "Error", "Hubo un problema al acceder a la pantalla d einicio ");
			e.printStackTrace();
		}
	}

	public SessionBean getSessionBean() {
		return sessionBean;
	}

	public void setSessionBean(SessionBean sessionBean) {
		this.sessionBean = sessionBean;
	}

	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isEsSuperAdmin() {
		return esSuperAdmin;
	}

	public void setEsSuperAdmin(boolean esSuperAdmin) {
		this.esSuperAdmin = esSuperAdmin;
	}
}
