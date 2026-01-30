package Tema2.TareasTema2;

public class Ejercicio7BUCLES {
    public static void main(String[] args) {

        //Números que sea multiplos de 3 pero no de 5 entre 100 y 200

        int contador = 0;
        int i;

        for(i = 100; i <= 200 ; i++){

            if((i % 3 == 0) && (i % 5 != 0)){
                System.out.print(i + " ");
                contador++;
            }
        }

        System.out.println();

        System.out.println("Entre el 100 y el 200 hay: " + contador + " ,que son multiplos de 3");




    }
}
