package Tema7.Tema7_II.Ejercicios.Pedidos;

import java.time.LocalDate;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class TestPedidos {

    static void main() {

        //Creación de objetos
        Cliente c1 = new Cliente(1L, "Manuel García", 2);
        Cliente c2 = new Cliente(2L, "Esther Expósito", 1);
        Cliente c3 = new Cliente(3L, "Goyo Jiménez", 2);

        Producto prod1 = new Producto(1L, "Libro1", CategoriaProducto.LIBROS, 19.95);
        Producto prod2 = new Producto(2L, "Libro2", CategoriaProducto.LIBROS, 27.95);
        Producto prod3 = new Producto(3L, "Libro3", CategoriaProducto.LIBROS, 22.95);
        Producto prod4 = new Producto(4L, "Libro4", CategoriaProducto.LIBROS, 15.95);
        Producto prod5 = new Producto(5L, "Libro5", CategoriaProducto.LIBROS, 19.95);

        Producto prod6 = new Producto(6L, "Juego1", CategoriaProducto.JUEGOS, 59.95);
        Producto prod7 = new Producto(7L, "Juego2", CategoriaProducto.JUEGOS, 67.95);
        Producto prod8 = new Producto(8L, "Juego3", CategoriaProducto.JUEGOS, 52.95);
        Producto prod9 = new Producto(9L, "Juego4", CategoriaProducto.JUEGOS, 55.95);
        Producto prod10 = new Producto(10L, "Juego5", CategoriaProducto.JUEGOS, 69.95);

        Producto prod11 = new Producto(11L, "Periferico1", CategoriaProducto.PERIFERICOS, 19.95);
        Producto prod12 = new Producto(12L, "Periferico2", CategoriaProducto.PERIFERICOS, 27.95);
        Producto prod13 = new Producto(13L, "Periferico3", CategoriaProducto.PERIFERICOS, 32.95);
        Producto prod14 = new Producto(14L, "Periferico4", CategoriaProducto.PERIFERICOS, 45.95);
        Producto prod15 = new Producto(15L, "Periferico5", CategoriaProducto.PERIFERICOS, 59.95);

        Pedido ped1 = new Pedido(c1, EstadoPedido.RECIBIDO, LocalDate.now().plusDays(5),null,1L);
        Pedido ped2 = new Pedido(c2, EstadoPedido.RECIBIDO, LocalDate.now().plusDays(20), null, 2L);
        Pedido ped3 = new Pedido(c3, EstadoPedido.RECIBIDO, LocalDate.now().plusDays(7), null, 3L);
        Pedido ped4 = new Pedido(c1, EstadoPedido.RECIBIDO, LocalDate.now(), null, 4L);

        ped1.setProductos(new HashSet<>( List.of(prod1, prod3, prod5, prod10)));
        ped2.setProductos(new HashSet<>( List.of(prod2, prod4, prod8, prod12)));
        ped3.setProductos(new HashSet<>( List.of(prod11, prod13, prod14, prod15)));
        ped4.setProductos(new HashSet<>( List.of(prod6, prod7, prod9, prod1, prod2, prod10)));

        ArrayList<Pedido> pedidos = new ArrayList<>(List.of(ped1, ped2, ped3, ped4));
        ArrayList<Producto> productos = new ArrayList<>(List.of(prod1,prod2,prod3,prod4,prod5,prod6,prod7,prod8,
                prod9,prod10,prod11,prod12,prod13,prod14,prod15));

        //CONSULTAS DE STREAMS

        IO.println("-----------------------");
        //1. Muestra los libros cuyo precio sea mayor de 20€
        productos.stream()
                .filter(p -> p.getCategoria().equals(CategoriaProducto.LIBROS))
                .filter(p -> p.getPrecio() > 20)
                .forEach(System.out::println);

        IO.println("-----------------------");
        //2. Muestra los pedidos que tengan algún "Juego"
        pedidos.stream()
                .filter(p -> p.getProductos().stream()
                        .anyMatch(prod -> prod.getCategoria().equals(CategoriaProducto.JUEGOS)))
                .forEach(System.out::println);

        IO.println("-----------------------");
        //3. Genera una lista con todos los Productos, pero cambia su precio para que lleven un 10%
        //de descuento
        List<Producto> productosDesc = productos.stream()
                .map(p -> new Producto(p.getId(), p.getNombre(),
                        p.getCategoria(), p.getPrecio() * 0.9))
                .toList();
        productosDesc.forEach(System.out::println);

        IO.println("-----------------------");
        //4. Saca los productos que aparecen en los pedidos de clientes de nivel 2, realizados entre
        //el 01-04-2025 y el 01-05-2025. Hay que usar flatmap para unir todos los productos de
        //todos los pedidos: .flatMap(p -> p.getProductos().stream())
        pedidos.stream()
                .filter(ped -> ped.getCliente().getNivel() == 2)
                .filter(ped -> ped.getFechaPedido().isAfter(LocalDate.of(2026,3,31)))
                .filter(ped -> ped.getFechaPedido().isBefore(LocalDate.of(2026,5,2)))
                .flatMap(ped -> ped.getProductos().stream())
                .forEach(System.out::println);

        // ped1 -> prod1, prod2
        // ped2 -> prod2, prod3, prod5
        // prod1, prod2, prod2, prod3, prod5   FLATMAP

        IO.println("-----------------------");
        //5. Muestra el producto más caro de la categoría Juegos
        productos.stream()
                .filter(prod -> prod.getCategoria().equals(CategoriaProducto.JUEGOS))
                .sorted(Comparator.comparing(Producto::getPrecio).reversed())
                .limit(1)
                .forEach(System.out::println);

        IO.println("-----------------------");
        //6. Devuelve los dos pedidos más recientes
        pedidos.stream()
                .sorted(Comparator.comparing(Pedido::getFechaPedido).reversed())
                .limit(2)
                .forEach(System.out::println);

        IO.println("-----------------------");
        //7. Muestra los pedidos hechos hoy, debe aparecer el pedido y debajo la lista de productos
        //de ese pedido
        pedidos.stream()
                .filter(p -> p.getFechaPedido().isEqual(LocalDate.now()))
                .forEach(ped -> {
                    IO.println("Pedido: " + ped.getId());
                    IO.println("Productos:");
                    ped.getProductos().forEach(System.out::println);
                });

        IO.println("-----------------------");
        //8. Calcula el total de todos los pedidos de abril de 2026
        double total = pedidos.stream()
                .filter(p -> p.getFechaPedido().getMonthValue() == 4)
                .filter(p -> p.getFechaPedido().getYear() == 2026)
                .mapToDouble(ped -> ped.getProductos().stream()
                        .mapToDouble(Producto::getPrecio)
                        .sum()
                )
                .sum();
        IO.println("Total de pedidos de abril de 2026: " + total);

        IO.println("-----------------------");
        //9. Obtén una colección de estadísticas del precio de los Juegos: número, media, máximo, mínimo,
        //total. Hay que usar el método de Streams summaryStatistics() que devuelve un
        //DoubleSummaryStatistics.
        DoubleSummaryStatistics stats = productos.stream()
                .filter(p -> p.getCategoria().equals(CategoriaProducto.JUEGOS))
                .collect(Collectors.summarizingDouble(Producto::getPrecio));
        IO.println("Estadísticas de precio de los Juegos: ");
        IO.println(stats);
        IO.println("Total juegos: " + stats.getCount());

        Integer countProds = productos.size();
        IO.println("Porcentaje de juegos: " + (stats.getCount() * 100 / countProds) + "%");
        IO.println("Porcentaje de periféricos: " + (productos.stream()
                .filter(p -> p.getCategoria().equals(CategoriaProducto.PERIFERICOS))
                .count() * 100 / countProds) + "%");

        IO.println("-----------------------");
        //10. Genera un Map<Long, Integer> donde como clave aparezca el id de pedido y como
        //valor el número de productos en el pedido
        Map<Long, Integer> pedidosSize = pedidos.stream()
                .collect(Collectors.toMap(
                        Pedido::getId,
                        ped -> ped.getProductos().size()
                ));
        pedidosSize.forEach((c,v) -> IO.println("Pedido " + c + ": " + v + " productos"));

        IO.println("-----------------------");
        //11.Genera un Map<Pedido, Double> donde la clave sea cada pedido y el valor sea el total
        //del pedido. Hay que usar Collectors.toMap pero al poner la clave es el propio pedido,
        //se pone Function.identity() en el primer parámetro de Collectors.toMap.
        Map<Pedido, Double> pedidosTotal = pedidos.stream()
                .collect(Collectors.toMap(
                        Function.identity(),
                        ped -> ped.getProductos().stream()
                                .mapToDouble(Producto::getPrecio)
                                .sum()
                ));
        pedidosTotal.forEach((c,v) -> IO.println("Pedido " + c.getId() + ": " + v + " €"));

        IO.println("-----------------------");
        //12. Genera un Map<String, List<Producto>> con la clave la categoría, y el valor los
        //productos de esa categoría. Usar Collectors.groupingBy
        productos.stream()
                .collect(Collectors.groupingBy(Producto::getCategoria))
                .forEach((c,v) -> IO.println(c + ": "
                        + v.stream().map(Producto::getNombre).collect(Collectors.joining(", "))));

        IO.println("-----------------------");
        //13. Saca el producto más caro de cada categoría. Genera un Map<String,
        //Optional<Producto>>. Usar Collectors.groupingBy y Collectors.maxBy
        productos.stream()
                .collect(Collectors.groupingBy(Producto::getCategoria, Collectors.counting()))
                .forEach((c,v) -> IO.println(c + ": " + v + " productos"));

        productos.stream()
                .collect(Collectors.groupingBy(Producto::getCategoria,
                        Collectors.maxBy(Comparator.comparing(Producto::getPrecio))))
                .forEach((c,v) -> IO.println(c + ": " + v.get() + " producto más caro"));

    }
}