package punto5;

public class RemeraNacional extends Remera{
    private static double RECARGO = 0.015;
    private static double IMPUESTO = 0.00;
    private static double BONIFICACION = 0.20;
    private static double GANANCIA = 0.15;


    public RemeraNacional(String color, String talle, double precio) {
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
    @Override
    double calcularGanancia(double precioUnitario) {
        return precioUnitario * GANANCIA;
    }

}
