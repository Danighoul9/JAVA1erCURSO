package Tema6.TareasTema6.EjPropuesto;

import java.time.LocalDateTime;

public class NotificacionRedSocial extends Notificacion{

    private TipoInteraccionRS tipo;
    private String usuarioOrigen;
    private String urlPublicacion;

    public NotificacionRedSocial(String titulo, String mensaje, String destinatario,
                                 TipoInteraccionRS tipo, String usuarioOrigen, String urlPublicacion) {
        super(titulo, mensaje, destinatario);
        this.tipo = tipo;
        this.usuarioOrigen = usuarioOrigen;
        this.urlPublicacion = urlPublicacion;
    }

    public TipoInteraccionRS getTipo() {
        return tipo;
    }

    public void setTipo(TipoInteraccionRS tipo) {
        this.tipo = tipo;
    }

    public String getUsuarioOrigen() {
        return usuarioOrigen;
    }

    public void setUsuarioOrigen(String usuarioOrigen) {
        this.usuarioOrigen = usuarioOrigen;
    }

    public String getUrlPublicacion() {
        return urlPublicacion;
    }

    public void setUrlPublicacion(String urlPublicacion) {
        this.urlPublicacion = urlPublicacion;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("NotificacionRedSocial{");
        sb.append("titulo='").append(titulo).append('\'');
        sb.append(", mensaje='").append(mensaje).append('\'');
        sb.append(", destinatario='").append(destinatario).append('\'');
        sb.append(", fecha=").append(fecha);
        sb.append(", leida=").append(leida);
        sb.append(", tipo=").append(tipo);
        sb.append(", usuarioOrigen='").append(usuarioOrigen).append('\'');
        sb.append(", urlPublicacion='").append(urlPublicacion).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public void enviar() {
        IO.println("Nueva interacción redes " + usuarioOrigen + " - " + tipo);
        IO.println(titulo + " - " + mensaje);
    }

    @Override
    public String getIcono() {
        return "\uD83C\uDF10 " + getIconoInteraccion();
    }

    @Override
    public Integer getPrioridad() {
        Integer prioridad = 0;
        switch (tipo) {
            case LIKE -> prioridad = 1;
            case COMMENT, SHARE -> prioridad = 2;
            case FOLLOW -> prioridad = 4;
        }
        return prioridad;
    }

    //MÉTODO PROPIO
    private String getIconoInteraccion() {
        String icono = "";
        switch (tipo) {
            case LIKE -> icono = "\uD83D\uDC4D";
            case COMMENT -> icono = "\uD83D\uDCAC";
            case SHARE -> icono = "\u27A1\uFE0F";
            case FOLLOW -> icono = "\uD83D\uDC64\u200D\uD83D\uDCBB";
        }
        return icono;
    }

}
