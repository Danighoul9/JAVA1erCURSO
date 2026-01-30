package Tema4.PracticasTema4.BladeOfDarkness;

public class Monstruo {
    /**
     * Propiedades:
     * ● nombre
     * ● clase (enum de GOBLIN, TROLL, SKRALL, DEMONIO, FANTASMA)
     * ● nivel
     * ● salud (inicialmente a 100)
     * ● puntosD (puntos de daño que hace el monstruo al golpear)
     */


    public enum Clase {
        GOBLIN,
        TROLL,
        SKRALL,
        DEMONIO,
        FANTASMA
    }

    private String nombre;
    private int nivel = 1;
    private double salud = 100;
    private double puntosD;
    private Clase clase;


    /**
     * Métodos:
     * ● Debes hacer el constructor parametrizado (menos nivel y salud que serán por defecto 1 y 100).*/

    public Monstruo(String nombre, double puntosD, Clase clase) {
        this.nombre = nombre;
        this.puntosD = puntosD;
        this.clase = clase;
    }
    /** ● Getters, setters y toString.*/
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNivel() {
        return nivel;
    }

    public double getSalud() {
        return salud;
    }

    public double getPuntosD() {
        return puntosD;
    }

    public Clase getClase() {
        return clase;
    }

    /** ● Un método para subir de nivel, subirNivel(), que incremente el nivel en 1 y suba su salud en 2 elevado a nivel.
     * El nivel máximo es 10.*/
    public void subirNivel() {
        if (this.nivel < 10) {
            this.nivel++;
            this.salud += Math.pow(2, this.nivel);
        }
    }

    /** ● Un método reducirVida(int puntosD): reduce la propia salud del monstruo tanto como indica puntosD. Si la
     * salud no es cero tras restar devuelve false, si la salud queda a cero o menos, la salud se pone a cero y se
     * devuelve true (muerto).*/

    public boolean reducirVida(int puntosD){
        this.salud -= puntosD;
        if(this.salud <= 0){
            this.salud = 0;
            return true;
        } else {
            return false;
        }
    }

    /** ● Un método golpear(Jugador jugador): reduce la salud del jugador tanto como sea el valor de la propiedad
     * puntosD del monstruo. Para reducir la salud debes llamar al método correspondiente de la clase Jugador.
     */

    public void golpear(Jugador jugador) {

        //Golpear
        if (this.puntosD > 0) {
            jugador.reducirVida(this.puntosD);
        }
        //Comprobar si lo ha matado al jugador
        if(jugador.getSalud() <= 0) {
            System.out.println(jugador.getNombre() + " ha muerto en manos de un " + this.nombre);
        }
    }
}
