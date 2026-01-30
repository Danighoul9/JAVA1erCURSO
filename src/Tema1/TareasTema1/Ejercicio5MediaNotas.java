package Tema1.TareasTema1;

import java.util.Scanner;

public class Ejercicio5MediaNotas {
    public static void main(String[] args) {

        //Un alumno del modulo de Programación quiere saber su nota final. Esta consta de:
        //55% de tres notas parciales (media aritmetica de las tres)
        //30% calificacion del examen final
        //15% calificacion del trabajo final
        //Pide los valores de entrada y muestra su nota final

        //Declaramos los valores
        double nota1,nota2,nota3;
        double mediaNotas;
        double examenFinal;
        double trabajoFinal;
        double resultado;

        //Añadimos la funcion de Scanner
        Scanner sc = new Scanner(System.in); //Crea el objeto para leer de teclado

        //Le pedimos al usuario que ingrese sus notas correspondientes de os 3 examenes (55%)
        System.out.println(" Ingrese la nota de su primer examen: ");
        nota1 = sc.nextDouble(); //Leer de teclado un decimal

        System.out.println(" Ingrese la nota de su segundo examen: ");
        nota2 = sc.nextDouble(); //Leer de teclado un decimal

        System.out.println(" Ingrese la nota de su tercer examen: ");
        nota3 = sc.nextDouble(); //Leer de teclado un decimal

        mediaNotas = (nota1+nota2+nota3)/3;
        System.out.println("Tu media entre estas 3 notas es de un:" + mediaNotas);

        //Le pedimos al usuario que ingrese sus nota del examen final (30%)
        System.out.println(" Ingrese la nota de su examen final: ");
        examenFinal = sc.nextDouble(); //Leer de teclado un decimal

        //Le pedimos al usuario que ingrese sus nota del trabajo final (15%)
        System.out.println(" Ingrese la nota de su trabajo final: ");
        trabajoFinal = sc.nextDouble(); //Leer de teclado un decimal

        //Calculamos el resultado teniendo en cuenta los porcentajes asignados a las notas
        resultado = ((mediaNotas*55)/100) + ((examenFinal*30)/100) + ((trabajoFinal*15)/100);

        //Pintamos el resultado final (La nota)
        System.out.println("Tu nota final es de:" + resultado);



    }
}
