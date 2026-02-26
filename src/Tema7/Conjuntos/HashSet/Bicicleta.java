package Tema7.Conjuntos.HashSet;

import java.util.Objects;

public class Bicicleta {

    private String marca;
    private String modelo;
    private int anio;
    private String color;
    private String cambio;
    private String frenos;
    private Double precio;

    public Bicicleta(String marca, String modelo, int anio, String color, String cambio, String frenos, Double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.color = color;
        this.cambio = cambio;
        this.frenos = frenos;
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getCambio() {
        return cambio;
    }

    public void setCambio(String cambio) {
        this.cambio = cambio;
    }

    public String getFrenos() {
        return frenos;
    }

    public void setFrenos(String frenos) {
        this.frenos = frenos;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Bicicleta{");
        sb.append("marca='").append(marca).append('\'');
        sb.append(", modelo='").append(modelo).append('\'');
        sb.append(", anio=").append(anio);
        sb.append(", color='").append(color).append('\'');
        sb.append(", cambio='").append(cambio).append('\'');
        sb.append(", frenos='").append(frenos).append('\'');
        sb.append(", precio=").append(precio);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Bicicleta bicicleta = (Bicicleta) o;
        return anio == bicicleta.anio && Objects.equals(marca, bicicleta.marca) && Objects.equals(modelo, bicicleta.modelo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(marca, modelo, anio);
    }
}