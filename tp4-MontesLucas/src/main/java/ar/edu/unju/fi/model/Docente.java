package ar.edu.unju.fi.model;

import org.springframework.stereotype.Component;

@Component
public class Docente {
	long legajo;
	String nombre;
	String apellido;
	String email;
	long telefono;
	
	public Docente() {
		// TODO Auto-generated constructor stub
	}

	public Docente(long legajo, String nombre, String apellido, String email, long telefono) {
		super();
		this.legajo = legajo;
		this.nombre = nombre;
		this.apellido = apellido;
		this.email = email;
		this.telefono = telefono;
	}

	@Override
	public String toString() {
		return "Docente [legajo=" + legajo + ", nombre=" + nombre + ", apellido=" + apellido + ", email=" + email
				+ ", telefono=" + telefono + "]";
	}

	public long getLegajo() {
		return legajo;
	}

	public void setLegajo(long legajo) {
		this.legajo = legajo;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getTelefono() {
		return telefono;
	}

	public void setTelefono(long telefono) {
		this.telefono = telefono;
	}
	
	
	
	
	
	
	
}
