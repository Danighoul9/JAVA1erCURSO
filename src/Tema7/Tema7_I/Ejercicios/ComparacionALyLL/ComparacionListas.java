package Tema7.Tema7_I.Ejercicios.ComparacionALyLL;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class ComparacionListas {
    static void main() {

        final int TOTAL = 1000000;
        long t1,t2;
        Random rand = new Random();

        //Creación listas
        List<Cancion> listaAL = new ArrayList<>();
        List<Cancion> listaLL = new LinkedList<>();

        //Rellenar listas
        t1 = System.nanoTime();
        for(int i=0; i < TOTAL; i++) {
            listaAL.add(new Cancion("Título"+i, "Artista"+i, rand.nextInt(300)));
        }
        t2 = System.nanoTime();
        System.out.println("Tiempo para crear lista ArrayList: " + (t2-t1)/1000000 + "ms");

        t1 = System.nanoTime();
        for(int i=0; i < TOTAL; i++) {
            listaLL.add(new Cancion("Título"+i, "Artista"+i, rand.nextInt(300)));
        }
        t2 = System.nanoTime();
        System.out.println("Tiempo para crear lista LinkedList: " + (t2-t1)/1000000 + "ms");

        /*
        //Rellenar listas por el principio
        listaAL.clear();
        t1 = System.nanoTime();
        for(int i=0; i < TOTAL; i++) {
            listaAL.addFirst(new Cancion("Título"+i, "Artista"+i, rand.nextInt(300)));
        }
        t2 = System.nanoTime();
        System.out.println("Tiempo para crear lista ArrayList: " + (t2-t1)/1000000 + "ms");

        listaLL.clear();
        t1 = System.nanoTime();
        for(int i=0; i < TOTAL; i++) {
            listaLL.addFirst(new Cancion("Título"+i, "Artista"+i, rand.nextInt(300)));
        }
        t2 = System.nanoTime();
        System.out.println("Tiempo para crear lista LinkedList: " + (t2-t1)/1000000 + "ms");


        //Acceso aleatorio
        t1 = System.nanoTime();
        for(int i=0; i < 10000; i++) {
            listaAL.get(rand.nextInt(TOTAL));
        }
        t2 = System.nanoTime();
        System.out.println("Tiempo para acceso aleatorio en ArrayList: " + (t2-t1)/1000000 + "ms");

        t1 = System.nanoTime();
        for(int i=0; i < 10000; i++) {
            listaLL.get(rand.nextInt(TOTAL));
        }
        t2 = System.nanoTime();
        System.out.println("Tiempo para acceso aleatorio en LinkedList: " + (t2-t1)/1000000 + "ms");

         */

        //Búsqueda indexOf
        t1 = System.nanoTime();
        for(int i=0; i < 100; i++) {
            listaAL.indexOf(new Cancion("Titulo"+rand.nextInt(TOTAL),
                    "Artista"+rand.nextInt(TOTAL), 0));
        }
        t2 = System.nanoTime();
        System.out.println("Tiempo para búsqueda con indexOf en ArrayList: " + (t2-t1)/1000000 + "ms");

        t1 = System.nanoTime();
        for(int i=0; i < 100; i++) {
            listaLL.indexOf(new Cancion("Titulo"+rand.nextInt(TOTAL),
                    "Artista"+rand.nextInt(TOTAL), 0));
        }
        t2 = System.nanoTime();
        System.out.println("Tiempo para búsqueda con indexOf en LinkedList: " + (t2-t1)/1000000 + "ms");

    }
}