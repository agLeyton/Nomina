package com.empresa.service;

import com.empresa.model.Empleado;
import com.empresa.model.Nomina;

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
	
	
	
	
	public double calcularNomina() {
		
	double salarioDiario=objNomina.getSalarioNeto() /30;
	
	objNomina.setSalarioDeve(salarioDiario * objEmpl.getDiasTrabajados());
		
		return 0;
		
	}
	
	

}
