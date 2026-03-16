package ExamenOficial.TercerExamen.Servicio;

public class PropietarioNoEncontradoException extends Exception {
    public PropietarioNoEncontradoException(String dni) {
        super("Propietario con DNI: " + dni + " no encontrado.");
    }
}
