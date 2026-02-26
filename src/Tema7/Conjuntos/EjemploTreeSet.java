package Tema7.Conjuntos;


import java.util.Set;
import java.util.TreeSet;

public class EjemploTreeSet {
    /**
     * --- TREESET ----------------
     * 1. Ordena los elementos
     * 2. No admite duplicados, no por equals, sino por el Comparable
     *
     */

    static void main() {

        Set<Integer> numeros = new TreeSet<>();
        numeros.add(10);
        numeros.add(20);
        numeros.add(30);
        numeros.add(1);
        numeros.add(5);
        numeros.add(10);
        numeros.add(15);

        IO.println(numeros);

    }
}
