package Tema6.TareasRepaso.Tarea2.Entidades;

import java.util.ArrayList;

public class Participante extends Persona{

    /**
     * Implementa Participante, que extiende de Persona:
     *
     * Atributos adicionales:
     * String alias — nombre con el que aparece en el grupo
     * ArrayList<Voto> votosEmitidos — se inicializa vacía
     *
     * Constructores:
     * Constructor con todos los parámetros (incluyendo los heredados)
     * Constructor copia
     *
     * Métodos:
     * Getters y setters
     * void addVoto(Voto v) : añade un voto a la lista
     * int getTotalVotosEmitidos() : devuelve cuántos votos ha emitido
     * toString() mostrando alias y número de votos emitidos
     */

     protected String alias;
     private ArrayList<Voto> listaVotos;

    public Participante(String nombre, String apellidos, String email,
                        String alias) {
        super(nombre, apellidos, email);
        this.alias = alias;
        this.listaVotos = new ArrayList<>();
    }

    public Participante(Participante otro) {
        super(otro.nombre, otro.apellidos, otro.email);
        this.alias = otro.alias;
        this.listaVotos = new ArrayList<>();
    }


    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public ArrayList<Voto> getVotos() {
        return listaVotos;
    }

    public void setVotos(ArrayList<Voto> votos) {
        this.listaVotos = votos;
    }


    /**
     * toString() mostrando alias y número de votos emitidos
     */
    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Participante{");
        sb.append("alias='").append(alias).append('\'');
        sb.append(", votos=").append(listaVotos);
        sb.append('}');
        return sb.toString();
    }

    /**
     * Añade un voto a la lista
     * @param v
     */
    public void addVoto(Voto v){
        listaVotos.add(v);
    }

    /**
     * Devuelve cuántos votos se han emitido
     */
    public int getTotalVotosEmitidos(){
        Integer numVotos = 0;
        for (Voto v : listaVotos){
            numVotos++;
        }
        return numVotos;
    }

}
