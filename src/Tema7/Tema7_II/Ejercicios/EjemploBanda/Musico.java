package Tema7.Tema7_II.Ejercicios.EjemploBanda;

import java.time.LocalDate;

public class Musico {
    private String nombre;
    private Integer edad;
    private LocalDate fechaEntrada;
    private Instrumento instrumento;

    public Musico(String nombre, Integer edad, LocalDate fechaEntrada, Instrumento instrumento) {
        this.nombre = nombre;
        this.edad = edad;
        this.fechaEntrada = fechaEntrada;
        this.instrumento = instrumento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public LocalDate getFechaEntrada() {
        return fechaEntrada;
    }

    public void setFechaEntrada(LocalDate fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    public Instrumento getInstrumento() {
        return instrumento;
    }

    public void setInstrumento(Instrumento instrumento) {
        this.instrumento = instrumento;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Musico{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", edad=").append(edad);
        sb.append(", fechaEntrada=").append(fechaEntrada);
        sb.append(", instrumento=").append(instrumento);
        sb.append('}');
        return sb.toString();
    }
}
