package com.empresa.model;

public class persona {
	
	protected String nombre="";
	protected String apellido="";
	protected String correo="";
	protected long identificacion=0;
	
	public persona(String nombre, String apellido, String correo, long identificacion) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.correo = correo;
		this.identificacion = identificacion;
	}

	public persona() {
		super();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public long getIdentificacion() {
		return identificacion;
	}

	public void setIdentificacion(long identificacion) {
		this.identificacion = identificacion;
	}
	
	
	
	
}
