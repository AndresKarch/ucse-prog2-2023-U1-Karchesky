package Envios;

public class EnvioBarco implements MetodoEnvio {
    public double calcularcostoenvio(String precio)
    {
        double precioproducto = Double.parseDouble(precio);
        return precioproducto * 0.40;
    }
}
