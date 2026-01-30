package Tema2.Procedimientos;

import java.util.Scanner;

public class ProcedimientosEJ2 {
    static Scanner sc = new Scanner(System.in);

    //Pintar asteriscos
    public static void verAsteriscos(int numAs) {
        for(int i = 1; i <= numAs; i++){
            System.out.print("*");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int conta = 1;
        int contador = 5;

        while(conta <= contador) {
            System.out.println("Dime un numero");
            int num = sc.nextInt();

            verAsteriscos(num);

            conta++;
        }
        
    }
}
