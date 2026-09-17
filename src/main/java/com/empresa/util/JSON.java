package com.empresa.util;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import com.empresa.model.Empleado;
import com.empresa.model.Nomina;
import com.fasterxml.jackson.core.exc.StreamWriteException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;


public class JSON {
	
	 
	public void cargarDatos(Empleado obje) {
		  try {
				 ObjectMapper mapeador= new ObjectMapper();
				 mapeador.writeValue(new File("datos.json"), obje);
				 
				   } catch (Exception e) {
					   
					   
					   
				   }
					
		
	}
	
	
	public void  leerDatos() {
		
		  try {
		      ObjectMapper mapeador= new ObjectMapper();
		     // Empleado persona= mapeador.readValue(new File("datos.json"),Persona.class);
		    
		   //   System.out.println(persona.getNombre());
		     // System.out.println(persona.getApellido());
		      //System.out.println(persona.getIdentificacion());
		      
		      
		      
		    } catch (StreamWriteException e) {
		
		
	}
		  
	}
	

}
