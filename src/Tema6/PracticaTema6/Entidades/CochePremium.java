package Tema6.PracticaTema6.Entidades;

public class CochePremium extends Coche {

    private boolean gps;
    private boolean seguroExtra;

    public CochePremium(String marca, String modelo, String matricula, int anio, TipoCombustible combustible,
                        TipoCoche tipo, Double precioBase, boolean gps, boolean seguroExtra) {
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
    public String toString() {
        final StringBuffer sb = new StringBuffer("CochePremium{");
        sb.append("gps=").append(gps);
        sb.append(", seguroExtra=").append(seguroExtra);
        sb.append(", id=").append(id);
        sb.append(", marca='").append(marca).append('\'');
        sb.append(", modelo='").append(modelo).append('\'');
        sb.append(", matricula='").append(matricula).append('\'');
        sb.append(", anio=").append(anio);
        sb.append(", combustible=").append(combustible);
        sb.append(", tipo=").append(tipo);
        sb.append(", precioBase=").append(precioBase);
        sb.append(", disponible=").append(disponible);
        sb.append('}');
        return sb.toString();
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

}

