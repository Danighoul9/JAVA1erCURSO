package Tema7.Tema7_I.Ejercicios.EjercicioVieja;


public class LibroDigital extends Libro {

    private Double sizeMB;

    public LibroDigital(String isbn, String titulo, String autor,
                        Integer anioPublicacion, Double sizeMB) {
        super(isbn, titulo, autor, anioPublicacion);
        this.sizeMB = sizeMB;
    }

    public Double getSizeMB() {
        return sizeMB;
    }

    public void setSizeMB(Double sizeMB) {
        this.sizeMB = sizeMB;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("LibroDigital{");
        sb.append("id=").append(id);
        sb.append(", isbn='").append(isbn).append('\'');
        sb.append(", titulo='").append(titulo).append('\'');
        sb.append(", autor='").append(autor).append('\'');
        sb.append(", anioPublicacion=").append(anioPublicacion);
        sb.append(", sizeMB=").append(sizeMB);
        sb.append('}');
        return sb.toString();
    }
}
