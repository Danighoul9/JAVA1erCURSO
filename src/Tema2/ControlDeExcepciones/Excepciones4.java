package Tema2.ControlDeExcepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Excepciones4 {
    public static void main(String[] args) {
        //CALCULADORA

        Scanner sc = new Scanner(System.in);
        int opcion=-1;
        double num1=0, num2=0, resultado=0;

        do {
            try {
                System.out.println("Dime el primer número: (Ej.: 34.567)");
                num1 = Double.parseDouble(sc.nextLine()); //Convertir String a Double
                System.out.println("Dime el segundo número: ");
                num2 = Double.parseDouble(sc.nextLine());

                System.out.println("OPERACIÓN A REALIZAR (1-5)");
                System.out.println("1. Sumar");
                System.out.println("2. Restar");
                System.out.println("3. Multiplicar");
                System.out.println("4. Dividir");
                System.out.println("5. Salir");

                opcion = Integer.parseInt(sc.nextLine());

                switch (opcion) {
                    case 1:
                        resultado = num1 + num2;
                        System.out.println("El resultado es: " + resultado);
                        break;
                    case 2:
                        resultado = num1 - num2;
                        System.out.println("El resultado es: " + resultado);
                        break;
                    case 3:
                        resultado = num1 * num2;
                        System.out.println("El resultado es: " + resultado);
                        break;
                    case 4:
                        resultado = num1 / num2;
                        System.out.println("El resultado es: " + resultado);
                        break;
                    case 5:
                        System.out.println("Gracias por usar nuestro programa");
                    default:
                        System.out.println("Opción incorrecta");
                }

            } catch (NumberFormatException exc) {
                sc = new Scanner(System.in); //Para volver a pedir datos
                System.out.println("Escribe bien el número");
                continue; //El bucle comienza de nuevo
            } catch (InputMismatchException exc) {
                sc = new Scanner(System.in); //Para volver a pedir datos
                System.out.println("La operación debe ser un entero (1-5)");
                continue; //El bucle comienza de nuevo
            } catch (Exception exc) {
                sc = new Scanner(System.in); //Para volver a pedir datos
                System.out.println(exc);
                continue; //El bucle comienza de nuevo
            }

        } while (opcion != 5);


    }
}
