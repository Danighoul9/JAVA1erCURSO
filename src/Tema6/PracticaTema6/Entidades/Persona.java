package Tema6.PracticaTema6.Entidades;

import java.util.Objects;
import java.util.UUID;

public abstract class Persona {

    /**
     * Crea la clase abstracta Persona con la siguiente información:
     * Atributos:
     * String id
     * String nombre
     * String apellidos
     * String dni
     * String email
     * String direccion
     * String telefono
     *
     * Constructores:
     * Constructor vacío que genere automáticamente el id usando
     * UUID.randomUUID().toString()
     * Constructor con todos los parámetros excepto id (que se genera
     * automáticamente con UUID )
     * Métodos:
     * Getters y setters para todos los atributos
     * toString() que muestre todos los atributos
     * Sobrescribir equals() y hashCode() basándose en el atributo dni
     */

    protected String id;
    protected String nombre;
    protected String apellidos;
    protected String dni;
    protected String email;
    protected String direccion;
    protected String telefono;

    public Persona(String nombre, String apellidos, String dni, String email, String direccion, String telefono) {
        this.id = UUID.randomUUID().toString();
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.email = email;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public String getId() {
        return id;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }


    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Persona{");
        sb.append("id='").append(id).append('\'');
        sb.append(", nombre='").append(nombre).append('\'');
        sb.append(", apellidos='").append(apellidos).append('\'');
        sb.append(", dni='").append(dni).append('\'');
        sb.append(", email='").append(email).append('\'');
        sb.append(", direccion='").append(direccion).append('\'');
        sb.append(", telefono='").append(telefono).append('\'');
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
}
