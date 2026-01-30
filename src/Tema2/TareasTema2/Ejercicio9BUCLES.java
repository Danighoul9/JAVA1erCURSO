package Tema2.TareasTema2;

public class Ejercicio9BUCLES {
    public static void main(String[] args) {

        //Lanza un dado de 20 caras 50 veces y dime cuantas sale un critico (20)


        //Declaramos variables que usaremos dentro del bucle

        int contador = 0;
        int num;

        //Usamos for como opcion de bucle

        for(num = 1; num <= 500; num++){

            //Se pone aqui la variable del dado porque si lo ponemos fuera solo tiraria del dado 1 vez
            int dado = (int) (Math.random()*20 + 1);

            //Mostramos lo que le ha salido en el dado al usuario
            System.out.println("DADO: " + dado);

            //Mostramos en que tirada le ha salido 20 y sumamos +1 al contador
            if (dado == 20){
                System.out.println("Te toco el número 20 en la tirada " + num);
                contador++;
            }
        }

        //Mostramos cuantos criticos le han salido al usuario
        System.out.println("Te salieron " + contador + " críticos");








    }
}
