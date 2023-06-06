package negocio.entities;

import org.junit.Assert;
import org.junit.Test;

public class ProfesorExternoTest {

    @Test
    public void testGetTitulacion() {
      
        ProfesorExterno profesorExterno = new ProfesorExterno("12345678R", "Juan", "Pérez", true, "Ingeniero informatico");
        String titulacion = profesorExterno.getTitulacion();
        Assert.assertEquals("Ingeniero informatico", titulacion);
    }

    @Test
    public void testSetTitulacion() {
        
        ProfesorExterno profesorExterno = new ProfesorExterno("98765432S", "María", "López", false, "");
        profesorExterno.setTitulacion("Programador");
        Assert.assertEquals("Programador", profesorExterno.getTitulacion());
    }
    
    
    //CP Conjeura de error
    @Test(expected = NullPointerException.class)
    public void testConjeturaError() {
   
        ProfesorExterno profesorExterno = new ProfesorExterno("12345678R", "Juan", "Pérez", true, null);
        String titulacion = profesorExterno.getTitulacion();

        
    }
}
