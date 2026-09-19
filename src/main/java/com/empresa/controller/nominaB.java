package com.empresa.controller;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.empresa.service.Service;
import com.empresa.util.JSON;

import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Named;

@Named ("nominaB")
@SessionScoped
public class nominaB  implements Serializable{

	private Service objService = new Service();
	private static final long serialVersionUID = -5095101345913377387L;
	private List<Map<String, Object>> registros = new ArrayList<>();

	
	
	
	
	
	
	public Service getObjService() {
		return objService;
	}
	public void setObjService(Service objService) {
		this.objService = objService;
	}

	
	public List<Map<String, Object>> getRegistros() {
		return registros;
	}
	public void setRegistros(List<Map<String, Object>> registros) {
		this.registros = registros;
	}
	
	
	
	public void cargar() {
        try {
            registros = JSON.leerDatos();
            
            
            
            
            System.out.println("Se cargaron " + registros.size() + " registros desde el JSON");
       
        
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
	
	
}
