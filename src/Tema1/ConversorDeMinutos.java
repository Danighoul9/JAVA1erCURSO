package Tema1;

import java.util.Scanner;

public class ConversorDeMinutos {
    public static void main(String[] args) {
        while (true){
        //Realiza un programa que reciba una cantidad de minutos y muestre por pantalla a cuantas
        //horas y minutos corresponde.
        //Por ejemplo: 1000 minutos son 16 horas y 40 minutos.

        //1.Declaramos las variables
        double min;
        int resultado;
        int minRestantesEnd;

        //2.Usamos el scanner para que el usuario introduzca los minutos deseados
        Scanner sc = new Scanner(System.in); //Crea el objeto para leer de teclado
        System.out.println(" Ingrese los minutos que desear paras a horas y minutos: ");
        min = sc.nextDouble(); //Leer de teclado un decimal

        //3.Hacemos los calculos para pasar de minutos a horas y minutos
        resultado = (int) (min / 60);
        minRestantesEnd = (int) (min % 60);


        System.out.println("Estos minutos son el equivalente a: " + resultado + "h " + minRestantesEnd + "min");

        }
    }
}
