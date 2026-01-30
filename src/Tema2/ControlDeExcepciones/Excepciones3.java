package Tema2.ControlDeExcepciones;

import java.util.Scanner;

public class Excepciones3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x1,x2;
        System.out.println("Dime un número:");
        x1 = sc.nextInt();
        System.out.println("Dime un número:");
        x2 = sc.nextInt();

        try {
            System.out.println("La división es: " + x1 / x2);
        } catch (ArithmeticException exc) {
            System.out.println("Error: no se puede dividir por cero");
        }




    }
}
