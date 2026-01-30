package Tema4.TareasTema4.EJ7Incidencia;

public class Tecnico {
    private String nombre;
    private String especialidad;
    private String email;
    private String telefono;

    public Tecnico(String nombre, String especialidad, String email, String telefono) {
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.email = email;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Tecnico{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", especialidad='").append(especialidad).append('\'');
        sb.append(", email='").append(email).append('\'');
        sb.append(", telefono='").append(telefono).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
