package negocio.entities;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Assert;
import org.junit.Test;

public class ProfesorUCLMTest {

	@Test
	public void testProfesorUCLM() {
		
		ProfesorUCLM profesor = new ProfesorUCLM("12223348A", "Pepe", "Cano", true, null, CategoriaProfesor.CATEDRATICO, null, null, null);
		profesor.setDni("12223348A");
		profesor.setNombre("Pepe");
		profesor.setApellidos("Cano");
	
		
		Assert.assertEquals("12223348A", profesor.getDni());
		Assert.assertEquals("Pepe", profesor.getNombre());
		Assert.assertEquals("Cano", profesor.getApellidos());
		Assert.assertEquals(true, profesor.isDoctor());
		Assert.assertEquals(null, profesor.getCentroAdscripcion());
		
	}


}
