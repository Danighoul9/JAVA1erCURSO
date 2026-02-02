package Tema6.TareasTema6.EjPropuesto;

import java.time.LocalDateTime;

public class NotificacionRedSocial extends Notificacion{

    enum TipoInteraccion{
        LIKE,
        COMMENT,
        SHARE,
        FOLLOW
    }

    private String nombreUsuarioOrigen;
    private TipoInteraccion tipoInteraccion;
    private String urlPublicacion;

    public NotificacionRedSocial(String titulo, String mensaje, String usuario, LocalDateTime fecha,
                                 boolean leida,TipoInteraccion tipoInteraccion, String nombreUsuarioOrigen, String urlPublicacion) {
        super(titulo, mensaje, usuario, fecha, leida);
        this.tipoInteraccion = tipoInteraccion;
        this.nombreUsuarioOrigen = nombreUsuarioOrigen;
        this.urlPublicacion = urlPublicacion;
    }

    public NotificacionRedSocial(NotificacionRedSocial otro) {
        super(otro);
        this.tipoInteraccion = otro.tipoInteraccion;
        this.nombreUsuarioOrigen = otro.nombreUsuarioOrigen;
        this.urlPublicacion = otro.urlPublicacion;
    }

    public String getNombreUsuarioOrigen() {
        return nombreUsuarioOrigen;
    }

    public void setNombreUsuarioOrigen(String nombreUsuarioOrigen) {
        this.nombreUsuarioOrigen = nombreUsuarioOrigen;
    }

    public String getUrlPublicacion() {
        return urlPublicacion;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("NotificacionRedSocial{");
        sb.append("nombreUsuarioOrigen='").append(nombreUsuarioOrigen).append('\'');
        sb.append(", tipoInteraccion=").append(tipoInteraccion);
        sb.append(", urlPublicacion='").append(urlPublicacion).append('\'');
        sb.append(", titulo='").append(titulo).append('\'');
        sb.append(", mensaje='").append(mensaje).append('\'');
        sb.append(", usuario='").append(usuario).append('\'');
        sb.append(", fecha=").append(fecha);
        sb.append(", leida=").append(leida);
        sb.append('}');
        return sb.toString();
    }

    //Metodo auxiliar
    public String getIconoInteraccion(){
        if (this.tipoInteraccion == TipoInteraccion.LIKE){
            return "\uD83D\uDC4D";
        }else if (this.tipoInteraccion == TipoInteraccion.COMMENT){
            return "\uD83D\uDCAC";
        }else if (this.tipoInteraccion == TipoInteraccion.SHARE) {
            return "\u27A1\uFE0F";
        }else {
            return "\uD83D\uDC64";
        }
    }

    //Métodos sobreescritos
    @Override
    public void enviar() {
        System.out.println("Nueva interacción con " + this.nombreUsuarioOrigen + ", Tipo: " + this.tipoInteraccion +
                ", Titulo: " + titulo + ", Mensaje: " + mensaje );
    }

    @Override
    public String getIcono() {
        return "\uD83C\uDF10 " + getIconoInteraccion();
    }

    @Override
    public int getPrioridad() {
        if (this.tipoInteraccion == TipoInteraccion.LIKE){
            return 1;
        }else if (this.tipoInteraccion == TipoInteraccion.COMMENT || this.tipoInteraccion == TipoInteraccion.SHARE){
            return 2;
        }else {
            return 3;
        }
    }



}
