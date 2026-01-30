package ExamenesDePrueba.PrimerExamen;

import java.util.Scanner;

public class Opcion_2 {

    static Scanner sc = new Scanner(System.in);

    static int numMin = 1;
    static int numMax = 100;

    public static boolean llamarNumRandom() {

        int numRandom = (int) (Math.random() * (numMax - numMin + 1) + numMin);

        System.out.println("¿Tu número es " + numRandom + "?");
        System.out.print("Responde con 'mayor', 'menor' o 'igual': ");
        String comparativa = sc.nextLine();

        switch (comparativa) {
            case "mayor":
                numMin = numRandom + 1;
                break;

            case "menor":
                numMax = numRandom - 1;
                break;
            case "igual":
                System.out.println("🎉 ¡He adivinado tu número!");
                return true;
            default:
                System.out.println("Respuesta no válida. Intenta de nuevo usando 'mayor', 'menor' o 'igual'.");
        }
        return false;
    }
//----------------------------------------------------------------------------------------------------------------------
//----------------------------------------------------------------------------------------------------------------------
//----------------------------------------------------------------------------------------------------------------------

    //Procedimiento de tirada Dado EJ2
    public static int tiradaDado(int numMin, int numMax) {
        return (int) (Math.random() * (numMax-numMin + 1) + numMin);
    }


    public static void main(String[] args) {

        //EJ 1
        //(No lo acabo de comprender al 100%, pero se hace asi.)
        //El usuario piensa un número, y el programa debe averiguarlo. Pide al usuario que piense un
        //número entre el 1 y el 100. El programa mostrará un número por pantalla y preguntará al
        //usuario si el número que ha pensado es menor, igual o mayor al número mostrado. Este
        //proceso lo repetirá hasta encontrar el número que ha pensado el usuario. Al finalizar el
        //proceso, mostrará el número de intentos probados hasta encontrar el número.

        System.out.println("Piensa en un número entre 1 y 100.");
        System.out.println("El ordenador intentará adivinarlo.");
        System.out.println("Responde con claridad ( 'mayor', 'menor' o 'igual') según corresponda.");

        boolean adivinado = false;
        int intentos = 0;

        while (!adivinado && numMin <= numMax) {
            intentos++;
            adivinado = llamarNumRandom();
        }

        System.out.println("\nNúmero de intentos: " + intentos);
        System.out.println("Fin del programa.");


//----------------------------------------------------------------------------------------------------------------------
//----------------------------------------------------------------------------------------------------------------------
//----------------------------------------------------------------------------------------------------------------------
//---------------------------------------------------------------------------------------------------------------------

        //EJ2

        //Marcus Cubitus y Julius Humerus, legionarios apasionados por los juegos de dados,
        //aprovechan los días cada vez más largos del mes de Iunius para probar nuevos juegos.
        //Pide por teclado un número de turnos que van a jugar. En cada turno Cubitus lanza cuatro
        //dados de 10 caras y se anota la suma de los valores impares obtenidos, mientras que el
        //Humerus lanza tres dados de 15 caras y se anota la suma de los valores pares obtenidos.
        //Gana el turno el jugador que obtenga más puntos y gana la partida el jugador que haya
        //ganado más turnos.
        //¿Es un juego equitativo? ¿Cómo lo comprobarías?

        System.out.println("Cuantas rondas van a jugar estos legionarios?");
        int rondas = sc.nextInt();

        int sumaC = 0;
        int sumaH = 0;
        int contadorWinsC = 0;
        int contadorWinsH = 0;

        //Hacemos el bucle con sus respectivos turnos
        for (int i = 1; i <= rondas; i++){

            //Tiradas Cubitus
            int dadoC1 = tiradaDado(1,10);
            int dadoC2 = tiradaDado(1,10);
            int dadoC3 = tiradaDado(1,10);
            int dadoC4 = tiradaDado(1,10);
            System.out.println("- Tirada CUBITUS: " + dadoC1 + ", " + dadoC2 + ", " + dadoC3 + ", " + dadoC4);

            //Hacemos la suma de todos los dados IMPARES
            if(dadoC1 % 2 != 0){
                sumaC = sumaC + dadoC1;
            }
            if(dadoC2 % 2 != 0){
                sumaC = sumaC + dadoC2;
            }
            if(dadoC3 % 2 != 0){
                sumaC = sumaC + dadoC3;
            }
            if(dadoC4 % 2 != 0){
                sumaC = sumaC + dadoC4;
            }


            //Mensaje puntos totales
            System.out.println("* CUBITUS suma un total de : " + sumaC + " puntos.");


            //----------------------------------------------------------------------------------------------

            //Tiradas Humerus
            int dadoH1 = tiradaDado(1,15);
            int dadoH2 = tiradaDado(1,15);
            int dadoH3 = tiradaDado(1,15);
            int dadoH4 = tiradaDado(1,15);
            int dadoH5 = tiradaDado(1,15);
            System.out.println("- Tirada HUMERUS: " + dadoH1 + ", " + dadoH2 + ", " + dadoH3);

            //Hacemos la suma de todos los dados PARES
            if(dadoH1 % 2 == 0){
                sumaH = sumaH + dadoH1;
            }
            if(dadoH2 % 2 == 0){
                sumaH = sumaH + dadoH2;
            }
            if(dadoH3 % 2 == 0){
                sumaH = sumaH + dadoH3;
            }
            
            //Mensaje puntos totales
            System.out.println("* HUMERUS suma un total de : " + sumaH + " puntos.");


            //Cubitus suma puntos si su su puntuacion es mayor
            if (sumaC > sumaH){
                System.out.println("---------------------------");
                System.out.println("| Cubitus gana esta ronda |");
                System.out.println("---------------------------");
                contadorWinsC++;
            }

            //Humerus suma puntos si su puntuacion es mayor
            if (sumaH > sumaC){
                System.out.println("---------------------------");
                System.out.println("| Humerus gana esta ronda |");
                System.out.println("---------------------------");
                contadorWinsH++;
            }

            //PONEMOS LAS SUMAS A C PARA QUE NO SE ACUMULEN LOS PUNTOS ENTRE RONDAS
            sumaC = 0;
            sumaH = 0;
        }

        //Mensaje de rondas ganadas de cada jugador
        System.out.println("--------------------------");
        System.out.println("Rondas ganadas Cubitus: " + contadorWinsC);
        System.out.println("Rondas ganadas Humerus: " + contadorWinsH);
        System.out.println("--------------------------");

        //if para saber quien es el ganador en base a las rondas ganadas
        if(contadorWinsC > contadorWinsH){
            System.out.println("Cubitus es el ganador");
        }else if ( contadorWinsH > contadorWinsC){
            System.out.println("Humerus es el ganador");
        }else{
            System.out.println("Empate");
        }

    }
}