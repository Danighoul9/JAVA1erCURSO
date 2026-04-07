package Tema7.Tema7_I.Practica1Tema7.Entities;

import lombok.*;

import java.time.LocalDate;
import java.util.HashSet;

@AllArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode(of = {"socio", "actividad", "fechaReserva"})
public class Reserva extends HashSet<Reserva> {

    private Socio socio;
    private Actividad actividad;
    private LocalDate fechaReserva;
    private Boolean asistio = false;

    public boolean confirmarAsistencia() {
        if (this.asistio == false) {
            this.asistio = true;
        }
        return asistio;
    }

    public boolean estaActiva(){
        if(fechaReserva.isAfter(LocalDate.now()) || fechaReserva.isEqual(LocalDate.now())) {
            return true;
        }else {
            return false;
        }
    }


}
