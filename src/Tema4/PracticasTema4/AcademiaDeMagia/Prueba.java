package Tema4.PracticasTema4.AcademiaDeMagia;

public class Prueba {

    /**
     * Propiedades:
     * ● descripcion (String): Descripción de la prueba (p. ej., "Apagar un incendio", "Romper un muro").
     * ● nivelDificultad (int): Nivel de dificultad del reto (1-10).
     * ● recompensa (int): Energía que el mago gana al superar la prueba.
     */
    private String descripción;
    private Integer nivelDificulad;
    private Integer recompensa;


    /**
     * Métodos:
     * ● Constructor, con todos los parámetros.
     */
    public Prueba(String descripción, Integer nivelDificulad, Integer recompensa) {
        this.descripción = descripción;
        this.nivelDificulad = nivelDificulad;
        this.recompensa = recompensa;
    }

    //Constructor copia
    public Prueba(Prueba otra) {
        this.descripción = otra.descripción;
        this.nivelDificulad = otra.nivelDificulad;
        this.recompensa = otra.recompensa;
    }
    /**
     * ● Getters, setters y toString
     */
    public String getDescripción() {
        return descripción;
    }

    public void setDescripción(String descripción) {
        this.descripción = descripción;
    }

    public Integer getNivelDificulad() {
        return nivelDificulad;
    }

    public void setNivelDificulad(Integer nivelDificulad) {
        this.nivelDificulad = nivelDificulad;
    }

    public Integer getRecompensa() {
        return recompensa;
    }

    public void setRecompensa(Integer recompensa) {
        this.recompensa = recompensa;
    }

    //Mi metodo toString para que se vea bien
    public void descPrueba() {
        IO.println("PRUEBA:");
        IO.println("Descripción: " + descripción);
        IO.println("Nivel de Dificultad: " + nivelDificulad);
        IO.println("Recompensa: " + recompensa + " pts de magia");
    }

    /**
     * ● resolver(Hechizo hechizo): Comprueba si el hechizo puede superar la prueba basándose en su potencia
     */
    public boolean resolver(Hechizo hechizo) {
        return hechizo.getPotencia() >= nivelDificulad;
    }
}
