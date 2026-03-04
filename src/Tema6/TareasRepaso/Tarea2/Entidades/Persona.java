package Tema6.TareasRepaso.Tarea2.Entidades;

import java.util.Objects;
import java.util.UUID;

public abstract class Persona {

    /**
     * Atributos
     * String id — generado automáticamente con UUID.randomUUID().toString()
     * String nombre
     * String apellidos
     * String email
     *
     * Constructores:
     * Constructor vacío (genera id automáticamente)
     * Constructor con todos los parámetros excepto id
     *
     * Métodos:
     * Getters y setters
     * toString() mostrando todos los atributos
     * Sobrescribir equals() y hashCode() basándose en email
     */

     protected String id;
     protected String nombre;
     protected String apellidos;
     protected String email;

    public Persona(String nombre, String apellidos, String email) {
        this.id = UUID.randomUUID().toString();
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Persona{");
        sb.append("id='").append(id).append('\'');
        sb.append(", nombre='").append(nombre).append('\'');
        sb.append(", apellidos='").append(apellidos).append('\'');
        sb.append(", email='").append(email).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Persona persona = (Persona) o;
        return Objects.equals(email, persona.email);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(email);
    }
}
