package MisProyectos;

import java.util.Scanner;

public class Ejercicio_J_1 {
    public static void main(String[] args) {

        //Leer tres números que denoten una fecha (día, mes, año). Comprobar que es
        //una fecha válida. Si no es válida escribir un mensaje de error. Si es válida
        //escribir la fecha cambiando el número del mes por su nombre. Ej. si se
        //introduce 1 2 2006, se deberá imprimir “1 de febrero de 2006”. El año debe ser
        //mayor que 0. (Recuerda la estructura según sea).


        int dia;
        int mes;
        int anio;

        Scanner sc = new Scanner(System.in);

        System.out.print("Dime el dia: ");
        dia = sc.nextInt();
        System.out.print("Dime el mes: ");
        mes = sc.nextInt();
        System.out.print("Dime el anio: ");
        anio = sc.nextInt();


        while(anio < 0){
            System.out.println("Ese anio es incorrecto, lo siento, vuelva a introducir el año");
            anio = sc.nextInt();
        }
        while(mes > 12 || mes < 1) {
            System.out.println("Ese mes es incorrecto, lo siento, vuelva a introducir el mes");
            mes = sc.nextInt();
        }

        switch (mes) {
            case 1,3,5,7,8,10,12:
                while (dia > 31 || dia < 1) {
                    System.out.println("Ese dia es incorrecto, lo siento, tonto...");
                    System.out.print("Dime el dia: ");
                    dia = sc.nextInt();
                }
                break;
            case 4,6,9,11:
                while (dia > 30 || dia < 1) {
                    System.out.println("Ese dia es incorrecto, lo siento, tonto...");
                    System.out.print("Dime el dia: ");
                    dia = sc.nextInt();
                }
                break;
            case 2:
                while (dia > 28 || dia < 1) {
                    System.out.println("Ese dia es incorrecto, lo siento, tonto...");
                    System.out.print("Dime el dia: ");
                    dia = sc.nextInt();
                }
                break;

        }

        System.out.println("Fecha correcta: ");

        if(mes ==1){
            System.out.println(dia + " Enero " + anio);
        }else if(mes ==2){
            System.out.println(dia + " Febrero " + anio);
        }else if(mes ==3){
            System.out.println(dia + " Marzo " + anio);
        }else if(mes ==4){
            System.out.println(dia + " Abril " + anio);
        }else if(mes ==5){
            System.out.println(dia + " Mayo " + anio);
        }else if(mes ==6){
            System.out.println(dia + " Junio " + anio);
        }else if(mes ==7){
            System.out.println(dia + " Julio " + anio);
        }else if(mes ==8){
            System.out.println(dia + " Agosto " + anio);
        }else if(mes ==9){
            System.out.println(dia + " Septiembre " + anio);
        }else if(mes ==10){
            System.out.println(dia + " Octubre " + anio);
        }else if(mes ==11){
            System.out.println(dia + " Noviembre " + anio);
        }else if(mes ==12){
            System.out.println(dia + " Dicembre " + anio);
        }
    }
}

