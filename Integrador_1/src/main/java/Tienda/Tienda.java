package Tienda;

import Productos.Producto;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Tienda {
    public static void main(String[] args){
        List<Producto> productos = new ArrayList<>();
        List<Compra> compras = new ArrayList<>();
        Productos.Fabrica fabrica = new Productos.Fabrica();
        Scanner scanner = new Scanner(System.in);
        String eleccion = "";
        while (!eleccion.equals("fin"))
        {
            System.out.println("Si desea crear un producto ingrese 'crear', si desea comprar ingrese 'comprar'");
            eleccion = scanner.nextLine();
            switch(eleccion)
            {
                case "crear":
                    System.out.println("Ingrese categoria");
                    String categoria = scanner.nextLine();
                    if(Objects.equals(categoria, "vehiculo") | Objects.equals(categoria, "ropa") | Objects.equals(categoria, "electronico"))
                    {

                        ArrayList<Object> datos = new ArrayList<>();
                        System.out.println("Ingrese los siguientes datos:");
                        System.out.println("Codigo:");
                        datos.add(Integer.parseInt(scanner.nextLine()));
                        System.out.println("Nombre:");
                        datos.add(scanner.nextLine());
                        switch (categoria) {
                            case "electronico":
                                System.out.println("Año de fabricación:");
                                datos.add(scanner.nextLine());
                                System.out.println("Modelo:");
                                datos.add(scanner.nextLine());
                                break;
                            case "ropa":
                                System.out.println("Tipo de la tela:");
                                datos.add(scanner.nextLine());
                                System.out.println("Temporada:");
                                datos.add(scanner.nextLine());
                                System.out.println("Adulto o niño:");
                                datos.add(scanner.nextLine());
                                break;
                            case "vehiculo":
                                System.out.println("Cantidad de puertas:");
                                datos.add(scanner.nextLine());
                                System.out.println("Color:");
                                datos.add(scanner.nextLine());
                                System.out.println("Marca:");
                                datos.add(scanner.nextLine());
                                break;
                        }
                        System.out.println("Precio:");
                        datos.add(scanner.nextLine());
                        System.out.println("Guardar - y|n");
                        String guardar = scanner.nextLine();
                        if (Objects.equals(guardar, "y")) {
                            productos.add(fabrica.crear_producto(datos, categoria));
                        }
                    }
                    else {
                        System.out.println("No existe esa categoria");
                    }
                break;
                case "comprar":
                {
                    System.out.println("Productos disponibles:");
                    Compra compra = new Compra(null,null,null);
                    if(productos.isEmpty())
                    {
                        System.out.println("No hay productos a la venta");
                    }
                    else {
                        for (Producto producto : productos) {
                            System.out.println(producto.obtener_nombre());
                        }
                        System.out.println("Ingrese producto que desea comprar:");
                        String nombre = scanner.nextLine();
                        int i = 0;
                        for (Productos.Producto producto : productos) {
                            if (Objects.equals(producto.obtener_nombre(), nombre)) {
                                compra.setProducto(producto);
                                break;
                            }
                        }
                        System.out.println("*En las siguientes opciones ingrese el numero correspondiente a la opción");
                        Pagos.Fabrica fabrica_metodos = new Pagos.Fabrica();
                        System.out.print("Metodo de pago: 1-MercadoPago  2-Paypal");
                        String metodopago = scanner.nextLine();
                        Pagos.Metodo metodo = fabrica_metodos.crear_metodo(metodopago);
                        System.out.println(metodo.metodopago());
                        compra.setMetodo_pago(metodo);

                        Envios.Fabrica fabrica_metodos_envios = new Envios.Fabrica();
                        System.out.print("Metodo envio: 1-Avion  2-Camion  3-Barco");
                        String metodoenvio = scanner.nextLine();
                        Envios.MetodoEnvio metodo_envio = fabrica_metodos_envios.crear_metodo_envio(metodoenvio);
                        compra.setMetodo_envio(metodo_envio);
                        compras.add(compra);
                    }
                }
                System.out.println("Desea coninuar?  y|n");
                String YN = scanner.nextLine();
                if(Objects.equals(YN, "n"))
                {
                    eleccion = "fin";
                }
            }
        }



}
}
