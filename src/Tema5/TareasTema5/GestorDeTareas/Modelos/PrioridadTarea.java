package Tema5.TareasTema5.GestorDeTareas.Modelos;

public enum PrioridadTarea {
    BAJA(1),
    MEDIA(2),
    ALTA(3),
    URGENTE(4);


    private int prioridad;

    PrioridadTarea(int valor) {
        this.prioridad = valor;
    }

    public int getValor(){
        return prioridad;
    }

}
