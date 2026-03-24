package Tema7.FormasDeComparar.Comparable;

import java.util.*;

public class App {
    static void main(String[] args) {
        List<Personaje> pj = new ArrayList<>();
        pj.add(new Personaje("Gandalf","Demonio",5,50));
        pj.add(new Personaje("Legolas","Guerrero",10,90));
        pj.add(new Personaje("Asgorn","Hechicero",9,100));
        pj.add(new Personaje("Dante","Espadachin",25,210));

        //Ordenar el ArrayList por lo que indiqaue el Comprabale Personaje -> por nombre
        Collections.sort(pj);

        for (Personaje personaje : pj){
            IO.println(personaje);
        }


        IO.println("-----------------------------------------------------------");
        Set<Personaje> pjOrdenados = new TreeSet<>();
        //En los Set ojo con Comparable, si se repite el elemento de ordenación no lo añade
        pjOrdenados.add(new Personaje("Gandalf","Demonio",5,50));
        pjOrdenados.add(new Personaje("Legolas","Guerrero",10,90));
        pjOrdenados.add(new Personaje("Asgorn","Hechicero",9,100));
        pjOrdenados.add(new Personaje("Dante","Espadachin",25,210));
        for (Personaje pjOrd :pjOrdenados){
            IO.println(pjOrd);
        }
    }
}
