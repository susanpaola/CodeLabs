package negocio.controllers;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner_GestorPropuestasCursosTest {

    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(GestorPropuestasCursosTest.class);

        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }

        if (result.wasSuccessful()) { 
            System.out.println("Total de pruebas ejecutadas: " + result.getRunCount());
            System.out.println("Total de pruebas fallidas: " + result.getFailureCount());
            System.out.println("¿Todas las pruebas pasaron? " + result.wasSuccessful());
        }
    }
}