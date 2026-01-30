package Tema5.PracticasTemas5.BladeOfDarknessCONTINUE;

public class Jugador extends Personaje {
    /**
     * Propiedades propias del Heroe:
     * ● experiencia
     * ● salud (inicialmente a 200)
     * ● Arma armaDerecha
     * ● Arma armaIzquierda
     */


    private int experiencia = 0;
    private Arma armaDerecha = null;
    private Arma armaIzquierda = null;

    public Jugador(String nombre, Clase clase) {
        super(nombre, clase);
    }

    //Getters y Setters
    public int getExperiencia() {
        return experiencia;
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


    /**
     * ● Un método golpear(Monstruo monstruo): reduce la salud del monstruo tanto como sea el valor de la
     * propiedad puntosD de las armas que lleve equipada el jugador, si el arma es doble solo quita el valor de uno
     * de los brazos. Para reducir la salud debes llamar al método correspondiente reducirVida de la clase Monstruo.
     * Si del golpe matas a un monstruo tu experiencia sube 10 por el nivel del monstruo. Además, cada vez que tu
     * experiencia suba una centena (100, 200, 300, …) subes de nivel. El máximo de experiencia será por tanto
     * 1000.
     *
     * @return
     */

    @Override
    public int golpear(Personaje personaje) {
        //Golpear
        if (this.armaDerecha != null) {
            personaje.reducirVida(this.getArmaDerecha().getPuntosD());
            if (!this.armaDerecha.isDosManos()) {
                if (this.getArmaDerecha() != null) {
                    personaje.reducirVida(this.getArmaIzquierda().getPuntosD());
                }
            }
        }
        //Comprobar si lo has matado
        if(personaje.getSalud() <= 0) {
            System.out.println(personaje.getNombre() + " ha sido derrotado por " + this.nombre);

            //Subir la exp y el lvl si correspondiera
            int expGanada = 10 * personaje.getNivel();

            // Limitar experiencia máxima
            if (this.experiencia < 1000){
                this.experiencia += expGanada;
                System.out.println(this.nombre + " ha ganado " + expGanada + "xp por derrotar a " + personaje.getNombre());
                System.out.println("Experiencia actual: " + this.experiencia + "xp");
                System.out.println("Nivel actual: " + this.nivel);

            } else if (this.experiencia >= 1000) {
                this.experiencia = 1000;
            }

            // Subir de nivel cada 100 puntos de experiencia
            while (this.experiencia / 100 > this.nivel - 1) {
                this.nivel++;
                System.out.println(this.nombre + " ha subido al nivel " + this.nivel + "!");
            }

        }
        return 0;
    }
}
