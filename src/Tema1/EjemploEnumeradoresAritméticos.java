package Tema1;

public class EjemploEnumeradoresAritméticos {
    public static void main(String[] args) {

        double num1 = 145, num2 = 23;
        double resultado = 0;

        System.out.println( "Suma = " + (num1 + num2) );
        System.out.println( "Resta = "  + (num1 - num2) );
        System.out.println( "Multiplicación = " + (num1 * num2) );
        System.out.println( "División = " + (num1 / num2) );
        System.out.println( "Resto de la división = " + (num1 % num2) );

        resultado = (num1 * num1) * (num2 / num1) - (num2 * 22);

        System.out.println( "Calculo completo = " + resultado);
    }
}
