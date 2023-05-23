package negocio.entities;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Assert;
import org.junit.Test;

public class MatriculaTest {

    @Test
    public void constructorTest() {
        Matricula matricula = new Matricula(1, "2023-05-18", true, 10, ModoPago.TARJETA_CREDITO, 1, "12345");
        Assert.assertEquals(1, matricula.getIdMatricula());
        Assert.assertEquals("2023-05-18", matricula.getFecha());
        Assert.assertTrue(matricula.isPagado());
        Assert.assertEquals(10, matricula.getAttributo());
        Assert.assertEquals(ModoPago.TARJETA_CREDITO, matricula.getTipoPago());
        Assert.assertEquals(1, matricula.getIdTitulo());
        Assert.assertEquals("12345", matricula.getIdEstudiante());
    }

    @Test
    public void SetterAndGettersTest() {
        Matricula matricula = new Matricula();

        matricula.setIdMatricula(2);
        Assert.assertEquals(2, matricula.getIdMatricula());

        matricula.setFecha("2023-05-19");
        Assert.assertEquals("2023-05-19", matricula.getFecha());

        matricula.setPagado(false);
        Assert.assertFalse(matricula.isPagado());

        matricula.setAttributo(20);
        Assert.assertEquals(20, matricula.getAttributo());

        matricula.setTipoPago(ModoPago.TRANSFERENCIA);
        Assert.assertEquals(ModoPago.TRANSFERENCIA, matricula.getTipoPago());

        matricula.setIdTitulo(2);
        Assert.assertEquals(2, matricula.getIdTitulo());

        matricula.setIdEstudiante("54321");
        Assert.assertEquals("54321", matricula.getIdEstudiante());
    }
}