package Tema3.TareasTema3.Ejercicios_2Matrices;

public class Ejercicio19REINAajedrez {

    public static void pintarMatriz(char[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.printf("%2c", m[i][j]);
            }
            System.out.println();  // 3.14 //Pinto el salto de línea al terminar la fila
        }
    }

    public static void main(String[] args) {

        /**
         * Dada una matriz 8x8 que representa una tablero de ajedrez
         * Dadas las coordenadas i,j donde está el rey en el tablero
         * Dime a qué posiciones del tablero se puede mover el rey
         */



        //Posición es (reinaX, reinaY)
        //--------
        //*-------   reinaX-2, reinay-2     (1,0)
        //-*------   reinaX-1, reinaY-1     (2,1)
        //--R-----   reinaX3, reinaY2       (3,2)
        //---*----   reinaX+2, reinaY+2     (4,3)
        //----*---   reinaX+3, reinaY+3     (5,4)
        //-----*--   reinaX+4, reinaY+4     (6,5)
        //------*-   reinaX+5, reinaY+5     (7,6)

        //Posición es (reinaX, reinaY)
        //-----*--   reinaX-3, reinaY+5     (0,7)
        //----*---   reinaX-2, reinaY+4     (1,6)
        //---*----   reinaX-1, reinaY+3     (2,5)
        //--R-----   reinaX3, reinaY2       (3,2)
        //-*------   reinaX+1, reinaY-1     (4,1)
        //*-------   reinaX+2, reinaY-2     (5,0)

        char[][] tablero = new char[8][8];

        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                tablero[i][j] = '-';
            }
        }

        int reinaX = 5, reinaY = 2;
        tablero[reinaX][reinaY] = 'R';

        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {

                if (i == reinaX && j == reinaY) {
                    continue;
                }

                //Posiciones como torre
                if (i == reinaX || j == reinaY) {
                    tablero[i][j] = 'o';
                }

                //Posiciones como alfil diagonal ↖ ↘ (principal)
                if ((i - j  == reinaX - reinaY)) {
                    tablero[i][j] = 'o';
                }

                //Posiciones como alfil diagonal ↗ ↙ (secundaria)
                if ((i + j  == reinaX + reinaY)) {
                    tablero[i][j] = 'o';
                }

            }
        }

        pintarMatriz(tablero);

    }
}
