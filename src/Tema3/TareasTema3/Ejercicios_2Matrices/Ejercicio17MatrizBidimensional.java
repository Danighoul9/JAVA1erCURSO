package Tema3.TareasTema3.Ejercicios_2Matrices;

public class Ejercicio17MatrizBidimensional {

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

        char[][] matriz = new char[8][8];


        for(int i=0; i < matriz.length; i++) {
            for(int j=0; j < matriz[i].length; j++){
                matriz[i][j] = '-';

                if(i==j){
                    matriz[i][j] = 'x';
                }

                if(i + j == matriz.length-1){
                    matriz[i][j] = 'x';
                }
            }
        }

        pintarMatriz(matriz);






    }


}

