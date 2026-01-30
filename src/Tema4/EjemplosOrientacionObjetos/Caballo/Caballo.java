package Tema4.EjemplosOrientacionObjetos.Caballo;

public class Caballo {

    /**
     * Propiedades o datos
     */
    private String nombre;
    private String color;
    private int edad;
    private int casillasRecorridas;


    /**
     * Comportamiento o acciones que puede realizar un caballo
     */
    /**
     * Constructor de caballo
     * @param nombre
     * @param color
     * @param edad
     */
    public Caballo(String nombre, String color, int edad) {
        this.nombre = nombre;
        this.color = color;
        this.edad = edad;
        this.casillasRecorridas = 0;
    }

    public int correr() {
        this.casillasRecorridas +=  (int) (Math.random() * (6) + 1);
        return this.casillasRecorridas;
    }

    public void pintarCaballo() {
        System.out.println("Nombre: " + this.nombre
                + " acaba en la casilla: " + this.casillasRecorridas);
    }



}
