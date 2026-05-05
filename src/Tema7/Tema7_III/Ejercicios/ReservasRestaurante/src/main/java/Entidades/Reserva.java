package Entidades;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalTime;

@Getter
@Setter

public class Reserva {
    private static long contadorId = 1L;
    private long id;
    private Cliente cliente;
    private LocalDate fecha;
    private LocalTime hora;
    private int numPersonas;
    private double importePrevisto;
    private EstadoReserva estado;
    private String zonaprivate;

    public Reserva(Cliente cliente, LocalDate fecha,
                   LocalTime hora, int numPersonas, double importePrevisto, EstadoReserva estado, String zonaprivate) {
        this.id = contadorId++;
        this.cliente = cliente;
        this.fecha = fecha;
        this.hora = hora;
        this.numPersonas = numPersonas;
        this.importePrevisto = importePrevisto;
        this.estado = estado;
        this.zonaprivate = zonaprivate;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("|| ID: ");
        sb.append(id);
        sb.append("| ").append(cliente.getDni());
        sb.append("| ").append(fecha).append(" ").append(hora);
        sb.append("| ").append(numPersonas);
        sb.append("| ").append(importePrevisto + "€");
        sb.append("| ").append(estado);
        sb.append("| ").append(zonaprivate + " ||").append('\n');
        return sb.toString();
    }
}
