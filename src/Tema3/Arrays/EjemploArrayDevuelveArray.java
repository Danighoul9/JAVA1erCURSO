package Tema3.Arrays;

public class EjemploArrayDevuelveArray {

    //Funcion para multiplicar el array por un numero especifico
    public static double[] multiplicarArray(double[] vector, double numero) {
        //Crear array del mismo tamaño que el original
        double[] nuevo = new double[vector.length];

        for(int i=0; i < nuevo.length; i++) {
            nuevo[i] = vector[i] * numero;
        }

        return nuevo;
    }

    /**
     * Función que imprime un array de enteros
     * @param array
     */
    public static void imprimirArray(double[] array) {
        for(int i=0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }


    public static void main(String[] args) {

        //Multiplicar los elementos de un vector por un número
        //guardarlo en otro vector

        double[] vector = {33.5, 35.9, 30.1, 28.7, 29.9, 30.0};
        double[] nuevoVector = multiplicarArray(vector, 4);
        imprimirArray(nuevoVector);

    }

}
