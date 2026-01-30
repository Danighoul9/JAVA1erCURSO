package Tema4.EjemplosOrientacionObjetos.EjemplosVarios.Viaje;

import java.time.LocalDate;

public class Viaje {


    private String origen;
    private String destino;
    private int duracion;
    private LocalDate fechaSalida;
    private Double precio;

    public Viaje(String origen, String destino, int duracion, LocalDate fechaSalida, Double precio) {
        this.origen = origen;
        this.destino = destino;
        this.duracion = duracion;
        this.fechaSalida = fechaSalida;
        this.precio = precio;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public LocalDate getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(LocalDate fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Viaje{");
        sb.append("origen='").append(origen).append('\'');
        sb.append(", destino='").append(destino).append('\'');
        sb.append(", duracion=").append(duracion);
        sb.append(", fechaSalida=").append(fechaSalida);
        sb.append(", precio=").append(precio);
        sb.append('}');
        return sb.toString();
    }

    public LocalDate getFechaLlegada(){
        return fechaSalida.plusDays(duracion);
    }
}
