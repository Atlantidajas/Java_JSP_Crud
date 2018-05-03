package com.post;

import java.io.IOException;
//import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.consultas.DeleteWhere;
import com.consultas.InsertInto;
import com.consultas.Update;
import com.datos.Persona;

//import com.consultas.Update;

@WebServlet("/PostDerivador")
public class PostDerivador extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
    public PostDerivador() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Persona persona = new Persona();
		persona.setNombre( request.getParameter( "nombre") );
		persona.setApellidos( request.getParameter( "apellidos") );
		persona.setDni( Integer.parseInt( request.getParameter("dni") ));
		persona.setEmailPersonal( request.getParameter("emailPersonal") );
		persona.setTelefonoPersonal( request.getParameter("telefonoPersonal") );
		persona.setEdad( Integer.parseInt(request.getParameter("edad") ) );
		persona.setGenero( request.getParameter("genero") );
		persona.setContrasena( request.getParameter("contrasena") );
		persona.setNombreCalle( request.getParameter("nombreCalle") );
		persona.setNumeroCalle( request.getParameter("numeroCalle") );
		persona.setCodigoPostal( Integer.parseInt(request.getParameter("codigoPostal") ) );
		persona.setMunicipio( request.getParameter("municipio") );
		persona.setProvincia( request.getParameter("provincia") );
		
		
		String guardar = null;//<-- a null ya que hay formularios que no usan este botón y no se recibiría ningún valor
		String borrar = null;//<-- a null ya que hay formularios que no usan este botón y no se recibiría ningún valor
		String registrar = null;//<-- a null ya que hay formularios que no usan este botón y no se recibiría ningún valor
		
	    guardar = request.getParameter( "botonGuardar" ); //<-- Value Botón formulario tablaDatos()
		borrar = request.getParameter( "botonBorrar" ); //<-- Value Botón formulario tablaDatos()
		registrar = request.getParameter( "registrar" ); //<-- Value Botón formulario nuevoRegistroFormulario()
		
		//PrintWriter pw = response.getWriter();
		//pw.println(guardar);
		//pw.println(borrar);
		 
		if ( "Guardar".equals( guardar ) ) {
			//pw.println("Se guardarán los datos");
			Update update = new Update("jdbc:mysql://localhost:3306/personas", "root", "", "personales");

			try {
				
				update.consutaDbUpdate( persona );
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}
		
		if ( "Borrar".equals( borrar ) ) {
			//pw.println("Se borrarán los datos");
			DeleteWhere delete = new DeleteWhere("jdbc:mysql://localhost:3306/personas", "root", "", "personales");
			
			try {
				
				delete.consutaDelete( persona );
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		if ( "Registrar".equals( registrar ) ) {
			//pw.println("Se borrarán los datos");
			InsertInto insertInto = new InsertInto("jdbc:mysql://localhost:3306/personas", "root", "", "personales");
			
			try {
				
				insertInto.consutaInsertInto( persona );
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}

}
