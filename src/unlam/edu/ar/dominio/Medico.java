package unlam.edu.ar.dominio;

import java.util.Objects;

public abstract class Medico {
	private String nombre;
	private Integer edad;
	private String dni;
	
	public Medico() {
		
	}
	
	public Medico(String nombre, Integer edad,String dni) {
		this.nombre = nombre;
		this.edad = edad;
		this.dni = dni;
		validarDni(dni);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}
	
	public Boolean validarDni(String dni) {
		if(this.dni.length() == 8) {
			setDni(dni);
			return true;
		}
		return false;
	}
	
	public abstract Boolean validarJubilacion();
	

	@Override
	public int hashCode() {
		return Objects.hash(dni);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Medico other = (Medico) obj;
		return Objects.equals(dni, other.dni);
	}
	
	
	
}
