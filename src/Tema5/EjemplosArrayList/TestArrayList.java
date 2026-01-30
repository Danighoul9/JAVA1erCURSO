package Tema5;

import java.util.ArrayList;
import java.util.List;

public class TestArrayList {

    static void main(String[] args) {
//int[] lista = new int[20];
        //ArrayList es una estructura dinámica
        ArrayList<Integer> lista = new ArrayList<>();
        //Add
        lista.add(25);
        lista.add(10);
        lista.add(7);
        lista.add(33);

        //Acceso a un elemento por posición lista[i]
        //0 es la primera posición
        System.out.println(lista.get(0)); //25

        //Imprimir ArrayList
        System.out.println(lista);

        //Quitar elemento en una posición, reordena los índices
        lista.remove(1);

        //Imprimir ArrayList
        System.out.println(lista);

        //Añadir por posición, desplaza el resto
        lista.add(1, 15);

        //Imprimir ArrayList
        System.out.println(lista);

        //Recorrer un ArrayList
        for(int i=0; i < lista.size(); i++) {
            System.out.print(lista.get(i) + ", ");
        }
        System.out.println();

        //Recorrer un ArrayList con un bucle for each
        //Cada elemento de la lista lo va pasando a "numero"
        for(Integer numero: lista) {
            System.out.print(numero + ", ");
        }

        //Vaciar
        lista.clear();

        //Imprimir ArrayList
        System.out.println(lista);


        List<Double> precios = List.of(15.44, 17.99, 85.77, 99.95);

    }
}
