package Tema5.PracticasTemas5.BladeOfDarknessCONTINUE;

public class Monstruo extends Personaje {
    /**
     * Propiedades propias del enemigo:
     * ● salud (inicialmente a 100)
     * ● puntosD (puntos de daño que hace el monstruo al golpear)
     */

    private int puntosD;

    public Monstruo(String nombre, Clase clase, int puntosD) {
        super(nombre, clase);
        this.salud = 100;
        this.puntosD = puntosD;
    }

    /** ● Getters, setters y toString.*/
    public double getPuntosD() {
        return puntosD;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Monstruo{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", clase=").append(clase);
        sb.append(", nivel=").append(nivel);
        sb.append(", salud=").append(salud);
        sb.append(", puntosD=").append(puntosD);
        sb.append('}');
        return sb.toString();
    }


    /**
     * ● Un método golpear(Jugador jugador): reduce la salud del jugador tanto como sea el valor de la propiedad
     * puntosD del monstruo. Para reducir la salud debes llamar al método correspondiente de la clase Jugador.
     *
     * @return
     */

    @Override
    public int golpear(Personaje personaje) {
        personaje.reducirVida(this.puntosD);
        return this.puntosD;
    }
}
