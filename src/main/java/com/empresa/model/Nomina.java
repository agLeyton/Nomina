package com.empresa.model;

public class Nomina {

	public double auxTransporte;
	public  double dctoSalud;
	public double dcto;
	public double salarioNeto;
	public double salarioDeve;
	public double pension;
	
	
	

	public Nomina(double auxTransporte, double dctoSalud, double dcto, double salarioNeto, double salarioDeve,
			double pension) {
		super();
		this.auxTransporte = auxTransporte;
		this.dctoSalud = dctoSalud;
		this.dcto = dcto;
		this.salarioNeto = salarioNeto;
		this.salarioDeve = salarioDeve;
		this.pension = pension;
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

	public Nomina() {
		super();
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

	public double getDcto() {
		return dcto;
	}

	public void setDcto(double dcto) {
		this.dcto = dcto;
	}

	public double getSalarioNeto() {
		return salarioNeto;
	}

	public void setSalarioNeto(double salarioNeto) {
		this.salarioNeto = salarioNeto;
	}
	
	
	
}
