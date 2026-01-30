package Tema2.TareasTema2;

import java.util.Scanner;

public class REPASO_1 {
    public static void main(String[] args) {

        //PONEMOS EL SCANNER
        Scanner sc = new Scanner(System.in); //Crea el objeto para leer de teclado

        //Crea una app que pida un numero y calcule su factorial
        //(El factorial de un numero es el producto de todos los enteros entre 1 y el propio numero
        //seguido de un signo de exclamacion.Por ejemplo 5! = 1*2*3*4*5= 120

        int num;
        int i;
        int factorial = 1;
        int contador = 0;

        System.out.println("Dime un número:");
        num = sc.nextInt();
        for (i = 1; i <= num; i++) {
            factorial = factorial * i;
            contador++;
            System.out.print(i + " * ");
        }
        System.out.println();

        System.out.println("Hay " + contador + " números que se multiplican para obtener su factorial");
        System.out.println("Calculo del factorial de su numero = " + factorial);


    }
}
