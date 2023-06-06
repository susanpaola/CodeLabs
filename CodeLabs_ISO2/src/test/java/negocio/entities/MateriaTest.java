package negocio.entities;

import org.junit.Assert;
import org.junit.Test;

public class MateriaTest {
    
    @Test
    public void testMateria() {
        // Creamos objetos necesarios para el caso de prueba
        Profesor responsable = new Profesor("Juan Perez", null, null, false);
        String nombre = "Matemáticas";
        double horas = 4.5;
        String fechaInicio = "2023-01-01";
        String fechaFin = "2023-06-30";
        int curso = 1;
        
        // Creamos objeto de la clase a probar
        Materia materia = new Materia(responsable, nombre, horas, fechaInicio, fechaFin, curso);
        
        // Verificar los resultados esperados
        Assert.assertEquals(responsable, materia.getResponsable());
        Assert.assertEquals(nombre, materia.getNombre());
        Assert.assertEquals(horas, materia.getHoras(), 0.001);
        Assert.assertEquals(fechaInicio, materia.getFechaInicio());
        Assert.assertEquals(fechaFin, materia.getFechaFin());
        Assert.assertEquals(curso, materia.getCurso());
    }
    
    @Test(expected = NullPointerException.class)
    public void testMateriaConError() {
        // Crear objeto de la clase a probar sin inicializar el responsable (causará una excepción NullPointerException)
        Materia materia = new Materia(null, "Física", 3.5, "2023-02-01", "2023-05-31", 2);
        // El caso de prueba lanzará una excepción y se considera exitoso
    }
    
}