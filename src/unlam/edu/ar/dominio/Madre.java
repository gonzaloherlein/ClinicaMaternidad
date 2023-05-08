package unlam.edu.ar.dominio;

import java.util.ArrayList;

public class Madre {
	
	private String nombre;
	private String apellido;
	private Integer dni;
	private ArrayList<Bebe> hijos = new ArrayList<>();
	private boolean tieneLeche;
	
	public Madre(String nombre, String apellido, Integer dni) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.hijos = new ArrayList<Bebe>();
		this.tieneLeche=false;
	}
	
	
	
	public boolean isTieneLeche() {
		return tieneLeche;
	}



	public void setTieneLeche(boolean tieneLeche) {
		this.tieneLeche = tieneLeche;
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



	public ArrayList<Bebe> getHijos() {
		return hijos;
	}



	public void setHijos(ArrayList<Bebe> hijos) {
		this.hijos = hijos;
	}



	public void parir(Bebe hijo) {
		hijos.add(hijo);
	}
	
	
}


