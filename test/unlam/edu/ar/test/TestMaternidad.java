package unlam.edu.ar.test;

import static org.junit.Assert.*;

import org.junit.Test;

import unlam.edu.ar.dominio.Clinica;
import unlam.edu.ar.dominio.Medico;
import unlam.edu.ar.dominio.Parteras;
import unlam.edu.ar.dominio.Obstetra;


public class TestMaternidad {

	@Test
	public void queSePuedaCrearUnaClinica() {
		Clinica clinica = new Clinica(null);
		assertNotNull(clinica);
	}
	
	@Test
	public void queSePuedCrearUnaObstetra() {
		Obstetra obstre = new Obstetra();
		assertNotNull(obstre);
	}

	@Test
	public void queSePuedaCrearUnMedico() {
		Medico medico = new Medico();
		assertNotNull(medico);
	}
	
	@Test
	public void queSePuedaCrearUnaPartera() {
		Parteras partera = new Parteras();
		assertNotNull(partera);
	}
	
	@Test
	public void queSePuedaCrearUnaPartera123() {
		Parteras partera123 = new Parteras();
		assertNotNull(partera123);
	}
}
