# Práctica: Análisis de partidas eFootball

Vais a desarrollar una aplicación de consola para analizar el historial de partidas jugadas en eFootball 2026 durante la temporada. La plataforma guarda un fichero CSV con todas las partidas y necesita extraer estadísticas para mejorar el rendimiento de los jugadores. Usaréis la API de Streams de Java para realizar consultas sobre los datos cargados en memoria.
Objetivos didácticos

    Practicar filter, map, sorted, collect, groupingBy, counting, summingInt, averagingInt.
    Modelar datos reales de videojuegos en clases Java.
    Leer y procesar ficheros CSV simples.
    Presentar resultados de forma clara por consola.

Nivel: Intermedio (1º CFGS DAW)
Clases requeridas

## Crear estas 2 clases:

#### Clase Partida

```java
public class Partida {
private int id;
private String jugador;
private String rival;
private String modoJuego;      // "PvP", "IA", "Evento", "Liga"
private String equipoLocal;
private int golesLocal;
private int golesVisitante;
private String duracion;       // "12min", "20min", "30min"
private LocalDateTime fecha;
private int estrellasGanadas;
}
```

#### Clase AnalizadorPartidas

Contiene List<Partida> partidas y todos los métodos de consulta.
Datos de ejemplo: meter 10 partidas en la lista.

text
id,jugador,rival,modoJuego,equipoLocal,golesLocal,golesVisitante,duracion,fecha,estrellasGanadas
1,Juan_Lopez,CPU_Madrid,PvP,FC_Barcelona,3,1,12min,2026-04-01 19:30,120
2,Maria_Garcia,Rafael_Torres,Evento,Real_Madrid,2,2,20min,2026-04-02 21:15,85
3,Carlos_Martin,Equipo_IA,Liga,Atletico_Madrid,1,0,12min,2026-04-03 18:45,150

## Consultas STREAMS

#### Consulta 1: Victorias del jugador
Mostrar todas las partidas ganadas (golesLocal > golesVisitante).

#### Consulta 2: Partidas por modo de juego
Contar cuántas partidas hay de cada modo (groupingBy).

#### Consulta 3: Goles totales marcados
Suma de todos los golesLocal.

#### Consulta 4: Mejor rival derrotado
Encontrar la partida ganada con mas estrellasPartida con más estrellas.

#### Consulta 5: Media de estrellas por modo
Calcular averagingInt(estrellasGanadas) por modoJuego.

text
Estrellas medias por modo:
PvP:  112★
Liga: 98★
Evento: 85★

#### Consulta 6: Partidas de más de 20 minutos
Filtrar duracion que contenga "20min" o "30min".

#### Consulta 7: Equipos más usados

Los 5 equiposLocal con más apariciones.

text
Equipos más jugados:
FC_Barcelona → 12 veces
Real_Madrid → 9 veces
Manchester → 7 veces

#### Consulta 8: Peor racha (3+ derrotas seguidas)
Partidas perdidas ordenadas por fecha (golesLocal < golesVisitante).

#### Consulta 9: Evolución mensual
Agrupar por mes de fecha y contar victorias.

text
Victorias por mes:
Marzo 2026 → 8 victorias
Abril 2026 → 12 victorias