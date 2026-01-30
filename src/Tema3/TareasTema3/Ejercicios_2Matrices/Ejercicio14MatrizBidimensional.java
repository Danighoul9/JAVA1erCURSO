package Tema3.TareasTema3.Ejercicios_2Matrices;

public class Ejercicio14MatrizBidimensional {

    public static void pintarMatriz(int[][] m) {
        for(int i=0; i < m.length; i++) {
            for(int j=0; j < m[i].length; j++) {
                System.out.printf("%3d ", m[i][j]);
            }
            System.out.println();  // 3.14 //Pinto el salto de línea al terminar la fila
        }
    }

    public static void main(String[] args) {
        //Dadas dos matrices 4x4 de enteros,
        //realiza la suma de ambas matrices y muestra el resultado
        //en una tercera matriz.

        int[][] matriz1 = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int[][] matriz2 = {{4,3,2,1},{5,6,8,9},{1,1,1,1},{3,4,5,6}};
        int[][] matriz3 = new int[4][4];

        pintarMatriz(matriz1);
        System.out.println("--------------------");
        pintarMatriz(matriz2);

        for(int i=0; i < matriz1.length; i++) {
            for(int j=0; j < matriz1[i].length; j++) {
                matriz3[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }

        System.out.println("--------------------");
        pintarMatriz(matriz3);

    }
}
