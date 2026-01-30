package Tema5.TareasTema5.BibliotecaDigital;

import java.util.Objects;
import java.util.UUID;

public abstract class BibliotecaDigital extends Libro{

    /**
     * Sistema de Biblioteca Digital
     * Clase base abstracta - ContenidoDigital
     * Atributos: id, title, author, year, size
     * Constructor con todo y constructor copia
     * Getters y Setters
     * toString
     * equals por id
     * Método abstracto String getTipo()
     * Método abstracto void reproducir()
     */

    protected Integer size;

    public BibliotecaDigital(String title, String author, Integer year, Integer size) {
        super(title, author, year);
        this.size = size;
    }

    public BibliotecaDigital(BibliotecaDigital otro) {
        super(otro);
        this.size = otro.size;
    }


    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    //ToString
    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("BibliotecaDigital{");
        sb.append("id='").append(id).append('\'');
        sb.append(", tile='").append(title).append('\'');
        sb.append(", author='").append(author).append('\'');
        sb.append(", year=").append(year);
        sb.append(", size=").append(size);
        sb.append('}');
        return sb.toString();
    }


    public abstract String getTipo();
    public abstract String reproducir();


}
