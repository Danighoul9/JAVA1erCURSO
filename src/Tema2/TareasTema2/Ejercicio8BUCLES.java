package Tema2.TareasTema2;

import java.util.Scanner;

public class Ejercicio8BUCLES {

    public static void main(String[] args) {

        //Pide 10 palabras por teclado y dime cuantas de ellas
        // tienen longitud mayor de 5 caracteres
        //cadena.length() devuelve la longitud de la adena

        Scanner sc = new Scanner(System.in);

        String palabra;

        int contador = 0;
        int num = 1;

        for(num = 1; num <= 10; num++){
            System.out.println("Dime la palabra " + num);
            palabra = sc.nextLine();

            if (palabra.length() > 5) {
                contador++;
            }
        }
        System.out.println("Hay " + contador + " palabras con mas de 5 caracteres");


        /* CON WHILE
        while(num <= 10) {
            System.out.println("Dime una palabra: ");
            palabra = sc.nextLine();

            if (palabra.length() > 5) {
                contador++;
            }
            num++;
        }
        System.out.println("Hay " + contador + " palabras con mas de 5 caracteres");
        */


        /* CON DO


        num = 1;
        do{
            System.out.println("Dime la palabra");
            palabra = sc.nextLine();

            if (palabra.length() > 5) {
                contador++;
            }
            num++;

        }while(num <= 10);
        System.out.println("Hay " + contador + " palabras con mas de 5 caracteres");
        */

    }
}
