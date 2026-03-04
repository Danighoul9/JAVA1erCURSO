package Tema6.TareasRepaso.Tarea1.Entidades;

public interface Producto {

    String getCodigo();
    String getNombre();
    Double getPrecio();
    Integer getStock();
    void descontarStock(int cantidad);
    String getInfo();

}