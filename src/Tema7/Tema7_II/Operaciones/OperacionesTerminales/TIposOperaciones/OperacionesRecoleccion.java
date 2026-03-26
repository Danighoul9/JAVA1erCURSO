package Tema7.Tema7_II.Operaciones.OperacionesTerminales.TIposOperaciones;


import Tema7.Tema7_II.Operaciones.OperacionesTerminales.Entidades.CategoriaProducto;
import Tema7.Tema7_II.Operaciones.OperacionesTerminales.Entidades.Producto;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class OperacionesRecoleccion {
    static void main() {
        List<Producto> tienda = List.of(
                new Producto("iPhone17","",1000.0,CategoriaProducto.MOVILES),
                new Producto("Xiaomi 17","", 999.0, CategoriaProducto.MOVILES),
                new Producto("Mac Neo","Vaya castaña", 800.0, CategoriaProducto.PORTATILES),
                new Producto("Lenovo X Ultra","", 900.0, CategoriaProducto.PORTATILES),
                new Producto("Samsung Galaxy S26 Ultra","", 1400.0, CategoriaProducto.PORTATILES),
                new Producto("Samsung Galaxy S26 Ultra","", 1400.0, CategoriaProducto.PORTATILES),
                new Producto("Asus 5080", "Imposible", 1200.0, CategoriaProducto.COMPONENTES)
        );

        //Collectors es una clase que nos proporciona métodos estáticos para realizar operaciones
        //de recolección en streams. Estas operaciones de recolección nos permiten transformar un stream
        //en una colección, un mapa, un resumen estadístico, entre otros resultados.

        //toList
        IO.println("Los nombres de los productos son:");
        List<String> nombres = tienda.stream()
                .map(Producto::getNombre)
                .toList(); //La lista generada es inmutable, no se puede modificar
        //nombres.add("Nuevo producto");
        nombres.forEach(System.out::println);

        IO.println("Los nombres de los productos en una lista mutable son:");
        List<String> nombresMutable = new ArrayList<>(nombres);
        nombresMutable.add("Nuevo producto");
        nombresMutable.forEach(System.out::println);

        //toSet
        IO.println("Los nombres de los productos en set son:");
        Set<Producto> portatiles = tienda.stream()
                .filter(p -> p.getCategoria().equals(CategoriaProducto.PORTATILES))
                .collect(Collectors.toSet()); //El set generado es inmutable, no se puede modificar
        portatiles.forEach(System.out::println);


    }

}
