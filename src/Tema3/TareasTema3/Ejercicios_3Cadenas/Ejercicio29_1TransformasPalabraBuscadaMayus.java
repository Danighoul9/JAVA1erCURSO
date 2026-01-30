package Tema3.TareasTema3.Ejercicios_3Cadenas;

import java.util.Scanner;

public class Ejercicio29_1TransformasPalabraBuscadaMayus {

    static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        /**
         * Crea un programa en Java que solicite al usuario dos cadenas de caracteres
         * y que devuelva la primera cadena, pero transformando en mayúsculas la parte
         * que coincide con la segunda cadena introducida.
         * Por ejemplo, si se introducen las cadenas "Esta es mi amiga Ana" y
         * "amiga" devolverá "Esta es mi AMIGA Ana".
         *
         * replace o replaceAll
         */

        System.out.println("Dime una cadena de caracteres");
        String cad1 = sc.nextLine();

        System.out.println("Introduce una palabra a buscar en tu cadena");
        String palabra = sc.nextLine();

        //Con .replace
        System.out.println(cad1.replace(palabra,palabra.toUpperCase()));

        //Con .replaceAll
        System.out.println(cad1.replaceAll(palabra,palabra.toUpperCase()));

        //Si contiene la palabra lo sustituye si no la contiene te dice que no existe la palabra
        if(cad1.contains(palabra)) {
            System.out.println(cad1.replace(palabra, palabra.toUpperCase()));
        } else {
            System.out.println("No existe la palabra");
        }


    }
}
