package ExamenesDePrueba.PrimerExamen;

import java.util.Scanner;

public class Example {
    public static int generarNumRandom(){
        return (int) (Math.random() * 50) + 1;

    }

    public static int calculo(int num){

        return num - generarNumRandom();
    }

    static void main(String[] args) {

        //El programa genera un número aleatorio entre 1 y 50. El usuario tiene un máximo de 7 intentos
        //para adivinarlo. Después de cada intento, el programa indicará:

        //Si el número es mayor o menor
        //Si está "frío" (diferencia > 10),"tibio" (dif. entre 5 y 10) o "caliente" (dif. < 5)

        //Al finalizar, mostrará si ganó o perdió y el número de intentos utilizados.


        Scanner sc = new Scanner(System.in);

        int numRandom = generarNumRandom();

        int num = -1;
        int intentos=0;

        do {
            try{
                do{
                    //Con este DoWhile protego que el usuario no ponga 0 o menos o mas de 50, y asi tampoco le cuenta para
                    //el intento
                    System.out.println("Dime un número entre 1 y 50: ");
                    num = sc.nextInt();
                }while (num <= 0 || num > 50);

                if (num -  1> 10) {
                    System.out.println("FRÍO (diferencia > 10)");
                } else if (calculo(num) <= 10 && calculo(num)  >= 5){
                    System.out.println("TIBIO (dif. entre 5 y 10)");
                } else if(calculo(num) < 5){
                    System.out.println("Caliente (dif. < 5)");
                }else{
                    System.out.println("ENHORABUENA, HAS ACERTADO");
                }

                //Intentos restantes
                intentos++;
                if (intentos == 7) {
                    System.out.println("Lo siento no lo has conseguido :(");
                    break; //TERMINA
                }
                if (num != generarNumRandom()) {
                    System.out.println("Te quedan " + (7-intentos) + " intentos");
                }

            }catch (Exception e){
                System.out.println(e.getMessage());
                sc.nextLine();
                System.out.println("Ingrese un numero correcto");
            }
        } while (num != generarNumRandom());

    }
}

