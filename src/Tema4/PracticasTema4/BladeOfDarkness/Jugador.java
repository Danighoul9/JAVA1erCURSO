package Tema4.PracticasTema4.BladeOfDarkness;

public class Jugador {
    /**
     * Propiedades:
     * ● nombre
     * ● clase (enum de MAGO, BRUJO, BARBARO, CABALLERO)
     * ● nivel
     * ● experiencia
     * ● salud (inicialmente a 200)
     * ● Arma armaDerecha
     * ● Arma armaIzquierda
     */

    public enum Clase {
        MAGO,
        BRUJO,
        BARBARO,
        CABALLERO
    }

    private String nombre;
    private Clase clase;

    private int nivel = 1;
    private int experiencia = 0;
    private double salud = 200;

    private Arma armaDerecha = null;
    private Arma armaIzquierda = null;

    /**
     *Métodos:
     * ● Debes hacer el constructor parametrizado, menos nivel que será por defecto 1, salud por defecto 200,
     * experiencia 0 por defecto, ni las armas que serán null.
     */

    public Jugador(String nombre, Clase clase) {
        this.nombre = nombre;
        this.clase = clase;
    }
    //Ccopia
    public Jugador(Jugador otro) {
        this.nombre = otro.nombre;
        this.clase = otro.clase;
    }

    /** ● Getters, setters y toString.*/
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Clase getClase() {
        return clase;
    }

    public void setClase(Clase clase) {
        this.clase = clase;
    }

    public int getNivel() {
        return nivel;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public double getSalud() {
        return salud;
    }

    public Arma getArmaDerecha() {
        return armaDerecha;
    }

    public void setArmaDerecha(Arma armaDerecha) {
        this.armaDerecha = armaDerecha;
    }

    public Arma getArmaIzquierda() {
        return armaIzquierda;
    }

    public void setArmaIzquierda(Arma armaIzquierda) {
        this.armaIzquierda = armaIzquierda;
    }


    /** ● Un método para subir de nivel, subirNivel(), que incremente el nivel en 1 y suba su salud en 2.5 elevado a
     nivel. El nivel máximo es 10.*/

    public void subirNivel() {
        if (this.nivel < 10) {
            this.nivel++;
            this.salud += Math.pow(2.5, this.nivel);
        }
    }

    /** ● Un método equipar(Arma arma). Si están libres el arma derecha o izquierda, asignará esa arma a uno de los
     * dos y devolverá true. Si están ocupados los dos devolverá false pues no se puede poner el arma. Si lo que
     * intentas equipar es un arma a dos manos, solo se puede poner si están los dos brazos libres, y se pone la
     * misma arma en los brazos. Se empieza equipando por la derecha.*/
    public boolean equiparArma(Arma arma){

        if (arma.isDosManos()){
            if (this.armaDerecha == null && this.armaIzquierda == null){
                this.armaDerecha = arma;
                this.armaIzquierda = arma;
                return true;
            }
            return false;
        }

        if (this.armaDerecha == null) {
            this.armaDerecha = arma;
            return true;
        }

        if (this.armaIzquierda == null) {
            this.armaIzquierda = arma;
            return true;
        }

        return false;

    }

    /** ● Un método tomarPocion(int puntosS): método que sube la salud del jugador tanto como indica puntosS,
     * hasta un máximo de 10000.**/
    public void tomarPocion(int puntosS){
        this.salud += puntosS;

        if (this.salud > 10000) {
            this.salud = 10000;
        }
    }


    /** ● Un método reducirVida(int puntosD): reduce la propia salud del jugador tanto como indica puntosD. Si la
     * salud no es cero tras restar devuelve false, si la salud queda a cero o menos, la salud se pone a cero y se
     * devuelve true (muerto).*/

    public boolean reducirVida(double puntosD){
        this.salud -= puntosD;
        if(this.salud <= 0){
            this.salud = 0;
            return true;
        } else {
            return false;
        }
    }



    /** ● Un método golpear(Monstruo monstruo): reduce la salud del monstruo tanto como sea el valor de la
     * propiedad puntosD de las armas que lleve equipada el jugador, si el arma es doble solo quita el valor de uno
     * de los brazos. Para reducir la salud debes llamar al método correspondiente reducirVida de la clase Monstruo.
     * Si del golpe matas a un monstruo tu experiencia sube 10 por el nivel del monstruo. Además, cada vez que tu
     * experiencia suba una centena (100, 200, 300, …) subes de nivel. El máximo de experiencia será por tanto
     * 1000.
     */

    public void golpear(Monstruo monstruo) {


        //Golpear
        if (this.armaDerecha != null) {
            monstruo.reducirVida(this.getArmaDerecha().getPuntosD());
            if (!this.armaDerecha.isDosManos()) {
                if (this.getArmaDerecha() != null) {
                    monstruo.reducirVida(this.getArmaIzquierda().getPuntosD());
                }
            }
        }
        //Comprobar si lo has matado
        if(monstruo.getSalud() <= 0) {
            System.out.println(monstruo.getNombre() + " ha sido derrotado por " + this.nombre);

            //Subir la exp y el lvl si correspondiera
            int expGanada = 10 * monstruo.getNivel();

            // Limitar experiencia máxima
            if (this.experiencia < 1000){
                this.experiencia += expGanada;
                System.out.println(this.nombre + " ha ganado " + expGanada + "xp por derrotar a " + monstruo.getNombre());
                System.out.println("Experiencia actual: " + this.experiencia + "xp");
                if (this.experiencia / 100 > this.nivel - 1) {
                    this.nivel++;
                    System.out.println(this.nombre + " ha subido al nivel " + this.nivel + "!");
                }else {
                    System.out.println("Nivel actual: " + this.nivel);

                }

            } else if (this.experiencia >= 1000) {
                this.experiencia = 1000;
            }



        }

    }
}
