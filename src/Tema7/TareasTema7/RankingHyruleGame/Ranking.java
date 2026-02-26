package Tema7.TareasTema7.RankingHyruleGame;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Ranking {

    private final Set<Jugador> jugadores = new HashSet<>();
    private Set<Jugador> ranking = new TreeSet<>(Comparator.comparing(Jugador::getPuntos)
            .thenComparing(Jugador::getId));

    public Set<Jugador> getJugadores() {
        return jugadores;
    }

    public Set<Jugador> getRanking() {
        return ranking;
    }

    public void pintarJugadores() {
        IO.println("--- JUGADORES ---");
        for(Jugador jugador: jugadores)
            IO.println(jugador);
    }

    public void pintarRanking() {
        IO.println("--- RANKING POR PUNTUACION ---");
        for(Jugador jugador: ranking)
            IO.println(jugador);
    }

    public void top(int n) {
        int i = 0;
        IO.println("--- TOP " + n + " ---");
        for(Jugador jugador: ranking) {
            i++;
            if (i >= n)
                break;

            IO.println(jugador);
        }
    }

    /**
     * Añadir un jugador al ranking, si el id ya está muestra un mensaje
     * @param jugador
     */
    public void registrar(Jugador jugador) {
        if (jugadores.contains(jugador))
            IO.println("Id de jugador repetido: " + jugador.getId());
        else {
            jugadores.add(jugador);
            ranking.add(jugador);

        }
    }

    /**
     * Eliminar un jugador por su id
     * @param id
     */
    public void eliminarJugador(int id) {
        Jugador j = new Jugador(id, "", 0, 0, "");
        jugadores.remove(j);

        /**
         //En ranking es complicado de hacer, no es por id, es por puntuacion e id
         j = null;
         for(Jugador jugador: ranking) {
         if(jugador.getId() == id) {
         j = jugador;
         }
         }
         ranking.remove(j);
         */

        //Mejor así
        this.ranking.clear();
        this.ranking.addAll(jugadores);


    }

    /**
     * Cambia la puntuación de un jugador determinado por su id
     * @param id
     * @param puntuacion
     */
    public void modificarPuntuacion(int id, int puntuacion) {
        Jugador j = new Jugador(id, "", 0, 0, "");
        if (jugadores.contains(j)) {
            for(Jugador jugador: jugadores) {
                if (jugador.getId() == id) {
                    jugador.setPuntos(puntuacion);
                }
            }

            /**
             //Para ranking si lo hacemos con un for y luego con un set le
             //cambiamos la puntuación no lo reordenaría
             //ConcurrentModificationException
             for(Jugador jugador: ranking) {
             if (jugador.getId() == id) {
             jugador.setPuntos(puntuacion);
             }
             }
             */

            //Mejor así. Borramos el ranking y lo vuelve a crear con las nuevas puntuaciones
            this.ranking.clear();
            this.ranking.addAll(jugadores);
        } else {
            IO.println("Id de jugador no encontrado: " + id);
        }

    }
}