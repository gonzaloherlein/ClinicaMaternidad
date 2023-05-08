package unlam.edu.ar.dominio;

import java.time.LocalDate;

public class Bebe {

	private LocalDate fechaDeNacimiento;
	private String nombre;
	private String apellido;
	private Integer dni;

	public Bebe() {

	}

	public Bebe(int anio, int mes, int dia, String Nombre, String Apellido, Integer Dni) {
		if (validarDni(Dni)) {
			this.setDni(Dni);
		} 
		else throw new IllegalArgumentException("El DNI ingresado no es válido");
		
		if(validarFechaDeNacimiento(anio, mes, dia)){
			fechaDeNacimiento = LocalDate.of(anio, mes, dia);
		}
		else throw new IllegalArgumentException("La fecha ingresada no es válida");
		
		this.nombre = Nombre;
		this.apellido = Apellido;
	}
	
	public LocalDate getFechaDeNacimiento() {
		return fechaDeNacimiento;
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

	public Integer getDni() {
		return dni;
	}

	public void setDni(Integer dni) {
		this.dni = dni;
	}


	public Boolean validarDni(Integer dni) {
		int cantidadDeDigitosDelDni = Integer.toString(dni.intValue()).length();
		int cantidadDeDigitosMinimaParaUnDni = 7;
		if (cantidadDeDigitosDelDni >= cantidadDeDigitosMinimaParaUnDni) {
			setDni(dni);
			return true;
		}
		return false;
	}
	
	private boolean validarFechaDeNacimiento(int anio, int mes, int dia) {
		LocalDate fechaDePrueba;
		LocalDate fechaActual = LocalDate.now();
		
		try {
			fechaDePrueba = LocalDate.of(anio, mes, dia);
		}
		catch(Exception e){
			return false;
		}
		
		if(fechaDePrueba.isAfter(fechaActual)){
			return false;
		}
		return true;
	}

}
