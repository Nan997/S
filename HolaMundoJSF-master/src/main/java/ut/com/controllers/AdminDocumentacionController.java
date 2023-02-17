package ut.com.controllers;

import java.util.List;

import javax.annotation.ManagedBean;
import javax.annotation.PostConstruct;
import javax.faces.bean.ViewScoped;

import com.ut.titulacionentities.entity.Documentacion;
import com.ut.titulacionservice.services.SuperAdmin;


@ManagedBean
@ViewScoped
public class AdminDocumentacionController {
	
	
	/**
	 * Lista de la docuemntacion que muestra la informacion en la tabla
	 */
	private List<Documentacion> documentacion;
	
	
	/**
	 * Objeto que permite utulizar los servicios de la logica 
	 */
	private SuperAdmin superAdmin = new SuperAdmin();
	
	@PostConstruct
	public void init() { 

		try {
			this.documentacion = this.superAdmin.consultarDocumentacion();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public List<Documentacion> getDocumentacion() {
		return documentacion;
	}

	public void setDocumentacion(List<Documentacion> documentacion) {
		this.documentacion = documentacion;
	}

	

}
