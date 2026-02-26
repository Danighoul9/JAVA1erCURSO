package Tema7.Colecciones;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class EjemploArrayList {
    static void pintar(List<Persona> listaPersonas) {
        for(Persona p: listaPersonas)
            IO.println(p);
    }

    static void main() {
        /**
         *   --- ARRAYLIST ---
         *   1. Bueno para recorrer
         *   2. Acceso posicional instantáneo
         *   3. Eliminación posicional
         *   4. Sublistas
         *   5. Búsqueda -> O(n) hay que recorrese la lista
         *   6. addFirst, removeFirst -> ineficientes
         *   7. Mejor usar addLast y removeLast
         *   8. Bueno para PILAS, malo para COLAS
         */



        //Constructor de ArrayList pasándole una lista inicial INMUTABLE
        List<Integer> numeros = new ArrayList<>(List.of(1,3,4,5,6,7,8,8));
        for(Integer n: numeros)
            IO.print(n + " ");
        IO.println();

        //Añadir una sublista
        numeros.addAll(List.of(9,10,11));
        for(Integer n: numeros)
            IO.print(n + " ");
        IO.println();

        //Genera una sublista entre los elementos entre esos índices
        List<Integer> miniLista = numeros.subList(3, 6);
        for(Integer n: miniLista)
            IO.print(n + " ");
        IO.println();

        //ContainsAll -> comprueba que una lista contiene todos los elementos de otra lista - INEFICIENTE
        IO.println(numeros.containsAll(miniLista));

        //RetainsAll -> se queda sólo con los elementos que están en la sublista (intersección)
        numeros.retainAll(List.of(4,7,10,20));
        for(Integer n: numeros)
            IO.print(n + " ");
        IO.println();


        List<Persona> listaPersonas = new ArrayList<>();
        //List<Persona> listaPersonas = new LinkedList<>();

        listaPersonas.add(new Persona("12345678A", "Pepe", "Perez", LocalDate.of(1990, 1, 2)));
        listaPersonas.add(new Persona("23456789B", "Juan", "Martínez", LocalDate.of(1991, 2, 3)));
        listaPersonas.add(new Persona("34567890C", "Ana", "Ramírez", LocalDate.of(1992, 3, 4)));
        listaPersonas.add(new Persona("45678901D", "María", "López", LocalDate.of(1993, 4, 5)));
        listaPersonas.add(new Persona("45678901D", "María", "López", LocalDate.of(1993, 4, 5)));

        pintar(listaPersonas);

        //Acceso por posición
        IO.println(listaPersonas.get(2));
        IO.println("----------------------------------");

        //Escribir en una posición, sin desplazar
        listaPersonas.set(2, new Persona("45451478F","Javier", "Guillén", LocalDate.now()));
        pintar(listaPersonas);
        IO.println("----------------------------------");

        //Insertar en una posición desplazando el resto de elementos a la derecha
        listaPersonas.add(3, new Persona("34567890C", "Ana", "Ramírez", LocalDate.of(1992, 3, 4)));
        pintar(listaPersonas);
        IO.println("----------------------------------");

        //listaPersonas.addLast -> añade al final de la lista
        //listaPersonas.addFirst -> añade al principio de la lista y desplaza el resto

        //MÉTODOS PARA ELIMINAR ELEMENTOS
        //Eliminar pasando el objeto --> OJO usa equals para buscar el objeto a borrar
        listaPersonas.remove(new Persona("45451478F","", "", null));
        pintar(listaPersonas);
        IO.println("----------------------------------");

        //Eliminar por posición
        listaPersonas.remove(2);
        pintar(listaPersonas);
        IO.println("----------------------------------");

        //listaPersonas.removeFirst --> elimina el primer elemento de la lista y desplaza el resto a la izquierda
        //listaPersonas.removeLast --> elimina el último elemento de la lista


        //BÚSQUEDA DE UN ELEMENTO
        //1. Un for con un booleano
        boolean encontrado = false;
        for(Persona p: listaPersonas) {
            if (p.getDni().equals("12349678A")) {
                encontrado = true;
                IO.println(p);
            }
        }
        IO.println(encontrado);
        IO.println("----------------------------------");

        //2. Usando indexOf, usa internamente 'equals'. Mismo rendimiento que hacer un for
        //   Si lo encuentra devuelve la posición, sino -1
        int posicion = listaPersonas.indexOf(new Persona("23456789B",
                "","",null));
        if (posicion < 0) {
            IO.println("No se ha encontrado");
        } else {
            IO.println(listaPersonas.get(posicion) + " -> " + posicion);
        }

        IO.println("----------------------------------");
        //ORDENACIÓN CON SORT
        //1. Implementar en Persona el interfaz Comparable
        //2. Pasarle un Comparator que compare por lo que queramos: fecha de nacimiento
        listaPersonas.sort(Comparator.comparing(Persona::getFechaNacimiento));
        pintar(listaPersonas);


    }
}
