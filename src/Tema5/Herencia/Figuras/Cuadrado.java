package Tema5.Herencia.Figuras;

public class Cuadrado extends Figura2D {

    private Double lado;

    public Cuadrado(String nombre, Double grosor, String color, Double lado) {
        super(nombre, grosor, color);
        this.lado = lado;
    }

    public Double getLado() {
        return lado;
    }

    public void setLado(Double lado) {
        this.lado = lado;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Cuadrado {");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", grosor=").append(grosor);
        sb.append(", color='").append(color).append('\'');
        sb.append(", lado='").append(lado).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public Double calcularArea() {
        return Math.pow(lado, 2);
    }

    @Override
    public Double calcularPerimetro() {
        return lado * 4.0;
    }
}