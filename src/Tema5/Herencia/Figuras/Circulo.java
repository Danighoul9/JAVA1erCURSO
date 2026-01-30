package Tema5.Herencia.Figuras;

public class Circulo extends Figura2D {

    private Double radio;

    public Circulo(String nombre, Double grosor, String color, Double radio) {
        super(nombre, grosor, color);
        this.radio = radio;
    }

    public Double getRadio() {
        return radio;
    }

    public void setRadio(Double radio) {
        this.radio = radio;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Círculo {");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", grosor=").append(grosor);
        sb.append(", color='").append(color).append('\'');
        sb.append(", lado='").append(radio).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public Double calcularArea() {
        return Math.PI * Math.pow(radio, 2);
    }

    @Override
    public Double calcularPerimetro() {
        return 2 * Math.PI * radio;
    }
}
