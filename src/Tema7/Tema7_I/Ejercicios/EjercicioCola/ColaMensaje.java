package Tema7.Tema7_I.Ejercicios.EjercicioCola;

import java.util.ArrayList;
import java.util.List;

public class ColaMensaje<T extends Notificable> {

    private List<T> mensajes = new ArrayList<>();

    public List<T> getMensajes() {
        return mensajes;
    }

    /**
     * Añadimos al final de la cola
     * @param mensaje
     */
    public void insertar(T mensaje) {
        mensajes.addLast(mensaje);
    }

    /**
     * Sacamos del principio de la cola
     * @return
     */
    public T sacar() {
        return mensajes.removeFirst();
    }

    /**
     * Pintamos todos los mensajes
     */
    public void pintar() {
        for(T t : mensajes) {
            t.notificar();
        }
    }
}