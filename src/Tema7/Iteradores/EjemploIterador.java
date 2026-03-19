package Tema7.Iteradores;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class EjemploIterador {
    static void main() {

        Set<String> palabras = new HashSet<>();
        palabras.add("Hola");
        palabras.add("Mundo");
        palabras.add("Cruel");

        IO.println("--- Con For each ---");
        for(String s: palabras) {
            IO.println(s);
        }

        IO.println("--- Con Iterator ---");
        Iterator<String> it = palabras.iterator();
        while(it.hasNext()) {
            IO.println(it.next());
        }


    }
}
