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
<<<<<<< HEAD
		Clinica clinica = new Clinica("das");
=======
		Clinica clinica = new Clinica(null);
>>>>>>> fcc96d795536ab9673a660468443eb81fd8c9fdb
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
	
	@Test
	public void queSePuedaCrearUnaPartera1235() {
		Parteras partera1235 = new Parteras();
		assertNotNull(partera1235);
	}
	
	@Test
	public void queSePuedaCrearUnaPartera123567() {
		Parteras partera123567 = new Parteras();
		assertNotNull(partera123567);
	}
}
