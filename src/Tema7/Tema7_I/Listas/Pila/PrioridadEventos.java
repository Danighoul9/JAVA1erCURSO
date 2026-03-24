package Tema7.Tema7_I.Listas.Pila;

import java.util.ArrayList;
import java.util.List;

public class PrioridadEventos {

    /**
     *   PILA -> Primero en entrar, ultimo en salir
     */


    private List<Evento> eventos = new ArrayList<>();

    public List<Evento> getEventos() {
        return eventos;
    }

    public void listarEventos(){
        IO.println("--- Eventos ---");
        for(Evento e: eventos)
            IO.println(e);
    }

    //1.Añadir
    public void push(Evento e) {
        eventos.add(e);
    }

    //2.Eliminar
    public Evento pop() {
        return eventos.removeLast();
    }

    //3.Mostrar elemento
    public Evento peek() {
        return eventos.getLast();
    }
}
