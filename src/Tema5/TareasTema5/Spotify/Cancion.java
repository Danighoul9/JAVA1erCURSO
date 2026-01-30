package Tema5.TareasTema5.Spotify;

import java.util.Objects;

public class Cancion {

    private String titulo;
    private String artista;
    private double duracion;

    //Constructor parametrizado
    public Cancion(String titulo, String artista, double duracion) {
        this.titulo = titulo;
        this.artista = artista;
        this.duracion = duracion;
    }

    //Constructor copia
    public Cancion(Cancion cancion) {
        this.titulo = cancion.titulo;
        this.artista = cancion.artista;
        this.duracion = cancion.duracion;
    }

    //Getters
    public String getTitulo() {
        return titulo;
    }

    public String getArtista() {
        return artista;
    }

    public double getDuracion() {
        return duracion;
    }

    //Setters
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public void setDuracion(Integer duracion) {
        this.duracion = duracion;
    }

    //ToString
    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Cancion{");
        sb.append("titulo='").append(titulo).append('\'');
        sb.append(", artista='").append(artista).append('\'');
        sb.append(", duracion=").append(duracion);
        sb.append('}');
        return sb.toString();
    }

    //Equals con titulo y artista
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Cancion cancion = (Cancion) o;
        return Objects.equals(titulo, cancion.titulo) && Objects.equals(artista, cancion.artista) && Objects.equals(duracion, cancion.duracion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titulo, artista, duracion);
    }
}
