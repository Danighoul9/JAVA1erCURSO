package Tema6.TareasTema6.EjPropuesto;

import java.time.LocalDateTime;

public class NotificacionEmail extends Notificacion{

    private String remitente;
    private boolean tieneAdjuntos;

    public NotificacionEmail(String titulo, String mensaje, String destinatario,
                             String remitente, boolean tieneAdjuntos) {
        super(titulo, mensaje, destinatario);
        this.remitente = remitente;
        this.tieneAdjuntos = tieneAdjuntos;
    }

    public String getRemitente() {
        return remitente;
    }

    public void setRemitente(String remitente) {
        this.remitente = remitente;
    }

    public boolean isTieneAdjuntos() {
        return tieneAdjuntos;
    }

    public void setTieneAdjuntos(boolean tieneAdjuntos) {
        this.tieneAdjuntos = tieneAdjuntos;
    }


    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("NotificacionEmail{");
        sb.append("titulo='").append(titulo).append('\'');
        sb.append(", mensaje='").append(mensaje).append('\'');
        sb.append(", destinatario='").append(destinatario).append('\'');
        sb.append(", fecha=").append(fecha);
        sb.append(", leida=").append(leida);
        sb.append(", remitente='").append(remitente).append('\'');
        sb.append(", tieneAdjuntos=").append(tieneAdjuntos);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public void enviar() {
        IO.println("Email De: " + remitente);
        IO.println("To " + destinatario);
        IO.println("Asunto: " + titulo);
        IO.println("Mensaje: " + mensaje);
    }

    @Override
    public String getIcono() {
        return "\uD83D\uDCE7";
    }

    @Override
    public Integer getPrioridad() {
        return tieneAdjuntos ? 2 : 1;
    }

}
