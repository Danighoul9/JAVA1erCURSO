package Tema6.TareasRepaso.Tarea1.Servicios;

public class StockInsuficienteException extends RuntimeException {
    public StockInsuficienteException(String codigo) {
        super("Stock insuficiente para el producto " + codigo);
    }
}
