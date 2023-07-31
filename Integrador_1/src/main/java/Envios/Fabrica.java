package Envios;

import Pagos.MercadoPago;
import Pagos.Metodo;
import Pagos.Paypal;

public class Fabrica {
    public MetodoEnvio crear_metodo_envio(String metodo,Double costoenvio)
    {
        switch (metodo) {
            case "1" -> {
                return new EnvioAvion(costoenvio);
            }
            case "2" -> {
                return new EnvioCamion(costoenvio);
            }

            case "3" -> {
                return new EnvioBarco(costoenvio);
            }
            default -> {
                return null;
            }
        }

    }
}
