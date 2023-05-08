package unlam.edu.ar.test;

import static org.junit.Assert.*;

import java.time.LocalDate;

import org.junit.Test;

import unlam.edu.ar.dominio.Bebe;
import unlam.edu.ar.dominio.Clinica;
import unlam.edu.ar.dominio.Medico;
import unlam.edu.ar.dominio.Obstetra;
import unlam.edu.ar.dominio.Partera;


public class TestMaternidad {

	@Test
	public void queSePuedaCrearUnaClinica() {
		Clinica clinica = new Clinica(null);
		assertNotNull(clinica);
	}
	
	@Test
	public void queSePuedaCrearUnaObstetra() {
		Obstetra obstre = new Obstetra();
		assertNotNull(obstre);
	}
	
	@Test
	public void queSePuedeCrearUnBebe() {
		Bebe Nuevo = new Bebe();
		assertNotNull(Nuevo);
	}
	
	@Test
	public void queSeCreeUnBebeYTodosLosDatosEstenBien(){
		int añoDeNacimiento = 2000;
		int mesDeNacimiento = 3;
		int diaDeNacimiento = 24;
		String Nombre = "Juan";
		String Apellido = "Gutierrez";
		Integer Dni = 50783451;
		Bebe Nuevo = new Bebe(añoDeNacimiento, mesDeNacimiento, diaDeNacimiento, Nombre, Apellido, Dni);
		
		assertEquals(añoDeNacimiento, Nuevo.getFechaDeNacimiento().getYear());
		assertEquals(mesDeNacimiento, Nuevo.getFechaDeNacimiento().getMonthValue());
		assertEquals(diaDeNacimiento, Nuevo.getFechaDeNacimiento().getDayOfMonth());
		assertEquals(Nombre, Nuevo.getNombre());
		assertEquals(Apellido, Nuevo.getApellido());
		assertEquals(Dni, Nuevo.getDni());
		
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void queNoSePuedaCrearUnBebeConUnDniIncorrecto(){
		int añoDeNacimiento = 2000;
		int mesDeNacimiento = 3;
		int diaDeNacimiento = 24;
		String Nombre = "Juan";
		String Apellido = "Gutierrez";
		Integer Dni = 50;
		Bebe Nuevo = new Bebe(añoDeNacimiento, mesDeNacimiento, diaDeNacimiento, Nombre, Apellido, Dni);
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void queNoSePuedaCrearUnBebeConUnaFechaDeNacimientoInvalida(){
		int añoDeNacimiento = 2000;
		int mesDeNacimiento = 20;
		int diaDeNacimiento = 24;
		String Nombre = "Juan";
		String Apellido = "Gutierrez";
		Integer Dni = 50783451;
		Bebe Nuevo = new Bebe(añoDeNacimiento, mesDeNacimiento, diaDeNacimiento, Nombre, Apellido, Dni);
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void queNoSePuedaCrearUnBebeConUnaFechaDeNacimientoFutura(){
		int añoDeNacimiento = 2030;
		int mesDeNacimiento = 3;
		int diaDeNacimiento = 24;
		String Nombre = "Juan";
		String Apellido = "Gutierrez";
		Integer Dni = 50783451;
		Bebe Nuevo = new Bebe(añoDeNacimiento, mesDeNacimiento, diaDeNacimiento, Nombre, Apellido, Dni);
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void queNoSePuedaCrearUnaParteraUObstetraConUnDniIncorrecto(){
		String nombrePartera = "Eduarda";
		Integer edadPartera = 23;
		String telefonoPartera = "1134236477";
		Medico Partera = new Partera(nombrePartera, edadPartera, 123,telefonoPartera );
	}

	@Test
	public void queSePuedaCrearUnaParteraConUnNumeroDeTelefono() {
		String nombrePartera = "Eduarda";
		Integer edadPartera = 23;
		String telefonoPartera = "1134236477";
		Integer dni = 43861369;
		Medico partera = new Partera(nombrePartera, edadPartera, dni,telefonoPartera );
		
		
		assertTrue(((Partera) partera).validarTelefono(telefonoPartera));
	}

	@Test
	public void queSePuedaSaberSiElObstetraTrabajaFinDeSemana() {
		String nombreObstetra = "Eduardo";
		Integer edadPartera = 23;
		Integer dni = 43861369;
		Integer horasTrabajadas = 20;
		Medico obstetra = new Obstetra(nombreObstetra, edadPartera, dni,horasTrabajadas);
		
		assertTrue(((Obstetra) obstetra).validarTrabajoFinDeSemana());
	}
	
	@Test
	public void queSePuedaValidarUnaParteraConUnDNIValido() {
		String nombrePartera = "Eduarda";
		Integer edadPartera = 23;
		String telefonoPartera = "1134236477";
		Integer dni = 43861369;
		Medico partera = new Partera(nombrePartera, edadPartera, dni,telefonoPartera);
		
		assertTrue(partera.validarDni(dni));
		assertNotNull(partera);
	}
	
	@Test
	public void queSePuedaAgregarUnaParteraConUnDNIValidoYConUnTelefonoValido() {
		String nombrePartera = "Eduarda";
		Integer edadPartera = 23;
		String telefonoPartera = "1134236477";
		Integer dni = 43861369;
		String nombreClinica = "Hospital Italiano";
		
		Clinica clinica = new Clinica(nombreClinica);
		Medico partera = new Partera(nombrePartera, edadPartera, dni,telefonoPartera);
		
		
		assertTrue(((Partera) partera).validarTelefono(telefonoPartera));
		assertTrue(partera.validarDni(dni));
		clinica.agregarMedicos(partera);
		
		assertEquals(clinica.getListaDeMedicos().size(),  1);
		
	}
	
	@Test
	public void queSePuedaAgregarUnaObstetraQueSoloTrabajeLosFinDeSemana() {
		String nombreObstetra = "Eduardo";
		Integer edadObstetra = 23;
		Integer dni = 43861369;
		String nombreClinica = "Hospital Italiano";
		
		Medico obstetra = new Obstetra(nombreObstetra,edadObstetra,dni ,20);
		Clinica clinica = new Clinica(nombreClinica);

		
		
		assertTrue(((Obstetra) obstetra).validarTrabajoFinDeSemana());
		assertTrue(obstetra.validarDni(dni));
		clinica.agregarMedicos(obstetra);
		
		assertEquals(clinica.getListaDeMedicos().size(),  1);
		
	}
	
	@Test
	public void queNoSePuedaAgregarUnaObstetraRepetido() {
		String nombreObstetra = "Eduardo";
		String nombreObstetra2 = "Juan";
		Integer edadObstetra = 23;
		Integer dni = 43861369;
		String nombreClinica = "Hospital Italiano";
		
		Medico obstetra = new Obstetra(nombreObstetra,edadObstetra,dni ,20);
		Medico obstetra2 = new Obstetra(nombreObstetra2,edadObstetra,dni ,20);
		Clinica clinica = new Clinica(nombreClinica);

		
		clinica.agregarMedicos(obstetra);
		clinica.agregarMedicos(obstetra2);
		
		assertEquals(clinica.getListaDeMedicos().size(),  1);
		
	}
	
	@Test
	public void queSeValideLaJubilacionDelObstetra() {
		String nombreObstetra = "Miguel";
		Integer edadObstetra = 60;
		Integer dni = 43861369;
		Medico obstetra = new Obstetra(nombreObstetra,edadObstetra,dni ,20);
		
		assertTrue(obstetra.validarJubilacion());
	}
	
	@Test
	public void queSeValideLaJubilacionDeLaPartera() {
		String nombrePartera = "Eduarda";
		Integer edadPartera = 50;
		String telefonoPartera = "1134236477";
		Integer dni = 43861369;
		String nombreClinica = "Hospital Italiano";
		
		Medico partera = new Partera(nombrePartera, edadPartera, dni,telefonoPartera);
		
		assertTrue(partera.validarJubilacion());
	}
	
	


}
