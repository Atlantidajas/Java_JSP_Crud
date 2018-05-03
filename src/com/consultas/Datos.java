package com.consultas;


import com.conexionDb.ConexionDB;
import com.datos.Persona;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Datos extends ConexionDB{
	
	private String tablaNombre;

	public Datos(String host, String user, String contrasena, String tablaNombre) {
		    super(host, user, contrasena);
		    
		    this.tablaNombre = tablaNombre;
	}
	
	public ArrayList<Persona> consutaDb() throws SQLException{
		

		ArrayList<Persona> list = new ArrayList<Persona>();

		try {   
			Connection con = this.conectarDB();
			PreparedStatement ps = con.prepareStatement("SELECT * FROM "+this.tablaNombre+"");
			ResultSet rs = ps.executeQuery();
			
				
			while ( rs.next() ) {
					

				 Persona persona = new Persona();
			
				 persona.setNombre( rs.getString("nombre") );
				 persona.setApellidos( rs.getString("apellidos") );
				 persona.setDni( rs.getInt( "dni" ) );
				 persona.setEmailPersonal( rs.getString("emailPersonal") );
				 persona.setTelefonoPersonal( rs.getString("telefonoPersonal") );
				 persona.setEdad( rs.getInt("edad") );
				 persona.setGenero( rs.getString("genero") );
				 persona.setContrasena( rs.getString("contrasena") );
				 persona.setNombreCalle( rs.getString("nombreCalle") );
				 persona.setNumeroCalle( rs.getString("numeroCalle") );
				 persona.setCodigoPostal( rs.getInt("codigoPostal") );
				 persona.setMunicipio( rs.getString("municipio") );
				 persona.setProvincia( rs.getString("provincia") );
				 list.add(persona);
			}
				
		}
		catch( Exception e ){
			System.out.println("No se conecto" +  e.getMessage());
		}
		
		return list;// Array de personas con todos sus métodos.
		
	}
	
	

}
