package Tema2.TareasTema2;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {

        //El director de una escuela está organizando un viaje de estudios,
        // y requiere determinar cuánto debe cobrar a cada alumno y cuánto debe pagar
        // a la compañía de viajes por el servicio. La forma de cobrar es la siguiente:

        //Si son 100 alumnos o más, el costo por cada alumno es de 65 euros
        //De 50 a 99 alumnos, el costo es de 70 euros
        //De 30 a 49, de 95 euros
        //Si son menos de 30, el costo de la renta del autobús es de 4000 euros, sin importar el número de alumnos.

        //Realice un algoritmo que permita determinar el pago a la compañía de autobuses
        // y lo que debe pagar cada alumno por el viaje.

        Scanner sc = new Scanner(System.in); //Crea el objeto para leer de teclado
        int numeroAlumnos;
        double costePorAlumno;
        double costeTotal = 0;


        System.out.println(" Ingrese numero de alumnos que van a la excursion: ");
        numeroAlumnos= sc.nextInt(); //Leer de teclado un entero

        if(numeroAlumnos >=100){
           costePorAlumno = 60;
        }else if (numeroAlumnos >=50 && numeroAlumnos <=99){
            costePorAlumno = 70;
        }else if (numeroAlumnos >= 30 && numeroAlumnos <= 49){
            costePorAlumno = 95;
        }else{
            costeTotal = 4000;
            costePorAlumno = 4000 / numeroAlumnos;
        }
        if (numeroAlumnos >= 30){
            costeTotal = numeroAlumnos * costePorAlumno;
        }
        System.out.println("El coste por alumno es de: " + costePorAlumno + " €");
        System.out.println("El coste del viaje es de: " + costeTotal + " €");






    }
}
