package Tema6.PracticaTema6.Entidades;

public class CochePremium extends Coche {

    private boolean gps;
    private boolean seguroExtra;

    public CochePremium(String marca, String modelo, String matricula, int anio,
                        TipoCombustible combustible, TipoCoche tipo,
                        Double precioBase, boolean gps, boolean seguroExtra) {
        super(marca, modelo, matricula, anio, combustible, tipo, precioBase);
        this.gps = gps;
        this.seguroExtra = seguroExtra;
    }

    public boolean tieneGps() {
        return gps;
    }

    public void setGps(boolean gps) {
        this.gps = gps;
    }

    public boolean tieneSeguroExtra() {
        return seguroExtra;
    }

    public void setSeguroExtra(boolean seguroExtra) {
        this.seguroExtra = seguroExtra;
    }

    @Override
    public double calcularPrecioAlquiler(int dias) {
        double precioDiario = precioBase * 1.20;
        if (gps) {
            precioDiario += 10.0;
        }
        if (seguroExtra) {
            precioDiario += 15.0;
        }
        return precioDiario * dias;
    }

    @Override
    public String toString() {
        return "CochePremium{" +
                "id=" + id +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", matricula='" + matricula + '\'' +
                ", anio=" + anio +
                ", combustible=" + combustible +
                ", tipo=" + tipo +
                ", precioBase=" + precioBase +
                ", gps=" + gps +
                ", seguroExtra=" + seguroExtra +
                ", disponible=" + disponible +
                '}';
    }
}

