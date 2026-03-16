package Tema7.TareasTema7.EjercicioPila;


import java.util.ArrayList;
import java.util.List;

public class PilaNumerica<T extends Number> {
    private final List<T> pila = new ArrayList<>();

    public List<T> getPila() {
        return pila;
    }

    public Double suma()  {
        Double suma = 0.0;
        for(T elemento: pila) {
            suma += elemento.doubleValue();
        }
        return suma;
    }

    public void pintar() {
        for(T elemento: pila) {
            IO.print(elemento + " - ");
        }
        IO.println();
    }

    public void apilar(T elemento) {
        //pila.add(pila.size(), elemento);
        pila.addLast(elemento);
    }

    public T desapilar() {
        return pila.removeLast();
    }

}
