package Tema5.PracticasTemas5.BladeOfDarknessCONTINUE;

public abstract class Personaje {

    /**
     * Propiedades:
     * ● nombre
     * ● clase (enemigo u heroe)
     *
     * Heroe:
     * MAGO,BRUJO,BARBARO,CABALLERO
     *
     * Enemigo:
     * GOBLIN,TROLL,SKRALL,DEMONIO,FANTASMA
     *
     * ● nivel
     * ● salud
     */

    public enum Clase{
        //Héroes
        MAGO,
        BRUJO,
        BARBARO,
        CABALLERO,

        //Enemigos
        GOBLIN,
        TROLL,
        SKRALL,
        DEMONIO,
        FANTASMA

    }

    //Cosas en comun de Heroes y Enemigos
    protected String nombre;
    protected Clase clase;
    protected int nivel = 1;
    protected double salud;

    //Contructor
    public Personaje(String nombre,Clase clase) {
        this.nombre = nombre;
        this.clase = clase;
    }

    //Getters y Setters
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

    public Clase getClase() {
        return clase;
    }


    /**
     * Metodo ToString();
     */
    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Personaje{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", clase=").append(clase);
        sb.append(", nivel=").append(nivel);
        sb.append(", salud=").append(salud);
        sb.append('}');
        return sb.toString();
    }
    /**
     * Metodos de la clase padre genéricos
     */

    /** ● Un método para subir de nivel, subirNivel(), que incremente el nivel en 1 y suba su salud en 2 elevado a nivel.
     * El nivel máximo es 10.*/
    public void subirNivel() {
        if (this.nivel < 10) {
            this.nivel++;
            this.salud += Math.pow(2, this.nivel);
        }
    }

    /** ● Un método reducirVida(int puntosD): reduce la propia salud del personaje tanto como indica puntosD. Si la
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

    /**
     * ● Un método golpear
     */
    public abstract int golpear(Personaje personaje);


}
