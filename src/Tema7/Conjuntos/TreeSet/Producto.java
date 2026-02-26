package Tema7.Conjuntos.TreeSet;


import java.util.Objects;

public class Producto implements Comparable<Producto>{

    private static long contador = 1000;

    private final long id = contador++;
    private String nombre;
    private String categoria;
    private String descripcion;
    private Double precio;

    public Producto(String nombre, String categoria, String descripcion, Double precio) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Producto{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", categoria='").append(categoria).append('\'');
        sb.append(", descripcion='").append(descripcion).append('\'');
        sb.append(", precio=").append(precio);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Producto producto = (Producto) o;
        return id == producto.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    /**
     * Devolver <0, 0, >0
     * @param o the object to be compared.
     * @return
     */
    @Override
    public int compareTo(Producto o) {
        //return this.nombre.compareTo(o.nombre);
        int resultado = this.nombre.compareTo(o.nombre);
        if (resultado == 0) {
            return this.precio.compareTo(o.precio);
        } else {
            return resultado;
        }
    }
}
