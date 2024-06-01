
import org.junit.Test;
import punto1.*;

import static org.junit.Assert.assertEquals;

public class Punto1 {
    @Test
    public void calcularMontoDeEmpleadosDeUnaEmpresaUnoPorCadaRegion() {
        Empresa empresa = new Empresa("Laser X");

        EmpleadoDeLaEmpresa director = new Director("Tiago", "Nardini", 2000.0);
        EmpleadoDeLaEmpresa gerente = new Gerente("Agusto", "Cesar", 1000.0);
        EmpleadoDeLaEmpresa mandoMedio = new MandoMedio("Perito", "Moreno", 500.0);
        EmpleadoDeLaEmpresa liderProyecto = new LiderDeProyecto("Juana", "Azurduy", 250.0);
        EmpleadoDeLaEmpresa empleadoRegular = new EmpleadoRegular("Norbit", "Briasco", 125.0);

        empresa.agregarEmpleado(director);
        empresa.agregarEmpleado(gerente);
        empresa.agregarEmpleado(mandoMedio);
        empresa.agregarEmpleado(liderProyecto);
        empresa.agregarEmpleado(empleadoRegular);

        director.aCargoDe(gerente);
        gerente.aCargoDe(mandoMedio);
        mandoMedio.aCargoDe(liderProyecto);
        liderProyecto.aCargoDe(empleadoRegular);

        assertEquals(3875.0, empresa.totalDeSueldosDeLaEmpresa(), 0.001);

    }
    @Test
    public void calcularMontoDeEmpleadosDeUnaEmpresaDosPorCadaRegion(){
        Empresa empresa = new Empresa("Laser X");

        EmpleadoDeLaEmpresa director = new Director("Tiago", "Nardini", 2000.0);
        EmpleadoDeLaEmpresa gerente = new Gerente("Agusto", "Cesar", 1500.0);
        EmpleadoDeLaEmpresa gerente2 = new Gerente("Juan", "Peron", 1000.0);
        EmpleadoDeLaEmpresa mandoMedio = new MandoMedio("Perito", "Moreno", 500.0);
        EmpleadoDeLaEmpresa mandoMedio2 = new MandoMedio("Lorenzo", "Elbert", 500.0);
        EmpleadoDeLaEmpresa liderProyecto = new LiderDeProyecto("Juana", "Azurduy", 250.0);
        EmpleadoDeLaEmpresa liderProyecto2 = new LiderDeProyecto("Martha", "Azurduy", 250.0);
        EmpleadoDeLaEmpresa empleadoRegular = new EmpleadoRegular("Edinson", "Cavani", 125.0);
        EmpleadoDeLaEmpresa empleadoRegular2 = new EmpleadoRegular("Norbit", "Briasco", 125.0);

        empresa.agregarEmpleado(director);
        empresa.agregarEmpleado(gerente);
        empresa.agregarEmpleado(gerente2);
        empresa.agregarEmpleado(mandoMedio);
        empresa.agregarEmpleado(mandoMedio2);
        empresa.agregarEmpleado(liderProyecto);
        empresa.agregarEmpleado(liderProyecto2);
        empresa.agregarEmpleado(empleadoRegular);
        empresa.agregarEmpleado(empleadoRegular2);

        director.aCargoDe(gerente);
        director.aCargoDe(gerente2);
        gerente.aCargoDe(mandoMedio);
        gerente2.aCargoDe(mandoMedio2);
        mandoMedio.aCargoDe(liderProyecto);
        mandoMedio2.aCargoDe(liderProyecto2);
        liderProyecto.aCargoDe(empleadoRegular);
        liderProyecto2.aCargoDe(empleadoRegular2);

        assertEquals(6250.0, empresa.totalDeSueldosDeLaEmpresa(), 0.001);

    }
}