package Tema7.TareasTema7.RankingHyruleGame;


public class Main {
    static void main() {

        RankingMejorado ranking = new RankingMejorado();
        ranking.registrar(new Jugador(1, "Chokas", "España"));
        ranking.registrar(new Jugador(2, "Ibai", "España"));
        ranking.registrar(new Jugador(3, "YO", "España"));
        ranking.registrar(new Jugador(3, "YO", "España"));

        ranking.pintarJugadores();
        ranking.modificarPuntuacion(1, 100);
        ranking.modificarPuntuacion(2, 200);
        ranking.modificarPuntuacion(3, 200);

        ranking.pintarRanking();

        ranking.eliminarJugador(2);

        ranking.pintarRanking();
        ranking.pintarJugadores();

    }
}