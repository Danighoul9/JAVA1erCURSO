package Tema5.TareasTema5.PersonaIMC;

import java.util.ArrayList;
import java.util.Objects;

public class Persona {

    static {
        //Comprobación de red, conexión a bbdd, ...
        //Se ejecuta una única vez la primera vez que se invoca la clase
        System.out.println("Clase Persona cargada");
    }

    enum SexoPersona {H, M, O}

    private String nombre;
    private Integer edad;
    private String dni;
    private SexoPersona sexo;
    private Double peso;
    private Double altura;

    public Persona() {
        this.nombre = "";
        this.edad = 0;
        this.dni = "";
        this.sexo = SexoPersona.H;
        this.peso = 0.0;
        this.altura = 0.0;
    }

    public Persona(String nombre, Integer edad, String dni, SexoPersona sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
        this.sexo = sexo;
        this.peso = 0.0;
        this.altura = 0.0;
    }

    public Persona(String nombre, Integer edad, String dni, SexoPersona sexo, Double peso, Double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

    public Persona(Persona otra) {
        this.nombre = otra.nombre;
        this.edad = otra.edad;
        this.dni = otra.dni;
        this.sexo = otra.sexo;
        this.peso = otra.peso;
        this.altura = otra.altura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public SexoPersona getSexo() {
        return sexo;
    }

    public void setSexo(SexoPersona sexo) {
        this.sexo = sexo;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Persona{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", edad=").append(edad);
        sb.append(", dni='").append(dni).append('\'');
        sb.append(", sexo=").append(sexo);
        sb.append(", peso=").append(peso);
        sb.append(", altura=").append(altura);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Persona persona = (Persona) o;
        return Objects.equals(dni, persona.dni);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(dni);
    }

    //-------------------------------------------------------------------

    public boolean esMayorEdad() {
        return this.edad >= 18;
    }

    public Integer calcularIMC() {
        double imc = this.peso / (Math.pow(this.altura, 2));
        if (imc < 20)
            return 1;
        else if (imc >= 20 && imc <= 25)
            return 0;
        else
            return -1;
    }
}
