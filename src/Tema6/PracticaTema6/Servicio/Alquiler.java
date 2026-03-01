package Tema6.PracticaTema6.Servicio;

import Tema6.PracticaTema6.Entidades.Cliente;
import Tema6.PracticaTema6.Entidades.Coche;
import Tema6.PracticaTema6.Entidades.Enviable;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Alquiler implements Enviable {

    private static long contadorId = 1L;

    private Long id;
    private Cliente cliente;
    private Coche coche;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private Double precioTotal;

    public Alquiler(Cliente cliente, Coche coche, LocalDate fechaInicio, LocalDate fechaFin) {

        if (!coche.isDisponible()) {
            throw new IllegalStateException("El coche no está disponible para alquilar");
        }else {
            this.id = contadorId++;
            long dias = ChronoUnit.DAYS.between(fechaInicio, fechaFin);
            this.cliente = cliente;
            this.coche = coche;
            this.fechaInicio = fechaInicio;
            this.fechaFin = fechaFin;
            this.precioTotal = coche.calcularPrecioAlquiler((int) dias);

            coche.setDisponible(false);
        }
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

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Alquiler{");
        sb.append("id=").append(id);
        sb.append(", cliente=").append(cliente);
        sb.append(", coche=").append(coche);
        sb.append(", fechaInicio=").append(fechaInicio);
        sb.append(", fechaFin=").append(fechaFin);
        sb.append(", precioTotal=").append(precioTotal);
        sb.append('}');
        return sb.toString();
    }

    public void cancelarAlquiler() {
        if (coche != null) {
            coche.setDisponible(true);
        }
    }


    @Override
    public String crearEmail() {
        StringBuilder sb = new StringBuilder();

        // Saludo personalizado
        sb.append("Hola, ").append(cliente.getNombre()).append(":\n\n");

        // Cuerpo del mensaje sobre el alquiler qu ha relizado el cliente
        sb.append("Espero que estés muy bien. Te escribo para confirmarte que ya hemos gestionado ");
        sb.append("el alquiler del ").append(coche.getMarca()).append(" ").append(coche.getModelo());
        sb.append(" (con matrícula ").append(coche.getMatricula()).append(").\n\n");

        sb.append("Me paso por aquí para recordarte que podrás disfrutar del coche desde el ");
        sb.append(fechaInicio).append(" hasta el ").append(fechaFin).append(".\n");

        // Le adjuntmos el importe del alquierl
        sb.append("El importe total de la reserva es de ").append(precioTotal).append(" €.\n\n");

        // Despedida cercana
        sb.append("Si necesitas cualquier cosa o tienes alguna duda con el vehículo, ");
        sb.append("no dudes en responderme a este correo.\n\n");
        sb.append("¡Que disfrutes mucho del viaje!\n\n");
        sb.append("Un saludo,\n");
        sb.append("El equipo de la Agencia.");

        return sb.toString();
    }

}

