package ExamenOficial.TercerExamen.TercerExamen.Entidades;

import java.time.LocalDate;

public class AnimalExotico extends Animal{

    private String paisOrigen;
    private boolean requierePermisoCITES;

    public AnimalExotico(String nombre, TipoAnimal tipo, String raza, LocalDate fechaNacimiento,
                         double peso, Propietario propietario, String paisOrigen, boolean requierePermisoCITES) {
        super(nombre, tipo, raza, fechaNacimiento, peso, propietario);
        this.paisOrigen = paisOrigen;
        this.requierePermisoCITES = requierePermisoCITES;
    }

    public String getPaisOrigen() {
        return paisOrigen;
    }

    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }

    public boolean isRequierePermisoCITES() {
        return requierePermisoCITES;
    }

    public void setRequierePermisoCITES(boolean requierePermisoCITES) {
        this.requierePermisoCITES = requierePermisoCITES;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("|-- AnimalExótico --| -> {");
        sb.append("PaisOrigen ->'").append(paisOrigen).append('\'');
        sb.append(", RequierePermisoCITES ->").append(requierePermisoCITES);
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
     * Aplica los mismos precios base que AnimalDomestico,
     * pero con un suplemento del 25% por ser animal exótico.
     * Si además requiere permiso CITES, se añaden 15€ fijos adicionales.
     * @param tipo
     * @return
     */
    @Override
    public double calcularCosteConsulta(TipoConsulta tipo) {
        double precioConsulta = 0;
        double suplemento = 0;

        if (tipo.equals(TipoConsulta.REVISION)){
            precioConsulta += 20;
        } else if (tipo.equals(TipoConsulta.VACUNA)) {
            precioConsulta += 30;
        } else if (tipo.equals(TipoConsulta.CIRUGIA)) {
            precioConsulta += 150;
        } else if (tipo.equals(TipoConsulta.URGENCIA)) {
            precioConsulta += 80;

        }

        //Sumamos el suplemento por ser animal exótico (+25%)
        suplemento = precioConsulta * 1.25;
        precioConsulta += suplemento;

        if (requierePermisoCITES){
            precioConsulta += 15;
        }


        return precioConsulta;
    }
}
