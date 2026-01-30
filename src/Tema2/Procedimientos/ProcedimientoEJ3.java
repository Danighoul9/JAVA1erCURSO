package Tema2.Procedimientos;

import java.util.Scanner;

public class ProcedimientoEJ3 {

    public static double areaTriangulo (double a, double b){
        return (a*b) /2;
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Crea una funcion que de el area de un triangulo
        //Recibe dos parámetros: el valor de la base y el de la altura
        //El programa debe funcionar con este main

        System.out.println("Dime la base del triangulo");
        double base = sc.nextDouble();
        System.out.println("Dime la altura del triangulo");
        double altura = sc.nextDouble();

        System.out.println("El area del triangulo es : " + areaTriangulo(base,altura));


    }
}
