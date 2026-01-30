package Tema5.Herencia.Figuras;

public class Test {
    static void main(String[] args) {
        Cuadrado f1 = new Cuadrado("Cuadrado", 2.0, "verde", 4.0);
        System.out.println(f1);
        System.out.println(f1.getNombre());
        f1.dibujar();
        System.out.println("Área: " + f1.calcularArea() );
        System.out.println("Perímetro: " + f1.calcularPerimetro());

        Circulo f2 = new Circulo("Círculo", 1.0, "rojo", 2.67);
        System.out.println(f2);
        System.out.println(f2.getNombre());
        f2.dibujar();
        System.out.println("Área: " + f2.calcularArea() );
        System.out.println("Perímetro: " + f2.calcularPerimetro());

    }

}
