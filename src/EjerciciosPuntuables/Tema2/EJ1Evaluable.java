package EjerciciosPuntuables.Tema2;

import java.util.Scanner;

public class EJ1Evaluable {

    static Scanner sc = new Scanner(System.in);

    //Procedimiento de tirada Dado
    public static int tiradaDado(){
        return (int)(Math.random()*6)+1;
    }

    static void main(String[] args) {
        System.out.println("Cuantos turnos va a tener el juego");
        int turnos = sc.nextInt();
        int suma;
        int empateAcumulados = 0;
        int contadorWinsC = 0;
        int contadorWinsH = 0;


        //Hacemos el bucle con sus respectivos turnos
        for (int i = 1; i <= turnos; i++){

            //Tirada Cubitus
            int dadoC = tiradaDado();
            System.out.println("Tirada Cubitus: " + dadoC);

            //Tirada Humerus
            int dadoH = tiradaDado();
            System.out.println("Tirada Humerus: " + dadoH);

            if(dadoC == dadoH){
                empateAcumulados += dadoC + dadoH;
                System.out.println("Empate, nadie se lleva puntos y se acumulan para la siguiente" +
                        " ronda +" +  empateAcumulados);
            }
            //Cubitus suma puntos si su dado es mayor
            if (dadoC > dadoH){
                suma = dadoC + dadoH + empateAcumulados;
                //Ponemos a 0 el acumulador para que no se quede con el valor de la suma de empateAcumulados
                empateAcumulados = 0;
                System.out.println("Cubitus suma todos los puntos que son: " + suma);
                contadorWinsC++;
            }

            //Humerus suma puntos si su dado es mayor
            if (dadoH > dadoC){
                suma = dadoC + dadoH + empateAcumulados;
                //Ponemos a 0 el acumulador para que no se quede con el valor de la suma de empateAcumulados
                empateAcumulados = 0;
                System.out.println("Humerus suma todos los puntos que son: " + suma);
                contadorWinsH++;
            }
        }

        //mensaje de rondas ganadas de cada jugador
        System.out.println("Rondas ganadas Cubitus: " + contadorWinsC);
        System.out.println("Rondas ganadas Humerus: " + contadorWinsH);

        //if para saber quien es el ganador en base a
        if(contadorWinsC > contadorWinsH){
            System.out.println("Cubitus es el ganador");
        }else if ( contadorWinsH > contadorWinsC){
            System.out.println("Humerus es el ganador");
        }else{
            System.out.println("Empate");
        }
    }
}
