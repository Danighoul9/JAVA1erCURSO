package Tema3.TareasTema3;

import java.util.Scanner;

public class Ejercicio10FincaHumedad {

    //Procedimiento de valor aleatorio del sensor de humedad
    public static double valorAleatorio() {
        return (Math.random() * 100);
    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /**
         * Una finca agrícola dispone de una serie de sensores de humedad del suelo distribuidos por diferentes zonas
         * del terreno. Cada sensor registra un valor entero entre 0 y 100.
         * Se pide implementar un programa en Java que trabaje con un array de valores de humedad, y que:
         * - Indique cuántos sensores están por debajo del nivel mínimo recomendado,
         * que será un valor dado por el usuario (por ejemplo, 30).
         * - Obtenga un nuevo array con los valores de los sensores que necesitan riego urgente.
         * - Calcule la media de humedad de toda la parcela.
         * - Determine si existe alguna zona crítica, definida como tres sensores consecutivos con
         * humedad menor al mínimo recomendado.
         *
         * Genera un array de ejemplo con 1000 valores aleatorios entre 0 y 100 para simular los sensores.
         */
        //Cuenta los sesores por debajo del minimo que el usuario ponga
        int contadorPorDebajoMinimos = 0;

        double valorSensorHumedad[] = new double[10];
        double sumaAcum = 0;



        double valorAsignadorPorUsuario = 0;
        System.out.println("Que valor recomendado quieres ponerle al sensor (0-99)");
        do {
            try {

                valorAsignadorPorUsuario = sc.nextDouble();

                if (valorAsignadorPorUsuario < 0 || valorAsignadorPorUsuario > 100){
                    System.out.println("Introduce un numero valido (0-99)");
                }

            }catch (Exception e){
                System.out.println("Introduce un numero");
                valorAsignadorPorUsuario = -1;
                sc.nextLine();
            }
        }while(valorAsignadorPorUsuario < 0 || valorAsignadorPorUsuario > 100);


        //Le ponemos valores random al array a la vez que lo recorremos
        for(int i = 0; i < valorSensorHumedad.length; i++){
            valorSensorHumedad[i]= valorAleatorio();
            System.out.println("El sensor " + (i+1) + " esta a un valor de: " + valorSensorHumedad[i]);

            //Acumulamos valores para sacr la media
            sumaAcum += valorSensorHumedad[i];

            if (valorSensorHumedad[i] < valorAsignadorPorUsuario){
                contadorPorDebajoMinimos++;
                System.out.println("* Sensor por debajo del minimo *");
            }
        }

        System.out.println("La media de humedad es de " + sumaAcum/valorSensorHumedad.length);
        System.out.println("Hay " + contadorPorDebajoMinimos + " sensores que estan por debajo del minimo establecido.");

        double sensoresPorDebajoMinimo [] = new double [contadorPorDebajoMinimos];

        for(int i = 0; i < contadorPorDebajoMinimos; i++){

            if (valorSensorHumedad[i] < valorAsignadorPorUsuario){
               sensoresPorDebajoMinimo[i] = valorSensorHumedad[i];
            }

        }

        for (int i = 0; i < sensoresPorDebajoMinimo.length; i++){
            System.out.println((i+1) + " --> " + sensoresPorDebajoMinimo[i] + " ESTA POR DEBAJO DEL MINIMO");
        }

        boolean hayZonaCrit = false;

        for(int i = 0; i < valorSensorHumedad.length; i++){
            if (valorSensorHumedad[i] < valorAsignadorPorUsuario &&
                valorSensorHumedad[i+1] < valorAsignadorPorUsuario &&
                valorSensorHumedad[i+2] < valorAsignadorPorUsuario){
                 hayZonaCrit = true;
            }
        }
        if(hayZonaCrit){
            System.out.println("Hay zona critica con al menos 3 valores por debajo del umbral minimo");
        }else{
            System.out.println("No hay zona critica");
        }



    }
}
