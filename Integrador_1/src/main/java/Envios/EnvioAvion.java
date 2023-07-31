package Envios;

public class EnvioAvion implements MetodoEnvio {
    private String nombre ="Avion";
    private Double Costoenvio;

    public EnvioAvion(Double costoenvio)
    {
        Costoenvio = costoenvio;
    }
    public double calcularcostoenvio(String precio)
    {
        double precioproducto = Double.parseDouble(precio);
        return precioproducto * 0.50;
    }
}
