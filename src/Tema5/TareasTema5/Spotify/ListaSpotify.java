package Tema5.TareasTema5.Spotify;

import java.util.ArrayList;
import java.util.Objects;

public class ListaSpotify {

    private String nombre;
    private ArrayList<Cancion> canciones;

    //Constructor parametrizado
    //Constructor copia
    //Getters y setters
    //ToString
    //Añadir canción
    //Eliminar canción

    public ListaSpotify(String nombre) {
        this.nombre = nombre;
        this.canciones = new ArrayList<>(); //Crear lista vacía
    }

    /**
     * Constructor copia
     * @param otraLista
     * Cuando queramos copiar un ArrayList hay que crear uno nuevo
     * this.canciones = new ArrayList<>(otraLista.canciones);
     */
    public ListaSpotify(ListaSpotify otraLista) {
        this.nombre = otraLista.nombre;
        //this.canciones = otraLista.canciones; // Mal -> comparten el mismo objeto ArrayList
        this.canciones = new ArrayList<>(otraLista.canciones); //Crea una nueva lista con los valores de la otra
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Cancion> getCanciones() {
        return canciones;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("ListaSpotify{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", canciones=").append('\n');
        for(Cancion c : canciones)
            sb.append(c).append('\n');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        ListaSpotify that = (ListaSpotify) o;
        return Objects.equals(nombre, that.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(nombre);
    }

    public void addCancion(Cancion c){
        canciones.add(c);
    }

    public void removeCancion(Cancion c){
        canciones.remove(c);
    }

}
