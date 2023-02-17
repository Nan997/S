package ut.com.utils;

import java.io.IOException;

import javax.faces.application.FacesMessage;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.faces.application.FacesMessage.Severity;


public class ControllerUtilis {
	

	/**
	 * Metodo que permite navegar entre pantallas del aplicativo
	 * @param pagina pagina a redireccionar
	 * @throws IOException Excepcion generada en caso de no encontrar la pagina
	 */
	public static void redireccionar(String pagina) throws IOException {
		
		ExternalContext ec = FacesContext.getCurrentInstance().getExternalContext(); 
		String contextPath = ec.getRequestContextPath();
     	ec.redirect(contextPath + pagina);
//    	ec.redirect(contextPath.concat(pagina));
	}
	
	

	/***
	 * Metodo que permite mostrar un mensaje al usuario
	 * @param severity tipo de mensaje
	 * @param titulo titulo de la ventana
	 * @param mensaje descripciona a mostrar el mensaje
	 */
	public static void mostrarMensaje(Severity severity, String titulo, String mensaje) {
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(severity, titulo, mensaje));
	}
	
}
