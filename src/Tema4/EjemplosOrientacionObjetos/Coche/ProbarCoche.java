package Tema4.EjemplosOrientacionObjetos.Coche;

import java.util.ArrayList;

public class ProbarCoche {

    static void main(String[] args) {

        ClaseCoche coche1 = new ClaseCoche("BMW", "X5", "ROJO", 35000);
        ClaseCoche coche2 = new ClaseCoche("Peugeot", "M3", "NARANJA", 65000);
        ClaseCoche coche3 = new ClaseCoche("BMW", "V8", "LIMA", 89000);
        ClaseCoche coche4 = new ClaseCoche("SEAT", "YV", "MARRÓN", 34000);
        ClaseCoche coche5 = new ClaseCoche("MAZDA", "MX5", "VERDE", 78000);
        ClaseCoche coche6 = new ClaseCoche("HONDA", "T-X2", "ROJO", 12000);

        ArrayList<ClaseCoche> coches = new ArrayList<>();
        coches.add(coche1);
        coches.add(coche2);
        coches.add(coche3);
        coches.add(coche4);
        coches.add(coche5);
        coches.add(coche6);


        for (ClaseCoche c : coches) {

            String texto = c.toString();

            // Línea superior
            for (int i = 0; i < texto.length() + 4; i++) {
                System.out.print("-");
            }
            System.out.println();

            // Contenido
            System.out.println("| " + texto + " |");

            // Línea inferior
            for (int i = 0; i < texto.length() + 4; i++) {
                System.out.print("-");
            }
            System.out.println();
        }

    }
}
