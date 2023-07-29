package Envios;

import Pagos.MercadoPago;
import Pagos.Metodo;
import Pagos.Paypal;

public class Fabrica {
    public MetodoEnvio crear_metodo_envio(String metodo)
    {
        switch (metodo) {
            case "1" -> {
                return new EnvioAvion();
            }
            case "2" -> {
                return new EnvioCamion();
            }

            case "3" -> {
                return new EnvioBarco();
            }
            default -> {
                return null;
            }
        }

    }
}
