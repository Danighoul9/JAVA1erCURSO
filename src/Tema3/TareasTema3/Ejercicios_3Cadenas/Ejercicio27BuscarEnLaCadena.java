package Tema3.TareasTema3.Ejercicios_3Cadenas;

public class Ejercicio27BuscarEnLaCadena {
    public static void main(String[] args) {

        /**
         * Diseña un programa en Java que solicite al usuario una cadena
         * en la que buscará y otra que será la cadena buscada. El programa
         * indicará cuántas veces aparece la segunda cadena en la primera.
         *
         * cadena = "El día de hoy es el más largo de mi vida."
         * subcadena = "de"
         * contador = 2
         *
         * indexOf(subcadena, desdeIndice) --> buscar a partir de una posición
         * -1 si no encuentra la subcadena
         * indice si encuentra la subcadena
         *
         */

        String cadena = "de día de hoy es el de más largo de mi vida.";
        String subcadena = "de";
        int contador = 0;
        int fromIndex = -1;

        //System.out.println(cadena.indexOf(subcadena,fromIndex));

        do {
            //Busque a partir de la posición de la que subcadena que encuentra
            fromIndex = cadena.indexOf(subcadena,fromIndex+1);
            if (fromIndex != -1) {
                contador++;
            }
        } while (fromIndex != -1);
        System.out.println("Hay " + contador +  " '" + subcadena + "' ");

        //Otra forma de hacerlo con while donde se asigna la variable y luego se compara
        contador = 0;
        fromIndex = -1;
        while ((fromIndex = cadena.indexOf(subcadena,fromIndex+1)) != -1) {
            contador++;
        }
        System.out.println("Hay " + contador +  " '" + subcadena + "' ");




    }

}
