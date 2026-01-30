package Tema4.EjemplosOrientacionObjetos.Caballo;

import java.util.ArrayList;

public class ProbarCaballo {
    public static void main(String[] args) {

        Caballo cab1 = new Caballo("Manolo", "Marrón", 2);
        Caballo cab2 = new Caballo("Margarita", "Blanco", 3);

        ArrayList<Caballo> caballos = new ArrayList<>();
        caballos.add(cab1);
        caballos.add(cab2);

        for (Caballo c : caballos) {
            for(int i=0; i<5; i++)
                c.correr();
        }

        for(Caballo c : caballos)
            c.pintarCaballo();

    }
}
