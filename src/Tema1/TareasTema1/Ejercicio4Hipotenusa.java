package Tema1.TareasTema1;

import java.util.Scanner;

public class Ejercicio4Hipotenusa {
    public static void main(String[] args) {
        while (true) {

            //Añadimos la funcion de Scanner
            Scanner sc = new Scanner(System.in); //Crea el objeto para leer de teclado

            // Dados los catetos de un triangulo calcular su hipotenusa y mostrarla
            //Para hacer la raiz cuadrada usamos el "Math.sqrt"
            //Para hacer los numeros con un elevado usamos el "Math.pow"

            //Variables
            double c1, c2;
            double hipotenusa;

            //Calculo
            // he2 = c1e2 + c2e2
            // Despejamos el elevado a 2 de la hipotenusa --> h = √c1e2 + c2e2

            //Le pedimos al usuario que ingrese el cateto 1 de su triangulo
            System.out.println(" Ingrese el Cateto 1 de su triangulo: ");
            c1 = sc.nextDouble(); //Leer de teclado un decimal

            //Le pedimos al usuario que ingrese el cateto 2 de su triangulo
            System.out.println(" Ingrese el Cateto 2 de su triangulo: ");
            c2 = sc.nextDouble(); //Leer de teclado un decimal

            //Realizamos el cálculo

            hipotenusa = Math.sqrt(Math.pow(c1, 2) + Math.pow(c2, 2));
            System.out.println("La hipotenusa de su triangulo es de: " + hipotenusa + " cm");


        }
    }
}
