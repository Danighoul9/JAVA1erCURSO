package Tema7.Tema7_I.Conjuntos;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class EjemploHashSet {
    static void main() {
        /**
         * --- HASHSET ----------------
         *      1. No admite duplicados
         *      2. No se puede acceder por posición, solo con for, búsqueda
         *      3. No hay un orden determinado, es aleatorio (hash)
         */

        Set<String> conjunto = new HashSet<>();
        conjunto.add("Javier");
        conjunto.add("Pedro");
        conjunto.add("Juan");
        conjunto.add("Javier"); //No da error, no lo añade

        IO.println(conjunto);

        IO.println(conjunto.contains("Pedro"));
        IO.println(conjunto.contains("Luisa"));

        //Unión
        IO.println("--- UNIÓN ---");
        conjunto.addAll(Set.of("Ana", "Silvia"));
        for(String s : conjunto) {
            IO.println(s);
        }

        //Diferencia
        IO.println("--- DIFERENCIA ---");
        conjunto.removeAll(Set.of("Pedro", "Martín"));
        for(String s : conjunto) {
            IO.println(s);
        }

        //Intersección
        IO.println("--- INTERSECCIÓN ---");
        conjunto.retainAll(Set.of("Javier", "Pedro", "Mirian", "Yolanda"));
        for(String s : conjunto) {
            IO.println(s);
        }

        //Eliminar
        IO.println("--- ELIMINAR ---");
        conjunto.remove("Javier");
        IO.println(conjunto);

        //Crear un Set a partir de un ArrayList, quitar duplicados
        List<Integer> numeros = new ArrayList<>(List.of(3,3,4,5,6,7,8,9,9,0,10,11,11,12,14,14));
        Set<Integer> numerosSet = new HashSet<>(numeros); //Al pasar en el constructor el List, se quitan los duplicados
        IO.println(numerosSet);



    }
}