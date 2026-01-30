package Tema4.PracticasTema4.AcademiaDeMagia;

import java.util.ArrayList;

public class Mago {


    /**
     * Propiedades:
     * ● nombre (String): Nombre del mago.
     * ● energia (int): Energía mágica disponible (de 0 a 100).
     * ● hechizos (List<Hechizo>): Lista de hechizos aprendidos.
     */

    private String nombre;
    private int energia;
    private ArrayList<Hechizo> hechizos;


    /**
     * Métodos:
     * ● Constructor, parametrizado con nombre y energía. La lista se inicializa en el constructor de la siguiente
     * manera:
     * this.hechizos = new ArrayList<>();
     */
    public Mago(String nombre, int energia) {
        this.nombre = nombre;
        this.energia = energia;
        this.hechizos = new ArrayList<>();

    }
    /**
     * ● Getters, setters y toString
     */
    public String getNombre() {
        return nombre;
    }

    public int getEnergia() {
        return energia;
    }

    public ArrayList<Hechizo> getHechizos() {
        return hechizos;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Mago{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", energia=").append(energia);
        sb.append(", hechizo=").append("\n");
        for (Hechizo h : hechizos){
            sb.append(h).append("\n");
        }
        sb.append('}');
        return sb.toString();
    }


    /**
     * ● aprenderHechizo(Hechizo hechizo): Añade un hechizo al repertorio del mago. Se haría así:
     * this.hechizos.add(hechizo);
     */
    public void aprenderHechizo(Hechizo hechizo){
        this.hechizos.add(hechizo);
    }

    /**
     * No lo pide pero me parecia interesante tambien poder olvidare hechizos
     * como en los juegos de pokemon que un pkm olvida un movimiento para aprender otro
     * @param hechizo
     */
    public void olvidarHechizo(Hechizo hechizo){
        this.hechizos.remove(hechizo);
    }



    /**
     * -Buscar hechizo
     */
    public Hechizo buscar(String nombreHechizo){
        for (Hechizo hechizo : hechizos) {
            //COMPROBAMOS QUE EL NOMBRE DEL HECHIZO ESTE EN LA LISTA
            if (hechizo.getNombre().equalsIgnoreCase(nombreHechizo)) {
                return hechizo;
            }
        }
        return null;

    }

    /**
     * ● lanzarHechizo(String nombreHechizo, Prueba prueba): Consume energía y usa el hechizo si está en la lista. Si
     * el hechizo supera la prueba, devuelve un éxito. Si no, pierde energía adicional.
     */
    public boolean lanzarHechizo(String nombreHechizo, Prueba prueba){
        // Usamos el método buscar que ya creamos con ayuda del profesor
        Hechizo hechizoEncontrado = buscar(nombreHechizo);

        //Comprobamos si el hechizo existe
        if (hechizoEncontrado == null) {
            System.out.println("Hechizo no aprendido");
            return false;
        }

        // Comprobamos si hay energía suficiente
        if (this.energia < hechizoEncontrado.getEnergiaNecesaria()) {
            System.out.println("No hay energía suficiente");
            return false;
        }

        // Consumimos la energía base
        this.energia -= hechizoEncontrado.getEnergiaNecesaria();

        //Intentamos resolver la prueba
        if (prueba.resolver(hechizoEncontrado)) {
            System.out.println("El hechizo consumió " + hechizoEncontrado.getEnergiaNecesaria() + " de energía.");
            System.out.println("¡Hechizo lanzado con éxito!");
            return true;
        } else {
            //Penalización por fallo
            this.energia -= 5;
            System.out.println("Hechizo fallido. pierdes energía extra (-5)");
            return false;
        }
    }

    /**
     * ● recargarEnergia(int cantidad): Aumenta la energía del mago (sin superar el máximo de 100).
     */
    public void recargarEnergia(int cantidad){
        if(this.energia < 100){
            this.energia += cantidad;
        }else {
            this.energia = 100;
        }
    }

}






