package Tema6.TareasTema6.ejercicioPublicaciones;

import java.time.LocalDate;
import java.util.List;

public abstract class Publicacion {

    protected String titulo;
    protected String editorial;
    protected LocalDate fechaPublicacion;
    protected Integer numPaginas;
    protected Double precio;

    public Publicacion(String titulo, String editorial, LocalDate fechaPublicacion, Integer numPaginas, Double precio) {
        this.titulo = titulo;
        this.editorial = editorial;
        this.fechaPublicacion = fechaPublicacion;
        this.numPaginas = numPaginas;
        this.precio = precio;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public LocalDate getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setFechaPublicacion(LocalDate fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    public Integer getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(Integer numPaginas) {
        this.numPaginas = numPaginas;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Publicacion{");
        sb.append("titulo='").append(titulo).append('\'');
        sb.append(", editorial='").append(editorial).append('\'');
        sb.append(", fechaPublicacion=").append(fechaPublicacion);
        sb.append(", numPaginas=").append(numPaginas);
        sb.append(", precio=").append(precio);
        sb.append('}');
        return sb.toString();
    }


    public abstract List<Autor> getAutores();

}
