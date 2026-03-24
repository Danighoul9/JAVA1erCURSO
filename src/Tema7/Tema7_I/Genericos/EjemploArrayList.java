package Tema7.Tema7_I.Genericos;

import java.util.ArrayList;
import java.util.List;

public class EjemploArrayList {

    static void main() {

        List<String> palabras = new ArrayList<>();
        List<Integer> numeros = new ArrayList<>();

        palabras.add("Hola");
        palabras.add("Mundo");

        numeros.add(10);
        numeros.add(20);

        System.out.println(palabras);
        System.out.println(numeros);
    }


}