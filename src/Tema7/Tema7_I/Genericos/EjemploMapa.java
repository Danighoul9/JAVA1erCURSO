package Tema7.Tema7_I.Genericos;


import java.util.HashMap;
import java.util.Map;

public class EjemploMapa {
    static void main() {

        Map<Integer, String> mapa = new HashMap<>();

        mapa.put(1, "Javier");
        mapa.put(2, "Pedro");
        IO.println(mapa);

    }
}