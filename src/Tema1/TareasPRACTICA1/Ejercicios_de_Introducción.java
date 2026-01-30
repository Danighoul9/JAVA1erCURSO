package Tema1.TareasPRACTICA1;

import java.util.Scanner;

public class Ejercicios_de_Introducción {
    public static void main(String[] args) {

        //1. Si A = 6, B = 2, C = 3, indicar el resultado final de las siguientes expresiones aritméticas:

        // a. (A * C) % C = 0
        // b1. A * B / C = 4
        // c. C % B + C * B = 7
        // d. A % ( A * B * C / (B + C) ) = 6
        // e. B * B + C – B * (A % B ) = 7

//--------------------------------------------------------------------------------------------------------------

        // 2. ¿Cuáles son los valores de a y b1 después de ejecutar las siguientes instrucciones?

        // a = 3; ->3
        // b1 = 4;->4
        // c = 2 * a * b1; ->24
        // a = a + 2;-> 6
        // b1 = c – a;-> 21
//--------------------------------------------------------------------------------------------------------------

        //3. Expresar las siguientes expresiones como condiciones lógicas.

        // a. a es mayor que 2 ->     a>2
        // b1. b1 es menor o igual que 25 pero mayor que 5 ->     b1 <= 25 && b1 > 5
        // c. c es mayor que 6 o igual a d ->     c > 6 || c == d
        // d. e es par menor que 50 ->     e < 50
        // e. f es mayor que a, b1 y c ->     F > a && F > b1 && F > c
        // f. g es igual a 3, 4 ó 5 ->    G == 3 || G == 4 || G == 5

//-------------------------------------------------------------------------------------------------------------

        // 4. Decir si son verdaderas o falsas las siguientes expresiones:

        // a. (3<=7) && (7<=7) -> T && T = T
        // b1. !((–8>1) && (3<=4)) -> !(F && T) -> !(F) -> T
        // c. “Hola” == “Hola ” -> F
        // d. ((2<=5) && (3>=6)) || (2>–1) -> T && F || T -> F || T -> T
        // e. ((2<=5) || (3>=6)) && (2>–1) -> T || F && T -> T && T -> T

//-------------------------------------------------------------------------------------------------------------

        // 5. Cumplimenta la siguiente tabla:

        //1.No funciona, porque en el int no tiene sentido las comillas en el valor de la variable
        //2.Si funciona, mostrara 3,14 ya que es el valor de la variable pi
        //3.No funciona, porque los decimales en intelliJ es con . no con , ya que es una app inglesa
        //4.Si funciona, porque esta bien formulado
        //5.No funciona, porque no puede haber dos veces el mismo valor en este caso el 97
        //6.Si funciona, porque la a es 97 en un idioma que nos enseño el maestro por lo tanto es true

//-------------------------------------------------------------------------------------------------------------

        //6. ¿Qué muestra por pantalla el siguiente programa?

        //Hola usuario.Bienvenido.
        //Hoy es Lunes
        //Son las 12 en punto.
        //   Dentro de 2 horas serán las 122 en punto (puesto que no esta en parentesis y se lo toma como añadir un 2)
        //   Dentro de 2 horas serán las 14 en punto.

//-------------------------------------------------------------------------------------------------------------

        // 7. ¿Por qué no compila el siguiente programa? Modifícalo para hacer que funcione.

        //Porque la suma tiene un boolean cuando deberia ser un int/long puesto que boolean es la funcion para
        //V o F

//-------------------------------------------------------------------------------------------------------------

        //8. Modifica el siguiente programa para hacer que compile y funcione:

        //Seria simplemente añadir un valor a la variable n3, puesto que no tiene valor y no podria
        //realizarse la ultima operacion de suma= suma + n3

//-------------------------------------------------------------------------------------------------------------

        //9. El siguiente programa tiene 3 fallos, averigua cuáles son y modifica el programa para que funcione.

        //1.Fallo, cuad no esta declarado como una variable por lo tanto no funcionara
        //2.Fallo, número con tilde no esta en las variables y no se deben poner tildes para mejor funcionalidad
        //3.Fallo,NUMERO en vez de mes en la función sout

//-------------------------------------------------------------------------------------------------------------

        //10. ¿Qué mostrará el siguiente código por pantalla?

        //En la primera operacion mostrata 7 ya que seria num+=2 (resultado de la operacion), que seria num+2=7
        //En la segunda operacion mostraria 4 ya que seria num%=5, que seria num % 5 = 4

//-------------------------------------------------------------------------------------------------------------

        //11. Realiza un programa que calcule el área y el perímetro de un círculo de radio 3,6 metros.

        System.out.println("11." +
                "Realiza un programa que calcule el área y el perímetro de un círculo de radio 3,6 metros.");

        double radio = 3.6;
        double pi = Math.PI;
        double area, perimetro;

        //Área= pi * r,2
        area= pi * Math.pow(radio,2);
        System.out.println("Area: "+area+ " m2" );

        //Perimetro= 2 * pi * r
        perimetro= 2* pi * radio;
        System.out.println("Perimetro: "+perimetro+ " m");


//-------------------------------------------------------------------------------------------------------------

        //12. Realiza un programa en Java que, dadas dos variables a y b1, intercambie los valores de a y b1.

        System.out.println("12. Realiza un programa en Java que," +
                " dadas dos variables a y b1, intercambie los valores de a y b1.");

        int a= 1;
        int b= 2;
        int temp;

       temp = b;
       b= a;
       a = temp;

        System.out.println("La A que era 1 se convierte en: "+a+ " Y la B que era 2 se convierte en: "+b);

//-------------------------------------------------------------------------------------------------------------

        //13. Realiza un programa en Java con una variable entera t la cual contiene un tiempo en segundos y
        //queremos conocer este tiempo, pero expresado en horas, minutos y segundos.

        System.out.println("13. Realiza un programa en Java con una variable entera t la cual contiene " +
                "un tiempo en segundos y" +
                " queremos conocer este tiempo, pero expresado en horas, minutos y segundos.");

        //1.Declaramos las variables
        long t;
        long horas;
        long min;
        long segundos;

        //2.Usamos el scanner para que el usuario introduzca los segundos deseados
        Scanner sc = new Scanner(System.in); //Crea el objeto para leer de teclado
        System.out.println(" Ingrese los segundos que desear paras a horas, minutos y segundos: ");
       t = sc.nextInt(); //Leer de teclado un decimal

        //3.Hacemos los calculos para pasar de segundos a horas, minutos y segundos
        horas = t / 3600;
        min = (t % 3600) / 60;
        segundos = t % 60;


        System.out.println("Tiempo equivalente: " + horas + "h " + min + "min " + segundos + "s");

//-------------------------------------------------------------------------------------------------------------

        //14. Realiza un programa en Java que genere números de forma aleatoria simulando la tirada de un dado.

        System.out.println("14. Realiza un programa en Java que genere números de forma" +
                " aleatoria simulando la tirada de un dado.");

        //Hacemos la variable del dado sin darle ningun valor
        int dado;

        //Hacemos calculo junto a Math.random, este genera numeros decimales entre 0-1, entonces si en la operación
        //saliera 0.67 seria, 0.67 * 6= 4.02 + 1= 5.02 lo que pasaria a un 5
        // Sumamos 1 al final por si Math random generase 0.999..., al generarse ese mes multiplicado por 6 daria
        //5.99, por lo tanto jamas sacariamos un 6 por eso el sumar 1, para poder sacar el maximo.
        dado= (int) (Math.random() * 6) + 1;

        System.out.println("En el dado te ha salido el número: "+dado);

//-------------------------------------------------------------------------------------------------------------

        //15. Escriba un programa que escriba en la pantalla cuánto le dará su banco después de seis meses si pone
        //2000€ en una cuenta a plazo fijo al 2,75% anual. Recuerde que al pagarle los intereses el banco le
        //retendrá el 18% para hacienda.
        System.out.println("15.Problema sobre cuanto devolvera en un plazo de medio año depositando 2000€");

        //Declaramos variables
        double plazo= 0.5; //0.5 porque es la mitad de un año, 6 meses.
        double deposito= 2000;
        double interesAnual= 2.75;
        double retencion= 18;

        double interesBruto,retencionHacienda,interesNeto;
        double resultado;

        //Cálculos

        interesBruto= deposito * (interesAnual/100) * plazo;
        retencionHacienda= interesBruto * (retencion/100);
        interesNeto= interesBruto - retencionHacienda;
        resultado= deposito + interesNeto;

        System.out.println("Despues de 6 meses el banco te devolvera un total de: " + resultado + "€");

//-------------------------------------------------------------------------------------------------------------

        //16. Escriba un programa para calcular el área y el volumen de un cilindro. Para ello declare una constante
        //que guarde el valor de Pi. Declare, también, variables para el diámetro y la altura del cilindro. Suponga
        //para el ejemplo que el cilindro tiene un diámetro de 15,5cm y una altura de 42,4cm.

        System.out.println("16.Area Y Volumen de un cilindro");
        double areaTotal,volumen;
        double areaBases,areaLateral;
        double radioCilindro;
        double nPi = Math.PI;
        double diametro = 15.5;
        double altura = 42.4;

        //Calculos

        radioCilindro= diametro/2;
        areaBases= 2 * nPi * Math.pow(radioCilindro,2);
        areaLateral= 2 * nPi * radioCilindro * altura;

        areaTotal= areaBases + areaLateral;
        volumen= nPi * Math.pow(radioCilindro,2) * altura;

        //Mostramos resultado
        System.out.println("Area: " + areaTotal + "cm²");
        System.out.println("Volumen: " + volumen + "cm³");

//-------------------------------------------------------------------------------------------------------------

        //17. Escriba expresiones que almacenen en variables lo siguiente:
        //a. Crear un número entero positivo aleatorio entre 1 y 49.
        //b1. Generar un número aleatorio positivo par.
        //c. Generar un número real aleatorio entre 1 y 10.
        //d. Crear un número entero negativo entre -50 y -150.
        //e. Crear un número entero entre -100 y 100.
        //f.Generar un número aleatorio que sea uno de los siguientes: 5, 7, 33, 125 o 77
        //g. Crea un generador aleatorio de uno de los meses del año
        //FORMULA: int n = (int) (Math.random() * (<número_máximo + 1> - <número_mínimo>)) + <numero_mínimo>;

        System.out.println("17. Escriba expresiones que almacenen en variables lo siguiente:");

        //a
        int resultado1a49;
        resultado1a49= (int) (Math.random() * 49) + 1;
        System.out.println("Resultado aleatorio entre estos 1-49 es un: " + resultado1a49);

        //b1
        int resultadoPar;
        resultadoPar= (int) (Math.random() * (100 + 1 - 2) / 2) * 2 + 2;
        System.out.println("Resultado aleatorio PAR: " + resultadoPar);

        //c
         double resultadoReal;
         resultadoReal= (Math.random() * 10) + 1 ;
        System.out.println("Resultado aleatorio real: " + resultadoReal);

        //d
        int resultadoNegativo;
        resultadoNegativo= (int) (Math.random() * (-50+1 - -150)) + -150;
        System.out.println("Resultado aleatorio negativo: " + resultadoNegativo);

        //e
        int resultadoNegAPos;
        resultadoNegAPos = (int) (Math.random() * (100 +1 - -100)) + -100;
        System.out.println("Resultado aleatorio entre 100 y -100: " + resultadoNegAPos);

        //f
        //INDICE [5, 7, 33, 125 o 77]
        int num= (int) (Math.random() * 12 + 1);
        if (num == 1){
            System.out.println("5");
        } else if (num == 2){
            System.out.println("7");
        }else if (num == 3){
            System.out.println("33");
        }else if (num == 4){
            System.out.println("125");
        }else if(num == 5){
            System.out.println("77");
        }

        //g
        int mes = (int) (Math.random() * 12 + 1);
        if (mes == 1){
            System.out.println("Enero");
        } else if (mes == 2){
            System.out.println("Febrero");
        }else if (mes == 3){
            System.out.println("Marzo");
        }else if (mes == 4){
            System.out.println("Abril");
        }else if (mes == 5){
            System.out.println("Mayo");
        }else if (mes == 6){
            System.out.println("Junio");
        }else if (mes == 7){
            System.out.println("Julio");
        }else if (mes == 8){
            System.out.println("Agosto");
        }else if (mes == 9){
            System.out.println("Septiembre");
        }else if (mes == 10){
            System.out.println("Octubre");
        }else if (mes == 11){
            System.out.println("Noviembre");
        }else{
            System.out.println("Diciembre");
        }

//-------------------------------------------------------------------------------------------------------------

       //18. ¿Qué resultados se obtienen al realizar las operaciones siguientes? Si hay errores en la compilación,/
       // corríjalos y dé una explicación de por qué suceden.

        //int a = 10, b = 3 , e = 1, d, e;

        //float x, y;
        //x= a / b;
        //c = a < b && c;
        //d = a + b++;
        //e = ++a – b;
        //y = (float)a / b1;

        //Fallos a corregir:

        //1.La c no existe en variables y habria que declararla como booleano
        //2.La variable e, esta repetida
        //3.Los calculos de x,y deben de llevar (float) en el calculo para que salgan
        // con decimales y no como num enteros
        //4.La operacion de la c = a < b && c no funcionaria puesto que la c no esta declarada como variable
        //5.En el cálculo de e = ++a – b, este calculo no funcionara porque en vez de un (-) hay un guion largo (–)

        //Asi sería el ejercicio bien hecho ⬇️

        int a1 = 10, b1 = 3, e = 1, d; //Pongo a1 y b1 pq las variables a y b ya estan ocupadas por otro ejercicio
        boolean c = true;

        float x, y;

        x= (float) a1 / b1;
        c = a1 < b1 && c;
        d = a1 + b1++;
        e = (++a1)- b1;
        y = (float) a1 / b1;
        System.out.println("Resultados: " + x + ", " + c + ", "+ d + ", " + e + ", " + y);

//-------------------------------------------------------------------------------------------------------------

        //19. Escriba el valor ASCII de la 'J' y de la 'j' sin consultar la tabla.

        System.out.println("19. Escriba el valor ASCII de la 'J' y de la 'j' sin consultar la tabla.");

        int asciiJ= 'J';
        int asciij= 'j';
        System.out.println("El resultado de J en número es: " + asciiJ);
        System.out.println("El resultado de j en número es: " +asciij);

//-------------------------------------------------------------------------------------------------------------

        //20. Escriba usando variables las siguientes expresiones:

        double variableA= 3;
        double  variableB= 5;
        double  variableD= 2;

        double  resultado1,resultado2,resultado3;

        //a
        resultado1= (5 * Math.pow(variableA,2 * variableB)) + Math.sqrt(Math.pow(variableA,2) + Math.pow(variableB,2));
        System.out.println("El resultado del apartado a) es: " + resultado1);

        //b
        resultado2= Math.sqrt(5 * variableA * Math.pow(variableB,2)) + (Math.pow(variableA,2) + Math.pow(variableB,2));
        System.out.println("El resultado del apartado b) es: " + resultado2);

        //c
        resultado3= (Math.pow(variableA,3) * variableB) / (2 * variableA * Math.pow(variableB,2)) - Math.sqrt(12 *
                Math.pow(variableD,4));
        System.out.println("El resultado del apartado c) es " + resultado3);















    }
}
