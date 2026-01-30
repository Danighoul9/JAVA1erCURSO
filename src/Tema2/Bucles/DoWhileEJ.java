package Tema2.Bucles;

import java.util.Scanner;

public class DoWhileEJ {
    public static void main(String[] args) {

        int opcion;
        Scanner sc = new Scanner(System.in);

        do{
            System.out.println("1.Opcion");
            System.out.println("2.Opcion");
            System.out.println("3.Opcion");
            System.out.println("4.Salir");

            System.out.println("Dime una opcion");

            opcion = sc.nextInt();
            switch (opcion){
                case 1,2,3:
                    System.out.println("Has elegido la opcion: " + opcion);
                    break;
                case 4:
                    System.out.println("Adios, hasta la próxima");
                    break;
                default:
                    System.out.println("Opcion incorrecta");

            }
        }while (opcion != 4);//El bucle termina cuando escoges el 4
    }
}
