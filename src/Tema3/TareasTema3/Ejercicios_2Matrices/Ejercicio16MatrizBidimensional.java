package Tema3.TareasTema3.Ejercicios_2Matrices;

public class Ejercicio16MatrizBidimensional {


    public static void pintarMatriz(char[][] m) {
        for(int i=0; i < m.length; i++) {
            for(int j=0; j < m[i].length; j++) {
                System.out.printf("%3c", m[i][j]);
            }
            System.out.println();
        }
    }

    static void main(String[] args) {


        //Dibuja una matriz 8x8 con un patrón de tablero de ajedrez usando 'X' blancas y 'O' negras

        char[][] tablero = new char[8][8];

        for(int i=0; i < tablero.length; i++) {
            for(int j=0; j < tablero[i].length; j++) {

                if ((i + j) % 2 == 0){
                    tablero[i][j] = 'x';
                }
                if((i + j) % 2 != 0){
                    tablero[i][j] = '0';
                }
            }
        }


        pintarMatriz(tablero);

    }
}
