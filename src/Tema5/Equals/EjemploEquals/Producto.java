package Tema5.Equals.EjemploEquals;

import java.util.Objects;

public class Producto {

    private String nombre;
    private double precio;
    private String categoria;

    //Constructor
    public Producto(String nombre, double precio, String categoria) {
        this.nombre = nombre;
        this.precio = precio;
        this.categoria = categoria;
    }

    //Constructor copia
    public Producto(Producto producto) {
        this.nombre = producto.nombre;
        this.precio = producto.precio;
        this.categoria = producto.categoria;
    }



    //Getters
    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public String getCategoria() {
        return categoria;
    }

    //Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }


    //ToString()

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Producto{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", precio=").append(precio);
        sb.append(", categoria='").append(categoria).append('\'');
        sb.append('}');
        return sb.toString();
    }

    //Equals y HashCode
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Producto producto = (Producto) o;
        return Double.compare(precio, producto.precio) == 0 && Objects.equals(nombre, producto.nombre) && Objects.equals(categoria, producto.categoria);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, precio, categoria);
    }
}
