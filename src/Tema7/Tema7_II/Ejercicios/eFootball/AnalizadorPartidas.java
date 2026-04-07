package Tema7.Tema7_II.Ejercicios.eFootball;

import Tema7.Tema7_II.Ejercicios.Pedidos.CategoriaProducto;
import Tema7.Tema7_II.Ejercicios.Pedidos.Pedido;
import Tema7.Tema7_II.Ejercicios.Pedidos.Producto;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class AnalizadorPartidas {
    static void main(String[] args) {
        List<Partida> partidas = new ArrayList<>();

        //Cargamos las 10 partidas
        partidas.add(new Partida(1, "Juan_Lopez", "CPU_Madrid", ModoJuego.PvP,
                "FC_Barcelona", 3, 1, "12min",
                LocalDateTime.of(2026, 4, 1, 19, 30), 120));

        partidas.add(new Partida(2, "Maria_Garcia", "Rafael_Torres", ModoJuego.Evento,
                "Real_Madrid", 2, 2, "20min",
                LocalDateTime.of(2026, 4, 2, 21, 15), 85));

        partidas.add(new Partida(3, "Carlos_Martin", "Equipo_IA", ModoJuego.Liga,
                "Atletico_Madrid", 1, 0, "12min",
                LocalDateTime.of(2026, 4, 3, 18, 45), 150));

        partidas.add(new Partida(4, "Laura_Sanchez", "CPU_Valencia", ModoJuego.PvP,
                "Valencia_CF", 4, 2, "15min",
                LocalDateTime.of(2026, 4, 4, 20, 0), 110));

        partidas.add(new Partida(5, "Pedro_Ruiz", "Miguel_Angel", ModoJuego.Evento,
                "Sevilla_FC", 1, 3, "18min",
                LocalDateTime.of(2026, 4, 5, 19, 10), 95));

        partidas.add(new Partida(6, "Ana_Torres", "CPU_Betis", ModoJuego.Liga,
                "Real_Betis", 2, 1, "12min",
                LocalDateTime.of(2026, 4, 6, 17, 30), 130));

        partidas.add(new Partida(7, "David_Gomez", "Sergio_Perez", ModoJuego.PvP,
                "Villarreal_CF", 0, 0, "10min",
                LocalDateTime.of(2026, 4, 7, 22, 0), 70));

        partidas.add(new Partida(8, "Elena_Fernandez", "CPU_Espanyol", ModoJuego.Evento,
                "Espanyol", 3, 2, "14min",
                LocalDateTime.of(2026, 4, 8, 18, 20), 105));

        partidas.add(new Partida(9, "Jorge_Diaz", "Luis_Moreno", ModoJuego.Liga,
                "Real_Sociedad", 1, 1, "16min",
                LocalDateTime.of(2026, 4, 9, 21, 45), 90));

        partidas.add(new Partida(10, "Sofia_Hernandez", "CPU_Getafe", ModoJuego.PvP,
                "Getafe_CF", 2, 0, "13min",
                LocalDateTime.of(2026, 4, 10, 19, 0), 115));


        IO.println("----------- Victorias del jugador ------------");
        /*Consulta 1: Victorias del jugador
         * Mostrar todas las partidas ganadas (golesLocal > golesVisitante).*/

        partidas.stream()
                .filter(p -> p.getGolesLocal() > p.getGolesVisitante())
                .forEach(IO::println);

        /* Consulta 2: Partidas por modo de juego
         * Contar cuantas partidas hay de cada modo (groupingBy).*/
        IO.println("----------- Partidas por modo de juego ------------");
        partidas.stream()
                .collect(Collectors.groupingBy(Partida::getModoJuego))
                .forEach((c,v) -> IO.println(c + ": " + v.stream().count()));

         /* Consulta 3: Goles totales marcados
          * Suma de todos los golesLocal. */
        IO.println("----------- Goles Locales totales marcados ------------");
        int totalGolesLocales = partidas.stream()
                .mapToInt(Partida::getGolesLocal)
                .sum();
        IO.println("Total de goles locales marcados: " + totalGolesLocales);

        /* Consulta 4: Mejor rival derrotado
         * Encontrar la partida ganada con más estrellasPartida */
        IO.println("----------- Mejor rival derrotado ------------");
        partidas.stream()
                .sorted(Comparator.comparing(Partida::getEstrellasGanadas).reversed())
                .limit(1)
                .forEach(System.out::println);

        /* Consulta 5: Media de estrellas por modo
         * Calcular averagingInt(estrellasGanadas) por modoJuego */
        IO.println("----------- Media de estrellas por modo ------------");
        Map<ModoJuego, Double> mediaEstrellas = partidas.stream()
                .collect(Collectors.groupingBy(
                        Partida::getModoJuego,
                        Collectors.averagingInt(Partida::getEstrellasGanadas)
                ));

        mediaEstrellas.forEach((c,v) ->
                IO.println("Modo Partida: " + c + ": " + v + " estrellas"));

        /* Consulta 6: Partidas de más de 20 minutos
         * Filtrar duracion que contenga "20min" o "30min" */


        /* Consulta 7: Equipos más usados
         * Los 5 equiposLocal con más apariciones */



        /* Consulta 8: Peor racha (3+ derrotas seguidas)
         * Partidas perdidas ordenadas por fecha (golesLocal < golesVisitante) */


        /* Consulta 9: Evolución mensual
         * Agrupar por mes de fecha y contar victorias */
    }

}
