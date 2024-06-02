package punto4;
import static java.time.LocalDate.now;
import static java.time.Month.of;
public class CalculadorJubilado extends Calculador {


    public CalculadorJubilado(int mesEnPromocion) {
        super(mesEnPromocion);
    }

    @Override
    double calcularPromocion(double precioProducto) {
        double precioTotal = precioProducto;
        if (!of(mesEnPromocion).equals(now().getMonth())) {
            precioTotal += (precioProducto * 0.1);
        }
        return precioTotal;
    }
}