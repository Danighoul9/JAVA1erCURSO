package Tema2.TareasTema2;

import java.util.Scanner;

public class Ejercicio0_2 {
    public static void main(String[] args) {

        //EJERCICIO PARA DETERMINAR SI TE DAN UNA BECA Y DE QUÉ TIPO
        //Requisitos generales (deben cumplirse los dos):
        //1. No tener más de dos asignaturas suspensas
        //2. Ingresos familiares inferiores a 2000€/mes
        //Si se cumplen te van a dar un tipo de beca

        //BECA COMPLETA: si se cumple alguna de estas condiciones
        //1. Ingresos inferiores a 800€/mes
        //2. Vives en zona vulnerable
        //3. Discapacidad superior al 60%

        //BECA PARCIAL: si se cumple alguna de estas condiciones
        //1. Ingresos inferiores a 1000€/mes y Familia numerosa
        //2. Ingresos inferiores a 1200€/mes
        //3. Ingresos inferiores a 1100€/mes y vives en zona vulnerable
        //4. Discapacidad entre el 40 y 60%

        //BECA SIMPLE: si se cumple alguna de estas condiciones
        //1. Ingresos familiares entre 1400€/mes y 1800€/mes
        //2. Discapacidad entre el 20 y 40%

        //V.E.: ingresosMensualesFamilia, asignaturasSuspensas, zonaVulnerable,
        //  discapacidad(0-100), familiaNumerosa
        //V.S.: si te dan beca o no, y en caso afirmativo qué tipo de beca

        Scanner sc = new Scanner(System.in); //Crea el objeto para leer de teclado


        double ingresosMensualesFamilia;
        int asignaturasSuspensas;
        boolean zonaVulnerable;
        int discapacidad;
        boolean familiaNumerosa;

        System.out.println(" Ingrese sus asignaturas suspendidas: ");
        asignaturasSuspensas= sc.nextInt(); //Leer de teclado un entero

        System.out.println(" Ingrese sus ingresos mensuales: ");
        ingresosMensualesFamilia= sc.nextDouble(); //Leer de teclado el género

        if (asignaturasSuspensas < 2 && ingresosMensualesFamilia < 2000){
            System.out.println("Tienes derecho a beca veamos que a que beca puedes aspirar");

            System.out.println("Diganos si vive en zona vulnerable (True o False): ");
            zonaVulnerable= sc.nextBoolean(); //Leer de teclado un boolean

            System.out.println("Diganos si tiene familia numerosa (True o False): ");
            familiaNumerosa= sc.nextBoolean(); //Leer de teclado un boolean

            System.out.println("Ingrese su grado de discapacidad (si tiene, si no, ponga 0): ");
            discapacidad= sc.nextInt(); //Leer de teclado un boolean

            if (ingresosMensualesFamilia < 800 && zonaVulnerable == true && discapacidad >=60){
                System.out.println("Tienes derecho a la beca completa");
            } else if (ingresosMensualesFamilia < 1000 && familiaNumerosa == true || ingresosMensualesFamilia < 1200
                    || ingresosMensualesFamilia < 1100 && zonaVulnerable == true || discapacidad >= 40 && discapacidad
                    <= 60) {
                System.out.println("Tienes derecho a la beca parcial");
            } else if (ingresosMensualesFamilia > 1400 && ingresosMensualesFamilia < 1800 || discapacidad >= 20
                    && discapacidad < 40) {
                System.out.println("Tienes derecho a la beca simple");
            }else{
                System.out.println("Cumples los requisitos principales pero no te corresponde ningun tipo de beca");
            }


        }else{
            System.out.println("No tienes derecho a beca");

        }




    }
}
