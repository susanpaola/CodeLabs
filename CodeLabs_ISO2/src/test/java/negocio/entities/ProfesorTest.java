package negocio.entities;

import org.junit.Assert;
import org.junit.Test;

public class ProfesorTest {
    
    @Test
    public void testConstructorAndGetters() {
        
        String dni = "12345678F";
        String nombre = "Peter";
        String apellidos = "Dash";
        boolean doctor = true;
        Profesor profesor = new Profesor(dni, nombre, apellidos, doctor);
       
        Assert.assertEquals(dni, profesor.getDni());
        Assert.assertEquals(nombre, profesor.getNombre());
        Assert.assertEquals(apellidos, profesor.getApellidos());
        Assert.assertEquals(doctor, profesor.isDoctor());
    }
    
    @Test(expected = AssertionError.class)
    public void testInvalidDni() {
        
        String dni = null;
        String nombre = "Peter";
        String apellidos = "Dash";
        boolean doctor = true;
		Profesor profesor = new Profesor(dni, nombre, apellidos, doctor);
    }
    
    @Test
    public void testSetters() {
        
        Profesor profesor = new Profesor("12345678F", "Peter", "Dash", true);
        profesor.setDni("98765432V");
        profesor.setNombre("Jane");
        profesor.setApellidos("Doe");
        profesor.setDoctor(false);
        
        Assert.assertEquals("98765432V", profesor.getDni());
        Assert.assertEquals("Jane", profesor.getNombre());
        Assert.assertEquals("Doe", profesor.getApellidos());
        Assert.assertFalse(profesor.isDoctor());
    }
}


