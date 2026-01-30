package Tema4.PracticasTema4.BladeOfDarkness;

public class Arma {
    /**
     * Propiedades:
     * ● nombre
     * ● tipo (enum de ESPADA, HACHA, BASTON, ARCO)
     * ● puntosD  (puntos de daño)
     * ● dosManos  (boolean)
     */

    public enum Tipo {
        ESPADA,
        HACHA,
        BASTON,
        ARCO
    }


    private String nombre;
    private Integer puntosD;
    private Tipo tipo;
    private boolean dosManos;

    /**
     * Métodos:
     * ● Constructor parametrizado con todas las propiedades.
     * ● Getters, setters y toString.
     */

    public Arma(String nombre, Integer puntosD,Tipo tipo, boolean dosManos) {
        this.nombre = nombre;
        this.puntosD = puntosD;
        this.tipo = tipo;
        this.dosManos = dosManos;
    }

    //Constructor copia
    public Arma(Arma otra) {
        this.nombre = otra.nombre;
        this.puntosD = otra.puntosD;
        this.tipo = otra.tipo;
        this.dosManos = otra.dosManos;
    }

    //Getters y Setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getPuntosD() {
        return puntosD;
    }

    public boolean isDosManos() {
        return dosManos;
    }

    //ToString();
    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Arma{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", puntosD=").append(puntosD);
        sb.append(", dosManos=").append(dosManos);
        sb.append('}');
        return sb.toString();
    }
}
