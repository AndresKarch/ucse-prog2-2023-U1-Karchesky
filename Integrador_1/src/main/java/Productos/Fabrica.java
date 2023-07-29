package Productos;

import java.util.ArrayList;

public class Fabrica {
    public Producto crear_producto(ArrayList<Object> datos,String tipo)
    {
        switch (tipo) {
            case "electronica" -> {
                return new Producto_electronica((int) datos.get(0), (String) datos.get(1), (String) datos.get(2), (String) datos.get(3), (String) datos.get(4));
            }
            case "ropa" -> {
                return new Producto_ropa((int) datos.get(0), (String) datos.get(1), (String) datos.get(2), (String) datos.get(3), (String) datos.get(4), (String) datos.get(5));
            }
            case "vehiculo" -> {
                return new Producto_vehiculo((int) datos.get(0), (String) datos.get(1), (String) datos.get(2), (String) datos.get(3), (String) datos.get(4), (String) datos.get(5));
            }
            default -> {
                return null;
            }
        }

    }
}
