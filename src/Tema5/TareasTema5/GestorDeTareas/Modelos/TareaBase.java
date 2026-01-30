package Tema5.TareasTema5.GestorDeTareas.Modelos;

import java.time.LocalDate;

/**
 * Clase abstracta ( nose pueden crear objetos de esta clase)
 * Va a ser el padre de una herencia ---> TareaUrgente y TareProgramada seran sus hijas
 * Iplementa interfaz tareas
 */
public abstract class TareaBase implements Tarea{

    //Contador de tareas comun a todas las instancias
    private static Integer contadorId = 1;

    protected Integer id;
    protected String titulo;
    protected String descripcion;
    protected PrioridadTarea prioridad;
    protected EstadoTarea estado;
    protected LocalDate fechaCreacion;
    protected LocalDate fechaCompletada;


    //Constructor
    public TareaBase(String titulo, String descripcion, PrioridadTarea prioridad) {
        this.id = TareaBase.contadorId++;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.prioridad = prioridad;
        this.estado = EstadoTarea.PENDIENTE;
        this.fechaCreacion = LocalDate.now();
        this.fechaCompletada = null;
    }

    //Getters y Setters
    public static Integer getContadorId() {
        return contadorId;
    }


    public Integer getId() {
        return id;
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

    public PrioridadTarea getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(PrioridadTarea prioridad) {
        this.prioridad = prioridad;
    }

    public EstadoTarea getEstado() {
        return estado;
    }


    public LocalDate getFechaCompletada() {
        return fechaCompletada;
    }


    public LocalDate getFechaCreacion() {
        return fechaCreacion;
    }

    //ToString()
    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("TareaBase{");
        sb.append("id=").append(id);
        sb.append(", titulo='").append(titulo).append('\'');
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

    /**
     * Cambiar estado de la tarea a COMPLETADA
     * Y pone la fecha del momento en fechaCompletada
     */
    public void ejecutar(){
        this.estado = EstadoTarea.COMPLETADA;
        this.fechaCompletada = LocalDate.now();
    }

    /**
     * Modifica el estado de la tarea
     * @param estado nuevo de la tarea
     */
    public void cambiarEstado(EstadoTarea estado) {
        this.estado = estado;
    }


    @Override
    public abstract String getTipo();

    @Override
    public void mostrarDetalle() {
        //Coge el objeto y lo convierte automaticamente a String
        //lamando a toString, luego pinta ese String
        IO.println(this);
    }







}
