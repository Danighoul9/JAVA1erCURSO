package Tema5.TareasTema5.Videojuego;

import java.util.ArrayList;

public class TiendaAlquilerVideojuego {

    private String nombre;
    private ArrayList<Videojuego> videojuegos;
    private double gananciasTotales = 0;

    public TiendaAlquilerVideojuego(String nombre) {
        this.nombre = nombre;
        this.videojuegos = new ArrayList<>();
    }

    public void agregarVideojuego(Videojuego v) {
        videojuegos.add(v);
    }

    public void quitarVideojuego(Videojuego v) {
        videojuegos.remove(v);
    }

    public Integer getNumeroVideojuegos() {
        return videojuegos.size();
    }

    public void mostrarVideojuegos() {
        System.out.println(nombre);
        for(Videojuego v: videojuegos) {
            System.out.println(v);
        }
    }

    public boolean alquilarJuego(String titulo, String plataforma) {
        //Buscar juego en la tienda y alquilarlo
        for(Videojuego v : this.videojuegos){
            if(v.getTitulo().equals(titulo) && v.getPlataforma().equals(plataforma)){
                this.gananciasTotales += v.calcularPrecioAlquiler();
                return v.alquilar();
            }
        }
        return false;
    }

    public boolean devolverJuego(String titulo, String plataforma) {
        //Buscar juego en la tienda y devolverlo
        for(Videojuego v : this.videojuegos){
            if(v.getTitulo().equals(titulo) && v.getPlataforma().equals(plataforma)){
                return v.devolver();
            }
        }
        return false;
    }

    public boolean devolverJuego(String codigo) {
        //Buscar juego en la tienda y devolverlo
        for(Videojuego v : this.videojuegos){
            if(v.getCodigo().equals(codigo)){
                return v.devolver();
            }
        }
        return false;
    }

    public Double calcularGananciasTotales() {
        return  gananciasTotales;
    }
}
