package Tema7.Tema7_II.GenerarStreams;


import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

public class Main {
    static void main() {

        Stream<Integer> numeros = Stream.of(10,9,8,7,6,5,4,3,2,1);

        numeros
                .filter(n -> n > 3)
                .sorted()
                .forEach(IO::println);

        Stream<Integer> impares = Stream.iterate(1, n -> n+2);
        impares
                .limit(10)
                .forEach(IO::println);

        Stream<Integer> numerosAleatorios = Stream.generate(() -> (int) (Math.random()*1000));
        numerosAleatorios
                .limit(10)
                .forEach(IO::println);

        Stream<String> ciudades = List.of("Vera", "Garrucha", "Pulpí", "Antas").stream();
        ciudades
                .map(String::toUpperCase)
                .sorted()
                .forEach(IO::println);
    }
}