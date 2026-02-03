package EjerciciosPuntuables.Tema5.Entidades;

public class Tanque extends Jugador{

    /**
     * Representa un jugador especializado en absorber daño y proteger al equipo.
     * Nuevos atributos (privados):
     * defensaPromedio (double): cantidad media de daño bloqueado por partida.
     * dañoRecibido (double): daño promedio recibido por partida.
     * Métodos:
     * Constructor que llama al de la clase padre.
     * Getters y setters.
     * imprimirDatos() : imprime los datos comunes y los específicos del rol.
     * imprimirRol() : devuelve “Tanque”.
     */

    //Atributos propios
    private double defensaPromedio;
    private double dañoRecibido;

    //Metodos
    public Tanque(String alias, Integer puntos, double defensaPromedio, double dañoRecibido) {
        super(alias, puntos);
        this.defensaPromedio = defensaPromedio;
        this.dañoRecibido = dañoRecibido;
    }

    public double getDefensaPromedio() {
        return defensaPromedio;
    }

    public void setDefensaPromedio(double defensaPromedio) {
        this.defensaPromedio = defensaPromedio;
    }

    public double getDañoRecibido() {
        return dañoRecibido;
    }

    public void setDañoRecibido(double dañoRecibido) {
        this.dañoRecibido = dañoRecibido;
    }


    //Metodos propios


    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Tanque{");
        sb.append("defensaPromedio=").append(defensaPromedio);
        sb.append(", dañoRecibido=").append(dañoRecibido);
        sb.append(", idJugador=").append(idJugador);
        sb.append(", alias='").append(alias).append('\'');
        sb.append(", puntos=").append(puntos);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public String imprimirRol() {
        return "Tanque";
    }
}
