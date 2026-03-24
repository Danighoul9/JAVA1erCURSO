package Tema7.Tema7_I.Ejercicios.PracticaMavenMapas.App;


import Tema7.Tema7_I.Ejercicios.PracticaMavenMapas.Entidades.Item;
import Tema7.Tema7_I.Ejercicios.PracticaMavenMapas.Entidades.Personaje;
import Tema7.Tema7_I.Ejercicios.PracticaMavenMapas.Entidades.TipoEquipamiento;
import Tema7.Tema7_I.Ejercicios.PracticaMavenMapas.Entidades.TipoItem;

import java.util.Map;

public class App {
    static void main(String[] args) {

        Personaje pj = new Personaje("Dante");
        pj.addItem(new Item("Espada cazademonios","Espada que repele y elimina demonios",
                10, TipoItem.ARMA));
        pj.addItem(new Item("Casco Blindado","Repele balas y todo tipo de magia oscura",
                4, TipoItem.ARMADURA));
        pj.addItem(new Item("Pechera de las 1000 bestias","Pechera con poderes de antiguas bestias con un" +
                " poder descomunal",
                2, TipoItem.ARMADURA));
        pj.addItem(new Item("Guantes Umbrella Deluxe","Guantes Anti-Infecciones",
                7, TipoItem.ARMADURA));


        pj.agregarEquipo(TipoEquipamiento.MANO_PRINCIPAL, pj.buscarItem("Espada cazademonios"));
        pj.agregarEquipo(TipoEquipamiento.PECHO,pj.buscarItem("Pechera de las 1000 bestias"));
        pj.agregarEquipo(TipoEquipamiento.MANO_SECUNDARIA,pj.buscarItem("Guantes Umbrella Deluxe"));


        IO.println("--- EQUIPO ---");
        for(Map.Entry<TipoEquipamiento, Item> entry : pj.getEquipo()) {
            IO.println(entry.getKey() + ": " + entry.getValue());
        }

        IO.println("--- INVENTARIO ---");
        for(Item item : pj.getInventario()) {
            IO.println(item);
        }
    }
}
