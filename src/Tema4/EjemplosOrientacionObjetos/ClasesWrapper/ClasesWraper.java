package Tema4.EjemplosOrientacionObjetos.ClasesWrapper;
import java.util.Scanner;

public class ClasesWraper {

    public static void main(String[] args) {

        Character letra = 'a';
        Integer num1 = 33;
        int num2 = 44;

        int num3 = num1 + num2;
        System.out.println(num3);

        Integer numero = Integer.valueOf("44");
        System.out.println(numero + 1);

        Scanner sc = new Scanner(System.in);
        System.out.println("Dime un número entero:");
        Integer numero2 = Integer.valueOf(sc.nextLine());
        System.out.println(numero2);
        System.out.println("Dime un número entero:");
        Integer numero3 = Integer.parseInt(sc.nextLine());
        System.out.println(numero3);

        sc.close();

        Boolean bool1 = true;
        boolean bool2 = false;

        Double precio1 = 10.55;
        double precio2 = 12.33;

        precio1 = precio1 + precio2; //22.88
        System.out.println(precio1);

        System.out.println(precio1.intValue());

        //Podemos usar las clases envoltorio para los tipos básicos
        //int -> Integer
        //double -> Double
        //boolean -> Boolean
        //char -> Character

        //Se pueden asignar indistintamente, hace la conversión automática
        //En los tipos númericos tenemos métodos para convertir de String al tipo
        //En los tipos númericos tenemos métodos para convertir entre tipos númericos
        //Las clases Integer, Double, Boolean y Character tienen además
        //métodos estáticos de utilidades: (isDigit, isUpperCase, max, min, ...)

    }
}
