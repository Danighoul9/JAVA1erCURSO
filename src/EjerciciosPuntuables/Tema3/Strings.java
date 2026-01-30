package EjerciciosPuntuables.Tema3;

import java.util.Scanner;

public class Strings {


    public static int contarVocales(String texto) {
        int numVocales = 0;

        for (int i = 0; i < texto.length(); i++) {
            if (texto.charAt(i) == 'a' ||
                texto.charAt(i) == 'e' ||
                texto.charAt(i) == 'i' ||
                texto.charAt(i) == 'o'||
                texto.charAt(i) == 'u'||
                texto.charAt(i) == 'A' ||
                texto.charAt(i) == 'E' ||
                texto.charAt(i) == 'I' ||
                texto.charAt(i) == 'O'||
                texto.charAt(i) == 'U') {
                numVocales++;
            }
        }
        return numVocales;
    }

    public static int contarPalabras(String texto) {
        // Dividimos el texto en palabras usando espacio
        String[] palabras =texto.split(" ");
        // Devolvemos la cantidad de palabras
        return palabras.length;
    }

    public static void cambiarLetraA(String texto) {
        StringBuffer sb = new StringBuffer(texto);

        for (int i = 0; i < texto.length(); i++) {
            if (sb.charAt(i) == 'a'){
                sb.setCharAt(i,'@');
            }
        }
        System.out.println(sb);
    }


    static void main(String[] args) {

        //EJERCICIO STRINGS

        //Escriba un programa que dado un texto como String, devuelva el
        //número de vocales que contiene (independiente de mayúsculas), el
        //número de palabras del texto, y que reemplace todas las apariciones de
        //la letra ‘a’ por la ‘@’. Para cada una de las acciones deberás crear un
        //método que devuelva el valor solicitado. Para el segundo método
        //puedes utilizar split() y para el tercero puedes utilizar replace(). Siempre
        //que sea conveniente utiliza StringBuffer.

        Scanner sc = new Scanner(System.in);

        System.out.println("Dime una frase");
        String frase = sc.nextLine();
        System.out.println("En este texto anteriormente escrito hay: " + contarVocales(frase) + " vocales.");
        System.out.println("En este texto anteriormente escrito hay: " + contarPalabras(frase) + " palabras.");
        cambiarLetraA(frase);







    }
}
