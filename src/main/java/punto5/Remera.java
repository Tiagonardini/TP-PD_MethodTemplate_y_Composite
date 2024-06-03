package punto5;

public abstract class Remera {
    protected String color;
    protected String talle;
    protected double precioUnitario;

    public Remera (String color, String talle, double precio){
        this.color = color;
        this.precioUnitario = precio;
        this.talle = talle;
    }

    public double calcularPrecio(){
        return precioUnitario + calcularImpuesto(precioUnitario) + calcularRecargo(precioUnitario) + calcularGanancia(precioUnitario)- calcularBonificacion(precioUnitario);

    }

    abstract double calcularRecargo(double precioUnitario);
    abstract double calcularImpuesto(double precioUnitario);
    abstract double calcularBonificacion(double precioUnitario);
    abstract double calcularGanancia(double precioUnitario);
}
