package Envios;

public class EnvioCamion implements MetodoEnvio{
    public double calcularcostoenvio(String precio) {
        double precioproducto = Double.parseDouble(precio);
        return precioproducto * 0.20;
    }
}
