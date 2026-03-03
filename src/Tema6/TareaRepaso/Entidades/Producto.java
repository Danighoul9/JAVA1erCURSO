package Tema6.TareaRepaso.Entidades;

public interface Producto {

    String getCodigo();
    String getNombre();
    Double getPrecio();
    Integer getStock();
    void descontarStock(int cantidad);
    String getInfo();

}