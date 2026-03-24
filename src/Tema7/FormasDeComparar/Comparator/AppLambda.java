package Tema7.FormasDeComparar.Comparator;

import java.util.*;

public class AppLambda {
    static void main() {

        List<Producto> tienda = new ArrayList<>();
        tienda.add(new Producto("Iphone17","MOVILES",
                "Último de Apple", 1000.0));
        tienda.add(new Producto("Iphone17 Pro","MOVILES",
                "Último de Apple más tocho", 1200.0));
        tienda.add(new Producto("Iphone17 Ultra","MOVILES",
                "Último de Apple tochaco", 1400.0));
        tienda.add(new Producto("Xiaomi 17","MOVILES",
                "Último de Xiaomi", 1000.0));

        IO.println("--- Ordenar por nombre ---");
        tienda.sort(Comparator.comparing(Producto::getNombre)); //Method reference
        //tienda.sort((o1,o2) -> o1.getNombre().compareTo(o2.getNombre())); //Lambda expression

        for(Producto p: tienda) {
            IO.println(p);
        }

        IO.println("--- Ordenar por precio ---");
        tienda.sort(Comparator.comparing(Producto::getPrecio));

        for(Producto p: tienda) {
            IO.println(p);
        }

        IO.println("--- Ordenar por precio con TreeSet ---");
        Set<Producto> productos = new TreeSet<>(Comparator.comparing(Producto::getDescripcion).reversed());
        productos.add(new Producto("Iphone17","MOVILES",
                "Último de Apple", 1000.0));
        productos.add(new Producto("Iphone17 Pro","MOVILES",
                "Último de Apple más tocho", 1200.0));
        productos.add(new Producto("Iphone17 Ultra","MOVILES",
                "Último de Apple tochaco", 1400.0));
        productos.add(new Producto("Xiaomi 17","MOVILES",
                "Último de Xiaomi", 1000.0));
        for(Producto p: productos) {
            IO.println(p);
        }
    }
}
