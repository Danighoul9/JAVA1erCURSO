package Tema6.TareasTema6.EjPropuesto;

import java.time.LocalDateTime;

public class NotificacionDeSistema extends Notificacion{

    enum TipoAlerta{
        INFO,
        ERROR,
        SUCCESS
    }

    private boolean requiereAccion;

    public NotificacionDeSistema(String titulo, String mensaje, String usuario,
                                 LocalDateTime fecha, boolean leida, boolean requiereAccion) {
        super(titulo, mensaje, usuario, fecha, leida);
        this.requiereAccion = requiereAccion;
    }

    public NotificacionDeSistema(NotificacionDeSistema otro) {
        super(otro);
        this.requiereAccion = otro.requiereAccion;
    }

    @Override
    public void enviar() {

    }

    @Override
    public String getIcono() {
        return "";
    }

    @Override
    public int getPrioridad() {
        return 0;
    }


}
