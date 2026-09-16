package com.empresa.model;

public class Nomina {

	public double auxTransporte;
	public  double dctoSalud;
	public double dcto;
	public double salarioNeto;
	
	public Nomina(double auxTransporte, double dctoSalud, double dcto, double salarioNeto) {
		super();
		this.auxTransporte = auxTransporte;
		this.dctoSalud = dctoSalud;
		this.dcto = dcto;
		this.salarioNeto = salarioNeto;
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
