package unlam.edu.ar.dominio;

public class Bebe {

	private int mesDeNacimiento;
	
	public Bebe() {
		
	}
	
	public Bebe(int mesDeNacimiento) {
		this.mesDeNacimiento=mesDeNacimiento;
	}
	
	public boolean tomarLecheMaterna(Madre madre) {
		boolean sePuedeTomar=false;
		if(madre.isTieneLeche()) {
			sePuedeTomar=true;
		}
		return sePuedeTomar;
	}
	
	
}
