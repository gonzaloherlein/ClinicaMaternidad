package unlam.edu.ar.test;

import static org.junit.Assert.*;

import org.junit.Test;

import unlam.edu.ar.dominio.Clinica;
import unlam.edu.ar.dominio.Medico;

public class TestMaternidad {

	@Test
	public void queSePuedaCrearUnaClinica() {
		Clinica clinica = new Clinica(null);
		assertNotNull(clinica);
	}

	@Test
	public void queSePuedaCrearUnMedico() {
		Medico medico = new Medico();
		assertNotNull(medico);
	}
	
	@Test
	public void queSePuedaCrearUnBebeConDniYPartidaDeNacimiento() {
		Bebe bebe = new bebe(null);
	}
}
