package Tema6.TareasTema6.EjercicioFechas.Entidades;

import java.time.Duration;
import java.time.LocalDateTime;

public class Examen {
    private String nombre;
    private LocalDateTime fechaHora;

    public Examen(String nombre, LocalDateTime fechaHora) {
        this.nombre = nombre;
        this.fechaHora = fechaHora;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDateTime getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(LocalDateTime fechaHora) {
        this.fechaHora = fechaHora;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Examen{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", fechaHora=").append(fechaHora);
        sb.append('}');
        return sb.toString();
    }

    /**
     * MÉTODOS DE LA CLASE -----------------------------------------------
     */

    /**
     * Devuelve cuánto tiempo falta para el examen o ha pasado desde el examen.
     * @return Duration (positivo si ha pasado, negativo si falta)
     */
    public Duration tiempoRelativo() {
        return Duration.between(fechaHora, LocalDateTime.now());
    }

    /**
     * Indica si el examen ya ha pasado.
     * @return boolean
     */
    public boolean haPasado() {
        return LocalDateTime.now().isAfter(fechaHora);
    }

    /**
     * Devuelve el tiempo que ha pasado del examen, si ya ha pasado.
     * Si no ha pasado aún, devuelve Duration.ZERO.
     * @return Duration
     */
    public Duration tiempoPasado() {
        if (haPasado())
            return Duration.between(fechaHora, LocalDateTime.now());
        else
            return Duration.ZERO;
    }
}