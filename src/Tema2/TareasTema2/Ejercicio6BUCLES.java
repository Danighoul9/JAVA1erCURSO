package Tema2.TareasTema2;

import java.util.Scanner;

public class Ejercicio6BUCLES {
    public static void main(String[] args) {

        //Pide un numero entero por teclado y di cuantos digitos tiene
        Scanner sc = new Scanner(System.in);

        long num;
        int contador;

        System.out.println("Dime un numero entero: ");
        num = sc.nextLong();


        for (contador = 0; num / 10 != 0; contador++) {
            num = num / 10;
        }
        System.out.println("Tiene " + contador + " digitos.");


    }
}
