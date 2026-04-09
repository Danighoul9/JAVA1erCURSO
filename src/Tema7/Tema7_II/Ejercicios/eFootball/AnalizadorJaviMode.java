package Tema7.Tema7_II.Ejercicios.eFootball;


/**
 *
public class AnalizadorPartidasJaviMode {
    private List<Partida> partidas;

    public AnalizadorPartidas() {
        this.partidas = new ArrayList<>();
        cargarDatosEjemplo();
    }

    private void cargarDatosEjemplo() {
        // Datos de ejemplo basados en el CSV
        partidas.add(new Partida(1, "Juan_Lopez", "CPU_Madrid", "PvP", "FC_Barcelona", 3, 1, "12min", LocalDateTime.parse("2026-04-01T19:30"), 120));
        partidas.add(new Partida(2, "Maria_Garcia", "Rafael_Torres", "Evento", "Real_Madrid", 2, 2, "20min", LocalDateTime.parse("2026-04-02T21:15"), 85));
        partidas.add(new Partida(3, "Carlos_Martin", "Equipo_IA", "Liga", "Atletico_Madrid", 1, 0, "12min", LocalDateTime.parse("2026-04-03T18:45"), 150));
        partidas.add(new Partida(4, "Juan_Lopez", "PSG", "PvP", "FC_Barcelona", 4, 2, "30min", LocalDateTime.parse("2026-04-04T20:00"), 180));
        partidas.add(new Partida(5, "Maria_Garcia", "CPU_Madrid", "IA", "Real_Madrid", 0, 1, "12min", LocalDateTime.parse("2026-04-05T19:00"), 50));
        partidas.add(new Partida(6, "Carlos_Martin", "Rafael_Torres", "Evento", "Atletico_Madrid", 2, 0, "20min", LocalDateTime.parse("2026-04-06T21:30"), 95));
        partidas.add(new Partida(7, "Juan_Lopez", "Equipo_IA", "Liga", "Manchester", 1, 2, "12min", LocalDateTime.parse("2026-04-07T18:00"), 70));
        partidas.add(new Partida(8, "Maria_Garcia", "PSG", "PvP", "Real_Madrid", 3, 1, "30min", LocalDateTime.parse("2026-04-08T20:15"), 140));
        partidas.add(new Partida(9, "Carlos_Martin", "CPU_Madrid", "IA", "Atletico_Madrid", 0, 3, "12min", LocalDateTime.parse("2026-04-09T19:45"), 30));
        partidas.add(new Partida(10, "Juan_Lopez", "Rafael_Torres", "Evento", "FC_Barcelona", 2, 1, "20min", LocalDateTime.parse("2026-04-10T21:00"), 110));
        partidas.add(new Partida(10, "Juan_Lopez", "Rafael_Torres", "Evento", "FC_Barcelona", 2, 1, "20min", LocalDateTime.parse("2026-05-10T21:00"), 110));
    }

    // Consulta 1: Victorias del jugador
    public List<Partida> obtenerVictorias() {
        return partidas.stream()
                .filter(p -> p.getGolesLocal() > p.getGolesVisitante())
                .collect(Collectors.toList()); //.toList()
    }

    // Consulta 2: Partidas por modo de juego
    public Map<String, Long> contarPartidasPorModo() {
        return partidas.stream()
                .collect(Collectors.groupingBy(Partida::getModoJuego, Collectors.counting()));
    }

    // Consulta 3: Goles totales marcados
    public int sumarGolesTotales() {
        return partidas.stream()
                //.mapToInt(Partida::getGolesLocal)
                .mapToInt(p -> p.getGolesLocal() + p.getGolesVisitante())
                .sum();
    }

    // Consulta 4: Partida ganadora con más estrellas
    public Optional<Partida> mejorVictoria() {
        return partidas.stream()
                .filter(p -> p.getGolesLocal() > p.getGolesVisitante())
                .max(Comparator.comparingInt(Partida::getEstrellasGanadas));
    }

    // Consulta 5: Media de estrellas por modo
    public Map<String, Double> mediaEstrellasPorModo() {
        return partidas.stream()
                .collect(Collectors.groupingBy(Partida::getModoJuego,
                        Collectors.averagingInt(Partida::getEstrellasGanadas)));
    }

    // Consulta 6: Partidas de más de 20 minutos
    public List<Partida> partidasMasDe20Min() {
        return partidas.stream()
                .map(p -> {
                    p.setDuracion(p.getDuracion().replace("min", ""));
                    return p;
                })
                .filter(p -> Integer.parseInt(p.getDuracion()) > 20 )
                .collect(Collectors.toList());
    }

    // Consulta 7: Equipos más usados
    public List<Map.Entry<String, Long>> equiposMasUsados() {
        Map<String, Long> count = partidas.stream()
                .collect(Collectors.groupingBy(Partida::getEquipoLocal, Collectors.counting()));
        return count.entrySet().stream()
                .sorted(Map.Entry.<String, Long>comparingByValue().reversed())
                .limit(5)
                .collect(Collectors.toList());
    }

    // Consulta 8: Peor racha (3+ derrotas seguidas)
    public List<Partida> derrotasOrdenadasPorFecha() {
        return partidas.stream()
                .filter(p -> p.getGolesLocal() < p.getGolesVisitante())
                .sorted(Comparator.comparing(Partida::getFecha))
                .collect(Collectors.toList());
    }

    // Consulta 9: Evolución mensual
    public Map<String, Long> victoriasPorMes() {
        return partidas.stream()
                .filter(p -> p.getGolesLocal() > p.getGolesVisitante())
                .collect(Collectors.groupingBy(
                        p -> p.getFecha().getMonth().toString(),
                        Collectors.counting()));
    }

    public static void main(String[] args) {
        AnalizadorPartidas analizador = new AnalizadorPartidas();

        System.out.println("=== Consulta 1: Victorias del jugador ===");
        analizador.obtenerVictorias().forEach(System.out::println);

        System.out.println("\n=== Consulta 2: Partidas por modo de juego ===");
        analizador.contarPartidasPorModo().forEach((modo, count) -> System.out.println(modo + ": " + count));

        System.out.println("\n=== Consulta 3: Goles totales marcados ===");
        System.out.println(analizador.sumarGolesTotales());

        System.out.println("\n=== Consulta 4: Mejor rival derrotado ===");
        analizador.mejorVictoria().ifPresent(partida ->
                System.out.println("vs " + partida.getRival() + ": " + partida.getGolesLocal() + "-" + partida.getGolesVisitante() + " (" + partida.getEstrellasGanadas() + "★)"));

        System.out.println("\n=== Consulta 5: Media de estrellas por modo ===");
        analizador.mediaEstrellasPorModo().forEach((modo, avg) -> System.out.println(modo + ": " + String.format("%.0f", avg) + "★"));

        System.out.println("\n=== Consulta 6: Partidas de más de 20 minutos ===");
        analizador.partidasMasDe20Min().forEach(System.out::println);

        System.out.println("\n=== Consulta 7: Equipos más usados ===");
        analizador.equiposMasUsados().forEach(entry -> System.out.println(entry.getKey() + " → " + entry.getValue() + " veces"));

        System.out.println("\n=== Consulta 8: Peor racha (derrotas ordenadas por fecha) ===");
        analizador.derrotasOrdenadasPorFecha().forEach(System.out::println);

        System.out.println("\n=== Consulta 9: Evolución mensual ===");
        analizador.victoriasPorMes().forEach((mes, count) -> System.out.println(mes + " → " + count + " victorias"));
    }

 */
