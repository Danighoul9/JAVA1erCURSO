package EjerciciosPuntuables.Tema5.Entidades;

public class Asesino extends Jugador {

    /**
     * Representa al jugador ofensivo, centrado en infligir daño y eliminar oponentes.
     *
     * Nuevos atributos (privados):
     * precisionPromedio (float): nivel medio de acierto en ataques.
     * bajasPorPartida (int): número promedio de eliminaciones por encuentro.
     *
     * Métodos:
     * Constructor que llama al de la clase padre.
     * Getters y setters.
     * toString() : imprime los datos del jugador y los particulares del rol.
     * imprimirRol() : devuelve “Asesino”.
     */

    private String precisionPromedio;
    private Integer bajasPorPartida;

    public Asesino(String alias, Integer puntos, String precisionPromedio,
                   Integer bajasPorPartida) {
        super(alias, puntos);
        this.precisionPromedio = precisionPromedio;
        this.bajasPorPartida = bajasPorPartida;
    }

    public String getPrecisionPromedio() {
        return precisionPromedio;
    }

    public void setPrecisionPromedio(String precisionPromedio) {
        this.precisionPromedio = precisionPromedio;
    }

    public Integer getBajasPorPartida() {
        return bajasPorPartida;
    }

    public void setBajasPorPartida(Integer bajasPorPartida) {
        this.bajasPorPartida = bajasPorPartida;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Asesino{");
        sb.append("precisionPromedio=").append(precisionPromedio);
        sb.append(", bajasPorPartida=").append(bajasPorPartida);
        sb.append(", idJugador='").append(idJugador).append('\'');
        sb.append(", alias='").append(alias).append('\'');
        sb.append(", puntos=").append(puntos);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public String imprimirRol() {
        return "Asesino";
    }
}
