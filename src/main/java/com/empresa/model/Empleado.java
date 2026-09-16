package com.empresa.model;

public class Empleado extends persona{

	public Double salario;
	public  int diasTrabajados=0;
	public String cargo="";
	
	
	public Empleado(String nombre, String apellido, String correo, long identificacion, Double salario,
			int diasTrabajados, String cargo) {
		super(nombre, apellido, correo, identificacion);
		this.salario = salario;
		this.diasTrabajados = diasTrabajados;
		this.cargo = cargo;
	}
	

	public Empleado(String nombre, String apellido, String correo, long identificacion) {
		super(nombre, apellido, correo, identificacion);
	}


	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	public int getDiasTrabajados() {
		return diasTrabajados;
	}

	public void setDiasTrabajados(int diasTrabajados) {
		this.diasTrabajados = diasTrabajados;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
	
	
}
