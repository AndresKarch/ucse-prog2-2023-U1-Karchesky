package Productos;

public class Producto_vehiculo implements Producto {
    private int codigo;
    private String nombre;
    private String cant_puerta;
    private String color;
    private String marca;
    private String precio;

    public Producto_vehiculo(int Codigo, String Nombre, String Cant_puerta, String Color, String Marca, String Precio)
    {
        codigo = Codigo;
        nombre = Nombre;
        cant_puerta = Cant_puerta;
        color = Color;
        marca = Marca;
        precio = Precio;
    }

    public String obtener_nombre(){return nombre;}
    public String obtener_precio()
    {
        return precio;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCant_puerta() {
        return cant_puerta;
    }

    public void setCant_puerta(String cant_puerta) {
        this.cant_puerta = cant_puerta;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }
}
