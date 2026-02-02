package Tema5.PracticasTemas5.GranjaInteligente;

public class CosechadoraAutonoma extends Maquina {

    /**
     * Clase CosechadoraAutonoma
     * Representa una máquina que cosecha de forma autónoma en la granja.
     * Nuevos atributos (privados), por ejemplo:
     * anchoCorte (float): ancho de corte en metros.
     * rendimientoToneladasHora (float): cantidad de producto cosechado por hora.
     * Métodos:
     * Constructor que llama al de la clase padre Maquina más los nuevos atributos.
     * Getters y setters de los nuevos atributos.
     * toString(): llama a super.imprimirDatos() y añade los datos propios.
     * imprimirTipo(): devuelve "Cosechadora Autónoma".
     */

    private float anchoCorte;
    private float rendimientoToneladasHora;

    public CosechadoraAutonoma(Integer idMaquina, String modelo, Integer estado, float horasUso,
                               float anchoCorte, float rendimientoToneladasHora) {
        super(idMaquina, modelo, estado, horasUso);
        this.anchoCorte = anchoCorte;
        this.rendimientoToneladasHora = rendimientoToneladasHora;
    }

    public CosechadoraAutonoma(CosechadoraAutonoma otra) {
        super(otra);
        this.anchoCorte = otra.anchoCorte;
        this.rendimientoToneladasHora = otra.rendimientoToneladasHora;
    }

    public float getAnchoCorte() {
        return anchoCorte;
    }

    public void setAnchoCorte(float anchoCorte) {
        this.anchoCorte = anchoCorte;
    }

    public float getRendimientoToneladasHora() {
        return rendimientoToneladasHora;
    }

    public void setRendimientoToneladasHora(float rendimientoToneladasHora) {
        this.rendimientoToneladasHora = rendimientoToneladasHora;
    }

    //Cambiarlo
    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("CosechadoraAutonoma{");
        sb.append("anchoCorte=").append(anchoCorte);
        sb.append(", rendimientoToneladasHora=").append(rendimientoToneladasHora);
        sb.append(", idMaquina=").append(idMaquina);
        sb.append(", modelo='").append(modelo).append('\'');
        sb.append(", estado=").append(estado);
        sb.append(", horasUso=").append(horasUso);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public void imprimirTipo() {
       IO.print("Cosechadora Autónoma");
    }

    @Override
    public void encender() {}
    @Override
    public void apagar() {}
    @Override
    public void ponerEnMantenimiento() {}
}
