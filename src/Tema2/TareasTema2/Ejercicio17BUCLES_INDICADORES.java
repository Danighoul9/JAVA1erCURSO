package Tema2.TareasTema2;

import java.util.Scanner;

public class Ejercicio17BUCLES_INDICADORES {
    public static void main(String[] args) {

        //PONEMOS EL SCANNER
        Scanner sc = new Scanner(System.in); //Crea el objeto para leer de teclado

        //Pide 5 cadenas de texto por teclado y dime si alguna de ellas
        //tiene una longitud de mayor de 5 caracteres
        //Pista: cadena.length() devuelve la longiud de la cadena


        int i;
        int contador = 0; //OPCIONAL
        boolean indicadorPalabraConMasDe5Char = false;
        String palabra;

        for(i=1; i<=5; i++){

            System.out.println("Dime una palabra");
            palabra = sc.nextLine();

            if(palabra.length() > 5){
                indicadorPalabraConMasDe5Char = true;
            }

            //OPCIONAL
            if(palabra.length() > 5){
                contador++;
            }

        }

        if (indicadorPalabraConMasDe5Char == true){//Al menos ha entrado una vez en el if en todas las iteraciones del bucle
            System.out.println("Algunos de los numeros introducidos es multiplo de 5");
        }else{//No ha entrado al if ni una sola vez en todo el bucle
            System.out.println("No has introducido ninguna palabra con más de 5 caracteres");
        }

        System.out.println("Has puesto " + contador + " con mas de 5 caracteres");













    }
}
