package Tema6.TareasTema6.ejercicioPublicaciones;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Revista extends Publicacion {
    private Integer numero;
    private Integer ejemplaresLanzados;
    private String tematica;
    private List<Articulo> articulos;

    public Revista(String titulo, String editorial, LocalDate fechaPublicacion, Integer numPaginas, Double precio,
                   Integer numero, Integer ejemplaresLanzados, String tematica) {
        super(titulo, editorial, fechaPublicacion, numPaginas, precio);
        this.numero = numero;
        this.ejemplaresLanzados = ejemplaresLanzados;
        this.tematica = tematica;
        this.articulos = new ArrayList<>();
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Integer getEjemplaresLanzados() {
        return ejemplaresLanzados;
    }

    public void setEjemplaresLanzados(Integer ejemplaresLanzados) {
        this.ejemplaresLanzados = ejemplaresLanzados;
    }

    public String getTematica() {
        return tematica;
    }

    public void setTematica(String tematica) {
        this.tematica = tematica;
    }

    public List<Articulo> getArticulos() {
        return articulos;
    }

    public void setArticulos(List<Articulo> articulos) {
        this.articulos = articulos;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Revista{");
        sb.append("titulo='").append(titulo).append('\'');
        sb.append(", editorial='").append(editorial).append('\'');
        sb.append(", fechaPublicacion=").append(fechaPublicacion);
        sb.append(", numPaginas=").append(numPaginas);
        sb.append(", precio=").append(precio);
        sb.append(", numero=").append(numero);
        sb.append(", ejemplaresLanzados=").append(ejemplaresLanzados);
        sb.append(", tematica='").append(tematica).append('\'');
        sb.append(", articulos=").append(articulos);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public List<Autor> getAutores() {
        //Hay que recorrerse todos los articulos de la revista
        //para obtener los autores
        List<Autor> autores = new ArrayList<>();
        for (Articulo articulo : articulos) {
            autores.addAll(articulo.getAutores());
        }

        return autores;
    }
}
