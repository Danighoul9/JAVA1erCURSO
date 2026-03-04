package Tema6.TareasRepaso.Tarea2.Entidades;

import java.time.LocalDate;

public class PlanEstandar extends Plan{

    /**
     * Implementa PlanEstandar, que extiende de Plan:
     *
     * Atributos adicionales:
     * int numMaxParticipantes
     * boolean incluyeAlojamiento
     *
     * Constructores:
     * Constructor con todos los parámetros necesarios, llamando al padre
     *
     * Métodos:
     * Getters, setters y toString()
     * Implementa getResumenEconomico(): devuelve un texto indicando el presupuesto
     * total y el coste por persona (presupuestoEstimado / numMaxParticipantes).
     *
     * Si incluye alojamiento, añade la nota "(alojamiento incluido)".
     */


    private Integer numMaxParticipantes;
    private boolean incluyeAlojamiento;

    public PlanEstandar(String titulo, String descripcion, CategoriaPlan categoria,
                        LocalDate fechaPropuesta, LocalDate fechaRealizacion,
                        double presupuestoEstimado, Participante participante,
                        Integer numMaxParticipantes, boolean incluyeAlojamiento) {
        super(titulo, descripcion, categoria, fechaPropuesta, fechaRealizacion, presupuestoEstimado, participante);
        this.numMaxParticipantes = numMaxParticipantes;
        this.incluyeAlojamiento = incluyeAlojamiento;
    }

    public Integer getNumMaxParticipantes() {
        return numMaxParticipantes;
    }

    public void setNumMaxParticipantes(Integer numMaxParticipantes) {
        this.numMaxParticipantes = numMaxParticipantes;
    }

    public boolean isIncluyeAlojamiento() {
        return incluyeAlojamiento;
    }

    public void setIncluyeAlojamiento(boolean incluyeAlojamiento) {
        this.incluyeAlojamiento = incluyeAlojamiento;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("PlanEstandar{");
        sb.append("numMaxParticipantes=").append(numMaxParticipantes);
        sb.append(", incluyeAlojamiento=").append(incluyeAlojamiento);
        sb.append(", id=").append(id);
        sb.append(", titulo='").append(titulo).append('\'');
        sb.append(", descripcion='").append(descripcion).append('\'');
        sb.append(", categoria=").append(categoria);
        sb.append(", fechaPropuesta=").append(fechaPropuesta);
        sb.append(", fechaRealizacion=").append(fechaRealizacion);
        sb.append(", presupuestoEstimado=").append(presupuestoEstimado);
        sb.append(", estado=").append(estado);
        sb.append(", participante=").append(participante);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public String getResumenEconomico() {
        final StringBuffer sb = new StringBuffer("--- PRESUPUESTO VIAJE *ESTANDAR* ---");
        sb.append("\n Presupuesto total: ").append(presupuestoEstimado).append("€");
        sb.append("\n Coste por persona: ").append(presupuestoEstimado / numMaxParticipantes).append("€");
        if (incluyeAlojamiento){
            sb.append("\n Alojamiento Incluido");
        }
        return sb.toString();
    }
}
