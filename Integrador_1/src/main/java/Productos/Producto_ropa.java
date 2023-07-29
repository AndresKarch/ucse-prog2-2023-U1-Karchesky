package Productos;

public class Producto_ropa implements Producto {
    private int codigo;
    private String nombre;
    private String tipo_tela;
    private String temporada;
    private String adulto_nino;
    private String precio;

    public Producto_ropa(int Codigo, String Nombre, String Tipo_tela, String Temporada, String Adulto_nino, String Precio)
    {
        codigo = Codigo;
        nombre = Nombre;
        tipo_tela = Tipo_tela;
        temporada = Temporada;
        adulto_nino = Adulto_nino;
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

    public String getTipo_tela() {
        return tipo_tela;
    }

    public void setTipo_tela(String tipo_tela) {
        this.tipo_tela = tipo_tela;
    }

    public String getTemporada() {
        return temporada;
    }

    public void setTemporada(String temporada) {
        this.temporada = temporada;
    }

    public String getAdulto_nino() {
        return adulto_nino;
    }

    public void setAdulto_nino(String adulto_nino) {
        this.adulto_nino = adulto_nino;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }
}
