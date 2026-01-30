package Tema5.TareasTema5.BibliotecaDigital;

import java.util.ArrayList;

public class Biblioteca {

    private String nombre;
    private ArrayList<Libro> contenidos;


    public Biblioteca(String nombre) {
        this.nombre = nombre;
        this.contenidos = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<Libro> getContenidos() {
        return contenidos;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }




    public void addContenido (Libro bd){
        this.contenidos.add(bd);
    }

    public void removeContenido (Libro bd){
        this.contenidos.remove(bd);
    }

    public void removeContenidoBYid(String id){
        for(Libro bd : contenidos){
            if(bd.getId().equals(id)){
                this.contenidos.remove(bd);
            }
        }
    }


    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Biblioteca{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", contenidos=").append('\n');
        for(Libro bd : contenidos){
            sb.append(bd).append('\n');
        }
        sb.append('}');
        return sb.toString();
    }
}
