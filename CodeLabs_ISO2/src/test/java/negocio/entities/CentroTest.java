package negocio.entities;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;

public class CentroTest {

	Centro centro;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}
	
	@Test
	public void testGettersAndSetters() {
		Centro centro = new Centro("Facultad de ciencias sociales", "Talavera de la Reina", 123);

		// Verificar los getters
		Assert.assertEquals("Facultad de ciencias sociales", centro.getNombre());
		Assert.assertEquals("Talavera de la Reina", centro.getLocalizacion());
		Assert.assertEquals(123, centro.getAttribute());

		// Verificar los setters
		centro.setNombre("UCLM");
		centro.setLocalizacion("Toledo");
		centro.setAttribute(456);

		Assert.assertEquals("UCLM", centro.getNombre());
		Assert.assertEquals("Toledo", centro.getLocalizacion());
		Assert.assertEquals(456, centro.getAttribute());
	}
 
	@Test
	public void testPlantilla() {
		Centro centro = new Centro("Facultad de ciencias sociales", "Talavera de la Reina", 123);
		ProfesorUCLM profesor1 = new ProfesorUCLM("25895175N", "Sergio", "Onís Gómez", false, centro, CategoriaProfesor.AYUDANTE_DOCTOR, null, null, null);
		//String dni, String nombre, String apellidos, boolean doctor, Centro centroAdscripcion, CategoriaProfesor categoria, String apellidos2, String nombre2, String dni
		ProfesorUCLM profesor2 = new ProfesorUCLM("74138526P", "Mario", "Vargas de la Cruz", false, centro, CategoriaProfesor.ASOCIADO, null, null, null);

		centro.setPlantilla(Arrays.asList(profesor1, profesor2));

		Assert.assertEquals(2, centro.getPlantilla().size());
		Assert.assertTrue(centro.getPlantilla().contains(profesor1));
		Assert.assertTrue(centro.getPlantilla().contains(profesor2));
	}

}




