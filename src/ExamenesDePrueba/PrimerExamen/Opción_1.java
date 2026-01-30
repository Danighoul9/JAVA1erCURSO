package ExamenesDePrueba.PrimerExamen;

import java.util.Scanner;

public class Opción_1 {

    //Ponemos el scanner
    static Scanner sc = new Scanner(System.in);
//----------------------------------------------------------------------------------------------------------------------
//----------------------------------------------------------------------------------------------------------------------
//----------------------------------------------------------------------------------------------------------------------
    //PROCEDIMIENTOS EJ1

    //Metodo para el ejercicio 1 para llamar al menu
    public static void llamarMenu(){
        System.out.println("1. Muestra la suma de cada uno de sus dígitos");
        System.out.println("2. Que diga si es primo o no");
        System.out.println("3. La longitud de una circunferencia cuyo radio fuera ese número");
        System.out.println("4. Salir");
    }

    //Metodo para el ejercicio 1 sumar 2 digitos
    public static void llamarDigitos(int numDigitos) {

        int i;
        //He usado un valor que guarde numDigitos porque el for que cuenta los digitos que tiene lo descompone hasta que
        // queda solo uno
        int numParaSuma = numDigitos;
        int suma = 0;

        // Contar los dígitos
        for (i = 1; numDigitos / 10 != 0; i++) {
            numDigitos = numDigitos / 10;
        }

        //Calculo de los digitos (Basicamente hace modulos usando el ultimo numero y acumulandose en suma y la división
        //quita ese número ya usado (el ultimo),por lo tanto lo va descomponiendo  y sumando en el acumulador)

        while (numParaSuma != 0) {
            suma = suma + numParaSuma % 10;  // Suma el último dígito (EJ: 12 modulo 10, seria 2, dejando el ultimo digito)
            numParaSuma = numParaSuma / 10; // Quita el último dígito (Al ser un entero no tiene decimales)
        }

        System.out.println("El número consta de " + i + " dígitos.");
        System.out.println("La suma de sus dígitos es: " + suma);
    }

    //Metodo para el ejercicio 1 esPremo? (copiado de un ejercicio anterior para no complicarme)
    public static void esPremo(int num){

        int i;
        int resultado;
        boolean esPremo = true;

        for(i=2; i <= (num-1);i++){

            resultado= num % i;

            if(resultado == 0){
                esPremo = false;
                break;
            }

        }
        if (esPremo){
            System.out.println("El número es primo");
        }else{
            System.out.println("El número no es primo");
        }

    }

    //Metodo para el ejercicio 1 calcularCircunferencia
    public static void calcularCircunferencia(double radio) {
        double circunferencia;

        circunferencia = 2 * Math.PI * radio;
        System.out.println("La circunferencia con radio " + radio + " es: " + circunferencia);
    }
//----------------------------------------------------------------------------------------------------------------------
//----------------------------------------------------------------------------------------------------------------------
//----------------------------------------------------------------------------------------------------------------------
//---------------------------------------------------------------------------------------------------------------------

    //PROCEDIMIENTOS EJ2

    //Procedimiento de tirada Dado EJ2
    public static int tiradaDado(){
        return (int)(Math.random()*6)+1;
    }

    //Procedimiento bonus
    public static int llamarBonusEscalera(int dadoC1, int dadoC2, int dadoC3, int dadoC4, int dadoC5){
        int bonus = 0;

        // Bonificación por escalera uso boolean pq se ve mejor que un if la verdad
        boolean hayUn1 = (dadoC1==1 || dadoC2==1 || dadoC3==1 || dadoC4==1 || dadoC5==1);
        boolean hayUn2 = (dadoC1==2 || dadoC2==2 || dadoC3==2 || dadoC4==2 || dadoC5==2);
        boolean hayUn3 = (dadoC1==3 || dadoC2==3 || dadoC3==3 || dadoC4==3 || dadoC5==3);
        boolean hayUn4 = (dadoC1==4 || dadoC2==4 || dadoC3==4 || dadoC4==4 || dadoC5==4);
        boolean hayUn5 = (dadoC1==5 || dadoC2==5 || dadoC3==5 || dadoC4==5 || dadoC5==5);
        boolean hayUn6 = (dadoC1==6 || dadoC2==6 || dadoC3==6 || dadoC4==6 || dadoC5==6);

        boolean escalera = (hayUn1 && hayUn2 && hayUn3 && hayUn4 && hayUn5) ||
                (hayUn2 && hayUn3 && hayUn4 && hayUn5 && hayUn6);

        if (escalera) {
            bonus += 10;
            System.out.println("---Escalera de numeros (+10 puntos)---");
        }

        // Bonificación por cinco iguales
        if (dadoC1==dadoC2 && dadoC2==dadoC3 && dadoC3==dadoC4 && dadoC4==dadoC5) {
            bonus += 20;
            System.out.println("---AFORTUNADO (+20 puntos)---");
        }

        return bonus;
    }


//----------------------------------------------------------------------------------------------------------------------



    static void main(String[] args) {
        //OPCIÓN 1

        //Menú
        //Realiza un programa que pida un número por teclado. Luego muestra un menú con las
        //siguientes opciones:

        //1. Muestra la suma de cada uno de sus dígitos
        //2. Que diga si es primo o no
        //3. La longitud de una circunferencia cuyo radio fuera ese número
        //4. Salir

        //Para cada una de las opciones deberás llamar a una función que calcule lo que se pide y
        //devuelva el resultado.

        int opcion = 1;
        do {
            try{
                //Variable para todo el ejercicio (int num)
                int num;

                llamarMenu();
                System.out.println("Ingrese una opcion 1-4");
                opcion = sc.nextInt();

                switch (opcion) {
                    case 1:
                        System.out.println("Ingrese un número");
                        num = sc.nextInt();
                        llamarDigitos(num);
                        break;

                    case 2:
                        System.out.println("Ingrese un numero");
                        num = sc.nextInt();
                        esPremo(num);
                        break;

                    case 3:
                        System.out.println("Ingrese un numero");
                        num = sc.nextInt();
                        calcularCircunferencia(num);
                        break;

                    case 4:
                        System.out.println("Gracias por usar nuestro programa");
                        break;
                }
                
            }catch(Exception e){
                System.out.println(e.getMessage());
                sc.nextLine();
            }
        } while (opcion != 4);

//----------------------------------------------------------------------------------------------------------------------
//----------------------------------------------------------------------------------------------------------------------
//----------------------------------------------------------------------------------------------------------------------
//----------------------------------------------------------------------------------------------------------------------
//----------------------------------------------------------------------------------------------------------------------

        //Cubitus y Humerus 1
        //Marcus Cubitus y Julius Humerus son dos legionarios que se entretienen en sus ratos
        //libres jugando a juegos de dados, el pasatiempo favorito de los antiguos romanos. Un
        //juego que pudieron haber jugado estos amigos consiste en tirar cada jugador cinco dados
        //de 6 caras. La puntuación es la suma total de puntos, pero hay un bonus de 10 puntos por
        //sacar una escalera (1,2,3,4,5 o 2,3,4,5,6) y un bonus de 20 puntos por sacar los cinco
        //dados iguales. Hay una penalización de 5 puntos si la suma de los dados es menor de 8. El
        //jugador que saca más puntos gana la partida. Escriba un programa que simule varias
        //partidas seguidas de este juego de dados.


        int sumaC;
        int sumaH;
        int contadorWinsC = 0;
        int contadorWinsH = 0;

        int turnos = 1;
        try{
            System.out.println("¿Cuanto turnos van a jugar estos romanos?");
            turnos = sc.nextInt();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }

        //Hacemos el bucle con sus respectivos turnos
        for (int i = 1; i <= turnos; i++){

            //Tiradas Cubitus
            int dadoC1 = tiradaDado();
            int dadoC2 = tiradaDado();
            int dadoC3 = tiradaDado();
            int dadoC4 = tiradaDado();
            int dadoC5 = tiradaDado();
            System.out.println("- Tirada CUBITUS: " + dadoC1 + ", " + dadoC2 + ", " + dadoC3 + ", " + dadoC4 + ", "
                    + dadoC5);
            //Hacemos la suma de todos los dados
            sumaC = dadoC1 + dadoC2 + dadoC3 + dadoC4 + dadoC5;

            //Agregamos a la suma una posible bonificación si no la hay se queda con el valor que tenia
            sumaC = sumaC + llamarBonusEscalera(dadoC1,dadoC2,dadoC3,dadoC4,dadoC5);

            //Penalización por sacar menos de 8 puntos (ya hay que ser desgraciado)
            if (sumaC < 8) {
                sumaC = sumaC - 5;
                System.out.println("** MENUDO FASTIDIO (-5) para Cubitus **");
            }
            //Mensaje puntos totales
            System.out.println("* CUBITUS suma un total de : " + sumaC + " puntos.");

//----------------------------------------------------------------------------------------------------------------------

            //Tiradas Humerus
            int dadoH1 = tiradaDado();
            int dadoH2 = tiradaDado();
            int dadoH3 = tiradaDado();
            int dadoH4 = tiradaDado();
            int dadoH5 = tiradaDado();
            System.out.println("- Tirada HUMERUS: " + dadoH1 + ", " + dadoH2 + ", " + dadoH3 + ", " + dadoH4 + ", "
                    + dadoH5 + ", ");
            //Hacemos la suma de todos los dados
            sumaH = dadoH1 + dadoH2 + dadoH3 + dadoH4 + dadoH5;


            //Agregamos a la suma una posible bonificación si no la hay se queda con el valor que tenia
            sumaH = sumaH + llamarBonusEscalera(dadoH1,dadoH2,dadoH3,dadoH4,dadoH5);

            //Penalización por sacar menos de 8 puntos (ya hay que ser desgraciado)
            if (sumaH < 8) {
                sumaH = sumaH - 5;
                System.out.println("** MENUDO FASTIDIO (-5) para Humerus **");
            }

            //Mensaje puntos totales
            System.out.println("* HUMERUS suma un total de : " + sumaH + " puntos.");

            //Cubitus suma puntos si su dado es mayor
            if (sumaC > sumaH){
                System.out.println("---------------------------");
                System.out.println("| Cubitus gana esta ronda |");
                System.out.println("---------------------------");
                contadorWinsC++;
            }

            //Humerus suma puntos si su dado es mayor
            if (sumaH > sumaC){
                System.out.println("---------------------------");
                System.out.println("| Humerus gana esta ronda |");
                System.out.println("---------------------------");
                contadorWinsH++;
            }
        }

        //Mensaje de rondas ganadas de cada jugador
        System.out.println("--------------------------");
        System.out.println("Rondas ganadas Cubitus: " + contadorWinsC);
        System.out.println("Rondas ganadas Humerus: " + contadorWinsH);
        System.out.println("--------------------------");

        //if para saber quien es el ganador en base a las rondas ganadas
        if(contadorWinsC > contadorWinsH){
            System.out.println("Cubitus es el ganador");
        }else if ( contadorWinsH > contadorWinsC){
            System.out.println("Humerus es el ganador");
        }else{
            System.out.println("Empate");
        }


    }


}
