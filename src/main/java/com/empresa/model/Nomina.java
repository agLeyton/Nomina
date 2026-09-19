package com.empresa.model;

import java.util.ArrayList;

public class Nomina {

	public double auxTransporte;
	public  double dctoSalud;
	public double salarioDeve;
	public double pension;
	public double netoPagar;
	
	

	

	public Nomina() {
		super();
	}

	public Nomina(double auxTransporte, double dctoSalud, double salarioDeve, double pension,
			double netoPagar) {
		super();
		this.auxTransporte = auxTransporte;
		this.dctoSalud = dctoSalud;
		this.salarioDeve = salarioDeve;
		this.pension = pension;
		this.netoPagar = netoPagar;
	}

	public double getSalarioDeve() {
		return salarioDeve;
	}

	public void setSalarioDeve(double salarioDeve) {
		this.salarioDeve = salarioDeve;
	}

	public double getPension() {
		return pension;
	}

	public void setPension(double pension) {
		this.pension = pension;
	}


	public double getAuxTransporte() {
		return auxTransporte;
	}

	public void setAuxTransporte(double auxTransporte) {
		this.auxTransporte = auxTransporte;
	}

	public double getDctoSalud() {
		return dctoSalud;
	}

	public void setDctoSalud(double dctoSalud) {
		this.dctoSalud = dctoSalud;
	}

	


	public double getNetoPagar() {
		return netoPagar;
	}

	public void setNetoPagar(double netoPagar) {
		this.netoPagar = netoPagar;
	}


	
	
	
	
}
