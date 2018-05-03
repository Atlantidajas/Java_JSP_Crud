package com.formularios;

import com.formularios.Formulario;

public class FormularioTablaDatos extends Formulario{

	public FormularioTablaDatos( String action,
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
				   super ( action,
						   valueNombre,
						   valueApellidos,
						   valueDni,
						   valueEmailPersonal,
						   valueTelefonoPersonal,
						   valueEdad,
						   valueGenero,
						   valueContrasena,
						   valueNombreCalle,
						   valueNumeroCalle,
						   valueCodigoPostal,
						   valueMunicipio,
						   valueProvincia );
	}
	

	public String tablaDatos() {
		
		String tablaDatos = 
				
		"<form action='" + this.getAction() + "' method='post'>" +

		"<table>" +
				
				"<caption></caption>" +
				
				"<tr>" +
					"<th>Nombre</th>" +
					"<th>Apellidos</th>" +
					"<th>DNI</th>" +
					"<th>Email</th>" +
					"<th>Telefono</th>" +
					"<th>Edad</th>" +
					"<th>Genero</th>" +
					"<th>Contraseña</th>" +
					"<th>Calle</th>" +
					"<th>Número</th>" +
					"<th>Código Postal</th>" +
					"<th>Municipio</th>" +
					"<th>Provincia</th>" +
					"<th>Borrar</th>" +
					"<th>Guardar</th>" +
					
				"</tr>" +
				"<tr>" +
				
					"<th>" +
						"<input type='text' name='nombre' class='inputText' id='nombre' placeholder='Solo nombre' value='" + this.getValueNombre() + "'>" +	
					"</th>" +
					"<th>" +
					"<input type='text' name='apellidos' class='inputText' id='apellidos' placeholder='Sus dos apellidos' value='" + this.getValueApellidos() + "'>" +
					"</th>" +
					"<th>" +
						"<input type='text' name='dni' class='inputText' id='dni' placeholder='DNI + Letra' value='" + this.getValueDni() + "' required>" +
					"</th>" +
					"<th>" +
						"<input type='email' name='emailPersonal' class='inputEmail' id='emailPersonal' placeholder='E-mail' value='" + this.getValueEmailPersonal() + "'>" +
					"</th>" +
					"<th>" +
						"<input type='tel' name='telefonoPersonal' class='inputText' id='telefonoPersonal' placeholder='Número teléfono' value='" + this.getValueTelefonoPersonal() + "'>" +
					"</th>" +
					"<th>" +
						"<input type='text' name='edad' class='inputText' id='edad' placeholder='Edad' value='" + this.getValueEdad() + "'>" +
					"</th>" +
					"<th>" +
						"<input type='text' name='genero' class='inputText' id='genero' placeholder='Genero' value='" + this.getValueGenero() + "'>" +
					"</th>" +
					"<th>" +
						"<input type='text' name='contrasena' class='inputPassword' id='contrasena' placeholder='Que contraseña desea' value='" +  this.getValueContrasena() +"' required>" +
					"</th>" +
					"<th>" +
						"<input type='text' name='nombreCalle' class='inputText' id='nombreCalle' placeholder='Nombre de la calle' value='" + this.getValueNombreCalle() + "'>" +
					"</th>" +
					"<th>" +
						"<input type='text' name='numeroCalle' class='inputText' id='numerocalle' placeholder='Número de la calle' value='" + this.getValueNumeroCalle() + "'>" +
					"</th>" +
					"<th>" +
						"<input type='text' name='codigoPostal' class='inputText' id='codigoPostal' placeholder='Número postal' value='" + this.getValueCodigoPostal() + "'>" +
					"</th>" +
					"<th>" +
						"<input type='text' name='municipio' class='inputText' id='municipio' placeholder='Municipio' value='" + this.getValueMunicipio() + "'>" +
					"</th>" +
					"<th>" +
						"<input type='text' name='provincia' class='inputText' id='provincia' placeholder='Provincia' value='" + this.getValueProvincia() + "'>" +
					"</th>" +
					"<th>" +
						"<input onclick='borrarCampo()' id='botonBorrar' type='submit' name='botonBorrar' class='inputButton' value='Borrar'>" +
					"</th>" +
					"<th>" +
						"<input onclick='actualizarCampo()' id='botonGuardar' type='submit' name='botonGuardar' class='inputButton'  value='Guardar'>" +
					"</th>" +				
				"</tr>" +
	"</table>" +
		"</form>";
		
		return tablaDatos;
	}
}
