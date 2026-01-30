package Tema3.Arrays;

public class EjemploArray1 {

    static void main(String[] args) {

        //Cuando se crea un array sus elementos tienen el valor por defecto del tipo
        //int -> 0
        //double -> 0.0
        //String -> ""

        //Crea un array de 10 elementos de tipo entero (Int)
        int [] numeros = new int [10];

        //Modificar un elemento del array
        numeros[0] = 10;
        numeros[9] = 4;
        //numeros[10] = 10; //Error ArrayIndexOutOfBoundsException

        //Recorrer desde 0 hasta la longitud del array --> nomrbe.length
        for(int i = 0; i < numeros.length; i++){

            System.out.println("Elemento en la posición " + i + " es " +numeros[i]);
        }
    }
}
