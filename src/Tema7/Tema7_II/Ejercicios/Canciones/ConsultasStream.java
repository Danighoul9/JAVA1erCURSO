package Tema7.Tema7_II.Ejercicios.Canciones;

import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Map;

public class ConsultasStream {
    static void main() {

        List<Cancion> canciones = List.of(
                new Cancion("Blinding Lights", new Artista("The Weeknd", "Canadá"), 2024, 200, 90.5, Genero.POP),
                new Cancion("Levitating", new Artista("Dua Lipa", "Reino Unido"), 2024, 203, 88.7, Genero.POP),
                new Cancion("Lost Souls", new Artista("Foo Fighters", "EE. UU."), 2024, 210, 91.0, Genero.ROCK),
                new Cancion("Rise Again", new Artista("Sam Smith", "Reino Unido"), 2025, 220, 92.5, Genero.POP),
                new Cancion("Phoenix Rising", new Artista("Paramore", "EE. UU."), 2025, 180, 89.7, Genero.ROCK),
                new Cancion("The Final Frontier", new Artista("Ghost", "Suecia"), 2025, 215, 92.1, Genero.METAL),
                new Cancion("Shining Star", new Artista("Doja Cat", "EE. UU."), 2025, 185, 88.7, Genero.HIPHOP),
                new Cancion("Crimson Skies", new Artista("Foo Fighters", "EE. UU."), 2025, 225, 93.3, Genero.ROCK),
                new Cancion("Kiss Me More", new Artista("Doja Cat", "EE. UU."), 2024, 205, 87.1, Genero.POP)
        );

        // 1. Muestra las canciones de 2025
        canciones.stream()
                .filter(c -> c.getAnioLanzamiento() == 2025)
                .forEach(System.out::println);

        System.out.println("----------------------------------------");

        // 2. Muestra las canciones de Doja Cat
        canciones.stream()
                .filter(c -> c.getArtista().getNombre().equalsIgnoreCase("Doja Cat"))
                .forEach(System.out::println);

        System.out.println("----------------------------------------");

        //3. Muestra las canciones ordenadas de mayor a menor por popularidad.
        canciones.stream()
                .sorted(Comparator.comparing(Cancion::getPopularidad).reversed())
                .forEach(System.out::println);

        //4. Calcula la duración total de todas las canciones en minutos
        int totalSegundos = canciones.stream()
                .mapToInt(Cancion::getDuracionSegs)
                .sum();
        IO.println("Duración total en minutos: " + totalSegundos / 60 + " minutos");

        //7. Comprueba si hay alguna canción con más del 95% de popularidad, y 90%
        boolean mas95 = canciones.stream()
                .anyMatch(c -> c.getPopularidad() > 95);
        IO.println("Alguna canción con más del 95% de popularidad? " + mas95);
        boolean mas90 = canciones.stream()
                .anyMatch(c -> c.getPopularidad() > 90);
        IO.println("Alguna canción con más del 90% de popularidad? " + mas90);

        //8. Muestra las tres canciones de más duración
        canciones.stream()
                .sorted(Comparator.comparing(Cancion::getDuracionSegs).reversed())
                .limit(3)
                .forEach(System.out::println);

        //9. Genera una lista: titulo – artista, de todas las canciones ordenada alfabéticamente.
        List<String> titulos = canciones.stream()
                .map(cancion -> cancion.getTitulo() + " - " + cancion.getArtista().getNombre())
                .sorted()
                .toList();
        titulos.forEach(System.out::println);

        //10. Muestra la duración media de las canciones
        double duracionMedia = canciones.stream()
                .collect(Collectors.summarizingInt(Cancion::getDuracionSegs))
                .getAverage();
        IO.println("Duración media de las canciones: " + duracionMedia + " segundos");

        //11. Muestra las estadísticas de popularidad (summarizingDouble)
        DoubleSummaryStatistics stats = canciones.stream()
                .collect(Collectors.summarizingDouble(Cancion::getPopularidad));
        IO.println("Estadísticas de popularidad: " + stats);

        //5. Agrupa las canciones por país de origen y cuántas canciones por país
        Map<String, Long> cancionesPorPais = canciones.stream()
                .collect(Collectors.groupingBy(c -> c.getArtista().getPais(), Collectors.counting()));
        cancionesPorPais.forEach((pais, count) -> IO.println(pais + ": " + count + " canciones"));

        //6. Muestra las canciones agrupadas por género, cuántas por cada uno.
        Map<Genero, Long> generos = canciones.stream()
                .collect(Collectors.groupingBy(Cancion::getGenero, Collectors.counting()));
        generos.forEach((genero, count) -> IO.println(genero + ": " + count + " canciones"));

        //12. Muestra el promedio de popularidad por género.
        Map<Genero, Double> generosProm = canciones.stream()
                .collect(Collectors.groupingBy(Cancion::getGenero, Collectors.averagingDouble(Cancion::getPopularidad)));
        generosProm.forEach((genero, prom) -> IO.println(genero + ": " + prom));


    }
}
