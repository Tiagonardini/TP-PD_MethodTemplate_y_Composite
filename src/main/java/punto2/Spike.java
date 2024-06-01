package punto2;

public class Spike implements Item {

    private String descripcion;
    private double tiempo;

    public Spike(String descripcion, double tiempo){
        this.descripcion = descripcion;
        this.tiempo = tiempo;
    }

    @Override
    public double calcularTiempo() {
        return tiempo;
    }
}