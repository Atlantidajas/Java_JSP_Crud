<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link href="../css/datos.css" rel="stylesheet" type="text/css">
	<script type="text/javascript" src="../js/borrarActualizar.js"></script>
    <title>Actualizar datos</title>
</head>
<body>

<%@ page import = "com.consultas.Datos" %>
<%@ page import = "com.formularios.FormularioTablaDatos" %>


	<% Datos datos = new Datos( "jdbc:mysql://localhost:3306/personas", "root", "", "personales" );
			
		FormularioTablaDatos[] form = new FormularioTablaDatos[datos.consutaDb().size()];
		
		for(int i = 0; i < datos.consutaDb().size(); i++){
			
				FormularioTablaDatos formularioTablaDatos = new FormularioTablaDatos( "../../E4/PostDerivador",
																				datos.consutaDb().get(i).getNombre(),
																				datos.consutaDb().get(i).getApellidos(),
																				datos.consutaDb().get(i).getDni(),
																				datos.consutaDb().get(i).getEmailPersonal(),
																				datos.consutaDb().get(i).getTelefonoPersonal(),
																				datos.consutaDb().get(i).getEdad(),
																				datos.consutaDb().get(i).getGenero(),
																				datos.consutaDb().get(i).getContrasena(),
																				datos.consutaDb().get(i).getNombreCalle(),
																				datos.consutaDb().get(i).getNumeroCalle(),
																				datos.consutaDb().get(i).getCodigoPostal(),
																				datos.consutaDb().get(i).getMunicipio(),
																				datos.consutaDb().get(i).getProvincia() );
				
				
				
				form[i] = formularioTablaDatos;
				
				out.print( form[i].tablaDatos());
		
		}
	%>

</body>
</html>