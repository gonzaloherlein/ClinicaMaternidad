package unlam.edu.ar.dominio;

import java.util.HashSet;

public class Clinica {

	private String nombre;
	private HashSet<Medico> listaDeMedicos = new HashSet<Medico>();

	public Clinica() {

	}

	public Clinica(String nombre) {
		this.nombre = nombre;
		this.listaDeMedicos = new HashSet<Medico>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public HashSet<Medico> getListaDeMedicos() {
		return listaDeMedicos;
	}

	public void setListaDeMedicos(HashSet<Medico> listaDeMedicos) {
		this.listaDeMedicos = listaDeMedicos;
	}

	public void agregarMedicos(Medico medico) {
		this.listaDeMedicos.add(medico);
	}
}
