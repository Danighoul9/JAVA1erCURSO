package Tema6.TareasRepaso.Tarea1.App;

import Tema6.TareasRepaso.Tarea1.Entidades.Equipamiento;
import Tema6.TareasRepaso.Tarea1.Entidades.RopaDeportiva;
import Tema6.TareasRepaso.Tarea1.Servicios.Tienda;

public class App {

    /**
     * Metodo para mostrar menu
     */
    public static void mostrarMenu(){
        IO.println("--- TIENDA ---");
        IO.println("1. Mostrar inventario");
        IO.println("2. Mostrar historial compras");
        IO.println("3. Realizar compra");
        IO.println("4. Salir");
        IO.println("Introduce opción");
    }

    /**
     * Metodo para precargar los items
     */
    public static void precargarItems(Tienda tienda){
        tienda.agregarProducto(new Equipamiento("Equipación R.Madrid",
                250.0, 10, "Fútbol"));
        tienda.agregarProducto(new Equipamiento("Equipación Atletico Madrid",
                225.0, 6, "Fútbol"));
        tienda.agregarProducto(new RopaDeportiva("Zapatillas Basket Adidas",
                180.0, 14, "41"));
        tienda.agregarProducto(new RopaDeportiva("Zapatillas Running Trail Adidas",
                280.0, 20, "42"));
    }
    static void main() {

        Tienda tienda = new Tienda();
        precargarItems(tienda);

        //Menú
        int opcion = 0;
        do {
           mostrarMenu();
            try {
                opcion = Integer.parseInt(IO.readln());
                switch (opcion) {
                    case 1 -> tienda.mostrarInventario();
                    case 2 -> tienda.mostrarHistorialCompras();
                    case 3 -> {
                        IO.println("Introduce código del producto");
                        String codigo = IO.readln();
                        IO.println("Introduce cantidad");
                        int cantidad = Integer.parseInt(IO.readln());
                        tienda.realizarCompra(codigo, cantidad);
                    }
                    case 4 -> IO.println("Hasta pronto");
                }
            } catch (Exception e) {
                IO.println("ERROR: " + e.getMessage());
            }

        } while (opcion != 4);

    }
}