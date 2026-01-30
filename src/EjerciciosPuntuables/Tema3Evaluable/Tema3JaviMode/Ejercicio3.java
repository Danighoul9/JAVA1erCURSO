package EjerciciosPuntuables.Tema3Evaluable.Tema3JaviMode;

import java.util.Scanner;

public class Ejercicio3 {

    /**
     * BATALLA NAVAL
     *
     * Inicialización:
     * Crear un tablero de 8x8 (matriz de char ), inicialmente relleno de '~' (agua).
     * Colocar aleatoriamente:
     * 3 barcos pequeños de tamaño 2 (dos casillas consecutivas en horizontal o vertical)
     * Los barcos estarán representados con ' B '
     * No pueden superponerse ni salirse del tablero
     *
     * Juego:
     * El jugador tiene 20 disparos para hundir todos los barcos
     * En cada turno, el jugador introduce dos coordenadas (fila y columna)
     * El programa responde:
     * “¡TOCADO!” si hay barco en la celda (marca con ' X ')
     * “Agua” si no hay barco (marca con ' O ')
     * “Ya disparaste ahí” si esa casilla ya ha sido jugada
     * Mostrar el tablero después de cada disparo (sin revelar los barcos no descubiertos)
     *
     * Finalización:
     * Si se hunden todos los barcos: victoria
     * Si se agotan los 20 disparos: derrota
     */

    /**
     * Rellena el tablero con '~'
     * @param tablero
     */
    public static void inicializarTablero(char[][] tablero) {
        for(int i=0; i < tablero.length; i++) {
            for(int j=0; j < tablero[i].length; j++) {
                tablero[i][j] = '~';
            }
        }
    }

    /**
     * Pinta la matriz en pantalla
     * @param matriz
     */
    public static void mostrarTablero(char[][] matriz, boolean mostrarBarcos) {
        for(int i=0; i < matriz.length; i++) {
            for(int j=0; j < matriz[i].length; j++) {
                if (mostrarBarcos && matriz[i][j] == 'B') { //Ver al principio si me pone los barcos
                    System.out.printf("%2c", matriz[i][j]);
                } else if (!mostrarBarcos && matriz[i][j] == 'B') {
                    System.out.printf("%2c", '~');
                } else {
                    System.out.printf("%2c", matriz[i][j]);
                }
            }
            System.out.println();
        }
    }

    public static void colocarBarco(char[][] tablero, int tamano) {
        int direccion; // 0 -> horizontal, 1 -> vertical
        int fila, columna;
        boolean solapado = false;

        do {
            fila = (int)(Math.random()*8);
            columna = (int)(Math.random()*8);
            direccion = (int)(Math.random()*2); //0 -> horizontal, 1 -> vertical

            if (direccion == 0) { //Horizontal
                //Comprobar que no se salga del tablero
                                             // 0 1 2 3 4 5 6 7
                if (columna <= 8 - tamano) { // - - - - - - - -
                    //Comprobar que no se solapen
                    solapado = false;
                    for (int i = 0; i < tamano; i++) {
                        if (tablero[fila][columna + i] == 'B') {
                            solapado = true;
                        }
                    }

                    //Si no se solapa, continuar
                    if (!solapado) {
                        //Colocar barco
                        for (int i = 0; i < tamano; i++) {
                            tablero[fila][columna + i] = 'B';
                        }
                        break; //Barco colocado
                    } else {
                        System.out.println("solapado");
                    }
                }
            } else {
                //Comprobar que no se salga del tablero
                if (fila <= 8 - tamano) { //Vertical
                    //Comprobar que no se solapen
                    solapado = false;
                    for (int i = 0; i < tamano; i++) {
                        if (tablero[fila + i][columna] == 'B') {
                            solapado = true;
                        }
                    }

                    //Si no se solapa, continuar
                    if (!solapado) {
                        for (int i = 0; i < tamano; i++) {
                            tablero[fila + i][columna] = 'B';
                        }
                        break; //Barco colocado
                    } else {
                        System.out.println("solapado");
                    }
                }
            }
        } while( true );

    }

    public static boolean todosBarcosHundidos(char[][] tablero) {
        boolean todosHundidos = true;
        for(int i=0; i < tablero.length; i++) {
            for(int j=0; j < tablero[i].length; j++) {
                if (tablero[i][j] == 'B') {
                    todosHundidos = false;
                    break;
                }
            }
        }
        return todosHundidos;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int disparos = 20;
        char[][] tablero = new char[8][8];
        int dispFila, dispColumna;

        inicializarTablero(tablero);

        colocarBarco(tablero, 3);
        colocarBarco(tablero, 2);
        colocarBarco(tablero, 3);
        colocarBarco(tablero, 4);

        mostrarTablero(tablero,true);

        while(disparos > 0) {

            try {
                System.out.println("Introduce fila del disparo:");
                dispFila = Integer.parseInt(sc.nextLine());
                System.out.println("Introduce columna del disparo:");
                dispColumna = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Coordenadas incorrectas");
                continue;
            }

            try {
                if (tablero[dispFila][dispColumna] == 'B') {
                    System.out.println("TOCADO!");
                    tablero[dispFila][dispColumna] = 'X';
                } else if (tablero[dispFila][dispColumna] == '~') {
                    System.out.println("AGUA");
                    tablero[dispFila][dispColumna] = 'O';
                } else if (tablero[dispFila][dispColumna] == 'X' || tablero[dispFila][dispColumna] == 'O') {
                    System.out.println("YA DISPARASTE AHI");
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Coordenadas fuera de rango");
                continue;
            }

            mostrarTablero(tablero, false);

            //Condición de victoria
            if (todosBarcosHundidos(tablero)) {
                System.out.println("GANASTE");
                break;
            }

            disparos--;
            System.out.println("Disparos restantes: " + disparos);
        }

        if (disparos == 0) {
            System.out.println("PERDISTE");
        }

    }
}
