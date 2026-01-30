package Tema2.TareasTema2;

import java.util.Scanner;

public class Ejercicio4_1BUCLES {
    public static void main(String[] args) {

        //Lanza 2 dados (1-6) mientras sean diferentes
        //Cuenta las veces que ahs tenido que tirar los dados

        Scanner sc = new Scanner(System.in);

        int contador = 0;
        int dado1,dado2;

        do {
            System.out.println("Presione la tecla (Enter) para tirar los dado");
            sc.nextLine();

            dado1 = (int) (Math.random() * 6) + 1;
            dado2 = (int) (Math.random() * 6) + 1;
            System.out.println("DADO 1: " + dado1);
            System.out.println("DADO 1: " + dado2);

            contador++;

            if (dado1 == dado2){
                break;
            }
        } while (true);//Termina si la tiradas es el numero elegido

        System.out.println("Lo dados 1 y 2 son iguales, felicidades.");
        System.out.println("Se tiraron los dados " + contador + "  veces");
    }
}

