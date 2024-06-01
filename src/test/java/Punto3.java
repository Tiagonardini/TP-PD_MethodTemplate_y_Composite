import punto3.*;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Punto3 {
    @Test
    public void calcularCostoDeSeguro(){
        var app = new AppGestorSeguro();
        var paquete = new Paquete("Moto");
        var seguro = new Seguro("Contra robo", 2000);
        var seguro1 = new Seguro("Contra incendio", 1000);
        var seguro2 = new Seguro("Contra todo riesgo", 5000);

        paquete.agregarSeguro(seguro);
        paquete.agregarSeguro(seguro1);
        paquete.agregarSeguro(seguro2);


        app.agregarPaqueteDeSeguro(paquete);

        assertEquals(7600, paquete.calcularCosto(), 0.001);

    }
    @Test
    public void calcularCostoDePaqueteDeSeguro(){
        var app = new AppGestorSeguro();

        var paquete = new Paquete("Moto");
        var paquete1 = new Paquete("Auto");

        var seguro = new Seguro("Contra robo", 2000);
        var seguro1 = new Seguro("Contra incendio", 1000);
        var seguro2 = new Seguro("Contra todo riesgo", 5000);

        paquete.agregarSeguro(seguro);
        paquete.agregarSeguro(seguro1);
        paquete.agregarSeguro(seguro2);

        paquete1.agregarSeguro(seguro);
        paquete1.agregarSeguro(seguro1);
        paquete1.agregarSeguro(seguro2);

        app.agregarPaqueteDeSeguro(paquete);
        app.agregarPaqueteDeSeguro(paquete1);

        assertEquals(15200, app.calcularCostoDePaquete(),0.001);

        app.agregarPaqueteDeSeguro(paquete);
    }

}