package Tema4.EjemplosOrientacionObjetos.Coche;

public class ClaseCoche {


    /**
     * Propiedades o datos
     */
    private String nombre;
    private String modelo;
    private String color;
    private int precio;


    /**
     * Constructor de coche
     */
    public ClaseCoche(String nombre, String modelo, String color, int precio) {
        this.nombre = nombre;
        this.modelo = modelo;
        this.color = color;
        this.precio = precio;
    }


    @Override
    public String toString() {
        return "ClaseCoche{" +
                "nombre='" + nombre + '\'' +
                ", modelo='" + modelo + '\'' +
                ", color='" + color + '\'' +
                ", precio=" + precio +
                '}';
    }
}
