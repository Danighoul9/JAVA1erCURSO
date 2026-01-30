package Tema2.TareasTema2;

import java.util.Scanner;

public class Ejercicio4BUCLES {
    public static void main(String[] args) {

        // 1. Lanza un dado (1-6) de forma aleatoria hasta que salga un 6
        // Cuenta el numero de veces que hubo que tirar el dado para que saliera 6

        //do{
        //    Lanzar el dado
        //    Ver si es 6
        //    contador++
        //}while el dado no es 6

        Scanner sc = new Scanner(System.in);

        int contador = 0;
        int dado;

        do{
            System.out.println("Presione la tecla (Enter) para tirar el dado");
            sc.nextLine();

            dado= (int) (Math.random() * 6) + 1;
            System.out.println("DADO: " + dado);

            contador++;
        }while(dado != 6);//Termina si la tiradas es el numero elegido

        System.out.println("Se tiro el dado " + contador + "  veces");


        //OTRA MANERA DE HACER

        do{
            System.out.println("Presione la tecla (Enter) para tirar el dado");
            sc.nextLine();

            dado= (int) (Math.random() * 6) + 1;
            System.out.println("DADO: " + dado);

            contador++;

            if(contador == 6){
                break;
            }
        }while(true); //Termina si la tiradas es el numero elegido

        System.out.println("Se tiro el dado " + contador + "  veces");
    }
}
