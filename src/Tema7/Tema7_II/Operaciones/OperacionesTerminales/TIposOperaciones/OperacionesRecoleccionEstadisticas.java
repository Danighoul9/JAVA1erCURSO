package Tema7.Tema7_II.Operaciones.OperacionesTerminales.TIposOperaciones;


import Tema7.Tema7_II.Operaciones.OperacionesTerminales.Entidades.CategoriaProducto;
import Tema7.Tema7_II.Operaciones.OperacionesTerminales.Entidades.Producto;

import java.util.List;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.stream.Collectors;

public class OperacionesRecoleccionEstadisticas {
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

        //Precio máximo
        tienda.stream()
                .collect(Collectors.maxBy(Comparator.comparing(Producto::getPrecio)))
                .ifPresent(IO::println);

        //Suma de precios
        double suma = tienda.stream()
                .collect(Collectors.summingDouble(Producto::getPrecio));
        IO.println("Suma de precios: " + suma);

        suma = tienda.stream().mapToDouble(Producto::getPrecio).sum();
        IO.println("Suma de precios: " + suma);

        //Estadísticas -> por precio
        double sumaTotal = tienda.stream()
                .collect(Collectors.summarizingDouble(Producto::getPrecio))
                .getSum();
        IO.println("Suma total: " + sumaTotal);

        //Objeto con todas las estadísicas
        DoubleSummaryStatistics estadisticas = tienda.stream()
                .collect(Collectors.summarizingDouble(Producto::getPrecio));
        IO.println(estadisticas);
        IO.println("Media: " + estadisticas.getAverage());
        IO.println("Máximo: " + estadisticas.getMax());


    }
}
