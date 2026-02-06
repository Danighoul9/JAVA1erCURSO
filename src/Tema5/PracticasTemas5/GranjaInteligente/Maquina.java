package Tema5.PracticasTemas5.GranjaInteligente;

import EjerciciosPuntuables.Tema5.Entidades.Jugador;

import java.util.Objects;

public abstract class Maquina implements Operable {

    /**
     * Describe las características generales de toda máquina inteligente agrícola.
     * - Atributos (privados):
     * id (int): identificador único de la máquina.
     * modelo (String): nombre o modelo de la máquina.
     * estado (int)
     * horasUso (float): número de horas acumuladas de funcionamiento (inicialmente 0).
     * - Métodos:
     *  Constructor que inicializa los atributos. El estado = APAGADA.
     * Getters y setters para cada atributo.
     * Método equals(): solo con el id
     * Método toString(): imprime los datos básicos de la máquina.
     * Método trabajar(float horas): incrementa el número de horas de funcionamiento si está
     * ENCENDIDA.
     * Implementa los métodos del interfaz, básicamente cambia el estado al correspondiente.
     * Método abstracto imprimirTipo(), que devuelve un String con el tipo de máquina (según su
     * subclase).
     */

    protected Integer idMaquina;
    protected String modelo;
    protected Integer estado;
    protected float horasUso;
    protected static Integer contadorParaElId = 1000;

    //Constructor
    public Maquina(String modelo, Integer estado, float horasUso) {
        this.idMaquina = contadorParaElId++;
        this.modelo = modelo;
        this.estado = estado;
        this.horasUso = horasUso;
    }

    public Integer getIdMaquina() {
        return idMaquina;
    }

    public void setIdMaquina(Integer idMaquina) {
        this.idMaquina = idMaquina;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Integer getEstado() {
        return estado;
    }

    public float getHorasUso() {
        return horasUso;
    }

    public void setHorasUso(float horasUso) {
        this.horasUso = horasUso;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Maquina maquina = (Maquina) o;
        return Objects.equals(idMaquina, maquina.idMaquina);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(idMaquina);
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Maquina{");
        sb.append("idMaquina=").append(idMaquina);
        sb.append(", modelo='").append(modelo).append('\'');
        sb.append(", estado=").append(estado);
        sb.append(", horasUso=").append(horasUso);
        sb.append('}');
        return sb.toString();
    }


    /**
     * Método trabajar(float horas): incrementa el número de horas de funcionamiento si está
     * @param horas
     */
    public void trabajar(float horas){
        if (this.estado == 1) { // Solo añadiremos horas a la maquina si esta en estado 1, osea encendida
            this.horasUso += horas;
        } else {
            IO.println("Error: La máquina debe estar ENCENDIDA para trabajar.");
        }
    }

    /**
     * Método abstracto imprimirTipo(), que devuelve un String con el tipo de máquina (según su
     * subclase).
     */
    public abstract void imprimirTipo();


}

