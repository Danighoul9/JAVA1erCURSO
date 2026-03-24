package Tema7.Tema7_II.Streams;


import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class EjemploFunction {
    static void main() {
        Function<Persona, String> functionPersonaANombre = (Persona p) -> {
            return p.getNombre();
        };

        List<Persona> lista = Arrays.asList(
                new Persona("12345678A", "Pepe", "Pérez Pérez", LocalDate.of(1990, 1, 1)),
                new Persona("12345678A", "María", "López Almagro", LocalDate.of(1996, 4, 21)),
                new Persona("12345678A", "Martín", "Casillas Cuenca", LocalDate.of(1991, 12, 12))
        );

        lista
                .stream()
                .map(p -> p.getApellidos() + ", " + p.getNombre())
                .forEach(System.out::println);

        //Como expresión lambda
        lista
                .stream()
                .map(p -> {
                    String nombreCompuesto = p.getApellidos() + ", " + p.getNombre();
                    return nombreCompuesto;
                })
                .forEach(System.out::println);

    }
}
