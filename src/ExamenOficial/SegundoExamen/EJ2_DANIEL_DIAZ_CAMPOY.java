package ExamenOficial.SegundoExamen;

public class EJ2_DANIEL_DIAZ_CAMPOY {

    public static int tiradaRandom(){ return (int)(Math.random() * 8) + 1;}

   // public static double porcentajeParejasConsecutivas(int[] array){


   // }

    public static int[] carasNoSalidas(int[] array){

        int[] carasNo = new int [8];

        for (int i=0; i < array.length;i++){
            if(array[i] == 0){
                carasNo[i] +=1;
            }
        }

        return carasNo;
    }


    static void main(String[] args) {

        //Ejercicio 2: Estadísticas avanzadas de dados (2 puntos)

        //Programa un simulador que lance un dado de 8 caras 200 veces y guarde los resultados en un
        //array.

        // Después debe:
        //Mostrar la cantidad de veces que sale cada cara.
        //Indicar cuál(es) es la cara que más veces ha salido.
        //Calcular y mostrar la media aritmética de los resultados.

        //Implementar una función  double porcentajeParejasConsecutivas(int[] array)  que calcule
        //el porcentaje de veces que salen dos tiradas consecutivas iguales en el array.
        //Implementar una función  int[] carasNoSalidas(int[] array)  que devuelva un array con
        //las caras del dado que no han salido ninguna vez en las 200 tiradas.

        //Numero de tiradas
        int n=200;

        int array[] = new int [8];
        int dado;
        double acumulador = 0;

        for (int i = 0; i < n; i++) {
            dado = (int)(Math.random() * 8) + 1;
            acumulador += dado;
            array[dado - 1]++;   //contamos cada aparición
        }

        // Mostramos resultados de cuantas veces ha salido cada cara
        for (int i = 0; i < 8; i++) {
            System.out.println("La cara " + (i + 1) + " ha salido  " + array[i] + " veces");
        }

        //Calcular el que mas veces ha salido
        //NO ME SALE
        int a = 0;
        for (int i=0; i < a; i++){
            if (array[i] > a){
                a=i;
            }
        }
        System.out.println("La cara que mas veces ha salido es : " + (a+1));

        //Media Aritmética
        System.out.println("La media aritmética es " + acumulador/n);


        int[] carasSinSalir = carasNoSalidas(array);
        for (int i=0;i < carasSinSalir.length ;i++){
            if (carasSinSalir[i] != 0){
                System.out.println("La cara " + (i+1) + " no ha salido ninguna vez");
            }
        }

    }
}

