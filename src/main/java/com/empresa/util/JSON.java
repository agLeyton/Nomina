package com.empresa.util;

import java.util.ArrayList;

import com.empresa.model.Empleado;
import com.empresa.model.Nomina;
import com.google.gson.Gson;
import com.google.gson.JsonObject;

public class JSON {
	Gson gson = new Gson();
	JsonObject jsonFinal = new JsonObject();
	
	ArrayList<> lista= new ArrayList<E>();
	
	
	public void cargarDatos() {
		
        String jsonString = gson.toJson(objEmpleado);
        System.out.println(jsonString);
		
        String json = gson.toJson(objNomina);
        System.out.println(json);
		 // jsonFinal.add("empleado", gson.toJsonTree(objEmpleado));
		//jsonFinal.add("nomina", gson.toJsonTree(objNomina));
		
	}
	
	
	public void 
	

}
