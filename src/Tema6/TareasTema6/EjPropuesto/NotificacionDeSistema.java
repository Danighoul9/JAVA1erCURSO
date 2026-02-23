package Tema6.TareasTema6.EjPropuesto;

import java.time.LocalDateTime;

public class NotificacionDeSistema extends Notificacion{

    private TipoAlerta tipo;
    private boolean requiereAccion;

    public NotificacionDeSistema(String titulo, String mensaje, String destinatario,
                                 TipoAlerta tipo, boolean requiereAccion) {
        super(titulo, mensaje, destinatario);
        this.tipo = tipo;
        this.requiereAccion = requiereAccion;
    }

    public TipoAlerta getTipo() {
        return tipo;
    }

    public void setTipo(TipoAlerta tipo) {
        this.tipo = tipo;
    }

    public boolean isRequiereAccion() {
        return requiereAccion;
    }

    public void setRequiereAccion(boolean requiereAccion) {
        this.requiereAccion = requiereAccion;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("NotificacionDeSistema{");
        sb.append("titulo='").append(titulo).append('\'');
        sb.append(", mensaje='").append(mensaje).append('\'');
        sb.append(", destinatario='").append(destinatario).append('\'');
        sb.append(", fecha=").append(fecha);
        sb.append(", leida=").append(leida);
        sb.append(", tipo=").append(tipo);
        sb.append(", requiereAccion=").append(requiereAccion);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public void enviar() {
        if (requiereAccion) {
            IO.println("Alerta del sistema (ACCION) " + tipo + " -> " + mensaje);
        } else {
            IO.println("Alerta del sistema (ACCION NO REQUERIDA) " + tipo + " -> " + mensaje);
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
    public Integer getPrioridad() {
        if (tipo == TipoAlerta.ERROR) return 4;
        return 2;
    }
}
