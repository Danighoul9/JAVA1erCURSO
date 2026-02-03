package EjerciciosPuntuables.Tema5.Entidades;

public class Apoyo extends Jugador {

    /**
     * Representa al jugador encargado de curar y asistir al resto del equipo.
     * Nuevos atributos (privados):
     * curacionesPorPartida (int): número medio de curaciones otorgadas en cada partida.
     * eficienciaAsistencia (float): eficacia global del jugador en asistencias (porcentaje).
     * Métodos:
     * Constructor que llama al de la clase padre.
     * Getters y setters.
     * toString() : imprime todos los datos heredados y específicos.
     * imprimirRol() : devuelve “Apoyo”.
     */

    //Atributos propios
    private Integer curacionesPorPartida;
    private String eficenciaAsistencia;

    //Metodos
    public Apoyo(String alias, Integer puntos, Integer curacionesPorPartida,
                 String eficenciaAsistencia) {
        super(alias, puntos);
        this.curacionesPorPartida = curacionesPorPartida;
        this.eficenciaAsistencia = eficenciaAsistencia;
    }

    public Integer getCuracionesPorPartida() {
        return curacionesPorPartida;
    }

    public void setCuracionesPorPartida(Integer curacionesPorPartida) {
        this.curacionesPorPartida = curacionesPorPartida;
    }

    public String getEficenciaAsistencia() {
        return eficenciaAsistencia;
    }

    public void setEficenciaAsistencia(String eficenciaAsistencia) {
        this.eficenciaAsistencia = eficenciaAsistencia;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Apoyo{");
        sb.append("curacionesPorPartida=").append(curacionesPorPartida);
        sb.append(", eficenciaAsistencia=").append(eficenciaAsistencia);
        sb.append(", idJugador='").append(idJugador).append('\'');
        sb.append(", alias='").append(alias).append('\'');
        sb.append(", puntos=").append(puntos);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public String imprimirRol() {
        return "Apoyo";
    }
}
