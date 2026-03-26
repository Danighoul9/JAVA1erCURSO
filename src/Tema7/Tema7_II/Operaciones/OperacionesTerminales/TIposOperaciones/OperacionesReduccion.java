package Tema7.Tema7_II.Operaciones.OperacionesTerminales.TIposOperaciones;

import Tema7.Tema7_II.Operaciones.OperacionesTerminales.Entidades.CategoriaProducto;
import Tema7.Tema7_II.Operaciones.OperacionesTerminales.Entidades.Producto;

import java.util.List;

public class OperacionesReduccion {

    static void main() {

        List<Producto> tienda = List.of(
                new Producto("iPhone17","",1000.0, CategoriaProducto.MOVILES),
                new Producto("Xiaomi 17","", 999.0, CategoriaProducto.MOVILES),
                new Producto("Mac Neo","Vaya castaña", 800.0, CategoriaProducto.PORTATILES),
                new Producto("Lenovo X Ultra","", 900.0, CategoriaProducto.PORTATILES),
                new Producto("Samsung Galaxy S26 Ultra","", 1400.0, CategoriaProducto.PORTATILES),
                new Producto("Asus 5080", "Imposible", 1200.0, CategoriaProducto.COMPONENTES)
        );


        //reduce --> máximo de todos los precios
        IO.print("El precio máximo es: ");
        tienda.stream()
                .map(Producto::getPrecio)
                .reduce(Double::max)
                .ifPresent(IO::println);

        //reduce --> suma de todos los precios
        IO.print("La suma de todos los precios es: ");
        tienda.stream()
                .map(Producto::getPrecio)
                .reduce(Double::sum)
                .ifPresent(IO::println);

        //reduce --> suma de todos los precios
        IO.print("La suma de todos los precios es: ");
        double total = tienda.stream()
                .map(Producto::getPrecio)
                .reduce(0.0, Double::sum);
        IO.println(total);

        //reduce -> devuelve un string con todos los nombres de los productos separados por ,
        IO.print("Los nombres de los productos son: ");
        String nombres = tienda.stream()
                .map(Producto::getNombre)
                .reduce("", String::concat);
        IO.println(nombres);

        nombres = tienda.stream()
                .map(Producto::getNombre)
                .reduce("", (n1, n2) -> n1 + ", " + n2);
        IO.println(nombres);


    }
}