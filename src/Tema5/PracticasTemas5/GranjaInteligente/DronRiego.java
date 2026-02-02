package Tema5.PracticasTemas5.GranjaInteligente;

public class DronRiego extends Maquina {
    /**
     * Clase DronRiego
     * Representa un dron usado para la pulverización o riego de precisión.
     * Nuevos atributos (privados):
     * capacidadLitros (int): capacidad del tanque de agua o sustancia.
     * alcanceMetros (float): distancia máxima de vuelo.
     * o Métodos:
     * Constructor que llama al de la clase padre, más los nuevos atributos
     * Getters y setters nuevos
     * toString(): imprime los datos comunes y los propios.
     * imprimirTipo(): devuelve “Dron de Riego”.
     */

    private Integer capacidadLitros;
    private  float alcanceMetros;

    public DronRiego(Integer idMaquina, String modelo, Integer estado,
                     float horasUso, Integer capacidadLitros, float alcanceMetros) {
        super(idMaquina, modelo, estado, horasUso);
        this.capacidadLitros = capacidadLitros;
        this.alcanceMetros = alcanceMetros;
    }

    public DronRiego(DronRiego otra) {
        super(otra);
        this.capacidadLitros = otra.capacidadLitros;
        this.alcanceMetros = otra.alcanceMetros;
    }

    public Integer getCapacidadLitros() {
        return capacidadLitros;
    }

    public void setCapacidadLitros(Integer capacidadLitros) {
        this.capacidadLitros = capacidadLitros;
    }

    public float getAlcanceMetros() {
        return alcanceMetros;
    }

    public void setAlcanceMetros(float alcanceMetros) {
        this.alcanceMetros = alcanceMetros;
    }

    @Override
    public String   toString() {
        final StringBuffer sb = new StringBuffer("DronRiego{");
        sb.append("capacidadLitros=").append(capacidadLitros);
        sb.append(", alcanceMetros=").append(alcanceMetros);
        sb.append(", idMaquina=").append(idMaquina);
        sb.append(", modelo='").append(modelo).append('\'');
        sb.append(", estado=").append(estado);
        sb.append(", horasUso=").append(horasUso);
        sb.append('}');
        return sb.toString();
    }

    //Metodos de la clase interfaz Operable
    @Override
    public void encender() {}
    @Override
    public void apagar() {}
    @Override
    public void ponerEnMantenimiento() {}


    @Override
    public void imprimirTipo() {
        IO.print("Dron de Riego");
    }
}
