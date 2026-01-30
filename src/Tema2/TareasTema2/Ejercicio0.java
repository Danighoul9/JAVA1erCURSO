package Tema2.TareasTema2;

import java.util.Scanner;

public class Ejercicio0 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); //Crea el objeto para leer de teclado

        int edad;
        String sexo; // 'h' hombre / 'm'Mujer
        boolean amigoJefe;

        System.out.println(" Ingrese su edad: ");
        edad= sc.nextInt(); //Leer de teclado un entero

        sc.nextLine();

        System.out.println(" Ingrese su genero (Hombre o Mujer): ");
        sexo= sc.nextLine(); //Leer de teclado el género

        System.out.println(" Es usted amigo del jefe especifique (true or false): ");
        amigoJefe= sc.nextBoolean(); //Leer de teclado un boolean



        //Puedes entrar a la discoteca si tienes 18 o mas años
        //Puedes entrar si tienes mas de 16 y eres mujer (no deberias)
        //Puede entrar si tienes mas de 16 y hombre y amigo del jefe
        //No puedes entrar en otro caso

        if (edad >= 18){
            System.out.println("Puedes entrar sin problema");
        } else if (edad >= 16 && sexo == "mujer" ){
            System.out.println("Puedes entrar pero no deberias");
        } else if (edad >= 16 && sexo == "hombre" && amigoJefe == true) {
            System.out.println("Puedes entrar por enchufe colega");
        }else{
            System.out.println("No puedes entrar");
        }
    }
}
