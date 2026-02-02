package Tema6.TareasTema6.EjPropuesto;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;

public abstract class Notificacion implements Notificable {

    /**
     * Atributos: titulo, mensaje, usuario, fecha (LocalDateTime), leida (boolean)
     * Constructor con todo menos fecha (LocalDateTime.now()) y leida (false)
     * Constructor copia
     * Getters de todo
     * Setters de titulo, mensaje y usuario
     * Equals por título, usuario y fecha
     * toString con todos los atributos
     * Métodos propios:
     * void marcarComoLeida(): leida = true
     * void pintarResumen(): muestra título, fecha, estado y usuario destinatario
     * Métodos abstractos:
     * void enviar();
     * String getIcono();
     * int getPrioridad();
     */


    protected String titulo;
    protected String mensaje;
    protected String usuario;
    protected LocalDateTime fecha;
    protected boolean leida;


    public Notificacion(String titulo, String mensaje, String usuario, LocalDateTime fecha, boolean leida) {
        this.titulo = titulo;
        this.mensaje = mensaje;
        this.usuario = usuario;
        this.fecha = fecha;
        this.leida = leida;
    }

    //Cc
    public Notificacion(Notificacion otro) {
        this.titulo = otro.titulo;
        this.mensaje = otro.mensaje;
        this.usuario = otro.usuario;
        this.fecha = otro.fecha;
        this.leida = otro.leida;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }


    public boolean isLeida() {
        return leida;
    }


    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Notificacion that = (Notificacion) o;
        return Objects.equals(titulo, that.titulo) && Objects.equals(usuario, that.usuario) && Objects.equals(fecha, that.fecha);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titulo, usuario, fecha);
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Notificacion{");
        sb.append("titulo='").append(titulo).append('\'');
        sb.append(", mensaje='").append(mensaje).append('\'');
        sb.append(", usuario='").append(usuario).append('\'');
        sb.append(", fecha=").append(fecha);
        sb.append(", leida=").append(leida);
        sb.append('}');
        return sb.toString();
    }


    //Metodos propios

    public void marcarComoLeida(){
        this.leida = true;
    }

    //muestra título, fecha, estado y usuario destinatario
    public void pintarResumen(){
        System.out.println("Titulo: " + this.titulo +
                           ", fecha: " + this.fecha +
                           ", estado: " + this.leida +
                           ", usuario: " + this.usuario);
    }


    //Metodos abstractos

    @Override
    public abstract void enviar();

    public abstract String getIcono();
    public abstract int getPrioridad();

}
