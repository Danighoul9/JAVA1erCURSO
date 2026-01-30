package Tema6.PolimorfismoClases;

public class Vehiculo {

    protected String marca;
    protected String modelo;
    protected String color;
    protected String matricula;

    public Vehiculo(String marca, String modelo, String color, String matricula) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.matricula = matricula;
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Vehiculo{");
        sb.append("marca='").append(marca).append('\'');
        sb.append(", modelo='").append(modelo).append('\'');
        sb.append(", color='").append(color).append('\'');
        sb.append(", matricula='").append(matricula).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public String metodoPolimorfico() {
        return "Yo soy tu padre";
    }
}
