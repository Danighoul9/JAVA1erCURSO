package Tema2.TareasTema2;

import java.util.Scanner;

public class Ejercicio14BUCLES_ACUMULADORES {
    public static void main(String[] args) {

        //Pide 5 precios de un producto y la cantidad de cada uno de ellos
        //Precio - cantidad (* 5veces)

        Scanner sc = new Scanner(System.in); //Crea el objeto para leer de teclado

        int i;
        double precioProducto;
        int cantidad;
        double resultado;
        double resultadoTotal = 0;


        for(i=0; i <=5; i++){
            System.out.println("Dime el precio de un producto que acabas de comprar: ");
            precioProducto = sc.nextInt();

            System.out.println("Dime la cantidad de la compra: ");
            cantidad = sc.nextInt();

            resultado= precioProducto * cantidad;
            System.out.println("En total te saldria a unos " + resultado + " €");

            resultadoTotal= resultadoTotal + resultado;
        }

        System.out.println("El total de la compra es de " + resultadoTotal + " €");
    }
}
