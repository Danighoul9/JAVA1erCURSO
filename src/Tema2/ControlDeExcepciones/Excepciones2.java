package Tema2.ControlDeExcepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Excepciones2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opcion=-1;

        do {
            System.out.println("1. Opción 1");
            System.out.println("2. Opción 2");
            System.out.println("3. Salir");

            //Si no introduces un entero, pongo la opción a -1
            try {
                opcion = sc.nextInt();
            } catch (InputMismatchException exc) {
                sc = new Scanner(System.in); //Para volver a pedir datos
                opcion = -1;
            }

            switch (opcion) {
                case 1:
                    System.out.println("1"); break;
                case 2:
                    System.out.println("2"); break;
                case 3:
                    System.out.println("Gracias por usar nuestro programa"); break;
                default:
                    System.out.println("Opción incorrecta (1-3)");
            }
        } while (opcion != 3);


    }
}
