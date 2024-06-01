package punto3;

public class Seguro implements ISeguro{
    private String tipoDeSeguro;
    private double valorSeguro;

    public Seguro (String tipoSeguro, double valorSeguro){
        this.tipoDeSeguro = tipoSeguro;
        this.valorSeguro = valorSeguro;
    }

    @Override
    public double calcularCosto() {
        return valorSeguro;
    }

}