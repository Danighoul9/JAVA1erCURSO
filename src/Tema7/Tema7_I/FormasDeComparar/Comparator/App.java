package Tema7.Tema7_I.FormasDeComparar.Comparator;

import java.util.*;

public class App {
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
        tienda.sort(new Comparator<Producto>() {
            @Override
            public int compare(Producto o1, Producto o2) {
                return o2.getNombre().compareTo(o1.getNombre());
            }
        });

        for(Producto p: tienda) {
            IO.println(p);
        }

        IO.println("--- Ordenar por precio ---");
        tienda.sort(new Comparator<Producto>() {
            @Override
            public int compare(Producto o1, Producto o2) {
                return o1.getPrecio().compareTo(o2.getPrecio());
            }
        });

        for(Producto p: tienda) {
            IO.println(p);
        }


        IO.println("--- Ordenar por precio con TreeSet ---");
        Set<Producto> productos = new TreeSet<>(new Comparator<Producto>() {
            @Override
            public int compare(Producto o1, Producto o2) {
                return o2.getPrecio().compareTo(o1.getPrecio());
            }
        });
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
