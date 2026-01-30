package EjerciciosPuntuables.Tema3Evaluable;

import java.util.Scanner;

public class EJ3_DANIEL_DIAZ_CAMPOY_MATRICES {


    public static void pintarMatriz(char[][] m) {
        for(int i=0; i < m.length; i++) {
            for(int j=0; j < m[i].length; j++) {
                System.out.printf("%2c", m[i][j]);
            }
            System.out.println();  // 3.14 //Pinto el salto de línea al terminar la fila
        }
    }

    public static void colocarBarcos (char[][] tablero, int barco1X, int barco1Y, int barco2X, int barco2Y,
    int barco3X, int barco3Y) {

        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                tablero[barco1X][barco1Y] = 'B';
                tablero[barco2X][barco2Y] = 'B';
                tablero[barco3X][barco3Y] = 'B';
            }
        }

    }

    public static void mostrarTablero(char[][] tablero, boolean mostrarBarcos){
        mostrarBarcos = false;

        for(int i=0; i < tablero.length; i++) {
            for(int j=0; j < tablero[i].length; j++) {
                tablero[i][j] = '~';
            }
        }

    }

    static void main(String[] args) {
        //Batalla Naval Simplificada

        //Crea un juego de batalla naval para consola en un tablero de 8x8. El programa debe realizar lo
        //siguiente:

        //Inicialización:
        //Crear un tablero de 8x8 (matriz de char ), inicialmente relleno de '~' (agua).

        //Colocar aleatoriamente:
        //3 barcos pequeños de tamaño 2 (dos casillas consecutivas en horizontal o vertical)
        //Los barcos estarán representados con ' B '
        //No pueden superponerse ni salirse del tablero

        //Juego:

        //El jugador tiene 20 disparos para hundir todos los barcos

        //En cada turno, el jugador introduce dos coordenadas (fila y columna)

        //El programa responde:

        //“¡TOCADO!” si hay barco en la celda (marca con ' X ')
        //“Agua” si no hay barco (marca con ' O ')
        //“Ya disparaste ahí” si esa casilla ya ha sido jugada

        //Mostrar el tablero después de cada disparo (sin revelar los barcos no descubiertos)

        //Finalización:

        //Si se hunden todos los barcos: victoria
        //Si se agotan los 20 disparos: derrota

        //Requerimientos adicionales:

        //Crea un método void colocarBarco (char[][] tablero, int tamano) que coloque un barco
        //aleatorio de tamaño dado en el tablero.

        //Crea un método void mostrarTablero(char[][] tablero, boolean mostrarBarcos) que
        //muestre el tablero. Si mostrarBarcos es true , muestra los barcos con 'B'; si es false ,
        //muestra '~' en su lugar.

        //Crea un método boolean todosBarcosHundidos(char[][] tablero) que compruebe si
        //quedan barcos ('B') en el tablero.

        //1.
        //Crear un tablero de 8x8 (matriz de char ), inicialmente relleno de '~' (agua).


        Scanner sc = new Scanner(System.in);

        char[][] tablero = new char[8][8];
        int turnos = 20;
        int disparoX = 0, disparoY = 0;

        //Coordenadas barcos 1,2,3
        int barco1X = (int) (Math.random() * 8), barco1Y = (int) (Math.random() * 8);
        int barco2X = (int) (Math.random() * 8), barco2Y = (int) (Math.random() * 8);
        int barco3X = (int) (Math.random() * 8), barco3Y = (int) (Math.random() * 8);

        for(int i=0; i < tablero.length; i++) {
            for(int j=0; j < tablero[i].length; j++) {
                tablero[i][j] = '~';
            }
        }


        colocarBarcos(tablero, barco1X,barco1Y,barco2X,barco2Y,barco3X,barco3Y);

        //Borrar
        pintarMatriz(tablero);


        //Bucle hasta agotar turnos
        do {

            do {
                System.out.println("¿En que coordenada X crees que esta el tesoro? (0-7)");
                disparoX = Integer.parseInt(sc.nextLine());
            } while (disparoX < 0 || disparoX > 7);
            do {
                System.out.println("¿En que coordenada Y crees que esta el tesoro? (0-7)");
                disparoY = Integer.parseInt(sc.nextLine());
            } while (disparoY < 0 || disparoY > 7);


            if(disparoX == barco1X && disparoY == barco1Y ||
               disparoX == barco2X && disparoY == barco3Y ||
               disparoX == barco3X && disparoY == barco3Y ){

                System.out.println("¡TOCADO!");
                //Pintar disparo en el tablero
                tablero[disparoX][disparoY] = 'X';
            }else{
                //Pintar disparo en el tablero
                tablero[disparoX][disparoY] = '0';
            }

            pintarMatriz(tablero);

            //Restamos un turno
            turnos--;

            System.out.println("Te quedan " + turnos + " turnos");
        } while(turnos > 0);

        //Si sales del while por agotar los turnos has perdido


    }

}
