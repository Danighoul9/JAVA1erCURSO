package Tema4.TareasTema4.EJ8ConsumoCoche;

public class Consumo {

    /**
     * Implementa una clase Consumo, que es parte de la centralita electrónica de un coche, con estas características:
     *
     * - Atributos:
     * - kms. Kilómetros recorridos por el coche.
     * - litros. Litros de combustible consumido.
     * - vmed. Velocidad media.
     * - pgas. Precio de la gasolina.
     *
     * - Métodos:
     * - getTiempo. Indicará el tiempo empleado en realizar el viaje.
     * - consumoMedio. Consumo medio del vehículo (en litros cada 100 kilómetros).
     * - consumoEuros. Consumo medio del vehículo (en euros cada 100 kilómetros).
     * - setKms, setLitros, setVmed y setPgas, los cuales podrán modificar los valores de los
     * atributos de la clase.
     *
     * Prueba todo en una clase TestConsumo.
     */

    //Atributos del consumo
    private double kms;
    private double litros;
    private double vmed;
    private double pgas;

    //Constructor
    public Consumo(int kms, int litros, int vmed, double pgas) {
        this.kms = kms;
        this.litros = litros;
        this.vmed = vmed;
        this.pgas = pgas;
    }

    //GETTERS
    public double getKms() {
        return kms;
    }

    public double getLitros() {
        return litros;
    }

    public double getVmed() {
        return vmed;
    }

    public double getPgas() {
        return pgas;
    }


    //SETTERS
    public void setKms(double kms) {
        this.kms = kms;
    }

    public void setLitros(double litros) {
        this.litros = litros;
    }

    public void setVmed(double vmed) {
        this.vmed = vmed;
    }

    public void setPgas(double pgas) {
        this.pgas = pgas;
    }

    //ToString

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Consumo{");
        sb.append("kms=").append(kms);
        sb.append(", litros=").append(litros);
        sb.append(", vmed=").append(vmed);
        sb.append(", pgas=").append(pgas);
        sb.append('}');
        return sb.toString();
    }


    // Métodos propios
    // Tiempo del viaje (horas)
    public double getTiempo() {
        return kms / vmed;
    }

    // Consumo medio (litros cada 100 km)
    public double consumoMedio() {
        return (litros / kms) * 100;
    }

    // Consumo medio en euros cada 100 km
    public double consumoEuros() {
        return consumoMedio() * pgas;
    }
}
