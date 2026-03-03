package Tema6.TareaRepaso.Servicios;

public class StockInsuficienteException extends RuntimeException {
    public StockInsuficienteException(String codigo) {
        super("Stock insuficiente para el producto " + codigo);
    }
}
