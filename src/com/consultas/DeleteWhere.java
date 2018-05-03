package com.consultas;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.conexionDb.ConexionDB;
import com.datos.Persona;



public class DeleteWhere extends ConexionDB{
	
	private String tablaNombre;

	public DeleteWhere(String host, String user, String contrasena, String tablaNombre) {
		    super(host, user, contrasena);
		    
		    this.tablaNombre = tablaNombre;
	}
	
	public void consutaDelete( Persona persona )throws SQLException{

		try {
			Connection con = this.conectarDB();
			PreparedStatement ps = con
					.prepareStatement("delete from "+this.tablaNombre+" where dni="+persona.getDni()+"");
	
			ps.executeUpdate();
			

		} catch (Exception e) {
			System.out.println(e);
		}
		
	}

}