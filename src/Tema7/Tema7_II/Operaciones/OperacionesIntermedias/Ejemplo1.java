package Tema7.Tema7_II.Operaciones.OperacionesIntermedias;

import java.util.List;
import java.util.List;
import java.util.stream.Stream;

public class Ejemplo1 {
    static void main() {

        List<String> pueblos = List.of("Vera", "Garrucha", "Antas",
                "Los Gallardos", "Pulpí", "Huércal-Overa", "Mojácar");

        IO.println("--- PUEBLOS ORDENADOS ---");
        Stream<String> pueblosOrdenados = pueblos.stream()
                .map(String::toUpperCase)
                .sorted();
        pueblosOrdenados.forEach(System.out::println);

        IO.println("--- PUEBLOS NO ORDENADOS ---");
        pueblos.stream()
                .map(String::toUpperCase)
                //.map(p -> p.toUpperCase())
                .forEach(System.out::println); //Consumir el flujo

        IO.println("--- LONGITUD DEL NOMBRE DE CADA PUEBLO ---");
        pueblos.stream()
                .map(String::length)
                .sorted()
                .forEach(System.out::println);

        pueblos.stream()
                .map(p -> p + " -> " + p.length())
                .forEach(System.out::println);



    }

}
