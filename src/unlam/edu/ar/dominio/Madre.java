package unlam.edu.ar.dominio;

import java.util.ArrayList;

public class Madre {
	
	private String nombre;
	private String apellido;
	private Integer dni;
	private ArrayList<Bebe> hijos = new ArrayList<>();
	
	public Madre(String nombre, String apellido, Integer dni) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.hijos = new ArrayList<Bebe>();
	}
}


