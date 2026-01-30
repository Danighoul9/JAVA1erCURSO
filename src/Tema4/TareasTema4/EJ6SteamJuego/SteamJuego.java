package Tema4.TareasTema4.EJ6SteamJuego;

public class SteamJuego {

    //Propiedades

    private String nombre;
    private String descCorta;
    private double mediaJugadoresDiarios;
    private int diasDesdeLaSalida;
    private double precio;
    private int puestosMasVendidos;

    //COnstrutor


    public SteamJuego(String nombre, String descCorta, double mediaJugadoresDiarios, int diasDesdeLaSalida, double precio, int puestosMasVendidos) {
        this.nombre = nombre;
        this.descCorta = descCorta;
        this.mediaJugadoresDiarios = mediaJugadoresDiarios;
        this.diasDesdeLaSalida = diasDesdeLaSalida;
        this.precio = precio;
        this.puestosMasVendidos = puestosMasVendidos;
    }

    //Getter

    public String getNombre() {
        return nombre;
    }

    public String getDescCorta() {
        return descCorta;
    }

    public double getMediaJugadoresDiarios() {
        return mediaJugadoresDiarios;
    }

    public int getDiasDesdeLaSalida() {
        return diasDesdeLaSalida;
    }

    public double getPrecio() {
        return precio;
    }

    public int getPuestosMasVendidos() {
        return puestosMasVendidos;
    }

    //Setter

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDescCorta(String descCorta) {
        this.descCorta = descCorta;
    }

    public void setMediaJugadoresDiarios(double mediaJugadoresDiarios) {
        this.mediaJugadoresDiarios = mediaJugadoresDiarios;
    }

    public void setDiasDesdeLaSalida(int diasDesdeLaSalida) {
        this.diasDesdeLaSalida = diasDesdeLaSalida;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setPuestosMasVendidos(int puestosMasVendidos) {
        this.puestosMasVendidos = puestosMasVendidos;
    }

    //ToString()

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("SteamJuego{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", descCorta='").append(descCorta).append('\'');
        sb.append(", mediaJugadoresDiarios=").append(mediaJugadoresDiarios);
        sb.append(", diasDesdeLaSalida=").append(diasDesdeLaSalida);
        sb.append(", precio=").append(precio);
        sb.append(", puestosMasVendidos=").append(puestosMasVendidos);
        sb.append('}');
        return sb.toString();
    }

    //Metodos propios
    public void jugadoresDia(int jugadoresHoy){
        this.mediaJugadoresDiarios=
                ((this.mediaJugadoresDiarios * this.diasDesdeLaSalida)* jugadoresHoy/(this.diasDesdeLaSalida+1));
    }

}
