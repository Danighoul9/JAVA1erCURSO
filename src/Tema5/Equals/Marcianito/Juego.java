package Tema5.Equals.Marcianito;

import java.util.ArrayList;
import java.util.Objects;

public class Juego {

    private String nombre;
    private ArrayList<Marcianito> enemigos;

    public Juego(String nombre) {
        this.nombre = nombre;
        this.enemigos = new ArrayList<>(); //Incializar el ArrayList
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Marcianito> getEnemigos() {
        return enemigos;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Juego{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", enemigos=").append('\n');
        for(Marcianito m : enemigos)
            sb.append(m).append('\n');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Juego juego = (Juego) o;
        return Objects.equals(nombre, juego.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(nombre);
    }

    //Métodos para añadir y eliminar enemigos
    public void addEnemigo(Marcianito m) {
        this.enemigos.add(m);
    }

    public void removeEnemigo(Marcianito m) {
        this.enemigos.remove(m);
    }
}
