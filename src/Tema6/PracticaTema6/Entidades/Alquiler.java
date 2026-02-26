package Tema6.PracticaTema6.Entidades;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Alquiler implements Enviable {

    private static long contadorId = 0L;

    private Long id;
    private Cliente cliente;
    private Coche coche;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private Double precioTotal;

    public Alquiler(Cliente cliente, Coche coche, LocalDate fechaInicio, LocalDate fechaFin) {
        if (coche == null) {
            throw new IllegalArgumentException("El coche no puede ser nulo");
        }
        if (!coche.isDisponible()) {
            throw new IllegalStateException("El coche no está disponible para alquilar");
        }
        if (fechaInicio == null || fechaFin == null) {
            throw new IllegalArgumentException("Las fechas no pueden ser nulas");
        }
        if (!fechaInicio.isBefore(fechaFin)) {
            throw new IllegalArgumentException("La fecha de inicio debe ser anterior a la fecha de fin");
        }

        long dias = ChronoUnit.DAYS.between(fechaInicio, fechaFin);
        if (dias <= 0) {
            throw new IllegalArgumentException("El número de días de alquiler debe ser positivo");
        }

        this.id = ++contadorId;
        this.cliente = cliente;
        this.coche = coche;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.precioTotal = coche.calcularPrecioAlquiler((int) dias);

        coche.setDisponible(false);
    }

    public Long getId() {
        return id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Coche getCoche() {
        return coche;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public Double getPrecioTotal() {
        return precioTotal;
    }

    public void cancelarAlquiler() {
        if (coche != null) {
            coche.setDisponible(true);
        }
    }

    @Override
    public String crearEmail() {
        StringBuilder sb = new StringBuilder();
        sb.append("Resumen de su alquiler:\n");
        sb.append("Cliente: ").append(cliente.getNombre()).append(" ").append(cliente.getApellidos()).append("\n");
        sb.append("Coche: ").append(coche.getMarca()).append(" ").append(coche.getModelo())
                .append(" - Matrícula: ").append(coche.getMatricula()).append("\n");
        sb.append("Fecha inicio: ").append(fechaInicio).append("\n");
        sb.append("Fecha fin: ").append(fechaFin).append("\n");
        sb.append("Precio total: ").append(precioTotal).append(" €\n");
        return sb.toString();
    }

    @Override
    public String toString() {
        return "Alquiler{" +
                "id=" + id +
                ", cliente=" + cliente +
                ", coche=" + coche +
                ", fechaInicio=" + fechaInicio +
                ", fechaFin=" + fechaFin +
                ", precioTotal=" + precioTotal +
                '}';
    }
}

