package Tema7.Tema7_I.Ejercicios.EjercicioVieja;


public class LibroFisico extends Libro {

    private Integer numPaginas;


    public LibroFisico(String isbn, String titulo, String autor,
                       Integer anioPublicacion, Integer numPaginas) {
        super(isbn, titulo, autor, anioPublicacion);
        this.numPaginas = numPaginas;
    }

    public Integer getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(Integer numPaginas) {
        this.numPaginas = numPaginas;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("LibroFisico{");
        sb.append("id=").append(id);
        sb.append(", isbn='").append(isbn).append('\'');
        sb.append(", titulo='").append(titulo).append('\'');
        sb.append(", autor='").append(autor).append('\'');
        sb.append(", anioPublicacion=").append(anioPublicacion);
        sb.append(", numPaginas=").append(numPaginas);
        sb.append('}');
        return sb.toString();
    }
}