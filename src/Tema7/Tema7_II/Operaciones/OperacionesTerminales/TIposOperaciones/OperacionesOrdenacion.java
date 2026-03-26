package Tema7.Tema7_II.Operaciones.OperacionesTerminales.TIposOperaciones;

import Tema7.Tema7_II.Operaciones.OperacionesTerminales.Entidades.CategoriaProducto;
import Tema7.Tema7_II.Operaciones.OperacionesTerminales.Entidades.Producto;

import java.util.Comparator;
import java.util.List;

public class OperacionesOrdenacion {
    static void main() {

        List<Producto> tienda = List.of(
                new Producto("iPhone17","",1000.0, CategoriaProducto.MOVILES),
                new Producto("Xiaomi 17","", 999.0, CategoriaProducto.MOVILES),
                new Producto("Mac Neo","Vaya castaña", 800.0, CategoriaProducto.PORTATILES),
                new Producto("Lenovo X Ultra","", 900.0, CategoriaProducto.PORTATILES),
                new Producto("Samsung Galaxy S26 Ultra","", 1400.0, CategoriaProducto.PORTATILES),
                new Producto("Asus 5080", "Imposible", 1200.0, CategoriaProducto.COMPONENTES)
        );

        //sorted -> por nombre
        IO.println("--- Ordenar por nombre ---");
        tienda.stream()
                .sorted(Comparator.comparing(Producto::getNombre))
                .forEach(System.out::println);

        //sorted -> por nombre con mayúsculas
        IO.println("--- Ordenar por nombre en mayúsculas ---");
        tienda.stream()
                .map(p -> {
                    p.setNombre(p.getNombre().toUpperCase());
                    return p;
                })
                .sorted(Comparator.comparing(Producto::getNombre))
                .forEach(System.out::println);

        //sorted -> por precio descendente
        IO.println("--- Ordenar por precio ---");
        tienda.stream()
                .sorted(Comparator.comparing(Producto::getPrecio).reversed())
                .forEach(System.out::println);

        //sorted -> mostrar solo el nombre de los productos ordenados
        IO.println("--- Mostrar solo el nombre de los productos ordenados ---");
        tienda.stream()
                .map(Producto::getNombre)
                .sorted()
                .forEach(System.out::println);

    }
}