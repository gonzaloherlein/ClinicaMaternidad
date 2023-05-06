package unlam.edu.ar.test;

import static org.junit.Assert.*;

import org.junit.Test;

import unlam.edu.ar.dominio.Clinica;
import unlam.edu.ar.dominio.Medico;
import unlam.edu.ar.dominio.Parteras;

public class TestMaternidad {

	@Test
	public void queSePuedaCrearUnaClinica() {
		Clinica clinica = new Clinica();
		assertNotNull(clinica);
	}

	@Test
	public void queSePuedaCrearUnMedico() {
		Medico medico = new Medico();
		assertNotNull(medico);
	}
	
	@Test
	public void queSePuedaCrearUnPartera() {
		Parteras partera = new Parteras();
		assertNotNull(partera);
	}
}
