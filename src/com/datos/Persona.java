package com.datos;

import com.datos.Direccion;

public class Persona extends Direccion{
	
	String nombre;
	String apellidos;
	int dni;
	String emailPersonal;
	String telefonoPersonal;
	int edad;
	String genero;
	String contrasena;
	
	public Persona( String nombre, String apellidos, int dni, String emailPersonal, String telefonoPersonal, int edad, String genero, String contrasena, String nombreCalle,String numerocalle,int codigoPostal,String municipio,String provincia) {
			super( nombreCalle,numerocalle,codigoPostal,municipio,provincia);
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
		this.emailPersonal = emailPersonal;
		this.telefonoPersonal = telefonoPersonal;
		this.edad = edad;
		this.genero = genero;
		this.contrasena = contrasena;
		
	}
	
	public Persona(){
		
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	
	public void setDni(int dni) {
		this.dni = dni;
	}
	
	public void setEmailPersonal(String emailPersonal) {
		this.emailPersonal = emailPersonal;
	}
	
	public void setTelefonoPersonal(String telefonoPersonal) {
		this.telefonoPersonal = telefonoPersonal;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}
	
	public String getNombre() {
		return this.nombre;
	}

	public String getApellidos() {
		return this.apellidos;
	}

	public int getDni() {
		return this.dni;
	}
	
	public String getEmailPersonal() {
		return this.emailPersonal;
	}

	public String getTelefonoPersonal() {
		return this.telefonoPersonal;
	}
	
	public int getEdad() {
		return this.edad;
	}

	public String getGenero() {
		return this.genero;
	}

	public String getContrasena() {
		return this.contrasena;
	}

	@Override
	public String toString() {
		return  nombre + apellidos + dni + emailPersonal + telefonoPersonal + telefonoPersonal + edad  + genero  + contrasena  + nombreCalle  + numeroCalle  + codigoPostal  + provincia;
	}
}
