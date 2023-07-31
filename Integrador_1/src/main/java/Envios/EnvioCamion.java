package Envios;

public class EnvioCamion implements MetodoEnvio{
    private String nombre ="Camion";
    private Double Costoenvio;

    public EnvioCamion(Double costoenvio)
    {
        Costoenvio = costoenvio;
    }
    public double calcularcostoenvio(String precio) {
        double precioproducto = Double.parseDouble(precio);
        return precioproducto * 0.20;
    }
}
