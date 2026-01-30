package Tema5.TareasTema5.GestorDeTareas.Modelos;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;

public class TareaProgramada extends TareaBase{

    private LocalDate fechaProgramada;
    private LocalTime horaProgramada;

    public TareaProgramada(String titulo, String descripcion, PrioridadTarea prioridad, LocalDate fechaProgramada, LocalTime horaProgramada) {
        super(titulo, descripcion, prioridad);
        this.fechaProgramada = fechaProgramada;
        this.horaProgramada = horaProgramada;
    }


    //GETTERS
    public LocalDate getFechaProgramada() {
        return fechaProgramada;
    }

    public LocalTime getHoraProgramada() {
        return horaProgramada;
    }

    //SETTERS
    public void setFechaProgramada(LocalDate fechaProgramada) {
        this.fechaProgramada = fechaProgramada;
    }

    public void setHoraProgramada(LocalTime horaProgramada) {
        this.horaProgramada = horaProgramada;
    }

    @Override
    public String getTipo() {
        return "PROGRAMADA";
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("TareaProgramada{");
        sb.append("titulo='").append(titulo).append('\'');
        sb.append(", fechaProgramada=").append(fechaProgramada);
        sb.append(", horaProgramada=").append(horaProgramada);
        sb.append(", id=").append(id);
        sb.append(", descripcion='").append(descripcion).append('\'');
        sb.append(", prioridad=").append(prioridad);
        sb.append(", estado=").append(estado);
        sb.append(", fechaCreacion=").append(fechaCreacion);
        sb.append(", fechaCompletada=").append(fechaCompletada);
        sb.append('}');
        return sb.toString();
    }


    /**
     * Metodos propios
     */
    public Integer obtenerDiasSemana(){
        //Calcular los dias entre la fecha de hoy y la fecha programad
        return Period.between(LocalDate.now(),fechaProgramada).getDays();
    }
}
