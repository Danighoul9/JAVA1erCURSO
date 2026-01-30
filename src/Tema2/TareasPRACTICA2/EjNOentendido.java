package Tema2.TareasPRACTICA2;

import java.util.Scanner;

public class EjNOentendido {
    static Scanner sc = new Scanner(System.in);

    // Método para pintar una fila de la pirámide
    public static void verAsteriscos(int numAs, int total) {
        // Espacios a la izquierda
        for (int i = 1; i <= total - numAs; i++) {
            System.out.print(" ");
        }

        // Asteriscos (2*numAs - 1 para hacer la forma de pirámide)
        for (int i = 1; i <= (2 * numAs - 1); i++) {
            System.out.print("*");
        }

        System.out.println(); // salto de línea al final
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el número de líneas: ");
        int n = sc.nextInt();

        // Bucle que va formando la pirámide
        for (int i = 1; i <= n; i++) {
            verAsteriscos(i, n);
        }

    }
}
