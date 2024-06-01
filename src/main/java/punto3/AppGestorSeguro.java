package punto3;

import java.util.ArrayList;
import java.util.List;

public class AppGestorSeguro {

    private List<ISeguro> paqueteDeSeguro;

    public AppGestorSeguro(){
        this.paqueteDeSeguro = new ArrayList<>();
    }

    public void agregarPaqueteDeSeguro(ISeguro paqueteSeguro){
        this.paqueteDeSeguro.add(paqueteSeguro);
    }

    public double calcularCostoDePaquete (){
        var total = 0;
        for (ISeguro paquete: paqueteDeSeguro){
            total += paquete.calcularCosto();
        }
        return total;
    }

}