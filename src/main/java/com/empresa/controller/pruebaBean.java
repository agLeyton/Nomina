package com.empresa.controller;

import java.io.Serializable;

import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Named;

@Named("bean")
@SessionScoped
public class pruebaBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5300530508376905314L;

	
	public String mensaje() {
		return "Calculo de Nomina para empleado ";
	}
}
