package Tema5.TareasTema5.GestorDeTareas.Modelos;

public interface Tarea {

    /**
     * Una interfaz son los metodos que queremos implementar
     */

    void ejecutar();
    PrioridadTarea getPrioridad();
    EstadoTarea getEstado();
    String getDescripcion();
    String getTipo();
    void mostrarDetalle();




}
