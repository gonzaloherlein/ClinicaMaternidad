package unlam.edu.ar.test;

import static org.junit.Assert.*;

import org.junit.Test;

import unlam.edu.ar.dominio.Clinica;
import unlam.edu.ar.dominio.Obstetra;

public class TestMaternidad {

	@Test
	public void queSePuedaCrearUnaClinica() {
		Clinica clinica = new Clinica();
		assertNotNull(clinica);
	}
	
	@Test
	public void queSePuedCrearUnaObstetra() {
		Obstetra obstre = new Obstetra();
		assertNotNull(obstre);
	}

}
