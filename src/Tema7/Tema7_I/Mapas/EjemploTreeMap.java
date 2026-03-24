package Tema7.Tema7_I.Mapas;

import java.util.Map;
import java.util.TreeMap;

public class EjemploTreeMap {

    static void main(String[] args) {
        //AGENDA CONTACTOS
        Map<String,Contacto> agenda = new TreeMap<>();

        agenda.put("Felisico", new Contacto("Felix",
                " fe@gmail.com", "Vera", "655 76 26 33"));
        agenda.put("Ana", new Contacto("Ana García",
                " ana@gmail.com", "Huercal", "611 42 56 77"));
        agenda.put("Sonia", new Contacto("Sonia García",
                " sonya@gmail.com", "Almeria", "600 99 22 33"));
        agenda.put("Lucas", new Contacto("Lucas",
                " lucius@gmail.com", "Vera", "612 34 21 55"));


        //Pintar directamente
        IO.println(agenda);

        //Pintar agenda por clave
        IO.println("--- Agenda ---");
        for (String clave: agenda.keySet()){
            IO.println(clave + " -> " + agenda.get(clave) + agenda.get(clave).getEmail());
        }

        IO.println("Dime un nombre");
        String nombre = IO.readln();
        if (agenda.containsKey(nombre)){
            IO.println(agenda.get(nombre));
        }else{
            IO.println("No existe " + nombre + " en la agenda");
        }

        //Mostrar todos los contactos
        IO.println("--- Contactos ---");
        for (Contacto c : agenda.values()){
            IO.println(c);
        }


    }


}
