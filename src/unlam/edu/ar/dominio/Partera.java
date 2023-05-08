package unlam.edu.ar.dominio;

public class Partera extends Medico{
	private String telefono;
	
	public Partera() {
		
	}
	
	public Partera(String nombre, Integer edad,Integer dni,String telefono) {
		super(nombre, edad,dni);
		this.telefono = telefono;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public Boolean validarTelefono(String telefono) {
		if(this.telefono.length() == 10) {
			setTelefono(telefono);
			return true;
			
		}
		return false;
	}

	public Boolean validarJubilacion() {
		if(super.getEdad() >= 50) {
			return true;
		}
		return false;
	}
}
