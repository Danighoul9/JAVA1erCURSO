package ExamenOficial.TercerExamen.Entidades;

import java.time.LocalDate;

public class AnimalDoméstico extends Animal{

    private boolean castrado;
    private boolean tieneChip;

    public AnimalDoméstico(String nombre, TipoAnimal tipo, String raza, LocalDate fechaNacimiento,
                           double peso, Propietario propietario, boolean castrado, boolean tieneChip) {
        super(nombre, tipo, raza, fechaNacimiento, peso, propietario);
        this.castrado = castrado;
        this.tieneChip = tieneChip;
    }

    public boolean isCastrado() {
        return castrado;
    }

    public void setCastrado(boolean castrado) {
        this.castrado = castrado;
    }

    public boolean isTieneChip() {
        return tieneChip;
    }

    public void setTieneChip(boolean tieneChip) {
        this.tieneChip = tieneChip;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("|-- AnimalDoméstico --| -> {");
        sb.append("Castrado=").append(castrado);
        sb.append(", TieneChip=").append(tieneChip);
        sb.append(", Id -> ").append(id);
        sb.append(", Nombre -> ").append(nombre).append('\'');
        sb.append(", Tipo -> ").append(tipo);
        sb.append(", Raza -> ").append(raza).append('\'');
        sb.append(", FechaNacimiento -> ").append(fechaNacimiento);
        sb.append(", Peso -> ").append(peso);
        sb.append(", Estado -> ").append(estado);
        sb.append(", Propietario -> ").append(propietario.getNombre() + propietario.getApellidos());
        sb.append('}');
        return sb.toString();
    }


    /**
     * Aplica los siguientes precios base según el tipo de consulta:
     * REVISION 20€, VACUNA 30€, CIRUGIA 150€, URGENCIA 80€.
     * Si el animal está castrado se aplica un descuento del 10% sobre el precio final
     * (menos complicaciones médicas).
     * @param tipo
     * @return
     */
    @Override
    public double calcularCosteConsulta(TipoConsulta tipo) {
        double precioConsulta = 0;

        if (tipo.equals(TipoConsulta.REVISION)){
            precioConsulta += 20;
        } else if (tipo.equals(TipoConsulta.VACUNA)) {
            precioConsulta += 30;
        } else if (tipo.equals(TipoConsulta.CIRUGIA)) {
            precioConsulta += 150;
        } else if (tipo.equals(TipoConsulta.URGENCIA)) {
            precioConsulta += 80;

        }

        if (castrado){
            double descuento = precioConsulta * 1.10;
            precioConsulta -= descuento;
        }

        return precioConsulta;
    }

}
