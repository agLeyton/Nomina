package com.empresa.service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.empresa.model.Empleado;
import com.empresa.model.Nomina;
import com.empresa.util.JSON;
import com.fasterxml.jackson.core.exc.StreamWriteException;
import com.fasterxml.jackson.databind.DatabindException;

public class Service {
	
	public Empleado objEmpl = new Empleado();
	public Nomina objNomina = new Nomina();

	public Empleado getObjEmpl() {
		return objEmpl;
	}
	
	public void setObjEmpl(Empleado objEmpl) {
		this.objEmpl = objEmpl;
	}
	public Nomina getObjNomina() {
		return objNomina;
	}
	public void setObjNomina(Nomina objNomina) {
		this.objNomina = objNomina;
	}
	
	
	
	


	public Nomina calcularNomina() {
		
	double salarioDiario=objNomina.getSalarioNeto() /30;
	
	
	objNomina.setSalarioDeve(salarioDiario * objEmpl.getDiasTrabajados());
		
	
	if(objNomina.getSalarioNeto()<=(2*1500000)){
		objNomina.setAuxTransporte((250000/30)*objEmpl.getDiasTrabajados());
	}else {
		objNomina.setAuxTransporte(0);

	}
	
	objNomina.setDctoSalud(objNomina.getSalarioDeve()* 0.04);
	objNomina.setPension(objNomina.getSalarioDeve()*0.04);
	objNomina.setNetoPagar(objNomina.getSalarioDeve()-objNomina.getDctoSalud()-objNomina.getPension()+objNomina.getAuxTransporte());
		
	return objNomina;
	}
	
	public void enviarDatosJson() throws StreamWriteException, DatabindException, IOException {
		
	    List<Map<String, Object>> datos = new ArrayList<>();

	
	for (int i =0; i< objEmpl.getListEmpl().size(); i++) {
		
		 Map<String, Object> objeto = new HashMap<>();

	        objeto.put("empleado", objEmpl.getListEmpl().get(i));
	        objeto.put("nomina", objNomina.getListNomina().get(i));

	        datos.add(objeto);
		
	}
		
		JSON.cargarDatos(datos);
		
		
		
	}
	

	public void agregarEmpleado(Empleado objE) {
		objEmpl.getListEmpl().add(objE);
	}
	
	public void agregarEmpleado(Nomina objN) {
		objNomina.getListNomina().add(objN);
	}
	
}
	


