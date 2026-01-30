package Tema2.TareasTema2;

import java.util.Scanner;

public class REPASO_2 {
    public static void main(String[] args) {

        //PONEMOS EL SCANNER
        Scanner sc = new Scanner(System.in); //Crea el objeto para leer de teclado

        //Programa que pida números hasta que se introcuza un 0
        //Debe imprimir la suma y la media de todos los numeros introducidos

        int num;
        int resultado = 0;
        double media = 0;
        int i;

        for(i= 1; i > 0; i++){

            System.out.println("Dime un número");
            num = sc.nextInt();

            resultado = resultado + num;

            if(num == 0){
                System.out.println("Fin de programa");
                break;
            }


        }

        media = resultado / (i-1);

        System.out.println("Has puesto " + (i -1)+ " números");
        System.out.println("La suma de todos los números puestos es: " + resultado);
        System.out.println("La media de todos esos números puestos es: " + media);
    }
}
