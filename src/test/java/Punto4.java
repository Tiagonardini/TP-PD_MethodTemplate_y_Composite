import org.junit.Test;
import punto4.Calculador;
import punto4.CalculadorJubilado;
import punto4.CalculadorNoJubilado;

import static org.junit.Assert.assertEquals;

public class Punto4 {

    @Test
    public void calculadorJubuladoSinPromocion(){
        Calculador calculadorJubilado = new CalculadorJubilado(5);

        assertEquals(1100, calculadorJubilado.calcularPrecio(1000.0), 0.001 );
    }
    @Test
    public void calculadorJubuladoConPromocion(){
        Calculador calculadorJubilado = new CalculadorJubilado(6);

        assertEquals(1000, calculadorJubilado.calcularPrecio(1000.0), 0.001 );
    }
    @Test
    public void calculadorNoJubuladoConPromocion(){
        Calculador calculadorJubilado = new CalculadorNoJubilado(6);

        assertEquals(1150, calculadorJubilado.calcularPrecio(1000.0), 0.001 );
    }
     @Test
    public void calculadorNoJubuladoSinPromocion(){
        Calculador calculadorJubilado = new CalculadorNoJubilado(5);

        assertEquals(1210, calculadorJubilado.calcularPrecio(1000.0), 0.001 );
    }


}
