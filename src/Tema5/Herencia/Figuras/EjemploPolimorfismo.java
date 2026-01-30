package Tema5.Herencia.Figuras;

import java.util.ArrayList;

public class EjemploPolimorfismo {
    public static void main(String[] args) {

        ArrayList<Figura2D> figuras = new ArrayList<>();
        figuras.add(new Cuadrado("Cuadrado", 2.0, "verde", 4.0));
        figuras.add(new Circulo("Circulo", 2.0, "rojo", 3.14));

        for (Figura2D f : figuras) {
            System.out.println("Área de " + f.getNombre() + " es " + f.calcularArea());
        }

    }
}