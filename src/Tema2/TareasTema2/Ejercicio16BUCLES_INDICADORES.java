package Tema2.TareasTema2;

import java.util.Scanner;

public class Ejercicio16BUCLES_INDICADORES {
    public static void main(String[] args) {
        //PONEMOS EL SCANNER
        Scanner sc = new Scanner(System.in); //Crea el objeto para leer de teclado

        //Pde 5 números por teclado y dime si "alguno" de ellos
        // es múltiplo de 5

        int num;
        boolean indicador = false;
        int i = 1;
        int contMultDe5 = 0;

        for(i = 1; i <= 5; i++){

            System.out.println("Dime un número:");
            num = sc.nextInt();

            if (num % 5 == 0){
               indicador = true;
            }

            if (num % 5 == 0){
                contMultDe5++;
            }
        }

        if (indicador == true){//Al menos ha entrado una vez en el if en todas las iteraciones del bucle
            System.out.println("Algunos de los numeros introducidos es multiplo de 5");
        }else{//No ha entrado al if ni una sola vez en todo el bucle
            System.out.println("No has introducido ningun numero multiplo de 5");
        }

        System.out.println("Has puesto " + contMultDe5 + " multiplos de 5");

    }
}
