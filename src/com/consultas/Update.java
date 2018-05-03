package com.consultas;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.conexionDb.ConexionDB;
import com.datos.Persona;



public class Update extends ConexionDB{
	
	private String tablaNombre;

	public Update(String host, String user, String contrasena, String tablaNombre) {
		    super(host, user, contrasena);
		    
		    this.tablaNombre = tablaNombre;
	}
	
	public void consutaDbUpdate( Persona persona)throws SQLException{

		try {
			Connection con = this.conectarDB();
			PreparedStatement ps = con
					.prepareStatement("UPDATE "+this.tablaNombre+" SET nombre=?, apellidos=?, dni=?, emailPersonal=?,telefonoPersonal=?, edad=?, genero=?, contrasena=?, nombreCalle=?, numeroCalle=?, codigoPostal=?, municipio=?, provincia=? where dni="+persona.getDni()+"");
		
			
			ps.setString( 1, persona.getNombre() );
			ps.setString( 2, persona.getApellidos() );
			ps.setInt( 3, persona.getDni() );
			ps.setString( 4, persona.getEmailPersonal() );
			ps.setString( 5, persona.getTelefonoPersonal() );
			ps.setInt( 6, persona.getEdad() );
			ps.setString( 7, persona.getGenero() );
			ps.setString( 8, persona.getContrasena() );
			ps.setString( 9, persona.getNombreCalle() );
			ps.setString( 10, persona.getNumeroCalle() );
			ps.setInt( 11, persona.getCodigoPostal() );
			ps.setString( 12, persona.getMunicipio() );
			ps.setString( 13, persona.getProvincia() );
			
			ps.executeUpdate();

		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
