package com.example.demo.controlador;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity

public class UNIVERSIDAD {
@Id
	private int id;
	private String nombre;
	private String Descripción;
	private String direccion;
	private String telefono;
	private int numerodeestudiantes;
	private String correoelectronico;

	public UNIVERSIDAD(int id, String nombre, String descripción, String direccion, String telefono,
			int numerodeestudiantes, String correoelectronico) {
		super();
		this.id = id;
		this.nombre = nombre;
		Descripción = descripción;
		this.direccion = direccion;
		this.telefono = telefono;
		this.numerodeestudiantes = numerodeestudiantes;
		this.correoelectronico = correoelectronico;
	}

	public UNIVERSIDAD() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripción() {
		return Descripción;
	}

	public void setDescripción(String descripción) {
		Descripción = descripción;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public int getNumerodeestudiantes() {
		return numerodeestudiantes;
	}

	public void setNumerodeestudiantes(int numerodeestudiantes) {
		this.numerodeestudiantes = numerodeestudiantes;
	}

	public String getCorreoelectronico() {
		return correoelectronico;
	}

	public void setCorreoelectronico(String correoelectronico) {
		this.correoelectronico = correoelectronico;
	}

}
