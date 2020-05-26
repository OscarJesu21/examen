package com.upaxer.WebApp.model;

public class UsuariosBean {

	private Integer idUsuario;
	private String nombre;
	private String apellidos;
	private int edad;
	
	public UsuariosBean(Integer idUsuario, String nombre, String apellidos, int edad) {
	
		this.idUsuario = idUsuario;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
	}

	public UsuariosBean() {
		
	}
	
	
	public Integer getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(Integer idUsuario) {
		this.idUsuario = idUsuario;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	
}
