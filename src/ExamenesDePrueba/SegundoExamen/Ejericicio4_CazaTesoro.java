package ExamenesDePrueba.SegundoExamen;

import java.util.Scanner;

public class Ejericicio4_CazaTesoro {
    /**
     * Escribe un programa en Java que simule un juego de la caza del tesoro. En
     * este juego, el tablero estará representado por una matriz 10x10 y el objetivo es
     * encontrar el tesoro escondido en una de las celdas del tablero. El jugador debe
     * ingresar coordenadas para intentar encontrar el tesoro.
     * Reglas del juego:
     * 1. El tablero tiene dimensiones de 10x10, inicialmente vacías ‘-’.
     * 2. Se coloca un tesoro en una casilla aleatoria del tablero.
     * 3. El jugador hará intentos para localizar el tesoro, dando la coordenada x y la
     * coordenada y donde cree que está el tesoro.
     * 4. El jugador tiene 15 intentos para encontrar el tesoro.
     * 5. Después de cada intento, el juego dará pistas:
     * • Si el jugador dispara a una casilla más cerca del tesoro (en términos
     * de distancia), se le da la pista "Estás más cerca del tesoro".
     * • Si el jugador dispara a una casilla más alejada, se le da la pista "Estás
     * más lejos del tesoro".
     * • Si la distancia es menor que la anterior, el jugador está más cerca. Si
     * es mayor, está más lejos.
     * • La distancia puede calcularse usando la distancia de Manhattan
     * que se calcula como la suma del valor absoluto de la resta de las
     * coordenadas x, más el valor absoluto de la resta de las coordenadas
     * y. Donde (x1,y1) es el punto donde está el tesoro, y (x2,y2) es el
     * punto donde tú pruebas.
     * Distancia = ∣x1 - x2∣ + ∣y1 - y2∣
     * 6. El jugador debe seguir intentando hasta encontrar el tesoro o agotar sus
     * intentos.
     * 7. Si el jugador encuentra el tesoro, el juego termina y se muestra un mensaje
     * de victoria. Si se quedan sin intentos, se muestra un mensaje de derrota.
     */


    public static void pintarMatriz(char[][] m) {
        for(int i=0; i < m.length; i++) {
            for(int j=0; j < m[i].length; j++) {
                System.out.printf("%2c", m[i][j]);
            }
            System.out.println();  // 3.14 //Pinto el salto de línea al terminar la fila
        }
    }

    public static int distanciaManhattan(int disparoX, int disparoY,
                                         int tesoroX, int tesoroY) {
        return Math.abs(disparoX - tesoroX) + Math.abs(disparoY - tesoroY);
    }


    public static void main(String[] args) {

        /**
         *   Distancia anterior = 10
         *   Distancia actual = 2
         *                          Disp. Tesoro
         *   --*-------    (i,j) -> (0,3) (4,7) -> Distancia = |4-0| + |7-3| = 10
         *   ----------
         *   ----*-----
         *   ----------
         *   -----*-T--
         *   ----------
         *   ----------
         *   ----------
         *   ----------
         *   ----------
         *
         */

        Scanner sc = new Scanner(System.in);

        char[][] tablero = new char[10][10];
        int tesoroX = 0, tesoroY = 0;
        int disparoX = 0, disparoY = 0;
        int distanciaAnterior = 20; //Mayor que la mayor distancia posible
        int distanciaActual = 0;
        int turnos = 15;

        for(int i=0; i < tablero.length; i++) {
            for(int j=0; j < tablero[i].length; j++) {
                tablero[i][j] = '-';
            }
        }

        //pintarMatriz(tablero);
        tesoroX = (int) (Math.random() * 10);
        tesoroY = (int) (Math.random() * 10);

        //tablero[tesoroX][tesoroY] = 'T';
        pintarMatriz(tablero);

        //Bucle hasta agotar turnos
        do {

            do {
                System.out.println("¿En que coordenada X crees que esta el tesoro? (0-9)");
                disparoX = Integer.parseInt(sc.nextLine());
            } while (disparoX < 0 || disparoX > 9);
            do {
                System.out.println("¿En que coordenada Y crees que esta el tesoro? (0-9)");
                disparoY = Integer.parseInt(sc.nextLine());
            } while (disparoY < 0 || disparoY > 9);

            //Pintar disparo en el tablero
            tablero[disparoX][disparoY] = '*';
            pintarMatriz(tablero);

            distanciaActual = distanciaManhattan(disparoX, disparoY, tesoroX, tesoroY);
            System.out.println("Distancia del disparo: " + distanciaActual);

            //Determinar si estás más cerca o más lejos del tesoro
            if (distanciaActual < distanciaAnterior) {
                System.out.println("Estás más cerca del tesoro");
            } else if (distanciaActual > distanciaAnterior) {
                System.out.println("Estás más lejos del tesoro");
            } else {
                System.out.println("Estás igual de lejos o cerca del tesoro");
            }

            //Actualizar distancia anterior
            distanciaAnterior = distanciaActual;

            //Condición de fin
            if (distanciaActual == 0) {
                System.out.println("Has encontrado el tesoro!");
                break;
            }

            //Restamos un turno
            turnos--;
            System.out.println("Te quedan " + turnos + " turnos");
        } while(turnos > 0);

        //Si sales del while por agotar los turnos has perdido
        if (turnos == 0) {
            System.out.println("Has perdido");
            System.out.println("El tesoro se encuentra en (" + tesoroX + "," + tesoroY + ")");
            tablero[tesoroX][tesoroY] = 'T';
            pintarMatriz(tablero);
        }

    }
}
