package com.ut.titulacionservice.services;

import java.sql.SQLException;

import com.ut.titulacion.daoImpl.PersonaDAOImpl;
import com.ut.titulacionentities.entity.Persona;

public class LoginService {

	
	private PersonaDAOImpl personaDAOImpl = new PersonaDAOImpl() ;
	
	public Persona consultarPorUsarioYPassword( String usuario, String password, boolean superAdmin) throws SQLException {
	
		return this.personaDAOImpl.consultarPorUsuarioYPassword(usuario, password, superAdmin);
	}
}
