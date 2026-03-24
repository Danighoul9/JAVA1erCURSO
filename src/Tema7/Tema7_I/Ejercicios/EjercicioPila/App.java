package Tema7.Tema7_I.Ejercicios.EjercicioPila;

public class App {

    static void main() {

        PilaNumerica<Integer> pila = new PilaNumerica<>();
        pila.apilar(4);
        pila.apilar(9);
        pila.apilar(6);
        pila.pintar();
        pila.desapilar();
        pila.desapilar();
        pila.pintar();
        pila.apilar(7);
        pila.pintar();

        PilaNumerica<Double> pila2 = new PilaNumerica<>();
        pila2.apilar(4.0);
        pila2.apilar(9.5);
        pila2.apilar(6.88);
        pila2.apilar(6.1);
        pila2.pintar();
        IO.println("Hemos sacado el " + pila2.desapilar());
        IO.println("Hemos sacado el " + pila2.desapilar());
        pila2.pintar();
        pila2.apilar(7.55);
        pila2.apilar(0.955);
        pila2.pintar();

    }
}
