package Tema5.Interfaces.CarritoCompra;

public interface Notificador {
    void notificarPorEmail(String mensaje, String destinatario);
    void notificarPorSMS(String mensaje, String destinatario);
}
