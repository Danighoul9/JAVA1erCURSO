package Tema7.Listas.Cola;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class NotificacionEventos {

    /**
     * COLA DE Evento: Primero en entrar, primero en salir
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


    //1. Añadir
    public void add(Evento e) {
        eventos.add(e);
    }

    //2. Eliminar
    public Evento poll() {
        return eventos.removeFirst(); //Ineficiente con muchísimos Eventos
    }

    //3. Mostrar elemento
    public Evento peek() {
        return eventos.getFirst();
    }


}