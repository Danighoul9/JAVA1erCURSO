package Tema6.PracticaTema6.Entidades;

public class CocheEstandar extends Coche {

    private boolean aireAcondicionado;

    public CocheEstandar(String marca, String modelo, String matricula, int anio,
                         TipoCombustible combustible, TipoCoche tipo,
                         Double precioBase, boolean aireAcondicionado) {
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
    public double calcularPrecioAlquiler(int dias) {
        double precio = precioBase * dias;
        if (aireAcondicionado) {
            precio += 5.0 * dias;
        }
        return precio;
    }

    @Override
    public String toString() {
        return "CocheEstandar{" +
                "id=" + id +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", matricula='" + matricula + '\'' +
                ", anio=" + anio +
                ", combustible=" + combustible +
                ", tipo=" + tipo +
                ", precioBase=" + precioBase +
                ", aireAcondicionado=" + aireAcondicionado +
                ", disponible=" + disponible +
                '}';
    }
}

