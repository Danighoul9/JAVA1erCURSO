package Tema2.Procedimientos;
import java.util.Scanner;

public class ProcedimientosEJ1 {
    static Scanner sc = new Scanner(System.in);

    //Pintar el menu de que numeros random quiere el usuario generar
    public static void pintarOpciones() {
        System.out.println("1. GenerarAleatorio(1, 100)");
        System.out.println("2. GenerarAleatorio(-100, 100)");
        System.out.println("3. GenerarAleatorio(100, 200)");
        System.out.println("4. Salir");
    }

    //Genrar numero random
    public static int tirarDado(int numMin, int numMax ) {
        return (int) (Math.random() * (numMax-numMin + 1) + numMin);
    }

    public static void main(String[] args) {
        int opcion;
        int dado=1;

        //Crea una función que genere un número aleatorio entre
        //un número entero mínimo y un máximo
        //generarAleatorio(int min, int max)
        //Pruébala desde el main llamándola con:
        //GenerarAleatorio(1, 100)
        //GenerarAleatorio(-100, 100)
        //GenerarAleatorio(100, 200)

        do {
            pintarOpciones();
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Has escogido numero random del  - 100");
                    dado = tirarDado(1,100);
                    System.out.println("Dado de 1- 100 = " + dado);
                    break;
                case 2:
                    System.out.println("Has escogido numero random del -100 - 100");
                    dado = tirarDado(-100,100);
                    System.out.println("Dado de -100 - 100 = " + dado);
                    break;
                case 3:
                    System.out.println("Has escogido numero random del 100 - 200");
                    dado = tirarDado(100,200);
                    System.out.println("Dado de 100 - 200 = " + dado);
                    break;
                case 4:
                    System.out.println("Gracias por usar nuestro programa");
                    break;
                default:
                    System.out.println("Opción incorrecta (1-3)");
            }

        }while(opcion != 4);


    }
}
