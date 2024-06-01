package punto2;

public class TareaX implements Item {
    private String descripcion;
    private double tiempo;

    public TareaX(String descripcion, double tiempo){
        this.descripcion = descripcion;
        this.tiempo = tiempo;
    }

    @Override
    public double calcularTiempo() {
        return tiempo;
    }
}