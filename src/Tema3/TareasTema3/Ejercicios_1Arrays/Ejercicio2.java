package Tema3.TareasTema3.Ejercicios_1Arrays;

public class Ejercicio2 {

    //Procedimiento de Temperatura Aleatoria
    public static double tempRandom(int numMin, int numMax) {
        return  (Math.random() * (numMax-numMin + 1) + numMin);
    }

    //Procedimiento de Humedad Aleatoria
    public static double humedadRandom(int numMin, int numMax) {
        return (Math.random() * (numMax-numMin + 1) + numMin);
    }

    static void main() {

        //Rellenar un array de 100 elementos de tipo double con valores
        //aleatorios de temperatura entre -20 y 40

        //Rellenar un array de 100 elementos de tipo double con valores
        //aleatorios de humedad entre 0 y 100

        //Haz un programa que muestre por pantalla la temperatura y la humedad
        //media conforme vas generando valores aleatorios

        //Si la temperatura media es superior a 25 grados en algún momento debe
        //parar el bucle y mostrar un mensaje indicando que ha superado la temperatura
        //media permitida.

        double[] temperaturas = new double[10];
        double[] humedades = new double[10];

        double acumTemp = 0;
        double acumHumed = 0;

        for(int i = 0; i < temperaturas.length;  i++){

            //Generamos valores random de temperatura y humedad
            temperaturas[i] = tempRandom(-20,40);
            humedades[i] = humedadRandom(0,100);

            System.out.println("La temperatura es de:" + temperaturas[i] + "°C");
            System.out.println("La humedad  es de:" + humedades[i]);

            acumTemp += temperaturas[i];
            acumHumed += humedades [i];

            System.out.println("-----------------------------------------");
            System.out.println("La media de temperatura actual es de: " + (acumTemp / (i+1)) + "°C");
            System.out.println("-----------------------------------------");

            if(acumTemp / (i+1) > 25){
                System.out.println("La temperatura ha superado los 25 grados");
                break;
            }

        }
    }
}
