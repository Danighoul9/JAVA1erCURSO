package Tema3.TareasTema3.Ejercicios_2Matrices;

public class Ejercicio13_1MatrizBidimensional {

    public static void pintarMatriz(int[][] m) {
        for(int i=0; i < m.length; i++) {
            for(int j=0; j < m[i].length; j++) {
                System.out.printf("%3d ", m[i][j]);
            }
            System.out.println();  // 3.14 //Pinto el salto de línea al terminar la fila
        }
    }

    public static void main(String[] args) {

        //Crea una matriz 5x5 de enteros y rellénala con números aleatorios entre 1 y 100.
        //Luego, calcula la suma de cada fila y cada columna, y muestra los resultados.

        int[][] matriz = new int[3][5];
        for(int i=0; i < matriz.length; i++) {
            for(int j=0; j < matriz[i].length; j++) {
                matriz[i][j] = (int) (Math.random() * 10);
            }
        }

        pintarMatriz(matriz);

        //Sumar filas
        int sumaFila = 0;
        for(int i=0; i < matriz.length; i++) { //fila
            for(int j=0; j < matriz[i].length; j++) { //columna
                sumaFila += matriz[i][j];
            }
            System.out.println("La suma de la fila " + i + " es: " + sumaFila );
            sumaFila = 0; //Para que calcule la suma de la siguiente fila
        }

        //Sumar columnas
        int sumaColumna = 0;
        for(int j=0; j < matriz[0].length; j++) { //columna
            for(int i=0; i < matriz.length; i++) { //fila+
                sumaColumna += matriz[i][j];
            }
            System.out.println("La suma de la columna " + j + " es: " + sumaColumna );
            sumaColumna = 0; //Para que calcule la suma de la siguiente columna
        }

    }
}
