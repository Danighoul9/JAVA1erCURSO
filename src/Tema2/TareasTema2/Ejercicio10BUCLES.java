package Tema2.TareasTema2;

public class Ejercicio10BUCLES {
    public static void main(String[] args) {

        //Lanza 2 dados de 12 caras 100 veces
        //Di cuantas veces salen las 2 caras iguales

        int contador = 0;
        int num;

        //Usamos for como opcion de bucle

        for(num = 1; num <= 100; num++){

            //Se pone aqui la variable del dado porque si lo ponemos fuera solo tiraria del dado 1 vez
            int dado1 = (int) (Math.random()*12 + 1);
            int dado2 = (int) (Math.random()*12 + 1);

            //Mostramos lo que le ha salido en el dado al usuario
            System.out.println("DADO 1: " + dado1 + " - " + "DADO 2: " + dado2);

            //Mostramos en que tirada le ha salido 20 y sumamos +1 al contador
            if (dado1 == dado2){
                System.out.println("Te toco el mismo numero en la tirada " + num);
                contador++;
            }
        }

        //Mostramos cuantos criticos le han salido al usuario
        System.out.println("Te salieron " + contador + " veces el mismo número");













    }
}
