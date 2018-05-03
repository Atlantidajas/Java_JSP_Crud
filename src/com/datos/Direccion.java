package com.datos;

/**
* @author Jorge Herrán
* @version 1.0
*/



public class Direccion {

	String nombreCalle;
	String numeroCalle;
	int codigoPostal;
	String municipio;
	String provincia;
	
	public Direccion( String nombreCalle,String numeroCalle,int codigoPostal,String municipio,String provincia ) {
		this.nombreCalle = nombreCalle;
		this.numeroCalle = numeroCalle;
		this.codigoPostal = codigoPostal;
		this.municipio = municipio;
		this.provincia = provincia;
	}
	
	public Direccion() {}
	
	public void setNombreCalle(String nombreCalle) {
		this.nombreCalle = nombreCalle;
	}
	
	public void setNumeroCalle(String numeroCalle) {
		this.numeroCalle = numeroCalle;
	}
	
	public void setCodigoPostal(int codigoPostal) {
		this.codigoPostal = codigoPostal;
	}
	
	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}
	
	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}
	
	public String getNombreCalle() {
		return this.nombreCalle;
	}

	public String getNumeroCalle() {
		return this.numeroCalle;
	}

	public int getCodigoPostal() {
		return this.codigoPostal;
	}

	public String getMunicipio() {
		return this.municipio;
	}

	public String getProvincia() {
		return this.provincia;
	}

}
