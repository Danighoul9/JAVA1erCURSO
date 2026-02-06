package Tema5.PracticasTemas5.GranjaInteligente;

import EjerciciosPuntuables.Tema5.Entidades.Jugador;

import java.util.ArrayList;

public class Granja {


    /**
     * Clase Granja
     * - Atributos:
     * nombre (String): nombre de la granja.
     * ubicacion (String): localización o comarca donde se ubica la granja.
     * totalHorasOperacion (double): representa la suma total de las horas trabajadas por todas las
     * máquinas de la granja.
     * Maquinas (List<Maquina>) Una lista de máquinas que pertenecen a la granja.
     * - Los atributos deben ser privados.
     * - Métodos protegidos:
     * Constructor que inicializa atributos y crea la lista (ArrayList).
     * Getters y setters para cada atributo.
     * imprimirDatosGranja(): muestra el nombre, la ubicación y el total de horas de operación.
     * addMaquina(): permite añadir una máquina a la granja.
     * calcularTotalHoras(): actualiza el atributo totalHorasOperacion sumando las horas de todas las
     * máquinas del equipo.
     * toString(): muestra los modelos de todas las máquinas registradas en la granja.
     * buscarMaquinaPorId(int id): busca y muestra los datos de una máquina concreta. Si no existe,
     * devuelve null. Pista: indexOf
     */

    //Atributos

    private String nombre;
    private String ubicacion;
    private double totalHorasOperacion;
    private ArrayList<Maquina> maquinas;

    protected Granja(String nombre, String ubicacion) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.totalHorasOperacion = 0.0;
        this.maquinas = new ArrayList<>();
    }

    protected String getNombre() {
        return nombre;
    }

    protected void setNombre(String nombre) {
        this.nombre = nombre;
    }

    protected String getUbicacion() {
        return ubicacion;
    }

    protected void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    protected double getTotalHorasOperacion() {
        return totalHorasOperacion;
    }

    protected ArrayList<Maquina> getMaquinas() {
        return maquinas;
    }

    /**
     * imprimirDatosGranja(): muestra el nombre, la ubicación y el total de horas de operación.
     */
    public void imprimirDatosGranja(){
        IO.println("GRANJA: ");
        IO.println("Nombre: " + this.nombre);
        IO.println("Ubicación: " + this.ubicacion);
        IO.println("Total horas operacion: " + this.totalHorasOperacion + "h.");
    }

    /**
     * addMaquina(): permite añadir una máquina a la granja.
     * @param maquinas
     */
    protected void addMaquina(Maquina maquinas){
        this.maquinas.add(maquinas);
    }

    /**
     * calcularTotalHoras(): actualiza el atributo totalHorasOperacion sumando las horas de todas las
     * máquinas del equipo.
     */

    protected double calcularTotalHoras(){
        double sumaTotal = 0;
        for (Maquina m : maquinas) {
            sumaTotal += m.getHorasUso();
        }
        this.totalHorasOperacion = sumaTotal;

        return this.totalHorasOperacion;
    }


    //METODOS AÑADIDOS POR MEJORIA

    /**
     * Añado este metodo para buscar las maquinas por id y añadirle las horas de uso
     */
    public Maquina buscarMaquinaPorId(Integer id){
        for(Maquina m : maquinas){
            if(m.getIdMaquina().equals(id)){
                return m;
            }
        }
        return null;
    }

    /**
     * listarMaquinas(); lo añado yo para poner menos codigo en el main y que
     * este metodo ya liste todas las maquinas
     */
    public void listarMaquina(){
        for(Maquina m : maquinas){
            IO.println(m);
        }
    }
}
