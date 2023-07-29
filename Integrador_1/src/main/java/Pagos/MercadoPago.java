package Pagos;

public class MercadoPago implements Metodo {
    private String nombre = "MercadoPago";

    public String metodopago()
    {
        return "Conexion con "+nombre;
    }
}
