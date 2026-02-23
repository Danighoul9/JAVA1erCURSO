package Tema6.PracticaTema6.Entidades;

public abstract class Coche {
    /**
     * Crea la clase abstracta Coche con la siguiente información:Atributos:
     * Long id
     * String marca
     * String modelo
     * String matricula
     * int anio
     * TipoCombustible combustible
     * TipoCoche tipo
     * Double precioBase
     * boolean disponible (inicialmente true )
     * Constructores:
     * Constructor que reciba todos los atributos excepto id y disponible
     * El id se genera automáticamente (puede usarse un contador
     * estático Long )
     * El atributo disponible se inicializa por defecto a true
     * Métodos:
     * Getters y setters para todos los atributos
     * toString() que muestre la información relevante del coche
     * Sobrescribir equals() y hashCode() basándose en el atributo id
     * Método abstracto: double calcularPrecioAlquiler(int dias) -
     * devuelve el precio de alquiler del coche para un número determinado
     * de días
     */

    protected Long id;
    protected String marca;
    protected String modelo;
    protected String matricula;
    protected int anio;
    protected TipoCombustible combustible;
    protected TipoCoche tipo;
    protected  Double precioBase;
    protected  boolean disponible;
    private static Long contadorId;



}
