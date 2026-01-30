package Tema3.TareasTema3;

import java.util.Scanner;

public class AhorcadoModoJAVI {
    public static void pintarPalabraOculta(StringBuffer palabra) {
        for(int i=0; i < palabra.length(); i++) {
            System.out.print(palabra.charAt(i) + " ");
        }
        System.out.println();
    }

    public static void rellenarPalabraOculta(StringBuffer sb) {
        for(int i=0; i < sb.capacity(); i++) {
            sb.append("_");
        }
    }

    public static void sustituirLetra(StringBuffer sb, char letra, String palabra) {
        for(int i=0; i < sb.length(); i++) {
            if (palabra.charAt(i) == letra) {
                sb.setCharAt(i, letra);
            }
        }
    }

    public static boolean buscarLetra(String palabra, char letra) {
        boolean encontrada = false;

        for(int i=0; i < palabra.length(); i++) {
            if (palabra.charAt(i) == letra) {
                encontrada = true;
                break;
            }
        }
        return encontrada;
    }

    //Esto aquí no sirve, es de explicar otra cosa
    public static boolean comprobarGanador(char[] palabraAEncontrar, char[] palabraActual) {
        boolean iguales = true;
        for(int i=0; i < palabraAEncontrar.length; i++) {
            if (palabraAEncontrar[i] != palabraActual[i]) {
                iguales = false;
                break;
            }
        }
        return iguales;
    }

    public static void main(String[] args) {
        /**
         * Implementa el juego del ahorcado con una palabra predefinida (ej: "JAVA").
         * Muestra al inicio una serie de guiones (_) del tamaño de la palabra.
         * El jugador ingresa letras de una en una.
         * Si la letra está en la palabra, revela su posición (o posiciones) reemplazando el guión.
         * Si no, resta una vida (comienza con 6 vidas).
         * Usa un array de char para la palabra oculta y otro para la palabra con pistas.
         * Gana si adivina la palabra antes de quedarse sin vidas.
         */

        Scanner teclado = new Scanner(System.in);

        int intentos = 6;
        char letra;

        String[] palabras = {"amigo", "gallina", "huevo", "perro", "ladrillo"};
        int aleatorio = (int) (Math.random() * palabras.length);
        //System.out.println(palabras[aleatorio]);
        String palabraAdivinar = palabras[aleatorio];

        StringBuffer palabraOculta = new StringBuffer(palabraAdivinar.length());

        //Llenamos la palabra de guiones
        rellenarPalabraOculta(palabraOculta);

        while(intentos > 0) {
            //Pintamos la palabra actual
            pintarPalabraOculta(palabraOculta);
            System.out.println("Dime una letra:");
            letra = teclado.next().charAt(0);

            //Buscar la letra en la palabra
            //if (palabraAdivinar.indexOf(letra) != -1) {
            if (buscarLetra(palabraAdivinar, letra)) {
                sustituirLetra(palabraOculta, letra, palabraAdivinar);
            } else {
                //No encontrada
                System.out.println("Letra no encontrada");
                intentos--;
            }

            //Comprobar fin del juego
            if (palabraOculta.toString().equals(palabraAdivinar)) {
                System.out.println("GANASTE --> " + palabraAdivinar);
                break;
            }

            System.out.println("Intentos restantes: " + intentos);
        }

        if (intentos == 0) {
            System.out.println("PERDISTE");
        }

        teclado.close();

    }
}
