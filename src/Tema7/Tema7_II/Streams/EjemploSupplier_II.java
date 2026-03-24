package Tema7.Tema7_II.Streams;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EjemploSupplier_II {
    static void main() {

        // 1. Definir el Supplier: Crea un objeto nuevo cada vez que se llama a .get()
        Supplier<Persona> pSupplier =
                () -> new Persona(UUID.randomUUID().toString(), "Persona-" + ((int) (Math.random()*1000)),"", LocalDate.now());

        // 2. Generar una lista con 3 usuarios usando el Supplier
        List<Persona> listaUsuarios = Stream.generate(pSupplier)
                .limit(300)
                .toList();

        IO.println(listaUsuarios.get(26));
        // 3. Imprimir el resultado
        listaUsuarios.forEach(System.out::println);
    }
}
