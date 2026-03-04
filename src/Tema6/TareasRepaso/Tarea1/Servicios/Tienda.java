package Tema6.TareasRepaso.Tarea1.Servicios;

import Tema6.TareasRepaso.Tarea1.Entidades.Compra;
import Tema6.TareasRepaso.Tarea1.Entidades.Producto;
import Tema6.TareasRepaso.Tarea1.Entidades.ProductoBase;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Tienda {

    private final List<Producto> inventario = new ArrayList<>();
    private final List<Compra> historialCompras = new ArrayList<>();


    /**
     * Añadir producto en el inventario de productos disponibles en la tienda
     * @param producto
     */
    public void agregarProducto(Producto producto) {
        if (!inventario.contains(producto))
            inventario.add(producto);
    }

    /**
     * Eliminar producto del inventario
     * @param producto
     */
    public void eliminarProducto(Producto producto) {
        inventario.remove(producto);
    }

    /**
     * Actualizar el precio y el stock de un producto
     * @param codigo
     * @param nuevoPrecio
     * @param nuevoStock
     */
    public void actualizarProducto(String codigo, double nuevoPrecio, int nuevoStock) {
        //int posicion = inventario.indexOf(new ProductoBase(codigo,"",""));
        for(Producto p: inventario) {
            if (p.getCodigo().equals(codigo)) {
                ((ProductoBase) p).setPrecio(nuevoPrecio);
                ((ProductoBase) p).setStock(nuevoStock);
            }
        }
    }

    /**
     * Realizar una compra de un producto.
     *  - Buscar el producto por código.
     *  - Verificar que el stock sea suficiente; si no, lanzar StockInsuficienteException.
     *  - Actualizar el stock y registrar la compra.
     * @param codigo
     * @param cantidad
     */
    public void realizarCompra(String codigo, int cantidad) throws StockInsuficienteException {
        for(Producto p: inventario) {
            if (p.getCodigo().equals(codigo)) {
                //Podemos hacer la compra si hay stock suficiente
                if (p.getStock() >= cantidad) {
                    ((ProductoBase) p).setStock(p.getStock() - cantidad);
                    Compra compra = new Compra(LocalDate.now(), p, cantidad);
                    historialCompras.add(compra);
                } else {
                    //Lanzar excepción de stock insuficiente
                    throw new StockInsuficienteException(codigo);
                }
            }
        }
    }

    /**
     * Mostrar el inventario de productos.
     */
    public void mostrarInventario() {
        IO.println("--- Inventario de productos ---");
        for(Producto p: inventario) {
            IO.println(p.getInfo());
        }
    }

    /**
     * Mostrar el historial de compras.
     */
    public void mostrarHistorialCompras() {
        IO.println("--- Historial de compras ---");
        for(Compra c: historialCompras) {
            IO.println(c);
        }
    }



}
