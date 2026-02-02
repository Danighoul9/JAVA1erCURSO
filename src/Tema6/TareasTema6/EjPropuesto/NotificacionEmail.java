package Tema6.TareasTema6.EjPropuesto;

import java.time.LocalDateTime;

public class NotificacionEmail extends Notificacion{

    private String remitente;
    private boolean tieneAdjuntos;

    public NotificacionEmail(String titulo, String mensaje, String usuario, LocalDateTime fecha, boolean leida, String remitente, boolean tieneAdjuntos) {
        super(titulo, mensaje, usuario, fecha, leida);
        this.remitente = remitente;
        this.tieneAdjuntos = tieneAdjuntos;
    }

    //Cc
    public NotificacionEmail(NotificacionEmail otro) {
        super(otro);
        this.remitente = otro.remitente;
        this.tieneAdjuntos = otro.tieneAdjuntos;
    }

    public String getRemitente() {
        return remitente;
    }

    public boolean isTieneAdjuntos() {
        return tieneAdjuntos;
    }

    public void setRemitente(String remitente) {
        this.remitente = remitente;
    }


    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("NotificacionEmail{");
        sb.append("remitente='").append(remitente).append('\'');
        sb.append(", tieneAdjuntos=").append(tieneAdjuntos);
        sb.append(", titulo='").append(titulo).append('\'');
        sb.append(", mensaje='").append(mensaje).append('\'');
        sb.append(", usuario='").append(usuario).append('\'');
        sb.append(", fecha=").append(fecha);
        sb.append(", leida=").append(leida);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public void enviar() {
        //De: ,Asunto: ,Mensaje: , Adjuntos:
        System.out.printf("Email de " + remitente);
        System.out.printf("Para " + usuario);
        System.out.println("Asunto: " + titulo);
        System.out.println("Mensaje: " + mensaje);
        System.out.println("Adjuntos: " + this.tieneAdjuntos);
    }

    @Override
    public String getIcono() {
        return "\uD83D\uDCE7";
    }

    @Override
    public int getPrioridad() {
        if (tieneAdjuntos){
            return 2;
        }else {
            return 1;
        }
    }
}
