package Tema4.PracticasTema4.AcademiaDeMagia;

public class Hechizo {

    /**
     * Propiedades:
     * ● nombre (String): Nombre del hechizo (p. ej., "Bola de fuego", "Escudo mágico").
     * ● energiaNecesaria (int): Energía necesaria para lanzarlo.
     * ● potencia (int): Nivel de potencia del hechizo (1-10).
     */

    private String nombre;
    private Integer energiaNecesaria;
    private Integer potencia;


    /**
     * Métodos:
     * ● Constructor, con todos los parámetros
     */
    public Hechizo(String nombre, Integer energiaNecesaria, Integer potencia) {
        this.nombre = nombre;
        this.energiaNecesaria = energiaNecesaria;
        this.potencia = potencia;
    }

    //Constructor copia
    public Hechizo(Hechizo otro) {
        this.nombre = otro.nombre;
        this.energiaNecesaria = otro.energiaNecesaria;
        this.potencia = otro.potencia;
    }
    /**
     * ● Getters, setters y toString
     */
    //Getters
    public String getNombre() {
        return nombre;
    }

    public Integer getEnergiaNecesaria() {
        return energiaNecesaria;
    }

    public Integer getPotencia() {
        return potencia;
    }

    //Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Hechizo{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", energiaNecesaria=").append(energiaNecesaria);
        sb.append(", potencia=").append(potencia);
        sb.append('}');
        return sb.toString();
    }

    /**
     * ● esEfectivo(Prueba prueba): Compara la potencia del hechizo con el nivel de dificultad de la prueba. Si es
     * mayor o igual, el hechizo es efectivo.
     */
    public boolean esEfectivo(Prueba prueba){
        return prueba.getNivelDificulad() <= potencia;
    }

}
