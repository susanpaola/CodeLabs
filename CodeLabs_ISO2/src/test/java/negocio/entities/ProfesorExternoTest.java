package negocio.entities;

import org.junit.Assert;
import org.junit.Test;

public class ProfesorExternoTest {

    @Test
    public void testGetTitulacion() {
      
        ProfesorExterno profesorExterno = new ProfesorExterno("123456789", "Juan", "Pérez", true, "Universidad");
        String titulacion = profesorExterno.getTitulacion();
        Assert.assertEquals("Universidad", titulacion);
    }

    @Test
    public void testSetTitulacion() {
        
        ProfesorExterno profesorExterno = new ProfesorExterno("987654321", "María", "López", false, "");
        profesorExterno.setTitulacion("M.Sc");
        Assert.assertEquals("M.Sc", profesorExterno.getTitulacion());
    }
    
    
    //CP Conjeura de error
    @Test(expected = NullPointerException.class)
    public void testConjeturaError() {
   
        ProfesorExterno profesorExterno = new ProfesorExterno("123456789", "Juan", "Pérez", true, null);
        String titulacion = profesorExterno.getTitulacion();

        
    }
}
