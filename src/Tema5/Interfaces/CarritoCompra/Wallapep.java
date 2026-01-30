package Tema5.Interfaces.CarritoCompra;

import java.util.ArrayList;
import java.util.List;

public class Wallapep implements Notificador {

    private String nombreUsuario;
    private List<Producto> productos;

    public Wallapep(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
        this.productos = new ArrayList<>();
    }

    public void addProducto(Producto producto){
        productos.add(producto);
    }

    public void removeProducto(Producto producto){
        productos.remove(producto);
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

    @Override
    public void notificarPorEmail(String mensaje, String destinatario) {
        System.out.println("Enviando email a "+destinatario+" con el mensaje: "
                + mensaje);
    }

    @Override
    public void notificarPorSMS(String mensaje, String destinatario) {
        System.out.println("Enviando SMS a "+destinatario+" con el mensaje: "
                + mensaje);
    }

    public static void main(String[] args) {
        Wallapep w = new Wallapep("Pepe");
        w.addProducto(new Producto("iPhone17",600.0,"Telefonía"));
        w.notificarPorEmail("Hola, acepto tu oferta",
                "Usuario123");

    }

}
