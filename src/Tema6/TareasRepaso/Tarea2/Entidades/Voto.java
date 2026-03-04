package Tema6.TareasRepaso.Tarea2.Entidades;

import java.time.LocalDate;
import Tema6.TareasRepaso.Tarea2.Servicios.GrupoPlanes;

public class Voto implements Votable{

    /**
     * Atributos:
     * Long id — generado automáticamente con un contador estático
     * Participante participante
     * Plan plan
     * TipoVoto tipo
     * LocalDate fechaVoto
     * String comentario — opcional, puede ser null
     *
     * Constructores:
     * Constructor que reciba todos los atributos
     * Validación: un participante no puede votar con una fecha futura; lanzar IllegalArgumentException si ocurre
     *
     * Métodos:
     * Getters y setters
     * toString() con participante, plan, tipo de voto y fecha
     */


     private Long id;
     private static Long contadorIdVoto = 0L;
     private Participante participante;
     private Plan plan;
     private TipoVoto tipo;
     private LocalDate fechaVoto;
     private String comentario;

    public Voto(Participante participante, Plan plan, TipoVoto tipo, LocalDate fechaVoto, String comentario) {
        if (fechaVoto.isAfter(LocalDate.now())) {
            throw new IllegalArgumentException("La fecha no puede ser futura");
        }

        this.id = contadorIdVoto++;
        this.participante = participante;
        this.plan = plan;
        this.tipo = tipo;
        this.fechaVoto = fechaVoto;
        this.comentario = comentario;
    }

    public Long getId() {
        return id;
    }

    public static Long getContadorIdVoto() {
        return contadorIdVoto;
    }

    public Participante getParticipante() {
        return participante;
    }

    public void setParticipante(Participante participante) {
        this.participante = participante;
    }

    public Plan getPlan() {
        return plan;
    }

    public void setPlan(Plan plan) {
        this.plan = plan;
    }

    public TipoVoto getTipo() {
        return tipo;
    }

    public void setTipo(TipoVoto tipo) {
        this.tipo = tipo;
    }

    public LocalDate getFechaVoto() {
        return fechaVoto;
    }

    public void setFechaVoto(LocalDate fechaVoto) {
        this.fechaVoto = fechaVoto;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }


    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Voto{");
        sb.append("participante=").append(participante);
        sb.append(", plan=").append(plan);
        sb.append(", tipo=").append(tipo);
        sb.append(", fechaVoto=").append(fechaVoto);
        sb.append('}');
        return sb.toString();
    }


    @Override
    public String getResultadoVotacion() {
        return "";
    }
}
