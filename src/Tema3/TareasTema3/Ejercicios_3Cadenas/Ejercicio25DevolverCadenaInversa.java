package Tema3.TareasTema3.Ejercicios_3Cadenas;

public class Ejercicio25DevolverCadenaInversa {
    static void main(String[] args) {

        /**
         * Crea un programa en Java que solicite al usuario la introducción
         * de una cadena de caracteres y devuelva esta cadena invertida.
         * Haz dos versiones, una con String y otra con StringBuffer.
         */

        String cadena = "Javi tengo la cabeza loca ya, para!!!";
        System.out.println(cadena);

        //Versión con StringBuffer
        StringBuffer sb = new StringBuffer(cadena);
        sb.reverse();
        System.out.println(sb);

        //Versión con String
        String cadenaInvertida = "";
        for(int i = cadena.length()-1; i >= 0; i--) {
            System.out.print(cadena.charAt(i));
            cadenaInvertida = cadenaInvertida +  cadena.charAt(i); //Ineficiente
        }

        System.out.println();
        System.out.println(cadenaInvertida);

        //Versión con String
        String cadenaInvertida2 = "";
        for(int i = 0; i < cadena.length(); i++) {
            cadenaInvertida2 = cadena.charAt(i) + cadenaInvertida2; //Ineficiente
        }

        System.out.println();
        System.out.println(cadenaInvertida2);


    }
}
