package Envios_Strategy;

public interface ShippingStrategy {
    double calcularCosto(double peso, double dimension, String origen, String destino);
}
