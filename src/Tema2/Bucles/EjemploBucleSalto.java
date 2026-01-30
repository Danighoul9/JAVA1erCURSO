package Tema2.Bucles;

import java.util.Scanner;

public class EjemploBucleSalto {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Muestra los numeros impares entre 1 y 20, menos el 9 y el 13

        //CONTINUE

        for(int contador = 1; contador <= 20; contador += 2){

            if(contador == 9 || contador == 13){
                continue; //Salta el bucle a la siguiente iteración
            }
            System.out.print(contador + " ");
        }

        //Pide palabras por teclado hata que se introduzca la palabra  "fin"
        //Cadena.equals(<lo que quieras comparar>) --> compara dos cadenas

        String palabra = "";

        while(true){
            System.out.println("Introduce una palabra: ");
            palabra = sc.nextLine();
            if(palabra.equals("fin")){
                break; //Termina el bucle totalmente
            }
            System.out.println("La palabra introducida es : " + palabra);
        }
        System.out.println("Fin del programa");






    }
}
