package punto5;

import javax.naming.PartialResultException;
import java.lang.reflect.GenericArrayType;

public class RemeraImportada extends Remera{

    private static double RECARGO = 0.03;
    private static double IMPUESTO = 0.05;
    private static double BONIFICACION = 0.0;
    private static double GANANCIA = 0.25;

    public RemeraImportada(String color, String talle, double precio) {
        super(color, talle, precio);
    }

    @Override
    double calcularRecargo(double precioUnitario) {
        return precioUnitario * RECARGO;
    }
    @Override
    double calcularImpuesto(double precioUnitario) {
        return precioUnitario * IMPUESTO;
    }

    @Override
    double calcularBonificacion(double precioUnitario) {
        return precioUnitario * BONIFICACION;
    }

    double calcularGanancia(double precioUnitario) {
        return precioUnitario * GANANCIA;
    }

}
