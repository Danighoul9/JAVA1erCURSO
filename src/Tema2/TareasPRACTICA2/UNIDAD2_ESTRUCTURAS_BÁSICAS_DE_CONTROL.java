package Tema2.TareasPRACTICA2;

import java.util.Scanner;

public class UNIDAD2_ESTRUCTURAS_BÁSICAS_DE_CONTROL {
    static Scanner sc = new Scanner(System.in);

    //Procedimiento EJ1-------------------------------------------------------------------------------------------------
    public static void mayor(int a, int b, int c){

        //A es mayor
        if( a > b && a > c){
            System.out.println(a + " es el número mayor");
        }

        //B es mayor
        if( b > a && b > c){
            System.out.println(b + " es el número mayor");
        }

        //C es mayor
        if( c > a && c > b){
            System.out.println(c + " es el número mayor");
        }

        //Hay 2 iguales y no hay numero o mayor, o TODOS son iguales
        if (a == b && a != c || a == c && a != b || b == a && b != c || b ==c && b != a || c == a && c != b || c == b && c != a){
            System.out.println("HAY 2 NUMEROS IGUALES, por lo tanto no hay un número mayor");
        }else if( a == b && a == c || b == a && b == c || c == a && c ==b){
            System.out.println("Todos son iguales");
        }
    }

    //Procedimiento EJ2-------------------------------------------------------------------------------------------------
    public static void multiplo(int num){
        if(num % 2 == 0){
            System.out.println("El numero es multiplo de 2");
        }else if (num % 3 == 0){
            System.out.println("El numero es multiplo de 3");
        }else if (num % 5 == 0){
            System.out.println("El numero es multiplo de 5");
        }else if (num % 7 == 0){
            System.out.println("El numero es multiplo de 7");
        }else{
            System.out.println("El numero no es multiplo de niguno");
        }

    }

    //Procedimiento EJ3-------------------------------------------------------------------------------------------------
    public static void nCorrespondiente(int num){
        if(num == 0){
            System.out.println("El numero es CERO");
        }else if (num == 1){
            System.out.println("El numero es UNO");
        }else if (num == 2){
            System.out.println("El numero es DOS");
        }else if (num == 3){
            System.out.println("El numero es TRES");
        }else if (num == 4) {
            System.out.println("El numero es CUATRO");
        }else if (num == 5){
            System.out.println("El numero es CINCO");
        }else if (num == 6){
            System.out.println("El numero es SEIS");
        }else if (num == 7){
            System.out.println("El numero es SIETE");
        }else if (num == 8){
            System.out.println("El numero es OCHO");
        }else if (num == 9){
            System.out.println("El numero es NUEVE");
        }else{
            System.out.println("El numero no es correspondiente");
        }

    }

    //Procedimiento EJ4-------------------------------------------------------------------------------------------------
    public static void llamarBilletes(int num){
        if (num >=500){
            System.out.println("Son " +  num / 500 + " billetes de 500€");
            num = num % 500;
        }
        if (num >= 200){
            System.out.println("Son " +  num / 200 + " billetes de 200€");
            num = num % 200;
        }
        if (num >= 100){
            System.out.println("Son " +  num / 100 + " billetes de 100€");
            num = num % 100;

        }if (num >= 50){
            System.out.println("Son " +  num / 50 + " billetes de 50€");
            num = num % 50;
        }
        if (num >= 20){
            System.out.println("Son " +  num / 20 + " billetes de 20€");
            num = num % 20;
        }
        if (num >= 10){
            System.out.println("Son " +  num / 10 + " billetes de 10€");
            num = num % 10;
        }
        if (num >= 5){
            System.out.println("Son " +  num / 5 + " billetes de 5€");
            num = num % 5;
        }
        if (num >= 2){
            System.out.println("Son " +  num / 2 + " monedas de 2€");
            num = num % 2;
        }
        if (num >= 1){
            System.out.println("Son " +  num / 1 + " monedas de 1€");
            num = num % 1;
        }

    }

    //Procedimiento EJ7-------------------------------------------------------------------------------------------------
    public static void llamarFactorial(int num){
        int sumaPos = 1;
        for (int i = 1; i <= num; i++){
            sumaPos = sumaPos * i;
            System.out.print(i + " * ");
        }
        System.out.println();
        System.out.println("El calculo del factorial de este numero es : "  + sumaPos);
    }

    //Procedimiento EJ8-------------------------------------------------------------------------------------------------
    public static void llamarTablaMult(int numTablaMult){
        for (int i = 1; i <= 10; i++){
            int resultado = numTablaMult * i;
            System.out.println(numTablaMult + " * " + i + " = " + resultado);
        }
        System.out.println("Tabla de multiplicar del numero " + numTablaMult);
    }

    //Procedimiento EJ9-------------------------------------------------------------------------------------------------
    public static void llamarDigitos(long numDigitos){
        int contador;
        for (contador = 1; numDigitos / 10 != 0; contador++) {
            numDigitos = numDigitos / 10;
        }

        System.out.println("El número consta de " + contador + " dígitos.");

    }

    //Procedimiento EJ10-------------------------------------------------------------------------------------------------
    public static void verAsteriscos(int numAs) {
        for(int i = 1; i <= numAs; i++){
            System.out.print("*");
        }
        System.out.println();
    }

    //Procedimiento EJ11-------------------------------------------------------------------------------------------------
    public static void verAsteriscosReves(int numAst, int nReves) {

        for (int i = 1; i <= nReves - numAst; i++) {
            System.out.print(" ");
        }

        for(int i = 1; i <= numAst; i++){
            System.out.print("*");
        }
        System.out.println();
    }


    //Procedimiento EJ14-------------------------------------------------------------------------------------------------
    public static void llamarParesEntreNumeros(int nPos1, int nPos2) {

        for (nPos1 = nPos1; nPos1 <= nPos2; nPos1++){
            if (nPos1 % 2 == 0){
                System.out.print(nPos1 + ", ");
            }
        }
        System.out.println();
    }


    public static void main(String[] args) {

        //1. Crea una función (método) que reciba como parámetros tres números enteros y devuelva el mayor de
        //los tres números. Utilizar esa función para el calcular el mayor de cuatro números enteros. Sería así:
        //public int mayor (int a, int b, int c) { … }
        System.out.println("1. Crea una función (método) que reciba como parámetros tres números enteros y devuelva el mayor de\n" +
                "los tres números. Utilizar esa función para el calcular el mayor de cuatro números enteros. Sería así:\n" +
                "public int mayor (int a, int b, int c) { … }");
        int a;
        int b;
        int c;

        System.out.println("Dime un número");
        a= sc.nextInt();
        System.out.println("Dime un número");
        b= sc.nextInt();
        System.out.println("Dime un número");
        c= sc.nextInt();

        mayor(a,b,c);



//-------------------------------------------------------------------------------------------------------------

        //2. Programa que lea un número por teclado e indique si es múltiplo de 2, 3, 5 o 7.

        System.out.println("2. Programa que lea un número por teclado e indique si es múltiplo de 2, 3, 5 o 7.");

        System.out.println("Dime un número");
        int num =sc.nextInt();
        multiplo(num);

//-------------------------------------------------------------------------------------------------------------

        //3. Programa que lea un número positivo de un dígito por teclado y diga en letra a qué dígito corresponde
        //(uno, dos, tres, cuatro, …). Ejemplo: si se introduce el 1, se mostrará por pantalla el “uno”; si se introduce
        //el 11, se mostrará el mensaje “Error: no es un número de un dígito”.

        System.out.println("3. Programa que lea un número positivo de un dígito por teclado y diga en letra a qué dígito corresponde \n" +
                "(uno, dos, tres, cuatro, …). Ejemplo: si se introduce el 1, se mostrará por pantalla el “uno”; si se introduce \n" +
                "el 11, se mostrará el mensaje “Error: no es un número de un dígito”. ");

        System.out.println("Dime un numero de 1 digito");

        int numm = sc.nextInt();
        nCorrespondiente(numm);

//-------------------------------------------------------------------------------------------------------------

        //4. Crea una función que no devuelva nada (void) que, dado un importe en euros, nos indique el mínimo
        //número de billetes y la cantidad sobrante que se pueden utilizar para obtener dicha cantidad. Ejemplo:
        //362 euros → 1 billete de 200, 1 billete de 100, 1 billete 50, un billete de 10, sobran 2 euros. Pista: hay
        //que ir sacando la división entera, y el resto se lleva al siguiente billete.

        System.out.println("4. Crea una función que no devuelva nada (void) que, dado un importe en euros, nos indique el mínimo \n" +
                "número de billetes y la cantidad sobrante que se pueden utilizar para obtener dicha cantidad. Ejemplo: \n" +
                "362 euros → 1 billete de 200, 1 billete de 100, 1 billete 50, un billete de 10, sobran 2 euros. Pista: hay \n" +
                "que ir sacando la división entera, y el resto se lleva al siguiente billete. ");

        System.out.println("Dime el dinero que tienes en billetes");
        int billetes = sc.nextInt();
        llamarBilletes(billetes);

//-------------------------------------------------------------------------------------------------------------

        //5. Programa que pida al usuario un número repetidamente hasta que esté entre 1 y 10.
        System.out.println("5. Programa que pida al usuario un número repetidamente hasta que esté entre 1 y 10. ");

        int numero = 0;
        
        while (numero < 1 || numero > 10){
            System.out.println("Dime un número");
            numero = sc.nextInt();
        }

//-------------------------------------------------------------------------------------------------------------

        //6. Programa que sume los 100 primeros números enteros impares.

        System.out.println("6. Programa que sume los 100 primeros números enteros impares.");

        int suma = 0;

        for (int i = 1; i <= 100; i++){
            if(i % 2 != 0){
                suma += i;
                System.out.print(i + " + ");
            }
        }
        System.out.println();
        System.out.println("La suma de los numeros impares es de " + suma);

//-------------------------------------------------------------------------------------------------------------

        //7. Función que calcule el factorial de un número entero positivo pasado como parámetro.
        System.out.println("7. Función que calcule el factorial de un número entero positivo pasado como parámetro.");

        System.out.println("Dime un número para calcular su factorial");

        int numeroPOS = sc.nextInt();
        llamarFactorial(numeroPOS);

//-------------------------------------------------------------------------------------------------------------

        //8. Programa que imprima la tabla de multiplicar de cualquier número entre el 1 y el 10 introducido por teclado.

        System.out.println("8. Programa que imprima la tabla de multiplicar de " +
                "cualquier número entre el 1 y el 10 introducido por teclado.");

        System.out.println("Dime un número para mostrarte la tabla de multiplicar (1-10)");
        int numTablaMult = sc.nextInt();

        while ( numTablaMult < 1 || numTablaMult > 10){
            System.out.println("Ingrese un número entre 1 y 10");
            numTablaMult = sc.nextInt();
        }

        llamarTablaMult(numTablaMult);

//-------------------------------------------------------------------------------------------------------------
        //9. Crea un método que, dado un número entero pasado como parámetro, devuelva cuántos dígitos lo
        //forman. P.ej.: el número 54326 consta de 5 dígitos. Pista: cuántas veces se puede dividir entre 10.

        System.out.println("9. Crea un método que, dado un número entero pasado como parámetro, devuelva cuántos dígitos lo\n" +
                "forman. P.ej.: el número 54326 consta de 5 dígitos. Pista: cuántas veces se puede dividir entre 10.");

        System.out.println("Dime un número");
        long numDigitos = sc.nextLong();

        llamarDigitos(numDigitos);

//-------------------------------------------------------------------------------------------------------------

        //10. Programa (utilizando bucles) que muestre por pantalla la siguiente figura. Debe funcionar para n =
        //número de líneas, que se pida por teclado.

        System.out.println("10. Programa (utilizando bucles) que muestre por pantalla la siguiente figura. Debe funcionar para n =\n" +
                "número de líneas, que se pida por teclado.");


        System.out.print("Introduce el número de líneas: ");
        int n = sc.nextInt();

        // Bucle para mostrar la figura
        for (int i = 1; i <= n; i++) {
            verAsteriscos(i);
        }

//-------------------------------------------------------------------------------------------------------------

        //11. Programa (utilizando bucles) que muestre por pantalla la siguiente figura. Debe funcionar para n =
        //número de líneas, que se pida por teclado.

        System.out.println("11. Programa (utilizando bucles) que muestre por pantalla la siguiente figura. Debe funcionar para n =\n" +
                "número de líneas, que se pida por teclado.");


        System.out.print("Introduce el número de líneas: ");
        int nReves = sc.nextInt();

        // Bucle para mostrar la figura
        for (int i = 1; i <= nReves; i++) {
            verAsteriscosReves(i,nReves);
        }

//-------------------------------------------------------------------------------------------------------------

        //12. Programa (utilizando bucles) que muestre por pantalla la siguiente figura. Debe funcionar para n =
        //número de líneas, que se pida por teclado.

        //No se hacerlo tbh.
//-------------------------------------------------------------------------------------------------------------

        //13. Programa que muestre por pantalla los números del 1 al 100 sin mostrar los que sean múltiplos de 5.
        System.out.println("13. Programa que muestre por pantalla los números del 1 al 100 sin mostrar los que sean múltiplos de 5.");

        for(int i = 1; i <= 100; i++){
            if (i % 5 != 0){
                System.out.print(i + ", ");
            }
        }
        System.out.println();
//-------------------------------------------------------------------------------------------------------------

        //14. Programa que lea dos números positivos e imprima por pantalla todos los números pares que estén entre
        //los dos números dados. También debe indicar cuántos números pares hay en ese intervalo.

        System.out.println("14. Programa que lea dos números positivos e imprima por pantalla todos los números pares que estén entre \n" +
                "los dos números dados. También debe indicar cuántos números pares hay en ese intervalo. ");


        System.out.println("Ingrese un número positivo");
        int nPos1 = sc.nextInt();

        System.out.println("Ingrese otro número positivo");
        int nPos2 = sc.nextInt();


        //Aqui prevenimos que el numero 2 introducido sea menor que el numero 1 intercambiando valores
        if(nPos1 > nPos2){
            int tempN1MenorAN2 = nPos2;
            nPos2 = nPos1;
            nPos1 = tempN1MenorAN2;
        }

        llamarParesEntreNumeros(nPos1,nPos2);

//-------------------------------------------------------------------------------------------------------------

        //15. Programa que lea números hasta que le den el cero, y que diga cuál ha sido el mayor y cuál el menor de
        //los números introducidos (sin tener en cuenta el cero).

        System.out.println(" 15. Programa que lea números hasta que le den el cero, y que diga cuál ha sido el mayor y cuál el menor de\n" +
                "los números introducidos (sin tener en cuenta el cero).   ");

        int numDeclararMayorMenor = 1;
        long tempMayor = 1;
        long tempMenor = 100000000;

        while(numDeclararMayorMenor != 0) {

            System.out.println("Ingrese un número (0 para acabar el programa)");
            numDeclararMayorMenor = sc.nextInt();

            //Declara el numero mas grande escrito con una variable
            if(numDeclararMayorMenor > tempMayor){
                tempMayor= numDeclararMayorMenor;
            }

            //Declara el numero mas pequeño escrito con una variable SIN CONTAR EL 0
            if(numDeclararMayorMenor < tempMenor &&  numDeclararMayorMenor > 0){
                tempMenor= numDeclararMayorMenor;
            }
        }

        System.out.println("El número mas grande escrito es : " + tempMayor);
        System.out.println("El número mas pequeño escrito es : " + tempMenor);

//-------------------------------------------------------------------------------------------------------------

        //16. Programa que lea por teclado una serie de números enteros hasta que introduzca el -1 y obtenga su
        //media. Deberá mostrarla por pantalla.

        int numIntroducido = 1;
        int contador = 0;
        int sumaEJ16 = 0;
        double media;
        while(numIntroducido != -1){
            System.out.println("Ingrese un numero (-1 para terminar el programa)");
            numIntroducido = sc.nextInt();

            if(numIntroducido == -1){
                break;
            }

            sumaEJ16 = sumaEJ16 + numIntroducido;

            contador++;
        }

        System.out.println("Has introducido " + contador + " números");
        if (contador > 0) {
            media = (double) sumaEJ16 / contador;
            System.out.println("La media entre todos los números introducidos es: " + media);
        } else {
            System.out.println("No se introdujeron números suficientes para calcular la media.");
        }


    }
}
