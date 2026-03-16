package Tema7.Listas.Cola;


public class Evento {

    private static Long contador = 0L;

    private Long id;
    private String nombre;
    private String descripcion;

    public Evento(String nombre, String descripcion) {
        this.id = contador++;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public Long getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}