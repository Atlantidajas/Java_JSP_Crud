package com.conexionDb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class ConexionDB {
	
	protected String host;
	protected String usuario;
	protected String contrasena;
	protected Statement st;

	public ConexionDB(String host, String user, String contrasena) {
		
		this.host = host;
		this.usuario = user;
		this.contrasena = contrasena;
		
	}
	
	public Connection conectarDB() {
		Connection con = null;
		try {
			con = DriverManager.getConnection( this.host, this.usuario, this.contrasena );
			System.out.println("Conectado MYSQL");
		} catch (Exception e) {
			System.out.println("No se conecto" +  e.getMessage());
		}
		return con;
	}
	

}
