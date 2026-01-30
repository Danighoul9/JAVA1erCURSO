package Tema2.Switch;

import java.util.Scanner;

public class Ejemplo_Switch {
    public static void main(String[] args) {
        while(true){
        //Programa que segun las ntoas me diga si estas:
        //Suspenso, Aprobado, Notable, Sobresaliente
        Scanner sc = new Scanner(System.in); //Crea el objeto para leer de teclado

        int nota;

        System.out.println(" Ingrese su nota: ");
        nota= sc.nextInt(); //Leer de teclado un entero

        switch (nota) {
            case 1, 2, 3, 4:
                System.out.println("Estas Suspenso");
                break;
            case 5, 6:
                System.out.println("Estas Aprobado");
                break;
            case 7, 8:
                System.out.println("Estas en Notable");
                break;
            case 9, 10:
                System.out.println("Estas en Sobresaliente");
                break;
            default:
                System.out.println("Fuera del rango de notas");
                break;
             }
        }
    }
}
