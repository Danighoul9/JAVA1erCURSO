package ExamenesDePrueba.SegundoExamen;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio1_MENU {

    public static void pintarMenu(){
        System.out.println("1. Intercambiar columna ");
        System.out.println("2. Sumar una fila");
        System.out.println("3. Comprueba si la diagonal principal y la inversa son iguales.");
        System.out.println("4. Pintar las coordenadas i,j donde se encuentra el menor elemento de la matriz.");
        System.out.println("5. Muestra la matriz con las filas ordenadas de menor a mayor");
        System.out.println("6.*EXTRA* Muestra la matriz con las columnas ordenadas de menor a mayor");
        System.out.println("7. Salir.");
    }

    public static void pintarMatriz(int[][] m) {
        for(int i=0; i < m.length; i++) {
            for(int j=0; j < m[i].length; j++) {
                System.out.printf("%5d ", m[i][j]);
            }
            System.out.println();  // 3.14 //Pinto el salto de línea al terminar la fila
        }
    }

    //OPCION 1
    public static void cambiarColumnaMatriz(int[][] matriz, int columna1, int columna2) {

        //Le restamos 1 a lo que haya dicho el usuario
        int c1 = columna1 - 1;
        int c2 = columna2 - 1;

        for (int i = 0; i < matriz.length; i++) {
            int temp = matriz[i][c1];
            matriz[i][c1] = matriz[i][c2];
            matriz[i][c2] = temp;
        }

        //Dibujamos la matriz modificada
        for(int i=0; i < matriz.length; i++) {
            for(int j=0; j < matriz[i].length; j++) {
                System.out.printf("%5d ", matriz[i][j]);
            }
            System.out.println();  // 3.14 //Pinto el salto de línea al terminar la fila
        }
    }

    public static int sumarFilaMatriz(int[][] matriz,int nFilaSumar) {

        int filaValorReal = nFilaSumar - 1; // índice real de la fila
        int sumaAcumulador = 0;

        for (int j = 0; j < matriz[filaValorReal].length; j++) {
            sumaAcumulador += matriz[filaValorReal][j];
        }

        return sumaAcumulador;
    }

    public static int[] calcularMenor(int[][] matriz) {
        int[] datos = new int[3]; //0 - valor, 1 - i, 2 - j
        datos[0] = matriz[0][0];
        //datos[1] = 0;
        //datos[2] = 0;
        for(int i=0; i < matriz.length; i++) {
            for(int j=0; j < matriz[i].length; j++) {
                if (matriz[i][j] < datos[0]) {
                    datos[0] = matriz[i][j];
                    datos[1] = i;
                    datos[2] = j;
                }
            }
        }

        return datos;
    }

    public static void ordenarColumnas(int[][] matriz) {
        //1. Trasponer la matriz, pasar filas a columnas
        int aux;
        for(int i=0; i < matriz.length; i++) {
            for(int j=i+1; j < matriz[i].length; j++) {
                aux = matriz[i][j];
                matriz[i][j] = matriz[j][i];
                matriz[j][i] = aux;
            }
        }
        //2. Ordenar filas de menor a mayor
        for(int i=0; i < matriz.length; i++) {
            Arrays.sort(matriz[i]);
        }

        //3. Trasponer la matriz de nuevo
        for(int i=0; i < matriz.length; i++) {
            for(int j=i+1; j < matriz[i].length; j++) { //OJO j=i+1 !!!
                aux = matriz[i][j];
                matriz[i][j] = matriz[j][i];
                matriz[j][i] = aux;
            }
        }
    }


    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //1. [2 puntos] Nos piden crear una matriz 20×20 de números enteros que inicialmente
        //rellenamos de valores aleatorios (1-100), nos piden hacer un menú con estas opciones:

        //1. Intercambiar columna. Te pedirá dos números de columna e intercambiará los
        //valores de la primera por los valores de la segunda.

        //2. Suma de una fila que se pedirá al usuario (controlar que elija una correcta)

        //3. Comprueba si la diagonal principal y la inversa son iguales.

        //4. Pintar las coordenadas i,j donde se encuentra el menor elemento de la matriz.

        //5. Muestra la matriz con las filas ordenadas de menor a mayor.

        //6. Salir.

        //Rellenar matriz 4x4 con números aleatorios entre 1 y 100

        int[][] matriz = new int[4][4];

        for(int i=0; i < matriz.length; i++) {
            for(int j=0; j < matriz[i].length; j++) {
                matriz[i][j] = (int) (Math.random() * 100) + 1;
            }
        }

        System.out.println("Esto es una matriz 20x20 con numeros aleatorios.");

        pintarMatriz(matriz);

        int respuestaUser= 0;

        do{
            try{
                System.out.println("Que quieres hacer con esta matriz (1-6)");
                pintarMenu();
                respuestaUser = sc.nextInt();
                if(respuestaUser < 1 || respuestaUser > 7){
                    System.out.println("Las opciones deben de ser de (1-6)");
                }
            }catch (InputMismatchException e){
                System.out.println("Debes introducir un número válido.");
                System.out.println(e.getMessage());
                sc.nextLine();
            }

            switch (respuestaUser) {
                case 1:
                    System.out.println("Que columnas quieres intercambiar");

                    //DoWhile para que el usuario no se salga del rango
                    int columna1;
                    do {
                        System.out.println("Dime una columna (1-4)");
                        columna1 = sc.nextInt();
                        if (columna1 < 1 || columna1 > 4) {
                            System.out.println("Columna no válida. Debe ser entre 1 y 4.");
                        }
                    } while (columna1 < 1 || columna1 > 4);

                    //DoWhile para que el usuario no se salga del rango
                    int columna2;
                    do {
                        System.out.println("Dime otra columna por la que intercambiarla columna (1-4)");
                        columna2 = sc.nextInt();
                        if (columna2 < 1 || columna2 > 4) {
                            System.out.println("Columna no válida. Debe ser entre 1 y 4.");
                        }
                    } while (columna2 < 1 || columna2 > 4);

                    cambiarColumnaMatriz(matriz,columna1,columna2);
                break;

                case 2:
                    //DoWhile para que el usuario no se salga del rango
                    int nFilaSumar;
                    do {
                        System.out.println("¿Qué fila quieres sumar? (1-4)");
                        nFilaSumar = sc.nextInt();
                        if (nFilaSumar < 1 || nFilaSumar > 4) {
                            System.out.println("Fila no válida. Debe ser entre 1 y 4.");
                        }
                    } while (nFilaSumar < 1 || nFilaSumar > 4);

                    System.out.println("El resultado de esa fila es: " + sumarFilaMatriz(matriz,nFilaSumar));
                break;

                case 3:

                    boolean diagonalesIguales = true;

                    for (int i = 0; i < matriz.length; i++) {
                        for(int j=0; j < matriz[i].length; j++) {
                            if(i==j){
                                //Si no coinciden, no seguir comprobando, no son iguales
                                if (matriz[i][j] != matriz[i][matriz.length - 1 - j]) {
                                    diagonalesIguales = false;
                                    break;
                                }
                            }
                        }
                    }
                    System.out.println("La diagonal principal y la diagonal inversa son iguales: " + diagonalesIguales);
                break;

                case 4:
                    int[] menor = calcularMenor(matriz);
                    System.out.println("El menor valor es: " + menor[0] + " en la fila "
                            + menor[1] + " y columna " + menor[2]);
                break;

                case 5:
                    System.out.println("Filas ordenadas de menor a mayor");
                    for (int i = 0; i < matriz.length; i++) {
                        Arrays.sort(matriz[i]);
                    }
                    pintarMatriz(matriz);
                    break;

                case 6:
                    //EXTRA POR SI ACASO
                    System.out.println("Columnas ordenadas de menor a mayor");
                    ordenarColumnas(matriz);
                    pintarMatriz(matriz);

                case 7:
                    System.out.println("Gracias por usar nuestro programa");
                    break;
                default:
                    System.out.println("Opción incorrecta (1-7)");
            }
        }while(respuestaUser != 7);

    }
}