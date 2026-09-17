package com.empresa.controller;

import java.io.Serializable;

import com.empresa.service.Service;

import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Named;

@Named ("nominaB")
@SessionScoped
public class nominaB  implements Serializable{

	private Service objService = new Service();
	private static final long serialVersionUID = -5095101345913377387L;
	
	
	public Service getObjService() {
		return objService;
	}
	public void setObjService(Service objService) {
		this.objService = objService;
	}

	
	
	
	
}
