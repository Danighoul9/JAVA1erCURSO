package Tema1;

public class EjemploOperadoresRelacionales {
    public static void main(String[] args) {

        //Los operadores relacionales sirven para comparar (numéricamente)
        //Los operadores relacionales me devuelven True o False (boolean)

        int num1 = 100;
        int num2 = 60;
        int num3 = 100;

        //MAYOR
        System.out.println("Resultado 100>60 = " + (num1>num2)); //Mayor

        //IGUAL
        System.out.println("Resultado 100==60 = " + (num1==num2)); //Igual
        System.out.println("Resultado 100==100 = " + (num1==num3)); //Igual

        //DISTINTOS
        System.out.println("Resultado 100!=60 = " + (num1!=num2)); //Distintos
        System.out.println("Resultado 100!=100 = " + (num1!=num3)); //Distintos

        //MAYOR O IGUAL
        System.out.println("Resultado 100>=60 = " + (num1>=num2)); //Mayor o Igual
        System.out.println("Resultado 100>=100= " + (num1>=num3)); //Mayor o Igual

        //MENOR O IGUAL
        System.out.println("Resultado 100<=60 = " + (num1<=num2)); //Menor o Igual
        System.out.println("Resultado 100<=100 = " + (num1<=num3)); //Menor o Igual



    }
}
