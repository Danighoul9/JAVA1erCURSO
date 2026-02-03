package EjerciciosPuntuables.Tema5.Entidades;

import java.util.Objects;
import java.util.UUID;

public abstract class Jugador {

    /**
     * Representa a un jugador profesional de eSports.
     *
     * Atributos (privados):
     * id (int): identificador único del jugador.
     * alias (String): nombre o apodo usado en el juego.
     * puntos (int): puntuación acumulada en el torneo.
     *
     * Métodos:
     * Constructor que inicializa los atributos.
     * Getters y setters para cada atributo.
     * Equals por id
     * addPuntos(int puntos) : incrementa los puntos obtenidos por el jugador en una
     * partida.
     * toString() : imprime los datos básicos del jugador.
     * Método abstracto imprimirRol() : devuelve un String con el rol o tipo de jugador
     * (según su especialización).
     */

    protected Integer idJugador;
    protected String alias;
    protected Integer puntos;
    static int contadorParaElId = 10000;
    //Metodos
    public Jugador(String alias, Integer puntos) {
        this.idJugador = contadorParaElId++;
        this.alias = alias;
        this.puntos = puntos;
    }

    public Integer getIdJugador() {
        return idJugador;
    }

    public void setIdJugador(Integer idJugador) {
        this.idJugador = idJugador;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public Integer getPuntos() {
        return puntos;
    }

    public void setPuntos(Integer puntos) {
        this.puntos = puntos;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Jugador jugador = (Jugador) o;
        return Objects.equals(idJugador, jugador.idJugador);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(idJugador);
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Jugador{");
        sb.append("idJugador=").append(idJugador);
        sb.append(", alias='").append(alias).append('\'');
        sb.append(", puntos=").append(puntos);
        sb.append('}');
        return sb.toString();
    }

    //Metodos propios
    public void addPuntos(int puntos){
        this.puntos += puntos;
    }

    public abstract String imprimirRol();
}
