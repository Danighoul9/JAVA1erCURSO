package Tema3.TareasTema3.Ejercicios_1Arrays;

import java.util.Scanner;

public class Oca {

    public static int tirada() {
        return (int) (Math.random() * 6) + 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Juego de la Oca con 63 casillas
        String[] casillas = new String[63]; //pos 0 - pos 62, casillas 1 - 63
        int[] ocas = {1, 5, 9, 14, 18, 23, 27, 32, 36, 41, 45, 50, 54, 59, 63};
        int[] puentes = {6,12};
        int[] dados = {26, 53};
        int muerte = 58;

        //int pozo = 31; --> hasta que pase otro
        //int carcel = 52; --> caiga otro
        //int laberinto = 42; --> cuatro turnos

        //Fichas jugadores, la posición en la que está cada jugador
        int[] jugadores = {-1,-1,-1,-1};

        int tirada=0;
        while(true) {

            //PARA CADA JUGADOR
            for(int i=0; i<jugadores.length; i++) {
                //Comprobar muerte
                if (jugadores[i] != -10) {
                    tirada = tirada();
                    System.out.println("Tirada: " + tirada);

                    //Mover jugador
                    jugadores[i] = jugadores[i] + tirada;

                    //Pintar dónde está
                    System.out.println("Jugador " + (i+1) + ": " + (jugadores[i]+1));

                    //Comprobar dónde está -------------------

                    //FIN
                    if (jugadores[i]+1 == 63 ) {
                        System.out.println("Jugador " + (i-1) + " has ganado");
                        return;
                    }
                    //Volver para atrás
                    if (jugadores[i]+1 > 63 ) {
                        System.out.println("Te has pasado");
                        jugadores[i] = 63 - (jugadores[i]+1 - 63) - 1;
                        System.out.println("Jugador " + (i+1) + ": " + (jugadores[i]+1));
                        continue;

                    }

                    //MUERTE
                    if (jugadores[i]+1 == muerte) {
                        System.out.println("Has muerto");
                        jugadores[i] = -10;
                        continue;
                    }
                    //DADOS
                    if (jugadores[i]+1 == dados[0]) {
                        jugadores[i] = dados[1]-1;
                        //Tira otra vez
                        System.out.println("DADO - Tira otra vez");
                        i--;
                        continue;
                    }
                    if (jugadores[i]+1 == dados[1]) {
                        jugadores[i] = dados[0]-1;
                        //Tira otra vez
                        System.out.println("DADO - Tira otra vez");
                        i--;
                        continue;
                    }
                    //PUENTES
                    if (jugadores[i]+1 == puentes[0]) {
                        jugadores[i] = puentes[1]-1;
                        //Tira otra vez
                        System.out.println("PUENTE - Tira otra vez");
                        i--;
                        continue;
                    }
                    if (jugadores[i]+1 == puentes[1]) {
                        jugadores[i] = puentes[0]-1;
                        //Tira otra vez
                        System.out.println("PUENTE - Tira otra vez");
                        i--;
                        continue;
                    }
                    //OCAS
                    for(int j=0; j<ocas.length; j++) {
                        if (jugadores[i]+1 == ocas[j]) {
                            jugadores[i] = ocas[j+1]-1;
                            //Tirar otra vez
                            System.out.println("OCA - Tira otra vez");
                            i--;
                            break;
                        }
                        //Si caes en la última oca, la 59, vas a la 63 y ganas
                        if (jugadores[i]+1 == 63 ) {
                            System.out.println("Jugador " + (i+1) + " has ganado");
                            return;
                        }
                    }

                }

            }

            System.out.println("Presiona ENTER para continuar");
            sc.nextLine();

        }

    }
}