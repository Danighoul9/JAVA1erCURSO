package Tema2.TareasTema2;

import java.util.Scanner;

public class Ejercicio12BUCLES {
    public static void main(String[] args) {

        //Pide 5 numeros por teclado y guarda en una variable la suma
        //que sean impares

        Scanner sc = new Scanner(System.in); //Crea el objeto para leer de teclado
        int num;
        int suma = 0;

        for(int i =1; i<=5; i++){

            System.out.println(" Dime un numero entero ");
            num = sc.nextInt();

            if(num % 2 != 0 ){
                suma = suma+num;
            }
        }

        System.out.println("La suma de los numeros impares son :" + suma);















    }
}
