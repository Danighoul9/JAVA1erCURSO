package Tema5.Interfaces.CarritoCompra;

import java.util.ArrayList;
import java.util.List;

public class CarritoTest {
    public static void main(String[] args) {

        Carrito carrito = new Carrito();
        carrito.addProducto(new Producto("Pr1", 100.0, "Cat1"));
        carrito.addProducto(new Producto("Pr2", 200.0, "Cat2"));
        carrito.addProducto(new Producto("Pr3", 300.0, "Cat1"));

        System.out.println(carrito);
        System.out.println(carrito.getPrecioTotal());

    }
}
