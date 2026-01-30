package EjerciciosPuntuables.Tema3;

public class Arrays {

    public static double[] estadisticas(int n){

        double[] arrayPorcentaje = new double[12];
        int dado;

        for (int i = 0; i < n; i++) {
            dado = (int)(Math.random() * 12) + 1;
            arrayPorcentaje[dado - 1]++;   // contamos cada aparición
        }

        // Convertimos a porcentaje
        for (int i = 0; i < 12; i++) {
            arrayPorcentaje[i] = (arrayPorcentaje[i] / n) * 100;
        }

        // Mostramos resultados
        for (int i = 0; i < 12; i++) {
            System.out.println("El número " + (i + 1) + " ha salido un: " + arrayPorcentaje[i] + "%");
        }


        return arrayPorcentaje;
    }

    static void main(String[] args) {

        //EJERCICIO ARRAYS

        //Escriba un programa que genere la tirada de 2 dados (de 6 lados) y
        //genere tiradas aleatorias y vaya sumando sus resultados hasta que
        //ambos dados obtengan un 6. Se deben mostrar todas las tiradas, el
        //número de tiradas realizadas y la suma de ambos dados hasta que
        //sacaron ambos un 6.

        //Escribe también una función llamada double[] estadisticas(int n) que
        //lance un dado de doce caras aleatoriamente un número n de veces
        //recibido como parámetro y debes retornar el porcentaje de apariciones
        //de cada número del dado en las n tiradas (double[]). Pruébalo con n =
        //100 y n = 1000.

        int n = 100;
        estadisticas(n);




    }
}
