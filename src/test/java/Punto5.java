import org.junit.Test;
import punto5.Remera;
import punto5.RemeraImportada;
import punto5.RemeraNacional;

import static org.junit.Assert.assertEquals;

public class Punto5 {
    @Test
    public void remeraImportada(){
        Remera remeraRoja = new RemeraImportada("Rojo","XL", 1000.00);

        assertEquals(1330.00, remeraRoja.calcularPrecio(), 0.001);
    }
    @Test
    public void remeraNacional(){
        Remera remeraRoja = new RemeraNacional("Rojo","XL", 1000.00);

        assertEquals(965.0, remeraRoja.calcularPrecio(), 0.001);
    }
}
