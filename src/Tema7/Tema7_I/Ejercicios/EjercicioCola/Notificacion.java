package Tema7.Tema7_I.Ejercicios.EjercicioCola;

public class Notificacion implements Notificable{

    private String mensaje;
    private Double prioridad;

    public Notificacion(String mensaje, Double prioridad) {
        this.mensaje = mensaje;
        this.prioridad = prioridad;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public Double getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(Double prioridad) {
        this.prioridad = prioridad;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Notificacion{");
        sb.append("mensaje='").append(mensaje).append('\'');
        sb.append(", prioridad=").append(prioridad);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public void notificar() {
        IO.println(this.mensaje + " - " + this.prioridad);
    }

}
