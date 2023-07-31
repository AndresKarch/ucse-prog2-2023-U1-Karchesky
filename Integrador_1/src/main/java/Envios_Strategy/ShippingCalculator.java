package Envios_Strategy;

public class ShippingCalculator {
    private double peso;
    private double dimension;
    private String origen;
    private String destino;
    private ShippingStrategy shippingStrategy;

    public ShippingCalculator(double peso, double dimension, String origen, String destino, ShippingStrategy shippingStrategy) {
        this.peso = peso;
        this.dimension = dimension;
        this.origen = origen;
        this.destino = destino;
        this.shippingStrategy = shippingStrategy;
    }

    public double CalcularCosto() {
        return shippingStrategy.calcularCosto(peso, dimension, origen, destino);
    }
}
