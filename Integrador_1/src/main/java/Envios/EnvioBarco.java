package Envios;

public class EnvioBarco implements MetodoEnvio {
    private String nombre ="Barco";
    private Double Costoenvio;

    public EnvioBarco(Double costoenvio)
    {
        Costoenvio = costoenvio;
    }
    public double calcularcostoenvio(String precio)
    {
        double precioproducto = Double.parseDouble(precio);
        return precioproducto * 0.40;
    }
}
