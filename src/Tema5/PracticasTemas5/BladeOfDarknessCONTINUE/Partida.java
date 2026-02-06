package Tema5.PracticasTemas5.BladeOfDarknessCONTINUE;

import java.util.ArrayList;

public class Partida {
    /**
     * - Se añade una clase nueva Partida.
     *
     * Sus atributos serán un jugador, un ArrayList de 10 (en principio) monstruos,
     * 2 de los cuales serán MonstruoFinalNivel.
     * Al constructor se le pasará un Jugador y, además, inicializará el ArrayList de Monstruos.
     */

    private Jugador jugador;
    private ArrayList<Monstruo> enemigos;

    //Constructor con el ArrayList inicializado
    public Partida(Jugador jugador) {
        this.jugador = jugador;
        this.enemigos = new ArrayList<>(10);
    }

    //Getters y Setters
    public Jugador getJugador() {
        return jugador;
    }

    public void setJugador(Jugador jugador) {
        this.jugador = jugador;
    }

    public ArrayList<Monstruo> getEnemigos() {
        return enemigos;
    }

    //ToString()
    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Partida{");
        sb.append("jugador=").append(jugador);
        sb.append(", enemigos=").append(enemigos);
        sb.append('}');
        return sb.toString();
    }


    /**
     * Tendrá los siguientes métodos:
     */

    /**
     * iniciarPartida(): se llamará en el constructor.
     * - Le añadirá en un for 100 objetos Monstruos iguales.
     * - Equipará al Jugador con las armas que decidas.
     */
    public void iniciarPartida(){
        // Crear arma
        Arma Hacha = new Arma("Hacha divina",40, Arma.Tipo.HACHA,true);

        // Equipar al jugador
        this.jugador.equiparArma(Hacha);

        //Lo hago con 10 para probar
        //8 monstruos normales
        for (int i = 0; i < 8; i++) {
            this.enemigos.add(new Monstruo("Goblin " + i, Personaje.Clase.GOBLIN, 5));
        }

        //2 monstruos finales de nivel
        this.enemigos.add(new MonstruoFinalNivel("Demonio Final 1", Personaje.Clase.DEMONIO,
                8, 20));
        this.enemigos.add(new MonstruoFinalNivel("Demonio Final 2", Personaje.Clase.DEMONIO,
                8, 20));

        System.out.println("Partida iniciada con " + this.enemigos.size() + " enemigos");
    }

    /**
     * turnoJugador(): recorrerá el ArrayList de Monstruos, y el primero que encuentre le golpeará con sus armas.
     * - Si el enemigo tiene 0 o menos de vida se quitará del ArrayList de la partida.
     * - Si no quedan enemigos vivos en el ArrayList, el jugador gana la partida, y termina (return).
     */
    public void turnoJugador(){
        if (enemigos.isEmpty()) {
            System.out.println("El jugador ha derrotado a todos los enemigos ");
            return;
        }

        Monstruo enemigo = this.enemigos.get(0);

        jugador.golpear(enemigo);
        if (this.jugador.getArmaDerecha() != null){
            System.out.println(this.jugador.getNombre() + " golpea a " + enemigo.getNombre() +
                    " causando " + jugador.getArmaDerecha().getPuntosD() + " de daño");
        } else if (this.jugador.getArmaDerecha() != null) {
            System.out.println(this.jugador.getNombre() + " golpea a " + enemigo.getNombre() +
                    " causando " + jugador.getArmaIzquierda().getPuntosD() + " de daño");
        }


        if (enemigo.getSalud() <= 0) {
            System.out.println("X Enemigo " + enemigo.getNombre() + " derrotado X : ");
            this.enemigos.remove(0);
        }

        if (this.enemigos.isEmpty()) {
            System.out.println("🏆 El jugador gana la partida");
            return;
        }
    }

    /**
     * turnoEnemigos(): el primer Monstruo vivo que haya en el ArrayList, golpea al jugador.
     * - Si el Jugador se queda sin vida, pierde la partida y el juego acaba (return).
     */
    public void turnoEnemigos(){
        if (enemigos.isEmpty()) {
            return;
        }

        Monstruo enemigo = enemigos.get(0);

        enemigo.golpear(jugador);
        System.out.println(enemigo.getNombre() + " golpea al jugador causando " + enemigo.getPuntosD() + " de daño");

        if (jugador.getSalud() <= 0) {
            System.out.println("El jugador ha muerto. FIN DE LA PARTIDA");
            return;
        }
    }








}
