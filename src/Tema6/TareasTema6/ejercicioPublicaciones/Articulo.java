package Tema6.TareasTema6.ejercicioPublicaciones;

import java.util.ArrayList;
import java.util.List;

public class Articulo {
    private String titulo;
    private String tipo;
    private List<Autor> autores;

    public Articulo(String titulo, String tipo) {
        this.titulo = titulo;
        this.tipo = tipo;
        this.autores = new ArrayList<>();
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public List<Autor> getAutores() {
        return autores;
    }

    public void setAutores(List<Autor> autores) {
        this.autores = autores;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Articulo{");
        sb.append("titulo='").append(titulo).append('\'');
        sb.append(", tipo='").append(tipo).append('\'');
        sb.append(", autores=").append(autores);
        sb.append('}');
        return sb.toString();
    }
}
