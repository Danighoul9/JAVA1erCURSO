package Tema7.Tema7_II.Ejercicios.eFootball;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;

@AllArgsConstructor
@Getter
@Setter
@ToString
public class Partida {
    private int id;
    private String jugador;
    private String rival;
    private ModoJuego modoJuego;      // "PvP", "IA", "Evento", "Liga"
    private String equipoLocal;
    private int golesLocal;
    private int golesVisitante;
    private String duracion;       // "12min", "20min", "30min"
    private LocalDateTime fecha;
    private int estrellasGanadas;

}
