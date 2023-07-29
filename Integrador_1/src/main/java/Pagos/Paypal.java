package Pagos;

public class Paypal implements Metodo {
    String nombre = "Paypal";
    public String metodopago()
    {
        return "Conexion con "+nombre;
    }
}
