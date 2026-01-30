package Tema2.TareasTema2;

import java.util.Scanner;

public class Ejercicio3BUCLES {
    public static void main(String[] args) {

        // 1.Suma los 10 primeros números (0,1,...) y muestra el resultado

        int contador = 0;
        int suma = 0;

        while (contador <= 10) {
            System.out.print(contador + " ,");
            suma = suma + contador;
            contador++;
        }
        System.out.println("La suma de estos numeros es " + suma);


        // 2.Pide 5 números por teclado y di si cada uno es par o impar

        Scanner sc = new Scanner(System.in); //Crea el objeto para leer de teclado

        int num = 1;
        int parImpar;

        while(num <= 5) {
            System.out.println("Ingresa número: ");
            parImpar = sc.nextInt(); //Leer de teclado un decimal

            if(parImpar % 2 == 0){
                System.out.println("Es par");
            }else{
                System.out.println("Es impar");
            }

            num++;
        }


        // 3. Pide por teclado cuatro notas (double) y muestra la media de ellas

        contador = 1;
        double nota;
        double mediaNotas = 0;

        while(contador < 4){
            System.out.println("Ingresa su nota de examen: ");
            nota = sc.nextInt(); //Leer de teclado un decimal
            mediaNotas = mediaNotas + nota;
            contador++;


        }

        if(mediaNotas <= 4){
            System.out.println("Estas suspenso");
        } else if (mediaNotas >= 5 && mediaNotas == 10){
            System.out.println("Estas aprobado");

        }

        System.out.println("Tu nota final es de: " + mediaNotas/contador);

    }
}
