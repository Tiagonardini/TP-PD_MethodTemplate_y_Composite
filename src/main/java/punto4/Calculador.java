package punto4;

import static java.time.LocalDate.now;

public abstract class Calculador {
    private LogTransaction log;
    protected int mesEnPromocion;

    public Calculador (int mesEnPromocion){
        this.mesEnPromocion = mesEnPromocion;
        this.log = new LogTransaction();
    }

    public double calcularPrecio(double precioProducto){
        double precioTotal = calcularPromocion(precioProducto);
        log.log(CalculadorJubilado.class.getName());
        return precioTotal;
    }

    abstract double calcularPromocion(double precioProducto);


}
