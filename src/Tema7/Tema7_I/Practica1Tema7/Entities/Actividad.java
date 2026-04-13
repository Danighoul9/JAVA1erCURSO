package Tema7.Tema7_I.Practica1Tema7.Entities;

import lombok.*;
import org.jetbrains.annotations.NotNull;

import java.time.LocalTime;
import java.util.Comparator;

@AllArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode(of = "codigo")

public class Actividad implements Comparable<Actividad> {

    private String codigo;
    private String nombre;
    private String descripcion;
    private diaSemana diaSemana;
    private LocalTime horaInicio;
    private Integer duracionMinutos;
    private Integer aforoMaximo;
    private String monitor;


    @Override
    public int compareTo(@NotNull Actividad actividad) {
        return Comparator.comparing(Actividad::getDiaSemana)
                .thenComparing(Actividad::getHoraInicio)
                .compare(this, actividad);
    }
}
