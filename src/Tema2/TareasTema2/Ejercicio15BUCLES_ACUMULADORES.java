package Tema2.TareasTema2;

public class Ejercicio15BUCLES_ACUMULADORES {
    public static void main(String[] args) {
        //Humerus y CUbitus se aburren el finde y van a jugar a lso dados
        //Humerus tira tres dados y su puntuacion es la suma de los pares
        //Cubitus "" los mismo pero con los impares
        //Juegan 10 rondas dime el ganador

        int i;

        //DADOS HUMERUS
        int dadoH1;
        int dadoH2;
        int dadoH3;
        int contadorH = 0;

        //DADOS CUBITUS
        int dadoC1;
        int dadoC2;
        int dadoC3;
        int contadorC = 0;


        System.out.println("---------------------------------");
        System.out.println("Humerus suma los números PARES");
        System.out.println("Cubitus suma los números IMPARES");
        System.out.println("---------------------------------");


        for(i=1; i<= 10; i++){

            //TIRADA HUMERUS
            dadoH1= (int) (Math.random() * 6 + 1);
            dadoH2= (int) (Math.random() * 6 + 1);
            dadoH3= (int) (Math.random() * 6 + 1);


            //SUMA DE LOS 3 DADOS (SI SON IMPARES)
            int sumaHumerus = 0;
            if (dadoH1 % 2 == 0){
                sumaHumerus = sumaHumerus + dadoH1;
            }
            if (dadoH2 % 2 == 0){
                sumaHumerus = sumaHumerus + dadoH2;
            }
            if (dadoH3 % 2 == 0){
                sumaHumerus = sumaHumerus + dadoH3;
            }

            //Mostramos lo que Humerus ha sido capaz de sumar con su tirada
            System.out.println("Humerus a sacado: " + dadoH1 + ", " + dadoH2 + ", " + dadoH3 + " = " + sumaHumerus);

            //TIRADA CUBITUS
            dadoC1= (int) (Math.random() * 6 + 1);
            dadoC2= (int) (Math.random() * 6 + 1);
            dadoC3= (int) (Math.random() * 6 + 1);


            //SUMA DE LOS 3 DADOS (SI SON PARES)
            int sumaCubitus = 0;
            if (dadoC1 % 2 != 0){
                sumaCubitus = sumaCubitus + dadoC1;
            }
            if (dadoC2 % 2 != 0){
                sumaCubitus = sumaCubitus + dadoC2;
            }
            if (dadoC3 % 2 != 0){
                sumaCubitus = sumaCubitus + dadoC3;
            }

            //Mostramos lo que Humerus ha sido capaz de sumar con su tirada
            System.out.println("Cubitus a sacado: " + dadoC1 + ", " + dadoC2 + ", " + dadoC3 + " = " + sumaCubitus);

            //Comparamos resultados

            if (sumaCubitus > sumaHumerus){
                contadorC++;
                System.out.println(" ¡¡¡¡CUBITUS se lleva +1 punto !!!!");
            }else if (sumaCubitus < sumaHumerus){
                contadorH++;
                System.out.println(" ¡¡¡¡HUMERUS se lleva +1 punto !!!!");
            }else{
                System.out.println("Nadie se lleva punto");
            }
        }

        System.out.println("Cubitus ha ganado " + contadorC + " rondas");
        System.out.println("Humerus ha ganado " + contadorH + " rondas");

        if (contadorC > contadorH){
            System.out.println("El ganador es Cubitus");
        }else if (contadorC < contadorH){
            System.out.println("El ganador es Humerus");
        }else{
            System.out.println("Empate");
        }

    }
}
