package com.empresa.util;

import com.empresa.model.Empleado;
import com.empresa.model.Nomina;
import com.google.gson.Gson;
import com.google.gson.JsonObject;

public class JSON {
	Gson gson = new Gson();
	JsonObject jsonFinal = new JsonObject();
	
	
	
	public void cargarDatos(Empleado objEmpleado , Nomina objNomina) {
		jsonFinal.add("empleado", gson.toJsonTree(objEmpleado));
		jsonFinal.add("nomina", gson.toJsonTree(objNomina));
		
	}
	

}
