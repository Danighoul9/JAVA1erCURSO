package Tema4.EjemplosOrientacionObjetos.EjemplosVarios.ConversorDeDivisas;

import java.util.Scanner;

public class TestConversorMoneda {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("¿Cuantos € quieres pasar a Dolar,Yuanes,Libras");
        //Cantidad a cambiar
        int cantidad = sc.nextInt();

        System.out.println(cantidad + "€ A Dolares son : " + ConversorMoneda.conversorEuroToDolar(cantidad) + "$");
        System.out.println(cantidad + "€ A Yuanes son : " + ConversorMoneda.conversorEuroToYuan(cantidad) + "¥");
        System.out.println(cantidad + "€ A Libras son : " + ConversorMoneda.conversorEuroToLibra(cantidad) +"£");
    }
}
