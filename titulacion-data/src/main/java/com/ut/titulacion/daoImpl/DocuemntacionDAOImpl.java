package com.ut.titulacion.daoImpl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ut.titulacion.connection.ConnectionFactory;
import com.ut.titulacion.dao.DocumentacionDAO;
import com.ut.titulacionentities.entity.Documentacion;
import com.ut.titulacionentities.entity.Persona;

public class DocuemntacionDAOImpl implements DocumentacionDAO {

	@Override
	public int guardar(Documentacion documentacion) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int actualizar(Documentacion documentacion) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int eliminar(int idDocuemntacion) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Documentacion> consultar() throws SQLException {
		
		
		String sql = " SELECT d.*, p.idPersona as Matricula FROM docuementacion d, persona p;";


		ResultSet rs = ConnectionFactory.ejecutarSQLSelect(sql);
		
		
		List<Documentacion> documentacionAlumno = new ArrayList<Documentacion>();

		if (rs != null) {
			while (rs.next()) {
				Documentacion documentacion = new Documentacion();
				documentacion.setIdDocumentacion(rs.getInt("idDocuementacion"));
				documentacion.setNombre(rs.getString("nombre"));
				documentacion.setPrimerApellido(rs.getString("primerApellido"));
				documentacion.setSegundoApellido(rs.getString("segundoApellido"));
				documentacion.setExpedienteAlumno(rs.getString("expedienteAlumno"));

				Persona persona = new Persona();
				persona.setIdPersona(rs.getInt("Matricula"));

				documentacion.setPersona(persona);

				documentacionAlumno.add(documentacion);
			}
		}

		return documentacionAlumno;
	}

	@Override
	public Documentacion consultarPorId(int idDocuemntacion) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

}
