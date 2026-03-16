package Tema7.Colecciones;


import java.time.LocalDate;
import java.util.ArrayList;

public class EjemploCola {

    public static void main() {
        ArrayList<Integer> lista = new ArrayList<>();

        //Cola -> FIFO -> Primero en entrar, primero en salir
        lista.addLast(1);
        lista.add(3);

        IO.println(lista.getFirst());

        //Eliminar un elemento -> Esto es ineficiente con muchos datos
        IO.println(lista.removeFirst());



    }
}
