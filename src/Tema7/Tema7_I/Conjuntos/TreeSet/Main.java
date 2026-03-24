package Tema7.Tema7_I.Conjuntos.TreeSet;


public class Main {
    static void main() {

        Tienda tienda = new Tienda();
        tienda.agregarProducto(new Producto("Samsung S26", "Móviles", "", 1000.0));
        tienda.agregarProducto(new Producto("Samsung S26 Reacondicionado", "Móviles", "Reacondicionado", 800.0));
        tienda.agregarProducto(new Producto("Samsung S26 Ultra", "Móviles", "", 1400.0));
        tienda.agregarProducto(new Producto("Iphone 17 Pro", "Móviles","", 1500.0));
        tienda.agregarProducto(new Producto("Iphone 17 Pro", "Móviles","Firmado", 1505.0));
        tienda.agregarProducto(new Producto("Samsung S26+","Móviles","", 1000.0));

        IO.println("Productos por nombre: ---------");
        tienda.mostrarProductos();
        IO.println("Productos por precio: ---------");
        tienda.mostrarProductosPrecio();
    }
}
