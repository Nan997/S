package com.ut.titulacionservice.services;

import java.sql.SQLException;
import java.util.List;

import com.ut.titulacion.daoImpl.DocuemntacionDAOImpl;
import com.ut.titulacionentities.entity.Documentacion;

public class SuperAdmin {
	
	
	
	private DocuemntacionDAOImpl docuemntacionDAOImpl = new DocuemntacionDAOImpl();
	
	
	//::::::::::::::::::Docuemntacion: ////////////////////////

	public List<Documentacion> consultarDocumentacion() throws SQLException{ 
		
		return this.docuemntacionDAOImpl.consultar();
		
		
	}

}
