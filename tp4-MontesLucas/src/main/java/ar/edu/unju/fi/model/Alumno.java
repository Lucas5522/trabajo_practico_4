package ar.edu.unju.fi.model;


public class Alumno {
	long dni;
	String nombre;
	String apellido;
	String email;
	long telefono;
	String fechaNacimeinto;
	String domicilio;
	int libretaUniversitaria;
	
	public Alumno() {
		// TODO Auto-generated constructor stub
	}

	public Alumno(long dni, String nombre, String apellido, String email, long telefono, String fechaNacimeinto,
			String domicilio, int libretaUniversitaria) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
		this.email = email;
		this.telefono = telefono;
		this.fechaNacimeinto = fechaNacimeinto;
		this.domicilio = domicilio;
		this.libretaUniversitaria = libretaUniversitaria;
	}

	@Override
	public String toString() {
		return "Alumno [dni=" + dni + ", nombre=" + nombre + ", apellido=" + apellido + ", email=" + email
				+ ", telefono=" + telefono + ", fechaNacimeinto=" + fechaNacimeinto + ", domicilio=" + domicilio
				+ ", libretaUniversitaria=" + libretaUniversitaria + "]";
	}

	public long getDni() {
		return dni;
	}

	public void setDni(long dni) {
		this.dni = dni;
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

	public String getFechaNacimeinto() {
		return fechaNacimeinto;
	}

	public void setFechaNacimeinto(String fechaNacimeinto) {
		this.fechaNacimeinto = fechaNacimeinto;
	}

	public String getDomicilio() {
		return domicilio;
	}

	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}

	public int getLibretaUniversitaria() {
		return libretaUniversitaria;
	}

	public void setLibretaUniversitaria(int libretaUniversitaria) {
		this.libretaUniversitaria = libretaUniversitaria;
	}
	
	
	
	
	
}
