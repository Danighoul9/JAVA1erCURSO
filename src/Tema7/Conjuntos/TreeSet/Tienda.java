package Tema7.Conjuntos.TreeSet;


import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Tienda {

    private final Set<Producto> productos = new TreeSet<>();
    private final Set<Producto> productosPrecio = new TreeSet<>(
            Comparator.comparing(Producto::getPrecio).reversed().thenComparing(Producto::getNombre)
    );

    public Set<Producto> getProductos() {
        return productos;
    }

    public Set<Producto> getProductosPrecio() {
        return productosPrecio;
    }

    public void agregarProducto(Producto producto){
        productos.add(producto);
        productosPrecio.add(producto);
    }

    public void eliminarProducto(Producto producto){
        productos.remove(producto);
        productosPrecio.remove(producto);
    }

    public void mostrarProductos(){
        IO.println("Productos disponibles:");
        for(Producto p : productos) {
            IO.println(p);
        }
    }

    public void mostrarProductosPrecio(){
        IO.println("Productos disponibles por precio:");
        for(Producto p : productosPrecio) {
            IO.println(p);
        }
    }

    public Producto buscarProducto(String nombre){
        for(Producto p : productos) {
            if(p.getNombre().equals(nombre)) {
                return p;
            }
        }
        return null;
    }
}