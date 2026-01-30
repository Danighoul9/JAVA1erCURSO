package ExamenOficial.PrimerExamen;

import java.util.Scanner;

public class EJ1_Daniel_Diaz_Campoy_Examen {

    static Scanner sc = new Scanner(System.in);

    //Procedimiento de tirada Dado
    public static int tiradaDado(int numMin, int numMax) {
        return (int) (Math.random() * (numMax-numMin + 1) + numMin);
    }

    static void main(String[] args) {

        //Dos magos, Merlinus y Gandolfus, se enfrentan en un duelo mágico. Pide por teclado el número
        //de rondas que van a combatir. En cada ronda:

        //Merlinus lanza tres dados de 8 caras y suma los valores sólo si son mayores que 4
        //Gandolfus lanza dos dados de 12 caras y suma los valores si son menores o iguales a 6.

        //Gana la ronda el mago que obtenga más puntos.
        // Gana el duelo el mago que haya ganado más rondas.
        // Si hay empate en rondas, gana quien tenga más puntos totales acumulados.

        //¿Es un duelo equitativo? ¿Cómo lo comprobarías mediante simulación?

        int rondas = 0;
        do{
            try{
                System.out.println("¿Cuantas rondas van a jugar estos Magos?");
                rondas = sc.nextInt();

                if(rondas <= 0){
                    System.out.println("No pueden jugar 0 o negativas rondas, minimo 1 ronda");
                    rondas = sc.nextInt();
                }

                int sumaM = 0;
                int sumaTotalM = 0;
                int sumaG = 0;
                int sumaTotalG = 0;
                int contadorWinsM = 0;
                int contadorWinsG = 0;

                //Hacemos el bucle con sus respectivos turnos
                for (int i = 1; i <= rondas; i++){

                    //Tiradas Merlinus
                    int dadoM1 = tiradaDado(1,8);
                    int dadoM2 = tiradaDado(1,8);
                    int dadoM3 = tiradaDado(1,8);
                    System.out.println("- Tirada Merlinus: " + dadoM1 + ", " + dadoM2 + ", " + dadoM3);

                    //Hacemos la suma de todos los dados > A 4
                    if(dadoM1 > 4){
                        sumaM = sumaM + dadoM1;
                    }
                    if(dadoM2 > 4){
                        sumaM = sumaM  + dadoM2;
                    }
                    if(dadoM3 > 4){
                        sumaM = sumaM  + dadoM3;
                    }


                    //Mensaje puntos totales
                    System.out.println("* Merlinus suma un total de : " + sumaM + " puntos.");

                    //Acumulador de puntos totales en caso de que haga falta por EMPATE
                    sumaTotalM = sumaTotalM + sumaM;


                    //----------SEPARACIÓN--DE--PERFILES------------------------------------------------------------------------

                    //Tiradas Gandolfus
                    int dadoG1 = tiradaDado(1,12);
                    int dadoG2 = tiradaDado(1,12);
                    System.out.println("- Tirada Gandolfus: " + dadoG1 + ", " + dadoG2);

                    //Hacemos la suma de todos los dados > A 4
                    if(dadoG1 <= 6){
                        sumaG = sumaG  + dadoG1;
                    }
                    if(dadoG2 <= 6){
                        sumaG = sumaG  + dadoG2;
                    }


                    //Mensaje puntos totales
                    System.out.println("* Gandolfus suma un total de : " + sumaG + " puntos.");

                    //Acumulador de puntos totales en caso de que haga falta por EMPATE
                    sumaTotalG = sumaTotalG + sumaG;


                    //Merlinus suma puntos si su su puntuacion es mayor
                    if (sumaM > sumaG){
                        System.out.println("---------------------------");
                        System.out.println("| Merlinus gana esta ronda |");
                        System.out.println("---------------------------");
                        contadorWinsM++;
                    }

                    //Gandolfus suma puntos si su puntuacion es mayor
                    if (sumaG > sumaM){
                        System.out.println("---------------------------");
                        System.out.println("| Gandolfus gana esta ronda |");
                        System.out.println("---------------------------");
                        contadorWinsG++;
                    }

                    if (sumaG == sumaM){
                        System.out.println("---------------------------");
                        System.out.println("||||||RONDA EMPATADA|||||||");
                        System.out.println("---------------------------");
                    }

                    //PONEMOS LAS SUMAS A C PARA QUE NO SE ACUMULEN LOS PUNTOS ENTRE RONDAS
                    sumaM = 0;
                    sumaG = 0;
                }

                //Mensaje de rondas ganadas de cada jugador
                System.out.println("--------------------------");
                System.out.println("Rondas ganadas Merlinus: " + contadorWinsM);
                System.out.println("Rondas ganadas Gandolfus: " + contadorWinsG);
                System.out.println("--------------------------");

                //if para saber quien es el ganador en base a las rondas ganadas
                if(contadorWinsM > contadorWinsG){
                    System.out.println("Merlinus es el ganador");
                }else if ( contadorWinsG > contadorWinsM){
                    System.out.println("Gandolfus es el ganador");
                }else{
                    System.out.println("Empate");
                    System.out.println("Como ha sido un empate, el ganador sera el que mas punto haya acumulado durante todas" +
                            "estas rondas");

                    //Mostramos puntos totales acumulados entre todas las rondas
                    System.out.println("**********************************");
                    System.out.println("Puntos totales Merlinus : " + sumaTotalM);
                    System.out.println("Puntos totales Gandolfus : " + sumaTotalG);
                    System.out.println("**********************************");

                    //Comparamos los puntos para decidir el ganador en base a ellos ya que en rondas quedan en un
                    //supuesto empate
                    if (sumaTotalM > sumaTotalG){
                        System.out.println("Por lo tanto el ganador es MERLINUNS, ENHORABUENA");
                    }else if (sumaTotalG > sumaTotalM) {
                        System.out.println("Por lo tanto el ganador es Gandolfus, ENHORABUENA");
                    }else{
                        System.out.println("EMPATE HASTA EN LOS PUNTOS MENUDA CASUALIDAD");
                    }

                    //¿Es un duelo equitativo? ¿Cómo lo comprobarías mediante simulación?

                    //No claramente, porque Merlinus tira 3 dados, y aunque tenga menos caras(8) que el dado de Gandolfus
                    //tiene 1+ tirada y sus numeros sumando en total seria 5+6+7+8 = 26 puntos * 3 dados suponiendo que
                    //siempre sacase el maximo equivaldrian a 78 puntacos, en cambio Gandolfus, tiene 2 tiradas y 12 caras
                    //por dado, pero solo suma si es <= 6 por lo tanto haciendo la suma seria
                    //6+5+4+3+2+1 = 21 puntos * 2 dados suponiendo que siempre sacase el maximo equivaldrian a 42 puntos.
                    //Esta es una prueba clara, aunque tengas mas caras el dado, su condicion de puntos le hace no poder
                    //ganar mas puntos que Merlinus la mayoria de veces.

                    //Podriamos comprobrar esta estafa simulando el juego muchas veces y veremos que Merlinus siempre acaba
                    //metiendole palizas a Gandolfus, mucha magia pero poca matemática.
                }
            }catch(Exception e){
                System.out.println(e.getMessage());
                sc.nextLine();
                System.out.println("Porfavor ingrese un numero correcto");
            }
        }while(rondas <= 0);

    }
}

