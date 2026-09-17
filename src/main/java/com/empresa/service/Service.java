package com.empresa.service;

import com.empresa.model.Empleado;
import com.empresa.model.Nomina;
import com.empresa.util.JSON;

public class Service {
	
	public Empleado objEmpl = new Empleado();
	public Nomina objNomina = new Nomina();
	JSON json = new JSON ();
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
	
	//public void enviarDatosJson() {
		
	//	json.cargarDatos(objEmpl, objNomina);
		
		
	//}
	

	public void agregarEmpleado(Empleado objE) {
		objEmpl.getListEmpl().add(objE);
	}
	
}
	


