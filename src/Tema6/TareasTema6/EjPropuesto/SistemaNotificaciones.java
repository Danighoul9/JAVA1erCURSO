package Tema6.TareasTema6.EjPropuesto;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SistemaNotificaciones {
    private final List<Notificacion> notificaciones = new ArrayList<>();

    public List<Notificacion> getNotificaciones() {
        return notificaciones;
    }

    public void addNotificacion(Notificacion notificacion){
        notificaciones.add(notificacion);
    }

    public void deleteNotificacion(Notificacion notificacion){
        notificaciones.remove(notificacion);
    }

    public void enviarTodas() {
        for(Notificacion n: notificaciones) {
            n.enviar();
        }
    }

    public void pintarResumen() {
        for(Notificacion n: notificaciones) {
            n.pintarResumen();
        }
    }

    public void pintarPorPrioridad() {
        List<Notificacion> nOrdPrioridad = new ArrayList<>(notificaciones);
        nOrdPrioridad.sort(Comparator.comparing(Notificacion::getPrioridad));
        for(Notificacion n: nOrdPrioridad) {
            n.pintarResumen();
        }
    }

    public void pintarLeidas() {
        for(Notificacion n: notificaciones) {
            if (n.isLeida())
                n.pintarResumen();
        }
    }

    public Integer getNumeroNotificacionesNoLeidas() {
        int contador=0;
        for(Notificacion n: notificaciones) {
            if (!n.isLeida())
                contador++;
        }
        return contador;
    }
}
