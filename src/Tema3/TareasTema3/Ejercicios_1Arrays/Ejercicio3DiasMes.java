package Tema3.TareasTema3.Ejercicios_1Arrays;

import java.util.Scanner;

public class Ejercicio3DiasMes {

   public static void main(String[] args) {

       //Genera un programa que pida por teclado un número de mes
       //e indique el número de días que tiene ese mes.
       //Generar un array que guarde los días que tiene cada mes.


       Scanner sc = new Scanner(System.in);

       //Array que nos dice el mes que ha seleccionado el usuario en base al numero escrito
       String mes[] = new String[12];
       mes[0] = "Enero";
       mes[1] = "Febrero";
       mes[2] = "Marzo";
       mes[3] = "Abril";
       mes[4] = "Mayo";
       mes[5] = "Junio";
       mes[6] = "Julio";
       mes[7] = "Agosto";
       mes[8] = "Septiembre";
       mes[9] = "Octubre";
       mes[10] = "Noviembre";
       mes[11] = "Diciembre";

       //Array con todos los dias de todos los meses
       int diasDelMes[] = new int[12];
       diasDelMes[0] = 31; //enero
       diasDelMes[1] = 28; //febrero
       diasDelMes[2] = 31; //marzo
       diasDelMes[3] = 30; //abril
       diasDelMes[4] = 31; //mayo
       diasDelMes[5] = 30; //junio
       diasDelMes[6] = 31; //julio
       diasDelMes[7] = 31; //agosto
       diasDelMes[8] = 30; //septiembre
       diasDelMes[9] = 31; //octubre
       diasDelMes[10] = 30; //noviembre
       diasDelMes[11] = 31; //diciembre


       int numMes = 0;
       do {
           try {

               System.out.println("Introduce un mes para saber sus dias (1-12): ");
               numMes = sc.nextInt();

               if (numMes < 1 || numMes > 12) {
                   System.out.println("Numero del Mes no valido");
               }

           } catch (Exception e) {
               System.out.println(e.getMessage());
               sc.nextLine();
               System.out.println("Ingresa un numero correcto");
           }

       } while (numMes < 1 || numMes > 12);

       System.out.println(mes[numMes - 1] + " tiene " + diasDelMes[numMes - 1] + " dias en total.");
   }
}
