package Tema5.PracticasTemas5.BladeOfDarknessCONTINUE;

public class TestPartida {
    static void main(String[] args) {
        /**
         * Crea un main, en él un objeto Partida, inicia la partida, y luego simula unos 30
         * turnos (for) alternativos de jugador y enemigo. Por último, muestra el resultado de quien
         * gana, y cuántos enemigos destruye en total el jugador. Decide tú los valores de salud de
         * cada uno, los puntos y daños del arma, de manera que esté ajustado el juego y el jugador
         * pueda matar al menos 8 monstruos.
         */

        //Creo el jugador
        Jugador j1 = new Jugador("Dertex", Personaje.Clase.BARBARO);
        System.out.println(j1);


        //Creo la partida
        Partida partidaPrueba = new Partida(j1);
        partidaPrueba.iniciarPartida();


        for (int i = 0; i <= 30; i++){
            System.out.println("------------------------------------------------------------------------------------");
            System.out.println("La cantidad de enemigos restantes es de " + partidaPrueba.getEnemigos().size());

            //El jugador empieza pegando al enemigo
            partidaPrueba.turnoJugador();

            //Turno del enemigo
            partidaPrueba.turnoEnemigos();
            System.out.println("------------------------------------------------------------------------------------");


        }

    }



}
