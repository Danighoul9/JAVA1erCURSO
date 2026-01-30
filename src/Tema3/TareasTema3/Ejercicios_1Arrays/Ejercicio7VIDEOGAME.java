package Tema3.TareasTema3.Ejercicios_1Arrays;

import java.util.Scanner;

public class Ejercicio7VIDEOGAME {

    /**
     * Estás desarrollando un pequeño sistema para un videojuego de rol (RPG).
     * En este juego, el personaje del jugador tiene varias armas disponibles,
     * y debe atacar a un grupo de enemigos. Cada arma causa un daño distinto,
     * y cada enemigo tiene una cierta cantidad de salud (HP).
     *
     * REQUISITOS:
     * 1. Crea un array con los nombres de las armas del jugador.
     * Ejemplo: Espada, Arco, Báculo mágico, Dagas.
     * 2. Crea otro array paralelo con el daño que hace cada arma.
     * Por ejemplo, si el índice 0 corresponde a "Espada", el daño en el array
     * de daños en el índice 0 podría ser 25.
     * 3. Crea un array con los nombres de los enemigos y otro con su salud inicial.
     * Ejemplo: Goblin (40 HP), Orco (60 HP), Dragón bebé (100 HP).
     * 4. Muestra por pantalla todas las armas disponibles con su daño.
     * 5. Selecciona un arma (puede hacerse de forma fija en el código o por
     * teclado) y usa su daño para atacar a un enemigo aleatoriamente, restando el
     * valor de daño a su salud.
     * 6. Evita que la salud de un enemigo sea negativa (mínimo 0).
     * 7. Muestra por pantalla la salud restante de cada enemigo y especifica cuáles han sido derrotados.
     * 8. Realiza un bucle infinito para que el juego siga funcionando hasta que
     * hayan sido derrotados al menos dos enemigos.
     *
     */

    public static void pintar(String[] array) {
        for(int i=0; i < array.length; i++) {
            System.out.println((i+1) + " -> " + array[i]);
        }
    }

    /**
     * Número aleatorio entre 0 y maximo-1
     * @param maximo
     * @return
     */
    public static int numeroAleatorio(int maximo) {
        return (int) (Math.random() * maximo);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arma, enemigo;

        String[] armas = { "Espada del Caos", "Arco del Triunfo",
                "Báculo sagrado", "Dagas de la Luz" };
        //int[] usosArmas = { 2, 5, 1, 8 };
        int[] pdArmas = { 25, 10, 20, 15 };
        String[] enemigos = {"Orco", "Elfo oscuro", "Enano loco", "Dragón blanco"};
        int[] psEnemigos = { 60, 120, 50, 100 };

        for(int i=0; i < armas.length; i++) {
            System.out.println(armas[i] + " - " + pdArmas[i]);
        }

        int enemigosDerrotados = 0;
        boolean maquina=false;

        while(!maquina) {
            //Golpear
            System.out.println("Elige arma (1-4)");
            pintar(armas);
            arma = Integer.parseInt(sc.nextLine());

            //No golpear a un enemigo muerto
            do {
                enemigo = numeroAleatorio(enemigos.length);
            } while (psEnemigos[enemigo] <= 0);

            //Quitar salud a ese enemigo
            psEnemigos[enemigo] -= pdArmas[arma - 1];
            System.out.println("Enemigo " + enemigos[enemigo] + " tiene " + psEnemigos[enemigo] + " HP");

            //Comprobar salud del enemigo
            if (psEnemigos[enemigo] <= 0) {
                System.out.println("Has derrotado al enemigo " + enemigos[enemigo]);
            }

            //Mostrar enemigos y su salud
            for (int i = 0; i < enemigos.length; i++) {
                if (psEnemigos[i] <= 0) {
                    System.out.println(enemigos[i] + " ha sido derrotado");
                } else {
                    System.out.println(enemigos[i] + " - " + psEnemigos[i]);
                }
            }

            //Si hay al menos dos enemigos derrotados que termine el bucle
            enemigosDerrotados=0;
            for(int i=0; i < psEnemigos.length; i++) {
                if (psEnemigos[i] <= 0) {
                    enemigosDerrotados++;
                }
                if (enemigosDerrotados >= 2) {
                    maquina=true;
                    break;
                }
            }

        }
    }
}
