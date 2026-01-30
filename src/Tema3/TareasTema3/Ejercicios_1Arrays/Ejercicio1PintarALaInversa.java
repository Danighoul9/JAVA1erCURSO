package Tema3.TareasTema3.Ejercicios_1Arrays;

public class Ejercicio1PintarALaInversa {

    //Funcion para imprimir los arrays al con el orden inverso
    public static void imprimirArrayReves(double[] numeros) {

        for(int i= numeros.length - 1; i >= 0; i--) {
            System.out.println(numeros[i]);
        }
    }


    static void main(String[] args) {

        //Crea un array de 10 numeros de tipo double y pintalos en orden inverso

        //Son 10 numeros guardados en el array pero e 0, es la primera posicion por lo tanto si hacemso un array
        //de 5 valores el array iria desde el 0-4 por lo tanto el 0 equivale a la 1ra posicion.

        //EL orden seria:    0    1    2    3    4    5    6     7     8    9
        double[] numeros = {2.3, 4.4, 5.6, 7.7, 1.2, 3.9, 9.99, 1.34, 4.5, 3.5};

        imprimirArrayReves(numeros);


    }
}
