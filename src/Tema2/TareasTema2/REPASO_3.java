package Tema2.TareasTema2;

import java.util.Scanner;

public class REPASO_3 {
    public static void main(String[] args) {

        //PONEMOS EL SCANNER
        Scanner sc = new Scanner(System.in); //Crea el objeto para leer de teclado

        //Programa que pida un numero por teclado y muestre la tabla de multiplicar

        //EJERCICIO EXTRA MOSTRAR TODAS LAS TABLAS DEL 1-10

        int i;
        int num;
        double resultado;

        //System.out.println("Dime un número");
        //num = sc.nextInt();

        for (i = 1; i <= 10; i++) {

            for (num = 1; num <= 10; num++) {

                resultado = num * i;
                System.out.println(num + " * " + i + " = " + resultado);

            }
            System.out.println("-------------------------------------------------------------------");

        }
    }
}
