package Tema6.TareasRepaso.Tarea2.Entidades;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.Objects;
import java.util.UUID;

public abstract class Plan {


    /**
     * Atributos:
     * Long id — generado automáticamente con un contador estático
     * String titulo
     * String descripcion
     * CategoriaPlan categoria
     * LocalDate fechaPropuesta — fecha en que se propuso el plan
     * LocalDate fechaRealizacion — fecha prevista para realizarlo
     * double presupuestoEstimado
     * EstadoPlan estado — se inicializa a ABIERTO por defecto
     * Participante proponente — quien propuso el plan
     *
     * Constructores:
     * Constructor que reciba todos los atributos excepto id y estado
     * Validación: si fechaRealizacion es anterior a fechaPropuesta, lanzar IllegalArgumentException
     *
     * Métodos:
     * Getters y setters
     * toString() con la información relevante
     * Sobrescribir equals() y hashCode() basándose en id
     * int getDiasHastaRealizacion() : días que quedan desde hoy hasta fechaRealizacion (puede ser negativo si ya pasó)
     * Método abstracto: String getResumenEconomico() — devuelve un texto con el desglose económico del plan
     */


     protected Long id;
     private static Long contadorId = 0L;
     protected String titulo;
     protected String descripcion;
     protected CategoriaPlan categoria;
     protected LocalDate fechaPropuesta;
     protected LocalDate fechaRealizacion;
     protected double presupuestoEstimado;
     protected EstadoPlan estado;
     protected Participante participante;

    public Plan(String titulo, String descripcion, CategoriaPlan categoria,
                LocalDate fechaPropuesta, LocalDate fechaRealizacion,
                double presupuestoEstimado,Participante participante) {
        this.id = contadorId++;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.categoria = categoria;
        this.fechaPropuesta = fechaPropuesta;
        this.fechaRealizacion = fechaRealizacion;
            if (fechaRealizacion.isBefore(fechaPropuesta)){
                throw new IllegalArgumentException("La fecha de realización no puede ser anterior a la fecha propuesta");
            }

        this.presupuestoEstimado = presupuestoEstimado;
        this.estado = EstadoPlan.ABIERTO;
        this.participante = participante;
    }

    public Long getId() {
        return id;
    }


    public Long getContadorId() {
        return contadorId;
    }


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public CategoriaPlan getCategoria() {
        return categoria;
    }

    public void setCategoria(CategoriaPlan categoria) {
        this.categoria = categoria;
    }

    public LocalDate getFechaPropuesta() {
        return fechaPropuesta;
    }

    public void setFechaPropuesta(LocalDate fechaPropuesta) {
        this.fechaPropuesta = fechaPropuesta;
    }

    public LocalDate getFechaRealizacion() {
        return fechaRealizacion;
    }

    public void setFechaRealizacion(LocalDate fechaRealizacion) {
        this.fechaRealizacion = fechaRealizacion;
    }

    public double getPresupuestoEstimado() {
        return presupuestoEstimado;
    }

    public void setPresupuestoEstimado(double presupuestoEstimado) {
        this.presupuestoEstimado = presupuestoEstimado;
    }

    public EstadoPlan getEstado() {
        return estado;
    }

    public void setEstado(EstadoPlan estado) {
        this.estado = estado;
    }

    public Participante getParticipante() {
        return participante;
    }

    public void setParticipante(Participante participante) {
        this.participante = participante;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("--- Plan ---");
        sb.append("Id=").append(id);
        sb.append("\n Titulo='").append(titulo).append('\'');
        sb.append("\n Descripcion='").append(descripcion).append('\'');
        sb.append("\n Categoria=").append(categoria);
        sb.append("\n PresupuestoEstimado=").append(presupuestoEstimado);
        sb.append("\n Estado=").append(estado);
        sb.append('}');
        return sb.toString();
    }


    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Plan plan = (Plan) o;
        return Objects.equals(id, plan.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }


    /**
     * Días que quedan desde hoy hasta fechaRealizacion (puede ser negativo si ya pasó)
     * @return
     */
    public int getDiasHastaRealizacion(){
        return (int) ChronoUnit.DAYS.between(LocalDate.now(), fechaRealizacion);
    }


    /**
     * Devuelve un texto con el desglose económico del plan (Abstracto)
     * @return
     */
    public abstract String getResumenEconomico();
}
