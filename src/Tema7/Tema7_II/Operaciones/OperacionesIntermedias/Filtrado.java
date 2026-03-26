package Tema7.Tema7_II.Operaciones.OperacionesIntermedias;

import Tema7.Tema7_II.Operaciones.OperacionesTerminales.Entidades.CategoriaProducto;
import Tema7.Tema7_II.Operaciones.OperacionesTerminales.Entidades.Producto;

import java.util.List;

public class Filtrado {
    static void main() {

        List<Producto> tienda = List.of(
                new Producto("iPhone17","",1000.0, CategoriaProducto.MOVILES),
                new Producto("Xiaomi 17","", 999.0, CategoriaProducto.MOVILES),
                new Producto("Mac Neo","Vaya castaña", 800.0, CategoriaProducto.PORTATILES),
                new Producto("Lenovo X Ultra","", 900.0, CategoriaProducto.PORTATILES),
                new Producto("Samsung Galaxy S26 Ultra","", 1400.0, CategoriaProducto.PORTATILES),
                new Producto("Asus 5080", "Imposible", 1200.0, CategoriaProducto.COMPONENTES)
        );

        //FILTRADO DEBE SER LA PRIMERA OPERACIÓN QUE PONGÁIS EN EL STREAM
        //SI YA QUITAMOS ELEMENTOS, EL RESTO DEL STREAM TRABAJARÁ SOBRE MENOS ELEMENTOS Y
        //SERÁ MÁS EFICIENTE

        //filter -> pinta los portátiles
        IO.println("Portátiles:");
        tienda.stream()
                .filter(p -> p.getCategoria().equals(CategoriaProducto.PORTATILES))
                .forEach(System.out::println);

        //filter y skip -> pinta los productos de más de 1000€ pero sáltate el primero
        IO.println("Productos de más de 1000 euros saltando el primero:");
        tienda.stream()
                .filter(p -> p.getPrecio() >= 1000 )
                .skip(1)
                .forEach(System.out::println);

        IO.println("Elementos ordenados y saltamos 1 con skip:");
        tienda.stream()
                .map(Producto::getPrecio)
                .sorted()
                .skip(1)
                .forEach(System.out::println);

    }
}
