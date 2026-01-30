package EjerciciosPuntuables.Tema3Evaluable.Tema3JaviMode;

public class Ejercicio2 {


    /**
     * Escriba un programa que simule una ruleta simplificada con números del 0 al 36. El programa
     * debe:
     * 1. Generar tiradas aleatorias de la ruleta hasta que salga el número 0 (la banca gana).
     * 2. Mostrar cada número que sale y clasificarlo como:
     * ROJO: Números impares del 1 al 10 y del 19 al 28, y números pares del 11 al 18 y del
     * 29 al 36
     * NEGRO: El resto de números excepto el 0
     * VERDE: El número 0
     * 3. Contar cuántas tiradas se realizaron hasta que salió el 0.
     * 4. Mostrar la suma total de todos los números que salieron.
     */


    public static int generarAleatorio(int min, int max) {
        return (int) (Math.random() * (max - min + 1) + min);
    }

    public static int[] contarColores(int n) {
        int[] colores = new int[3]; //colores[0] -> rojos, colores[1] -> negros, colores[2] -> verdes
        int tirada = -1;

        while(n > 0) {
            tirada = generarAleatorio(0, 36);
            n--;
            if (tirada == 0) {
                colores[2]++;
            } else if (tirada % 2 != 0 && (tirada >= 1 && tirada <= 10 || tirada >= 19 && tirada <= 28)
                    || tirada % 2 == 0 && (tirada >= 11 && tirada <= 18 || tirada >= 29 && tirada <= 36) ){
                colores[0]++;
            } else {
                colores[1]++;
            }
        }

        return colores;
    }

    public static void main(String[] args) {
        int tirada = -1;
        int contadorTiradas = 0;
        int sumaTiradas = 0;

        while(true) {
            tirada = generarAleatorio(0, 36);
            System.out.print(tirada + " --> ");

            contadorTiradas++;
            sumaTiradas += tirada;

            if (tirada == 0) {
                System.out.println("Verde");
                break;
            } else if ( (tirada % 2 != 0 && (tirada >= 1 && tirada <= 10 || tirada >= 19 && tirada <= 28))
                || (tirada % 2 == 0 && (tirada >= 11 && tirada <= 18 || tirada >= 29 && tirada <= 36)) ){
                System.out.println("Rojo");
            } else {
                System.out.println("Negro");
            }
        }

        System.out.println("Se hicieron " + contadorTiradas + " hasta salir el 0");
        System.out.println("La suma de todas las tiradas es " + sumaTiradas);

        System.out.println();
        System.out.println("50 Tiradas");
        int[] colores = contarColores(50);
        System.out.println("Rojos: " + colores[0] + " Negros: " + colores[1] +
                           " Verdes: " + colores[2]);

        System.out.println();
        System.out.println("20000 Tiradas");
        colores = contarColores(20000);
        System.out.println("Rojos: " + colores[0] + " Negros: " + colores[1] +
                " Verdes: " + colores[2]);

    }
}
