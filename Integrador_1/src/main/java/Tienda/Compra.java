package Tienda;

import Envios.MetodoEnvio;
import Pagos.Metodo;
import Productos.Producto;

public class Compra {
    Pagos.Metodo metodo;
    Envios.MetodoEnvio metodos_envio;
    private Productos.Producto producto;
    private Pagos.Metodo metodo_pago;
    private Envios.MetodoEnvio metodo_envio;

    private double costo_envio;

    public Compra(Productos.Producto producto_compra, Pagos.Metodo Metodo_pago, Envios.MetodoEnvio Metodo_envio)
    {
        producto = producto_compra;
        metodo_pago = Metodo_pago;
        metodo_envio = Metodo_envio;
        if(Metodo_pago != null )
        {
            System.out.println("Metodo de pago conectado ->" + Metodo_pago.metodopago());
            costo_envio = Metodo_envio.calcularcostoenvio(producto_compra.obtener_precio());
            System.out.println("Costo de envio: $" + costo_envio);
        }
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public Metodo getMetodo_pago() {
        return metodo_pago;
    }

    public void setMetodo_pago(Metodo metodo_pago) {
        this.metodo_pago = metodo_pago;
    }

    public MetodoEnvio getMetodo_envio() {
        return metodo_envio;
    }

    public void setMetodo_envio(MetodoEnvio metodo_envio) {
        this.metodo_envio = metodo_envio;
    }
}
