package Tema7.EjemploPunto;

public class MainPunto {
    static void main() {

        Punto<Integer, Integer> punto1 = new Punto<>(1,2);
        Punto<Double, Double> punto2 = new Punto<>(2.5, 3.5);

        IO.println(punto1);
        IO.println(punto2);

        IO.println(punto1.distancia(punto2));


    }
}
