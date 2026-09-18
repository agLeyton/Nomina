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
	
	public Empleado objEmpl ; 
	public Nomina objNomina ;
	public ArrayList<Empleado> listEmpl= new ArrayList<Empleado>();
	ArrayList<Nomina>listNomina = new ArrayList<Nomina>();
	
	

	public Service() {
		super();
		objEmpl = new Empleado();
		objNomina =  new Nomina();
	}

	
	




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
	
	public ArrayList<Empleado> getListEmpl() {
		return listEmpl;
	}


	public void setListEmpl(ArrayList<Empleado> listEmpl) {
		this.listEmpl = listEmpl;
	}
	
	
	public ArrayList<Nomina> getListNomina() {
		return listNomina;
	}

	public void setListNomina(ArrayList<Nomina> listNomina) {
		this.listNomina = listNomina;
	}


	public void calcularNomina(Empleado objE) throws StreamWriteException, DatabindException, IOException {

	    System.out.println("entro a calculaN");
	    System.out.println("objE: " + objE.getNombre() + " - " + objE.getSalario());

	    // Copia del empleado que llega por parámetro, para no guardar referencias compartidas
	    Empleado empleadoAGuardar = new Empleado();
	    empleadoAGuardar.setNombre(objE.getNombre());
	    empleadoAGuardar.setApellido(objE.getApellido());
	    empleadoAGuardar.setCorreo(objE.getCorreo());
	    empleadoAGuardar.setIdentificacion(objE.getIdentificacion());
	    empleadoAGuardar.setSalario(objE.getSalario());
	    empleadoAGuardar.setDiasTrabajados(objE.getDiasTrabajados());
	    empleadoAGuardar.setCargo(objE.getCargo());

	    // Nómina NUEVA para este cálculo
	    Nomina nuevaNomina = new Nomina();

	    double salarioDiario = objE.getSalario() / 30;

	    nuevaNomina.setSalarioDeve(salarioDiario * objE.getDiasTrabajados());

	    if (objE.getSalario() <= (2 * 1500000)) {
	        nuevaNomina.setAuxTransporte((250000.0 / 30) * objE.getDiasTrabajados());
	    } else {
	        nuevaNomina.setAuxTransporte(0);
	    }

	    nuevaNomina.setDctoSalud(nuevaNomina.getSalarioDeve() * 0.04);
	    nuevaNomina.setPension(nuevaNomina.getSalarioDeve() * 0.04);
	    nuevaNomina.setNetoPagar(
	        nuevaNomina.getSalarioDeve()
	        - nuevaNomina.getDctoSalud()
	        - nuevaNomina.getPension()
	        + nuevaNomina.getAuxTransporte()
	    );

	    agregarEmpleadoYNomina(empleadoAGuardar, nuevaNomina);
	}
	
	
	
	public void enviarDatosJson() throws StreamWriteException, DatabindException, IOException {
		System.out.println("entro a enviar datos");

		
	    List<Map<String, Object>> datos = new ArrayList<>();

	
	for (int i =0; i< listEmpl.size(); i++) {
		
		 Map<String, Object> objeto = new HashMap<>();

	        objeto.put("empleado", listEmpl.get(i));
	        objeto.put("nomina", listNomina.get(i));

	        datos.add(objeto);
		
	}
		
		JSON.cargarDatos(datos);	
	}
	

	public void agregarEmpleadoYNomina(Empleado objE, Nomina objN) throws StreamWriteException, DatabindException, IOException {
		System.out.println("entro a agregar");

		listEmpl.add(objE);
		listNomina.add(objN);
		enviarDatosJson();
	}
	
}
	


