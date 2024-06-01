package punto3;
import java.util.ArrayList;
import java.util.List;

public class Paquete implements ISeguro {

    private String nombre;
    private List<ISeguro> segurosIncluido;
    private static final double DESCUENTO = 0.95;

    public Paquete (String nombre){
        this.nombre = nombre;
        this.segurosIncluido = new ArrayList<>();
    }

    public void agregarSeguro (ISeguro seguro){
        this.segurosIncluido.add(seguro);
    }

    @Override
    public double calcularCosto() {
        var costoTotal = 0;
        for (ISeguro seguro: segurosIncluido){
            costoTotal += (seguro.calcularCosto() * DESCUENTO);
        }
        return costoTotal;
    }
}