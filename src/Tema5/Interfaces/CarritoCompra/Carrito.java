package Tema5.Interfaces.CarritoCompra;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Carrito {

    private List<Producto> productos;

    public Carrito() {
        //Implementación con ArrayList
        //this.productos = new ArrayList<>();
        //LinkedList y ArrayList implementan el interfaz List
        this.productos = new LinkedList<>();
    }

    public void addProducto(Producto producto) {
        productos.add(producto);
    }

    public void removeProducto(Producto producto) {
        productos.remove(producto);
    }

    public Integer getCantidadProductos() {
        return productos.size();
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Carrito{");
        sb.append("productos=").append('\n');
        for(Producto p : productos)
            sb.append(p).append('\n');
        sb.append('}');
        return sb.toString();
    }

    public Double getPrecioTotal(){
        Double precioTotal = 0.0;
        for(Producto p: this.productos) {
            precioTotal += p.getPrecio();
        }
        return precioTotal;
    }
}
