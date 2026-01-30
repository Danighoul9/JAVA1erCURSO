package Tema5.Herencia.Figuras;

public abstract class Figura2D extends Figura {

    public Figura2D(String nombre, Double grosor, String color) {
        super(nombre, grosor, color); //Llama al constructor de la clase padre
    }

    public abstract Double calcularArea();

    public abstract Double calcularPerimetro();

}