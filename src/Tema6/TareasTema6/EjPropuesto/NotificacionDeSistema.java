package Tema6.TareasTema6.EjPropuesto;

import java.time.LocalDateTime;

public class NotificacionDeSistema extends Notificacion{

    enum TipoAlerta{
        INFO,
        ERROR,
        SUCCESS
    }

    private boolean requiereAccion;
    private TipoAlerta tipo;

    public NotificacionDeSistema(String titulo, String mensaje, String usuario,
                                 LocalDateTime fecha,TipoAlerta tipo, boolean leida, boolean requiereAccion) {
        super(titulo, mensaje, usuario, fecha, leida);
        this.tipo = tipo;
        this.requiereAccion = requiereAccion;
    }

    public NotificacionDeSistema(NotificacionDeSistema otro) {
        super(otro);
        this.tipo = otro.tipo;
        this.requiereAccion = otro.requiereAccion;
    }

    @Override
    public void enviar() {
        if(requiereAccion){
            IO.println("Alerta del sistema(ACCION NO REQUERIDA) " + tipo + " -> " + mensaje);
        }
    }

    @Override
    public String getIcono() {
        String icono = "";
        switch (tipo) {
            case INFO -> icono = "\u2139\uFE0F";
            case ERROR -> icono = "\u274C";
            case SUCCESS -> icono = "\u2705";
        }
        return "";
    }

    @Override
    public int getPrioridad() {
        if (tipo == TipoAlerta.ERROR) return 4;
        return 2;
    }


}
