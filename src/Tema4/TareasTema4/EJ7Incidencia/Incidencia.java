package Tema4.TareasTema4.EJ7Incidencia;

public class Incidencia {
    public enum EstadoIncidencia {
        ABIERTA,
        EN_PROCESO,
        RESUELTA
    }

    private String codigo;
    private String problema;
    private String solucion;
    private EstadoIncidencia estado;
    private Tecnico tecnico;

    private static Integer pendientes = 0; //Incidencias pendientes de resolver
    private static Integer autoinc = 0; //Utilizado para generar el código de la incidencia

    public Incidencia(String problema) {
        this.problema = problema;
        this.estado = EstadoIncidencia.ABIERTA;
        Incidencia.autoinc++; //Incrementamos en uno cada vez que se crea una incidencia
        this.codigo = "INC-"+(Incidencia.autoinc);
        Incidencia.pendientes++; //Hay una incidencia nueva pendiente de resolver
    }

    public String getCodigo() {
        return codigo;
    }

    public String getProblema() {
        return problema;
    }

    public String getSolucion() {
        return solucion;
    }

    public EstadoIncidencia getEstado() {
        return estado;
    }

    public void setProblema(String problema) {
        this.problema = problema;
    }

    public void setSolucion(String solucion) {
        this.solucion = solucion;
    }

    public void setEstado(EstadoIncidencia estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Incidencia{");
        sb.append("codigo='").append(codigo).append('\'');
        sb.append(", problema='").append(problema).append('\'');
        sb.append(", solucion='").append(solucion).append('\'');
        sb.append(", estado=").append(estado);
        sb.append(", tecnico=").append((tecnico == null) ? "No asignado" : tecnico.getNombre());
        sb.append('}');
        return sb.toString();
    }

    public static Integer getPendientes() {
        return Incidencia.pendientes;
    }

    public void resuelve(String solucion) {
        this.solucion = solucion;
        this.estado = EstadoIncidencia.RESUELTA;
        Incidencia.pendientes--;
    }

    public void asignaTecnico(Tecnico tecnico) {
        this.tecnico = tecnico;
        this.estado = EstadoIncidencia.EN_PROCESO;
    }
}
