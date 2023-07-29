package Productos;

public class Producto_electronica implements Producto {
    private int codigo;
    private String nombre;
    private String ano_fabricacion;
    private String modelo;

    private String precio;

    public Producto_electronica(int Codigo, String Nombre, String Ano_fabricacion, String Modelo, String Precio)
    {
        codigo = Codigo;
        nombre = Nombre;
        ano_fabricacion = Ano_fabricacion;
        modelo = Modelo;
        precio = Precio;
    }

    public String obtener_nombre(){return nombre;}

    public String obtener_precio()
    {
        return precio;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
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

    public String getAno_fabricacion() {
        return ano_fabricacion;
    }

    public void setAno_fabricacion(String ano_fabricacion) {
        this.ano_fabricacion = ano_fabricacion;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}
