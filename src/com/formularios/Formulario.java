package com.formularios;

public class Formulario {
	
	protected String action;
	protected String valueNombre;
	protected String valueApellidos;
	protected int valueDni;
	protected String valueEmailPersonal;
	protected String valueTelefonoPersonal;
	protected int valueEdad;
	protected String valueGenero;
	protected String valueContrasena;
	protected String valueNombreCalle;
	protected String valueNumeroCalle;
	protected int valueCodigoPostal;
	protected String valueMunicipio;
	protected String valueProvincia;
	
	public Formulario( String action,
						String valueNombre,
						String valueApellidos,
						int valueDni,
						String valueEmailPersonal,
						String valueTelefonoPersonal,
						int valueEdad,
						String valueGenero,
						String valueContrasena,
						String valueNombreCalle,
						String valueNumeroCalle,
						int valueCodigoPostal,
						String valueMunicipio,
						String valueProvincia ) {
		 
			this.action = action;
			this.valueNombre = valueNombre;
			this.valueApellidos = valueApellidos;
			this.valueDni = valueDni;
			this.valueEmailPersonal = valueEmailPersonal;
			this.valueTelefonoPersonal = valueTelefonoPersonal;
			this.valueEdad = valueEdad;
			this.valueGenero = valueGenero;
			this.valueContrasena = valueContrasena;
			this.valueNombreCalle = valueNombreCalle;
			this.valueNumeroCalle = valueNumeroCalle;
			this.valueCodigoPostal = valueCodigoPostal;
			this.valueMunicipio = valueMunicipio;
			this.valueProvincia = valueProvincia;
		 
	 }

	protected void setAction(String action) {
		this.action = action;
	}
	
	protected void setValueNombre(String valueNombre) {
		this.valueNombre = valueNombre;
	}
	
	protected void setValueApellidos(String valueApellidos) {
		this.valueApellidos = valueApellidos;
	}
	
	protected void setValueDni(int valueDni) {
		this.valueDni = valueDni;
	}
	
	protected void setValueEmailPersonal(String valueEmailPersonal) {
		this.valueEmailPersonal = valueEmailPersonal;
	}
	
	protected void setValueTelefonoPersonal(String valueTelefonoPersonal) {
		this.valueTelefonoPersonal = valueTelefonoPersonal;
	}
	
	protected void setValueEdad(int valueEdad) {
		this.valueEdad = valueEdad;
	}
	 
	protected void setValueGenero(String valueGenero) {
		this.valueGenero = valueGenero;
	}
	
	protected void setValueContrasena(String valueContrasena) {
		this.valueContrasena = valueContrasena;
	}
	
	protected void setValueNombreCalle(String valueNombreCalle) {
		this.valueNombreCalle = valueNombreCalle;
	}
	
	protected void setValueNumeroCalle(String valueNumeroCalle) {
		this.valueNumeroCalle = valueNumeroCalle;
	}
	
	protected void setValueCodigoPostal(int valueCodigoPostal) {
		this.valueCodigoPostal = valueCodigoPostal;
	}
	
	protected void setValueMunicipio(String valueMunicipio) {
		this.valueMunicipio = valueMunicipio;
	}
	
	protected void setValueProvincia(String valueProvincia) {
		this.valueProvincia = valueProvincia;
	}
	
	protected String getAction() {
		return action;
	}

	protected String getValueNombre() {
		return valueNombre;
	}

	protected String getValueApellidos() {
		return valueApellidos;
	}
	
	protected int getValueDni() {
		return valueDni;
	}

	protected String getValueEmailPersonal() {
		return valueEmailPersonal;
	}

	protected String getValueTelefonoPersonal() {
		return valueTelefonoPersonal;
	}

	protected int getValueEdad() {
		return valueEdad;
	}

	protected String getValueGenero() {
		return valueGenero;
	}

	protected String getValueContrasena() {
		return valueContrasena;
	}

	protected String getValueNombreCalle() {
		return valueNombreCalle;
	}

	protected String getValueNumeroCalle() {
		return valueNumeroCalle;
	}

	protected int getValueCodigoPostal() {
		return valueCodigoPostal;
	}

	protected String getValueMunicipio() {
		return valueMunicipio;
	}

	protected String getValueProvincia() {
		return valueProvincia;
	}
	
}
