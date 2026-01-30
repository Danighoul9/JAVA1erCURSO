package Tema1;

import java.util.Scanner;

public class ScannerFunciones {
    public static void main(String[] args) {

        long num;
        double decimal;
        String cadena;

        //Leer Número ENTERO
        Scanner sc = new Scanner(System.in); //System.in hace referencia al teclado
        System.out.println("Dime un número entero");
        num = sc.nextLong();
        System.out.println("El número introducido es " + num);

        //Leer Número DECIMAL (La parte decimal con (,) y la parte (elevado a) con e)
        System.out.println("Dime un número decimal");
        decimal = sc.nextDouble();
        System.out.println("El número introducido es " + decimal);

        sc.nextLine(); //Para leer el Enter tras escribir el decimal

        //Leer CADENAS
        System.out.println("Dime una cadena");
        cadena = sc.nextLine();
        System.out.println("La cadena introduciza es " + cadena);

        //HAY UN PEQUEÑO DEFECTO: CUANDO LEES UNA CADENA DESPUES DE UN ENTERO O UN DOUBLE
        //EL ENTER DESPUÉS DE ESCRIBIR EL NÚMERO LO TOMA COMO LA CADENA A LEER

        //SOLUCION 1 --> poner un sc.nextLine() antes de leer la cadena, para tragarse el Enter
        //SOLUCION 2 --> leer siempre cadenas y transformarlas a números cuando sea necesario

        //Leer entero
        System.out.println("Dime un entero: ");
        num = Long.parseLong(sc.nextLine());
        System.out.println("El número introducido es " + num);

        //Leer decimal (la parte decimal con ,  y la parte elevado a con e)
        // 54,55   56e8 = 56 x 10 elevado a 8
        System.out.println("Dime un decimal: ");
        decimal = Double.parseDouble(sc.nextLine());
        System.out.println("El número introducido es " + decimal);

        //Leer cadenas
        System.out.println("Dime un cadena es: ");
        cadena = sc.nextLine();
        System.out.println("La cadena es: " + cadena);

    }
}
