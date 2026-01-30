package Tema1.TareasTema1;

import java.util.Scanner;

public class RadiodeUnCirculo {
    public static void main(String[] args) {
        //Leer el radio de un círculo y calcular e imprimir su superficie y su circunferencia.
        //Análisis
        //Entradas: Radio del circulo (Variable RADIO).
        //Salidas: Superficie del circulo (Variable SUPERFICIE) y Circunferencia del circulo (Variable PERIMETRO)
        //Variables: RADIO, SUPERFICIE, PERIMETRO de tipo REAL
        // DISEÑO
        // Area = PI * radio * radio
        // Longitud = PI * 2 * radio

        //1.Declaración de variable

        double radio;
        double area;
        double longitud;

        //2.Leer datos de entrada

        Scanner sc = new Scanner(System.in); //Crea el objeto para leer de teclado
        System.out.println(" Ingrese el radio: ");
        radio = sc.nextDouble(); //Leer de teclado un decimal
        System.out.println("El radio es " + radio);

        //3.Hacer cálculos

        area = 3.1415 * radio * radio; // PI *r2
        longitud = 2 * 3.1415 * radio; // 2 * PI * r

        //4.Mostrar el resultado
        System.out.println("El area es " + area);
        System.out.println("La longitd es " + longitud);


    }

}
