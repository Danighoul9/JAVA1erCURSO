package Tema1.TareasTema1;

import java.util.Scanner;

public class Ejercicio0 {
    public static void main(String[] args) {

        //EJERCICIO CLASE
        //Tenemos que diseñar un programa que pida por teclado tres temperaturas
        //Tiene que mostrar como salida la temperatura media de esas tres
        //Realizar analisis, diseño y codificación

        //1.Ponemos los datos con su respectiva variable

        double temp1;
        double temp2;
        double temp3;
        double tempsMedia;

        //2. Debemos usar el scanner para que nos pida de teclado las temperaturas

        Scanner sc = new Scanner(System.in); //Crea el objeto para leer de teclado
        System.out.println(" Ingrese la Temperatura 1: ");
        temp1 = sc.nextDouble(); //Leer de teclado un decimal
        System.out.println(" Ingrese la Temperatura 2: ");
        temp2 = sc.nextDouble(); //Leer de teclado un decimal
        System.out.println(" Ingrese la Temperatura 3: ");
        temp3 = sc.nextDouble(); //Leer de teclado un decimal

        //3.CALCULOS
        tempsMedia = (temp1+temp2+temp3)/3;

        //4.Mostrar el resultado

        System.out.println(" La media de esas 3 temperaturas es de: " + tempsMedia);



    }
}
