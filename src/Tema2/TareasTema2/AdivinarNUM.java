package Tema2.TareasTema2;

import java.util.Scanner;

public class AdivinarNUM {
    public static void main(String[] args) {
        //Crea una aplicación que permita adivinar un número. La aplicación genera un número
        //aleatorio del 1 al 100. A continuación, va pidiendo números y va respondiendo si el número
        //a adivinar es mayor o menor que el introducido, además de los intentos que te quedan
        //(tienes 10 intentos para acertarlo). El programa termina cuando se acierta el número
        //(además te dice en cuantos intentos lo has acertado), si se llega al límite de intentos te
        //muestra el número que había generado.

        int numRandom = (int) (Math.random()*100) +1;
        int respuesta;
        int contador = 1;

        Scanner sc = new Scanner(System.in);

        System.out.println("Adivina el número generado por el pc entre el 1-100");



        do {
            System.out.println("Introduzca el numero que esta pensando: ");
            respuesta = sc.nextInt();

            if(respuesta > numRandom){
                System.out.println("Prueba con un poco menos");
            }else if(respuesta < numRandom){
                System.out.println("Prueba con un poco mas");
            }else{
                System.out.println("Acertasteeeeeee ole ole ole");
            }

            if (respuesta != numRandom){
                System.out.println("Te quedan :" + (10-contador) + " intentos");
            }


            contador++;

            if( contador == 10){
                System.out.println("Sin intentos restantes, lo siento mucho");
            }

        }while(respuesta != numRandom);
        System.out.println("Eres un makina");
    }
}

