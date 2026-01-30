package Tema1.TareasTema1;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {

        //Lee de teclado dos valores de tipo double num1, num2
        //Intercambia el valor de las variables y pintalo por pantalla

        //Valores
        double num1, num2, temp;

        //Añadimos la funcion de Scanner
        Scanner sc = new Scanner(System.in); //Crea el objeto para leer de teclado

        //Le pedimos al usuario que ingrese sus notas correspondientes de os 3 examenes (55%)
        System.out.println(" Ingrese su 1 numero: ");
        num1 = sc.nextDouble(); //Leer de teclado un decimal

        //Le pedimos al usuario que ingrese sus notas correspondientes de os 3 examenes (55%)
        System.out.println(" Ingrese su 2 numero: ");
        num2 = sc.nextDouble(); //Leer de teclado un decimal

        temp = num2;//Grabo el num2 antes de machacarlo con el num1
        num2 = num1;
        num1 = temp;

        //Pintamos por pantalla el resultado
        System.out.println("El numero 1 es " + num1);
        System.out.println("El numero 2 es " + num2);
    }
}
