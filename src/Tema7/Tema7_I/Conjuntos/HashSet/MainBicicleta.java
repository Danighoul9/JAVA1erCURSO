package Tema7.Tema7_I.Conjuntos.HashSet;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MainBicicleta {

    static void main() {

        TiendaBicicleta tienda = new TiendaBicicleta();
        tienda.agregarBicicleta(new Bicicleta("BMX", "BMX", 2025,
                "Blanco", "Shimano", "XRC", 1000.0));
        tienda.agregarBicicleta(new Bicicleta("KTM", "Scarp MT", 2025,
                "Gris", "SRAM GX Eagle AXS 12speed", "Shimano Deore", 2400.0));
        tienda.agregarBicicleta(new Bicicleta("Rotwild", "R.EX900 Core", 2025,
                "Gris y rojo", "SHIMANO XT 8100 SGS Hyperglide+", "Magura", 8400.0));
        tienda.agregarBicicleta(new Bicicleta("Rotwild", "R.EX900 Core", 2025,
                "Gris y rojo", "SHIMANO XT 8100 SGS Hyperglide+", "Magura", 8400.0));


        tienda.mostrarBicicletas();

        IO.println("Buscando bici: ");
        IO.println(tienda.getBicicletas().contains(new Bicicleta("Rotwild", "R.EX900 Core", 2025,
                "", "", "", 0.0)));
        IO.println(tienda.buscarBicicleta("R.EX900 Core"));

        //Ordenar por precio
        //Crear un ArrayList con las bicicletas, y ordenarlo por precio
        List<Bicicleta> listaBicicletas = new ArrayList<>(tienda.getBicicletas());
        listaBicicletas.sort(Comparator.comparing(Bicicleta::getPrecio));
        IO.println("Ordenado por precio: ");
        for(Bicicleta bc: listaBicicletas)
            IO.println(bc);


    }
}