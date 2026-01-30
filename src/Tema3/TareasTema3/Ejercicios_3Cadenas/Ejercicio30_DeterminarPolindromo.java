package Tema3.TareasTema3.Ejercicios_3Cadenas;

public class Ejercicio30_DeterminarPolindromo {

    /**
     * Determinar si una cadena es un palíndromo
     */

    public static void main(String[] args) {

        String cadena = "tecladoodalcet";
        //Palíndromo: si se lee igual de izquierda a derecha que de derecha a izquierda
        //Si la cadena original es igual a la cadena invertida es un palíndromo

        StringBuffer sb = new StringBuffer(cadena);
        if (cadena.contentEquals(sb.reverse())) {
            System.out.println("Es un palíndromo");
        } else {
            System.out.println("No es un palíndromo");
        }

        //Versión con String
        //Longitud = 13
        //  0 1 2 3 4 5 6 7 8 9 10 11 12
        //  t e c l a d o d a l c  e  t
        //
        boolean palindromo = true;
        for (int i = 0; i < cadena.length() / 2; i++) {
            if (cadena.charAt(i) != cadena.charAt(cadena.length() - 1 - i)) {
                palindromo = false;
                break;
            }
        }
        System.out.println("Es palíndromo? " + palindromo);

    }
}