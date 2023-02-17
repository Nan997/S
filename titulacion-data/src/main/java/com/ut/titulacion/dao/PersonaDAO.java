package com.ut.titulacion.dao;

import java.util.List;

import com.ut.titulacionentities.entity.Persona;


public interface PersonaDAO {
	

	
	int guardar(Persona persona);
	
	int actualizar (Persona persona);
	
	
	int eliminar (int idEmpleado);
	
	List<Persona> consultar ();

	Persona consultarporId(int idPersona);


	
}
