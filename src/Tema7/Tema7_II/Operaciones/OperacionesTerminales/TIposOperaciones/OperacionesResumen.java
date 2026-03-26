package Tema7.Tema7_II.Operaciones.OperacionesTerminales.TIposOperaciones;

import Tema7.Tema7_II.Operaciones.OperacionesTerminales.Entidades.CategoriaProducto;
import Tema7.Tema7_II.Operaciones.OperacionesTerminales.Entidades.Producto;

import java.util.Comparator;
import java.util.List;


public class OperacionesResumen {
    static void main() {

        List<Producto> tienda = List.of(
                new Producto("iPhone17", "", 1000.0, CategoriaProducto.MOVILES),
                new Producto("Xiaomi 17", "", 999.0, CategoriaProducto.MOVILES),
                new Producto("Mac Neo", "Vaya castaña", 800.0, CategoriaProducto.PORTATILES),
                new Producto("Lenovo X Ultra", "", 900.0, CategoriaProducto.PORTATILES),
                new Producto("Samsung Galaxy S26 Ultra", "", 1400.0, CategoriaProducto.PORTATILES),
                new Producto("Asus 5080", "Imposible", 1200.0, CategoriaProducto.COMPONENTES)
        );

        //count
        IO.println("La tienda tiene " + tienda.stream().count() + " productos");
        IO.println("La tienda tiene " + (long) tienda.size() + " productos");

        //min -> devuelve el producto con el precio más bajo
        tienda.stream()
                .min(Comparator.comparing(Producto::getPrecio))
                .ifPresent(IO::println);

        //max -> devuelve el producto con el precio más alto
        tienda.stream()
                .max(Comparator.comparing(Producto::getPrecio))
                .ifPresent(IO::println);

        //max -> devuelve el producto con el nombre más largo
        tienda.stream()
                .peek(p -> IO.println("Nombre: " + p.getNombre()))
                .max(Comparator.comparing(p -> p.getNombre().length()))
                .ifPresent(IO::println);

        //sum -> total del precio de todos los productos
        double total = tienda.stream()
                .mapToDouble(Producto::getPrecio)
                .sum();
        IO.println("Total: " + total);


    }
}
