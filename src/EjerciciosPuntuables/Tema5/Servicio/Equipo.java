package EjerciciosPuntuables.Tema5.Servicio;

import java.util.ArrayList;
import EjerciciosPuntuables.Tema5.Entidades.Jugador;

public class Equipo {

    /**
     * Atributos:
     * nombre (String): nombre del equipo.
     * pais (String): país de origen.
     * totalPuntos (tipo int): representa la suma total de los puntos conseguidos por los
     * jugadores del equipo.
     * Una lista que almacena a los jugadores inscritos en el equipo.
     * Los atributos deben ser privados.
     *
     *
     * Métodos protegidos:
     * Getters y setters para cada atributo.
     * imprimirDatosEquipo() : imprime el nombre, país y total de puntos del equipo.
     *
     * nuevoJugador() : añade un nuevo jugador al equipo.
     *
     * calcularTotalPuntos() : actualiza el atributo totalPuntos sumando los puntos de
     * todos los jugadores del equipo.
     *
     * listarJugadores() : muestra los nombres (o alias) de todos los jugadores que forman
     * parte del equipo junto con la puntuación de cada uno
     *
     * buscarJugadorPorId(int id) : busca y muestra los datos de un jugador según su
     * identificador. Si no existe, se mostrará un mensaje apropiado.
     */

    //Atributos
    private String nombre;
    private String pais;
    private Integer totalPuntos;
    private ArrayList<Jugador> jugadores;

    public Equipo(String nombre, String pais) {
        this.nombre = nombre;
        this.pais = pais;
        this.totalPuntos = 0;
        this.jugadores = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public Integer getTotalPuntos() {
        return totalPuntos;
    }


    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    /**
     * Metodos Imprimir datos del equipo
     */
    public void imprimirDatosEquipo(){
        IO.println("Equipo: ");
        IO.println("Nombre: " + this.nombre);
        IO.println("Pais: " + this.pais);
        IO.println("Puntos totales: " + this.totalPuntos);
        IO.println("Jugadores: ");
        for(Jugador j : jugadores){
            IO.println(j);
        }
    }

    //Añadir jugador
    public void nuevoJugador(Jugador jugador) {
        this.jugadores.add(jugador);
    }

    /**
     * calcularTotalPuntos() : actualiza el atributo totalPuntos sumando los puntos de
     * todos los jugadores del equipo.
     */
    public Integer calcularTotalPuntos(){
        int acumuladorPuntos = 0;
        for (Jugador j: jugadores){
            acumuladorPuntos += j.getPuntos();
        }
        return acumuladorPuntos;
    }

    /**
     * listarJugadores() : muestra los nombres (o alias) de todos los jugadores que forman
     * parte del equipo junto con la puntuación de cada uno
     */
    public void listarJugadores(){
        for(Jugador j : jugadores){
            IO.println("Nombre: " + j.getAlias() + " -- Puntos: " + j.getPuntos());
        }
    }

    /**
     * buscarJugadorPorId(int id) : busca y muestra los datos de un jugador según su
     * identificador. Si no existe, se mostrará un mensaje apropiado.
     *
     * @return
     */
    public Jugador buscarJugadorPorId(Integer id){
        for(Jugador j : jugadores){
            if(j.getIdJugador().equals(id)){
                return j;
            }
        }
        return null;
    }

}
