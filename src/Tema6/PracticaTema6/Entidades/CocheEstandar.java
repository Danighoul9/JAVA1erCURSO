package Tema6.PracticaTema6.Entidades;

public class CocheEstandar extends Coche {

    private boolean aireAcondicionado;

    public CocheEstandar(String marca, String modelo, String matricula, int anio, TipoCombustible combustible,
                         TipoCoche tipo, Double precioBase, boolean aireAcondicionado) {
        super(marca, modelo, matricula, anio, combustible, tipo, precioBase);
        this.aireAcondicionado = aireAcondicionado;
    }

    public boolean tieneAireAcondicionado() {
        return aireAcondicionado;
    }

    public void setAireAcondicionado(boolean aireAcondicionado) {
        this.aireAcondicionado = aireAcondicionado;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("CocheEstandar{");
        sb.append("aireAcondicionado=").append(aireAcondicionado);
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
        double precio = precioBase * dias;
        if (aireAcondicionado) {
            precio += 5.0 * dias;
        }
        return precio;
    }

}

