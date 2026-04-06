package Tema7.Tema7_II.Ejercicios.EjemploBanda;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    static void main() {

        List<Musico> banda = new ArrayList<>();
        banda.add(new Musico("Pedro", 21,
                LocalDate.of(2010,9,1),Instrumento.CLARINETE));
        banda.add(new Musico("Laura", 15,
                LocalDate.of(2010,9,1),Instrumento.TUBA));
        banda.add(new Musico("Andrés", 18,
                LocalDate.of(2010,9,1),Instrumento.TAMBOR));
        banda.add(new Musico("Sonia", 25,
                LocalDate.of(2010,9,1),Instrumento.TAMBOR));
        banda.add(new Musico("Juan", 32,
                LocalDate.of(2010,9,1),Instrumento.CLARINETE));
        banda.add(new Musico("Javier", 15,
                LocalDate.of(2010,9,1),Instrumento.FLAUTA));
        banda.add(new Musico("Ana", 21,
                LocalDate.of(2010,9,1),Instrumento.TROMBON));
        banda.add(new Musico("Luisa", 32,
                LocalDate.of(2010,9,1),Instrumento.FLAUTA));

        IO.println("------------------------");
        //Cuántos menores de 18 años
        long menores = banda.stream()
                .filter(m -> m.getEdad() < 18)
                .count();
        IO.println("Menores de 18: " + menores);

        IO.println("------------------------");
        //Devuelve el primero que tenga menos de 18 años
        banda.stream()
                .filter(m -> m.getEdad() < 18)
                .findFirst()
                .ifPresent(IO::println);

        Optional<Musico> musico = banda.stream()
                .filter(m -> m.getEdad() < 14)
                .findFirst();
        if (musico.isPresent()) {
            IO.println(musico.get().getNombre());
        } else {
            IO.println("No hay nadie menor de 14");
        }

        IO.println("------------------------");
        //Nombres en mayúscula
        banda.stream()
                .map(Musico::getNombre)
                .map(String::toUpperCase)
                .sorted()
                .forEach(IO::println);

        IO.println("------------------------");
        //Muestra los instrumentos que se tocan en esa banda, sin repetidos
        banda.stream()
                .map(Musico::getInstrumento)
                .distinct()
                .forEach(IO::println);

        IO.println("------------------------");
        //Persona con más edad de la banda
        banda.stream()
                .sorted(Comparator.comparing(Musico::getEdad).reversed())
                .limit(1)
                .forEach(IO::println);

        banda.stream()
                .max(Comparator.comparing(Musico::getEdad))
                .ifPresent(IO::println);

        IO.println("------------------------");
        //Alguien toca el trombón en la banda
        boolean trombon = banda.stream()
                .anyMatch(m -> m.getInstrumento().equals(Instrumento.TROMBON));
        if (trombon) {
            IO.println("Sí, alguien toca el trombón");
        } else {
            IO.println("No, nadie toca el trombón");
        }

        IO.println("------------------------");
        //Todos tienen más de 14 años
        boolean mascatorce = banda.stream()
                .allMatch(m -> m.getEdad() > 14);
        if (mascatorce)
            IO.println("Todos más de catorce");
        else
            IO.println("No todos más de catorce");

        IO.println("------------------------");
        //Suma de todas las edades
        int sumaEdades = 0;
        sumaEdades = banda.stream()
                .mapToInt(Musico::getEdad)
                .sum();
        IO.println("Suma de edades: " + sumaEdades);

        sumaEdades = banda.stream()
                .reduce(0, (m1,m2) -> m1 + m2.getEdad(), Integer::sum);
        IO.println("Suma de edades: " + sumaEdades);

        IntSummaryStatistics estadisticas = banda.stream()
                .collect(Collectors.summarizingInt(Musico::getEdad));
        IO.println(estadisticas);
        IO.println("Suma de edades: " + estadisticas.getSum());

        IO.println("------------------------");
        //Genera una nueva lista con todos los músicos que tocan la flauta
        List<Musico> flautistas = banda.stream()
                .filter(m -> m.getInstrumento().equals(Instrumento.FLAUTA))
                .toList();
        flautistas.forEach(IO::println);

        IO.println("------------------------");
        //Genera una mapa donde aparezca como clave el nombre y valor el instrumento que toca
        Map<String, Instrumento> musinst = banda.stream()
                .collect(Collectors.toMap(Musico::getNombre, Musico::getInstrumento));
        musinst.forEach((clave, valor) -> IO.println(clave + ": " + valor));

        IO.println("------------------------");
        //Muestra para cada instrumento quién lo toca
        Map<Instrumento, List<Musico>> instrumentosMusicos = banda.stream()
                .collect(Collectors.groupingBy(Musico::getInstrumento));
        instrumentosMusicos.forEach((clave, valor) -> IO.println(clave + ": " + valor));

        IO.println("------------------------");
        //Muestra para cada instrumento cuántas personas lo tocan
        Map<Instrumento, Long> instrumentosCount = banda.stream()
                .collect(Collectors.groupingBy(Musico::getInstrumento, Collectors.counting()));
        instrumentosCount.forEach((clave, valor) -> IO.println(clave + ": " + valor));

        IO.println("------------------------");
        //Muestra para cada instrumento quién lo toca, solo el nombre
        Map<Instrumento, List<String>> instrumentosNames = banda.stream()
                .collect(Collectors.groupingBy(Musico::getInstrumento, Collectors.mapping(Musico::getNombre, Collectors.toList())));
        instrumentosNames.forEach((clave, valor) -> IO.println(clave + ": " + valor));

        IO.println("------------------------");
        //Mostrar todos los nombres de la banda seguidos
        String nombres = banda.stream()
                .map(Musico::getNombre)
                .collect(Collectors.joining(", ", "", ""));
        IO.println(nombres);


    }

}