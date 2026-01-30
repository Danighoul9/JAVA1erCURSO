package Tema2.TareasTema2;

public class Ejercicio11Bucles {
    public static void main(String[] args) {

        //Hay dos romanos Cubitus y Humerus en la frontera germana aburridos
        //Juegan a los dados y se determina quien gana.
        //Cada jugador tiene 2 dados de seis caras
        //Gana el jugador que sume más sus dos dados
        //Juegan 10 rondas
        //Quién gana más rondas?


        int num = 1;
        int contadorCubitus = 0;
        int contadorHumerus = 0;

        int dadoC1,dadoC2,sumTotalCubitus; // se suman
        int dadoH1, dadoH2,sumTotalHumerus; // se suman

        for (num = 1; num <= 10; num++){

            //Se pone aqui la variable del dado porque si lo ponemos fuera solo tiraria del dado 1 vez

            //Tirada Cubitus

            System.out.println("Tirada de cubitus");
             dadoC1 = (int) (Math.random()*6 + 1);
             dadoC2 = (int) (Math.random()*6 + 1);
             sumTotalCubitus = dadoC1 + dadoC2;

            System.out.println("Dado 1: " + dadoC1 + "Dado 2: " + dadoC2 + " = " + sumTotalCubitus);

            //Tirada Humerus

            System.out.println("Tirada de Humerus");
            dadoH1 = (int) (Math.random()*6 + 1);
            dadoH2 = (int) (Math.random()*6 + 1);
            sumTotalHumerus = dadoH1 + dadoH2;

            System.out.println("Dado 1: " + dadoH1 + "Dado 2: " + dadoH2 + " = " + sumTotalHumerus);

            if (sumTotalCubitus > sumTotalHumerus){
                contadorCubitus++;
                System.out.println(" ¡¡¡¡CUBITUS se lleva +1 punto !!!!");
            }else if (sumTotalCubitus < sumTotalHumerus){
                contadorHumerus++;
                System.out.println(" ¡¡¡¡HUMERUS se lleva +1 punto !!!!");
            }else{
                System.out.println("Nadie se lleva punto");
            }

        }

        System.out.println("Cubitus ha ganado " + contadorCubitus + " rondas");
        System.out.println("Humerus ha ganado " + contadorHumerus + " rondas");

        if (contadorCubitus > contadorHumerus){
            System.out.println("El ganador es Cubitus");
        }else if (contadorCubitus < contadorHumerus){
            System.out.println("El ganador es Humerus");
        }else{
            System.out.println("Empate");
        }

    }
}
