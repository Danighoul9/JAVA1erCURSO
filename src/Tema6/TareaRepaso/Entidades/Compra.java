package Tema6.TareaRepaso.Entidades;

import java.time.LocalDate;

public class Compra {

    private LocalDate fecha;
    private Producto producto;
    private Integer cantidad;
    private Double precioTotal;

    public Compra(LocalDate fecha, Producto producto, Integer cantidad) {
        this.fecha = fecha;
        this.producto = producto;
        this.cantidad = cantidad;
        this.precioTotal = producto.getPrecio() * cantidad;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public Producto getProducto() {
        return producto;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public Double getPrecioTotal() {
        return precioTotal;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Compra{");
        sb.append("fecha=").append(fecha);
        sb.append(", producto=").append(producto);
        sb.append(", cantidad=").append(cantidad);
        sb.append(", precioTotal=").append(precioTotal);
        sb.append('}');
        return sb.toString();
    }
}
