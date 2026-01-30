package Tema5.TareasTema5.BibliotecaDigital;

import java.util.Objects;
import java.util.UUID;

public class Libro {

    protected String id;
    protected String title;
    protected String author;
    protected Integer year;

    public Libro(String title, String author, Integer year) {
        this.id = UUID.randomUUID().toString();
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public Libro(Libro otro) {
        this.id = UUID.randomUUID().toString();
        this.title = otro.title;
        this.author = otro.author;
        this.year = otro.year;
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public Integer getYear() {
        return year;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setYear(Integer year) {
        this.year = year;
    }


    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Libro libro = (Libro) o;
        return Objects.equals(id, libro.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }


    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Libro{");
        sb.append("id='").append(id).append('\'');
        sb.append(", title='").append(title).append('\'');
        sb.append(", author='").append(author).append('\'');
        sb.append(", year=").append(year);
        sb.append('}');
        return sb.toString();
    }

    public String getTipo(){
        return "Libro";
    }




}
