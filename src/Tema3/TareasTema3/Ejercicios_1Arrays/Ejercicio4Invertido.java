package Tema3.TareasTema3.Ejercicios_1Arrays;

public class Ejercicio4Invertido {

    static void main(String[] args) {

        //Recorrer el array al reves


        int numeros[] = {1,2,3,4,5,6,7,8,9,10};
        int numInvertidos[] = new int [10];


        for(int i = 0; i < numeros.length; i++){
            numInvertidos[numeros.length-i -1] = numeros[i];
        }

        for (int i = 0; i < numInvertidos.length; i++){
            System.out.println(numInvertidos[i]);
        }





    }
}
