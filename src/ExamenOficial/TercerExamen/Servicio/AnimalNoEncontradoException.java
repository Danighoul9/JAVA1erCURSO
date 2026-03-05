package ExamenOficial.TercerExamen.Servicio;

public class AnimalNoEncontradoException extends RuntimeException {
    public AnimalNoEncontradoException(Long id) {
        super("Animal con ID: " + id + " no encontrado.");
    }
}
