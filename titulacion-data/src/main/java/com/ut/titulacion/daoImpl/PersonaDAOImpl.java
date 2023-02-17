package com.ut.titulacion.daoImpl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.ut.titulacion.connection.ConnectionFactory;
import com.ut.titulacion.dao.PersonaDAO;
import com.ut.titulacionentities.entity.Persona;
import com.ut.titulacionentities.entity.Rol;
import com.ut.titulacionentities.entity.Universidad;

public class PersonaDAOImpl  implements PersonaDAO{
	
	
	
	static {
		try {
			ConnectionFactory.conectar();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public int guardar (Persona persona) {
		return 0;	
		
	}
	
	@Override
	public int actualizar(Persona persona) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int eliminar(int idEmpleado) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Persona> consultar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Persona consultarporId(int idPersona) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	//Persona porque es el objeto que va regresar
	
	public Persona consultarPorUsuarioYPassword(String usuario, String password, boolean superAdmin) throws SQLException{
		
		Persona  persona = null;
		
		//se inicia vacia porque depende del if
		String sql  = "";
		
		if(superAdmin) {
			sql = "SELECT p.*, r.nombre as nombreRol, u.nombre as nombreUni, u.idUniversidad\r\n"
					+ "										FROM persona p, rol r, universidad u\r\n"
					+ "								        WHERE p.idRol = r.idRol \r\n"
					+ "									    AND p.idUniversidad = u.idUniversidad \r\n"
					+ "									    AND (p.usuario = '"+usuario+"' OR p.email = '"+usuario+"') \r\n"
					+ "										AND password = '"+password+"'\r\n"
					+ "					                    AND p.esEstudiante IS NULL;";
		}else{
			sql = "SELECT p.*, r.nombre as nombreRol, u.nombre as nombreUni, u.idUniversidad\r\n"
					+ "										FROM persona p, rol r, universidad u\r\n"
					+ "								        WHERE p.idRol = r.idRol \r\n"
					+ "									    AND p.idUniversidad = u.idUniversidad \r\n"
					+ "									    AND (p.usuario = '"+usuario+"' OR p.email = '"+usuario+"') \r\n"
					+ "										AND password = '"+password+"'\r\n"
					+ "					                    AND p.superadmin IS NULL;";
		}
		
		//almacena la informacion de la consulta
		
		ResultSet rs = ConnectionFactory.ejecutarSQLSelect(sql);
	
		//verifica si hay algo en rs y regresa la informacion si contiene datos
		
		if(rs != null) {
			if(rs.next()) {
				persona = new Persona();
				persona.setIdPersona(rs.getInt("idPersona"));
				persona.setNombre(rs.getString("nombre"));
				persona.setPrimerApellido(rs.getString("segundoApellido"));
				persona.setSegundoApellido(rs.getString("segundoApellido"));
				persona.setUsuario(rs.getString("usuario"));
				persona.setPassword(rs.getString("password"));
				persona.setEmail(rs.getString("email"));
				persona.setEstatus(rs.getBoolean("estatus"));
			    persona.setSuperadmin(rs.getBoolean("superadmin"));
				persona.setEsAlumno(rs.getBoolean("esEstudiante"));
				
				
				//Se instancia rol para obtener los datos del rol
				Rol rol = new Rol();
				rol.setIdRol(rs.getInt("idRol"));
				rol.setNombre(rs.getString("nombreRol"));
				
				persona.setRol(rol);
				
				Universidad universidad  = new Universidad();
				
				universidad.setIdUniversidad(rs.getInt("idUniversidad"));
				universidad.setNombre(rs.getString("nombreUni"));

			}
		}
		return persona;
		
	}
}
