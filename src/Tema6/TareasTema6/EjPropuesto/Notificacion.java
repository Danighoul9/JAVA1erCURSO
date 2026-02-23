package Tema6.TareasTema6.EjPropuesto;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;

public abstract class Notificacion implements Notificable {

    protected String titulo;
    protected String mensaje;
    protected String destinatario;
    protected LocalDateTime fecha;
    protected boolean leida;

    public Notificacion(String titulo, String mensaje, String destinatario) {
        this.titulo = titulo;
        this.mensaje = mensaje;
        this.destinatario = destinatario;
    }

    public Notificacion(Notificacion otra) {
        this.titulo = otra.titulo;
        this.mensaje = otra.mensaje;
        this.destinatario = otra.destinatario;
        this.fecha = otra.fecha;
        this.leida = otra.leida;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getMensaje() {
        return mensaje;
    }

    public String getDestinatario() {
        return destinatario;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public boolean isLeida() {
        return leida;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Notificacion that = (Notificacion) o;
        return Objects.equals(titulo, that.titulo) && Objects.equals(destinatario, that.destinatario) && Objects.equals(fecha, that.fecha);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titulo, destinatario, fecha);
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Notificacion{");
        sb.append("titulo='").append(titulo).append('\'');
        sb.append(", mensaje='").append(mensaje).append('\'');
        sb.append(", destinatario='").append(destinatario).append('\'');
        sb.append(", fecha=").append(fecha);
        sb.append(", leida=").append(leida);
        sb.append('}');
        return sb.toString();
    }

    //MÉTODOS PROPIOS
    public void marcarComoLeida(){
        this.leida = true;
    }

    public void pintarResumen() {
        final StringBuffer sb = new StringBuffer("Notificacion{");
        sb.append("titulo='").append(titulo).append('\'');
        sb.append(", destinatario='").append(destinatario).append('\'');
        sb.append(", fecha=").append(fecha);
        sb.append(", leida=").append(leida);
        sb.append('}');
        IO.println(sb.toString());
    }

    //Métodos abstractos
    public abstract void enviar();
    public abstract String getIcono();
    public abstract Integer getPrioridad();

}
