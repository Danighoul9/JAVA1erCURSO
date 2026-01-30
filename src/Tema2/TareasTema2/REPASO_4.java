package Tema2.TareasTema2;

import java.util.Scanner;

public class REPASO_4 {
    public static void main(String[] args) {

        //PONEMOS EL SCANNER
        Scanner sc = new Scanner(System.in); //Crea el objeto para leer de teclado



        //Pide un numero por teclado y comprueba si es o no primo
        //Un numero es primo si SOLO es divisible por 1 y por el mismo

        int i;
        int num;
        int resultado = 0;
        boolean esPremo = true;

        System.out.println("Dime un número");
        num = sc.nextInt();

        for(i=2; i <= (num-1);i++){

            resultado= num % i;

            if(resultado == 0){
                esPremo = false;
                break;
            }
           
        }
        if (esPremo){
            System.out.println("El número es primo");
        }else{
            System.out.println("El número no es primo");
        }












    }
}
