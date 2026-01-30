package Tema2.TareasTema2;

import java.util.Scanner;

public class Ejercicio5BUCLES {
    public static void main(String[] args) {
        //Pide dos numeros por teclado entre 1-100
        //Muestra los numeros pares entre esos dos numero

        Scanner sc = new Scanner(System.in);

        int num1, num2;

        System.out.println("Dime primer número (1-100): ");
        num1 = sc.nextInt();
        System.out.println("Dime segundo número (1-100): ");
        num2 = sc.nextInt();

        //Intercambiamos si num1 es mayor que num2
        if (num1 > num2) {
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }

        while (num1 <= num2) {
            if (num1 % 2 == 0) {
                System.out.print(num1 + ", ");
            }
            num1++;;
        }


    }
}
