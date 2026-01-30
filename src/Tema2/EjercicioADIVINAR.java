package Tema2;

import java.util.Scanner;

public class EjercicioADIVINAR {
    public static void main(String[] args) {


        //Adivinar un numero generado por el pc entre el (1-100)
        //Pedir por teclado un numero entre 1 y 100 y el programa
        //nos responde si el numero introducido es igual (fin), mayor
        // o menor que el numero generado a acertar

        Scanner sc = new Scanner(System.in);
        int numeroAAdivinar =  (int) (Math.random() * 100) + 1;
        int numero;
        int intentos=0;
        do {
            System.out.println("Dime un número entre 1 y 100: ");
            numero = sc.nextInt();

            if (numero > numeroAAdivinar) {
                System.out.println("Prueba con uno más pequeño");
            } else if (numero < numeroAAdivinar) {
                System.out.println("Prueba con uno más grande");
            } else {
                System.out.println("ACERTÁSTE...");
            }

            if (numero != numeroAAdivinar) {
                System.out.println("Te quedan " + (7-intentos) + " intentos");
            }

            //Extra
            intentos++;
            if (intentos == 7) {
                System.out.println("Lo siento no lo has conseguido :(");
                break; //TERMINA
            }
        } while (numero != numeroAAdivinar);

    }
}
