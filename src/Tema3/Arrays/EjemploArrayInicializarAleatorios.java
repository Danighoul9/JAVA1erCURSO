package Tema3.Arrays;

public class EjemploArrayInicializarAleatorios {

    /**
     * Función que genera un número aleatorio entre 1 y max
     * @param max
     * @return
     */
    public static int generarNumero(int max) {
        return (int) (Math.random() * max + 1);
    }

    /**
     * Función que imprime un array de enteros
     * @param array
     */
    public static void imprimirArray(int[] array) {
        for(int i=0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static void main(String[] args) {

        //Crear un array de 10 elementos aleatorios entre 1 y 100
        int[] numeros = new int[10];

        //Rellenar con valores aleatorios
        for(int i=0; i < numeros.length; i++) {
            numeros[i] = generarNumero(100);
        }

        imprimirArray(numeros);



    }
}


