package Pagos;

import Productos.Producto_electronica;
import Productos.Producto_ropa;
import Productos.Producto_vehiculo;

public class Fabrica {
    public Metodo crear_metodo(String metodo)
    {
        switch (metodo) {
            case "1" -> {
                return new MercadoPago();
            }
            case "2" -> {
                return new Paypal();
            }
            default -> {
                return null;
            }
        }

    }
}
