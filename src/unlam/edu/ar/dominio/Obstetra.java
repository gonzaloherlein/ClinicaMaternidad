package unlam.edu.ar.dominio;

public class Obstetra extends Medico{
	private Boolean trabajaFinDeSemana;
	private Integer horasTrabajadas;
	
	public Obstetra() {
		
	}
	
	public Obstetra(String nombre, Integer edad,Integer dni, Integer horasTrabajadas) {
		super(nombre, edad, dni);
		this.trabajaFinDeSemana = true;
		this.horasTrabajadas = horasTrabajadas;
	}

	public Boolean getTrabajaFinDeSemana() {
		return trabajaFinDeSemana;
	}

	public void setTrabajaFinDeSemana(Boolean trabajaFinDeSemana) {
		this.trabajaFinDeSemana = trabajaFinDeSemana;
	}

	public Integer getHorasTrabajadas() {
		return horasTrabajadas;
	}

	public void setHorasTrabajadas(Integer horasTrabajadas) {
		this.horasTrabajadas = horasTrabajadas;
	}
	
	
	public Boolean validarTrabajoFinDeSemana() {
		Boolean trabaja = false;
		if(this.horasTrabajadas <= 20) {
			trabaja = true;
			setTrabajaFinDeSemana(trabaja);
			return trabaja;
		}
		return trabaja;
	}

	@Override
	public Boolean validarJubilacion() {
		if(super.getEdad() >= 60) {
			return true;
		}
		return false;
	}
	
}
