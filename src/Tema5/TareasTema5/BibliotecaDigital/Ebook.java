package Tema5.TareasTema5.BibliotecaDigital;

public class Ebook extends BibliotecaDigital{

    /**
     * Clase hija - Ebook
     * Atributos extra: numPages, ebookType
     * Implementa los métodos abstractos de ContenidoDigital
     * getTipo devuelve "Ebook"
     * reproducir devuelve "Reading ebook ..." y el título y numPages
     */

    private  Integer numPages;
    private String ebookType;

    public Ebook(String title, String author, Integer year, Integer size, Integer numPages, String ebookType) {
        super(title, author, year, size);
        this.numPages = numPages;
        this.ebookType = ebookType;
    }

    public Ebook(Ebook otro) {
        super(otro);
        this.numPages = otro.numPages;
        this.ebookType = otro.ebookType;
    }

    public Integer getNumPages() {
        return numPages;
    }


    public String getEbookType() {
        return ebookType;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Ebook{");
        sb.append("id='").append(id).append('\'');
        sb.append(", tile='").append(title).append('\'');
        sb.append(", author='").append(author).append('\'');
        sb.append(", year=").append(year);
        sb.append(", size=").append(size);
        sb.append(", numPages=").append(numPages);
        sb.append(", ebookType='").append(ebookType).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public String getTipo() {
        return "Ebook";
    }

    @Override
    public String reproducir() {
        return "Reading ebook" + "Titulo: " + this.title + "Número de páginas : "+ this.numPages;
    }
}
