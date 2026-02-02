package Tema5.PracticasTemas5.GranjaInteligente;

public class TractorAutonomo extends Maquina{

    /**
     * Clase TractorAutonomo
     * Representa un tractor autónomo capaz de realizar labores de arado o transporte.
     * Nuevos atributos (privados):
     * potenciaCV (float): potencia del motor en caballos de vapor.
     * consumoPorHora (float): consumo de combustible por hora (litros/hora).
     * o Métodos:
     * Constructor que llama al de la clase padre, más los nuevos atributos
     * Getters y setters nuevos
     * toString(): imprime los datos comunes y los propios.
     * imprimirTipo(): devuelve “Tractor Autónomo”.
     */

    private float potenciaCV;
    private float consumoPorHora;

    public TractorAutonomo(Integer idMaquina, String modelo, Integer estado,
                           float horasUso, float potenciaCV, float consumoPorHora) {
        super(idMaquina, modelo, estado, horasUso);
        this.potenciaCV = potenciaCV;
        this.consumoPorHora = consumoPorHora;
    }

    public TractorAutonomo(TractorAutonomo otra) {
        super(otra);
        this.potenciaCV = otra.potenciaCV;
        this.consumoPorHora = otra.consumoPorHora;
    }

    public float getPotenciaCV() {
        return potenciaCV;
    }

    public void setPotenciaCV(float potenciaCV) {
        this.potenciaCV = potenciaCV;
    }

    public float getConsumoPorHora() {
        return consumoPorHora;
    }

    public void setConsumoPorHora(float consumoPorHora) {
        this.consumoPorHora = consumoPorHora;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("TractorAutonomo{");
        sb.append("potenciaCV=").append(potenciaCV);
        sb.append(", consumoPorHora=").append(consumoPorHora);
        sb.append(", idMaquina=").append(idMaquina);
        sb.append(", modelo='").append(modelo).append('\'');
        sb.append(", estado=").append(estado);
        sb.append(", horasUso=").append(horasUso);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public void imprimirTipo() {
        IO.print("Tractor Autónomo");
    }

    //Metodos de la clase interfaz Operable
    @Override
    public void encender() {}
    @Override
    public void apagar() {}
    @Override
    public void ponerEnMantenimiento() {}
}
