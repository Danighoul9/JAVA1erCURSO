package Tema3.TareasTema3.Ejercicios_2Matrices;

public class Ejercicio15MatrizBidimensional {

    public static void pintarMatriz(int[][] m) {
        for(int i=0; i < m.length; i++) {
            for(int j=0; j < m[i].length; j++) {
                System.out.printf("%3d ", m[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        //Dada una matriz 5x5 de enteros generados aleatoriamente, muestra los elementos de la diagonal principal y calcula su suma.


        int[][] matriz = new int[5][5];

        for(int i=0; i < matriz.length; i++) {
            for(int j=0; j < matriz[i].length; j++) {
                matriz[i][j] = (int) (Math.random() * 100);
            }
        }

        pintarMatriz(matriz);

        int acumulador = 0;
        System.out.println("Los numeros de la diagonal principal son: ");

        for(int i=0; i < matriz.length; i++) {
            for(int j=0; j < matriz[i].length; j++) {
                if(i == j){
                    System.out.print(matriz[i][j] + " - ");
                    acumulador += matriz[i][j];
                }
            }
        }
        System.out.println();
        System.out.println("La suma de la diagonal prinipal es: " + acumulador);


    }
}
