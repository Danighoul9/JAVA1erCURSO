package EjerciciosPuntuables.Tema2;

import java.util.Scanner;

public class EJ3Evaluable {

    static Scanner sc = new Scanner(System.in);

    //Procedimiento de tirada Dado
    public static int tiradaDado(){
        return (int)(Math.random()*6)+1;
    }

    static void main(String[] args) {

        System.out.println("Cuantos turnos va a tener el juego");
        int turnos = sc.nextInt();
        int suma;
        int contadorWinsC = 0;
        int contadorWinsH = 0;

        for (int i = 1; i <= turnos; i++){

            //Tirada Cubitus
            int dadoC = tiradaDado();
            System.out.println("Tirada Cubitus: " + dadoC);

            //Tirada Humerus
            int dadoH = tiradaDado();
            System.out.println("Tirada Humerus: " + dadoH);


            //Cubitus suma puntos si su dado y el de Humerus es PAR (los 2 dados) o IMPAR (los 2 dados)
            if(dadoC % 2 == 0 && dadoH % 2 == 0 || dadoC % 2 != 0 && dadoH % 2 != 0 ) {
                suma = dadoC + dadoH;
                System.out.println("Cubitus ha ganado esta ronda y suma: " + suma);
                contadorWinsC++;
            }

            //Humerus suma puntos si su dado es PAR y el de Humerus es IMPAR y viceversa
            if(dadoC % 2 == 0 && dadoH % 2 != 0 || dadoC % 2 != 0 && dadoH % 2 == 0){
                suma = dadoC + dadoH;
                System.out.println("Humerus ha ganado esta ronda y suma: " + suma);
                contadorWinsH++;
            }

        }

        //Mensaje de rondas ganadas de cada jugador
        System.out.println("Rondas ganadas Cubitus: " + contadorWinsC);
        System.out.println("Rondas ganadas Humerus: " + contadorWinsH);

        //If para saber quien es el ganador en base a
        if(contadorWinsC > contadorWinsH){
            System.out.println("Cubitus es el ganador");
        }else if ( contadorWinsH > contadorWinsC){
            System.out.println("Humerus es el ganador");
        }else{
            System.out.println("Empate");
        }
    }
}


