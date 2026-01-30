package Tema6.PolimorfismoClases;

public class Furgoneta extends Vehiculo{

    private Double cargaMaxima;

    public Furgoneta(String marca, String modelo, String color, String matricula, Double cargaMaxima) {
        super(marca, modelo, color, matricula);
        this.cargaMaxima = cargaMaxima;
    }

    public Double getCargaMaxima() {
        return cargaMaxima;
    }

    public void setCargaMaxima(Double cargaMaxima) {
        this.cargaMaxima = cargaMaxima;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Furgoneta{");
        sb.append("marca='").append(marca).append('\'');
        sb.append(", modelo='").append(modelo).append('\'');
        sb.append(", color='").append(color).append('\'');
        sb.append(", matricula='").append(matricula).append('\'');
        sb.append(", cargaMaxima=").append(cargaMaxima);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public String metodoPolimorfico() {
        return "Nooooooooooooooooooo";
    }
}
