package Tema2.ControlDeExcepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Excepciones1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opcion=-1;

        try {
            System.out.println("Dime un número");
            opcion = sc.nextInt();
        } catch (InputMismatchException exc) { //Si no es entero
            System.out.println("Por favor introduce un entero");
        } catch (Exception exc) { //Cualquier error capturado
            System.out.println("Error leyendo de teclado");
            System.out.println(exc.toString());
        }

        //SOLO CAPTURA UNA EXCEPCION: la más específica
        //Orden de los catchs es de excepción más concreta a excepción
        //más general. La más general es Exception, y se pone al final.

        System.out.println("FIN DEL PROGRAMA");

    }
}
