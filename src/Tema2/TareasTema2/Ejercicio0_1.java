package Tema2.TareasTema2;

import java.util.Scanner;

public class Ejercicio0_1 {
    public static void main(String[] args) {

        //Determinar si eres elegible para que te den un credito
        //1. Tienes más de 5 años de antiguedad en el banco e ingresos mensuales de
        // más de 2500€
        //2.Tienes una antiguedad entre 2 y 5 años, regresos de mas de 2000€ mensuales
        // y no tienes deudad pendientes
        //3. Tienes menos de 2 años de antiguedad, un ingreso de mas de 3000€ mensuales
        // y no tienes deudas pendientes

        //V.E: antiguedad, ingresosMensuales, deudasPendientes
        //V.S: decir si eres elegiblre para que te den un crédito o no

        Scanner sc = new Scanner(System.in); //Crea el objeto para leer de teclado

        //VARIABLES

        double antiguedad;
        double ingresosMensuales;
        boolean deudasPendientes;

        System.out.println(" Ingrese su antiguedad: ");
        antiguedad= sc.nextInt(); //Leer de teclado un entero

        System.out.println(" Ingrese sus ingresos mensuales: ");
        ingresosMensuales= sc.nextDouble(); //Leer de teclado el género

        System.out.println("¿Tiene usted deudas pendientes? (true or false): ");
        deudasPendientes= sc.nextBoolean(); //Leer de teclado un boolean

        if (antiguedad > 5 && ingresosMensuales > 2500){
            System.out.println("Eres elegible para el crédito");
        } else if (antiguedad > 2 && antiguedad < 5 && ingresosMensuales > 2000 && deudasPendientes == false){
            System.out.println("Eres elegible para el crédito");
        } else if (antiguedad < 2 && ingresosMensuales == 3000 && deudasPendientes == false) {
            System.out.println("Eres elegible para el crédito");
        } else {
            System.out.println("Lo sentimos no eres legible para el préstamo");
        }


    }
}
