package Tema5.TareasTema5.BibliotecaDigital;

public class AudioLibro extends BibliotecaDigital {

    /**
     * Clase hija - AudioLibro
     * Atributos extra: durationMins, narrator
     * Implementa los métodos abstractos de ContenidoDigital
     * getTipo devuelve "AudioBook"
     * reproducir devuelve "Playing audio ..." y el título y narrador
     */

    private Integer durationMins;
    private String narrator;

    public AudioLibro(String title, String author, Integer year, Integer size, Integer durationMins, String narrator) {
        super(title, author, year, size);
        this.durationMins = durationMins;
        this.narrator = narrator;
    }

    public AudioLibro(AudioLibro otro) {
        super(otro);
        this.durationMins = otro.durationMins;
        this.narrator = otro.narrator;
    }

    public Integer getDurationMins() {
        return durationMins;
    }

    public String getNarrator() {
        return narrator;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("AudioLibro{");
        sb.append("id='").append(id).append('\'');
        sb.append(", tile='").append(title).append('\'');
        sb.append(", author='").append(author).append('\'');
        sb.append(", year=").append(year);
        sb.append(", size=").append(size);
        sb.append(", durationMins=").append(durationMins);
        sb.append(", narrator='").append(narrator).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public String getTipo() {
        return "AudioBook";
    }

    @Override
    public String reproducir() {
        return "Playing audio ..." + "Titulo: " + this.title + " Narrador: " + this.narrator;
    }
}
