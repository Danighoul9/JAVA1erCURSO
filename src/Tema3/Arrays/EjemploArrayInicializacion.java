package Tema3.Arrays;

public class EjemploArrayInicializacion {

    public static void main(String[] args) {

        //Darle valores a las variables del array
        //Tamaño es 5      0    1    2    3    4
        double[] notas = {5.5, 7.3, 8.0, 6.1, 4.2};
        String[] alumnos = {"Pepe", "Manolo", "Juan", "Ana", "Maria"};

        //Pintar notas
        for(int i=0; i < notas.length; i++) {
            System.out.println("La nota de " + alumnos[i] + " es: " +
                    notas[i]);
        }

    }

}
