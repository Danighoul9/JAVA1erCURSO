package Tema6.TareasRepaso.Tarea1.Entidades;

import java.util.Objects;
import java.util.UUID;

public abstract class ProductoBase implements Producto {

    protected String codigo;
    protected String nombre;
    protected Double precio;
    protected Integer stock;

    public ProductoBase(String nombre, Double precio, Integer stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
        this.codigo = UUID.randomUUID().toString();
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("ProductoBase{");
        sb.append("codigo='").append(codigo).append('\'');
        sb.append(", nombre='").append(nombre).append('\'');
        sb.append(", precio=").append(precio);
        sb.append(", stock=").append(stock);
        sb.append('}');
        return sb.toString();
    }

    /**
     * Si hay stock suficiente, se descuenta la cantidad indicada
     * @param cantidad
     */
    @Override
    public void descontarStock(int cantidad) {
        if (cantidad <= stock) {
            stock -= cantidad;
        }
    }

    /**
     * Información del producto, dependiendo del tipo de producto
     * @return
     */
    @Override
    public abstract String getInfo();

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        ProductoBase that = (ProductoBase) o;
        return Objects.equals(codigo, that.codigo);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(codigo);
    }
}
