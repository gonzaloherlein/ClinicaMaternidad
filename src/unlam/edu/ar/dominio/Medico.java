package unlam.edu.ar.dominio;

import java.util.Objects;

public abstract class Medico {
	private String nombre;
	private Integer edad;
	private Integer dni;
	
	public Medico() {
		
	}
	
	public Medico(String nombre, Integer edad,Integer dni) {
		if(validarDni(dni)) {
			this.setDni(dni);
		}
		else {
		throw new IllegalArgumentException ("El DNI ingresado no es válido");
		}
		this.nombre = nombre;
		this.edad = edad;
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

	public Integer getDni() {
		return dni;
	}

	public void setDni(Integer dni) {
		this.dni = dni;
	}
	
	public Boolean validarDni(Integer dni) {
		int cantidadDeDigitosDelDni = Integer.toString(dni.intValue()).length();
		int cantidadDeDigitosMinimaParaUnDni = 7;
		if(cantidadDeDigitosDelDni >= cantidadDeDigitosMinimaParaUnDni) {
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
