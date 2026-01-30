package Tema2.Bucles;

public class FOR {
    public static void main(String[] args) {


        //EJEMPLO CON WHILE
        int contador = 0;
        while(contador < 10){
            System.out.print(contador + " ");
            contador++;
        }

        System.out.println();

        //FOR (iniciar variable;condicion de seguir bucle; incremento del contador)

        for(contador= 0; contador <= 10; contador++){
            System.out.print(contador + " ");
        }

        System.out.println();//Para saltar de línea

        //Multiplos de 5 del 5 al 500

        for(contador = 5; contador <= 100; contador += 5){
            System.out.print(contador + " ");
        }

        System.out.println();//Para saltar de línea

        //Potencias de 2 hasta 10000

        for(contador = 2; contador <= 10000; contador *= 2){
            System.out.print(contador +" ");
        }

        System.out.println();//Para saltar de línea

        //Potencias de 2 desde 10000 hasta 2

        for(contador = 8192 ; contador >= 2; contador /= 2){
            System.out.print(contador +" ");
        }

    }
}
