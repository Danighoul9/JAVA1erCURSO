package Tema5.Herencia.Figuras;


import java.util.Objects;

public class Figura {
    protected String nombre;
    protected Double grosor;
    protected String color;

    public Figura(String nombre, Double grosor, String color) {
        this.nombre = nombre;
        this.grosor = grosor;
        this.color = color;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getGrosor() {
        return grosor;
    }

    public void setGrosor(Double grosor) {
        this.grosor = grosor;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Figura{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", grosor=").append(grosor);
        sb.append(", color='").append(color).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Figura figura = (Figura) o;
        return Objects.equals(nombre, figura.nombre) && Objects.equals(grosor, figura.grosor) && Objects.equals(color, figura.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, grosor, color);
    }

    //----------------------------------------------
    //Como es final las clases hijas no pueden sobreescribir este metodo, esto quiere decir
    // al llevar final este metodo seria definitivo para toda su herencia y no cambiara
    public final void dibujar(){
        System.out.println("Dibujando figura...");
    }



}
