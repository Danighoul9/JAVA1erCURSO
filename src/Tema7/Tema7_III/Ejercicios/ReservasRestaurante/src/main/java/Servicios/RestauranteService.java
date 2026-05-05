package Servicios;

import Entidades.Cliente;
import Entidades.EstadoReserva;
import Entidades.Reserva;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class RestauranteService {

    private List<Reserva> reservas;
    public RestauranteService(List<Reserva> reservas) {
        this.reservas = reservas;
    }

    /** 1. Reservas confirmadas de una fecha concreta */
    public List<Reserva> getReservasConfirmadas(LocalDate fecha) {
        return reservas.stream()
                .filter(r -> r.getFecha().equals(fecha))
                .filter(r -> r.getEstado() == EstadoReserva.CONFIRMADA)
                .sorted(Comparator.comparing(Reserva::getFecha).reversed())
                .toList();
    }

    /** 2. Reservas de más de X personas */
    public List<Reserva> getReservasGrandes(int numPersonas) {
        return reservas.stream()
                .filter(r -> r.getNumPersonas() == numPersonas)
                .toList();
    }
    /** 3. Primera reserva cancelada */
    public Optional<Reserva> getPrimeraCancelada() {
        return reservas.stream()
                .filter(r -> r.getEstado() == EstadoReserva.CANCELADA)
                .findFirst();

    }

    /** 4. getReservasOrdenadas(LocalDate fecha): mostrar todas las reservas no canceladas ordenadas
     de mayor a menor número de personas en una fecha determinada */
    public List<Reserva> getReservasOrdenadas(LocalDate fecha) {
        return reservas.stream()
                .filter(r -> r.getEstado() == EstadoReserva.CANCELADA)
                .filter(r -> r.getFecha().equals(fecha))
                .sorted(Comparator.comparing(Reserva::getNumPersonas).reversed())
                .toList();
    }

    /** 5. Obtener los nombres de los clientes que tengan alguna reserva
     de más de 6 personas. */
     public Optional<String> getClientesReservasGrandes(){
         return reservas.stream()
                 .filter(r -> r.getNumPersonas() > 6)
                 .map(Reserva::getCliente)
                 .map(Cliente::getNombre)
                 .findFirst();
     };

    /**
     * 6. Calcular la suma total de importePrevisto de todas las reservas
     * con estado ATENDIDA .
     */
    public Double getTotalPrevistoAtendidas() {
        return reservas.stream()
                .filter(r -> r.getEstado().equals(EstadoReserva.ATENDIDA))
                .mapToDouble(Reserva::getImportePrevisto)
                .sum();
    }

    /**
     * 7. Crear un mapa donde la clave sea el estado de la reserva y el valor sea
     * el número total de reservas de ese estado.
     */
    public Map<EstadoReserva, Long> getReservasPorEstado() {
        return reservas.stream()
                .collect(Collectors.groupingBy(Reserva::getEstado,
                        Collectors.counting()));
    }

    /**
     * 8. Crear un mapa donde la clave sea la zona ( terraza , salon , barra , etc.)
     * y el valor sea el número de reservas de esa zona.
     */
    public Map<String, Long> getReservasPorZona() {
        return reservas.stream()
                .collect(Collectors.groupingBy(Reserva::getZonaprivate,
                Collectors.counting()));
    }

    /**
     * 9. Crear un mapa donde la clave sea la fecha y el valor sea la
     * lista de reservas de ese día.
     */
     public Map<LocalDate, List<Reserva>> getReservasAgrupadasPorFecha() {
         return reservas.stream()
                 .collect(Collectors.groupingBy(Reserva::getFecha));
     }

    /** 10. Cliente con más reservas */
    public Optional<Cliente> getClienteTop() {
        return reservas.stream()
                .map(Reserva::getCliente)
                .max(Comparator.comparing(Cliente::getNombre));
    }

    /** 11. Mostrar la suma del importe previsto de las reservas
     agrupada por fecha*/
    // No se si esta correcta, ***PREGUNTAR***
    public Double getTotalPrevistoAgrupadoPorFecha(){
        return reservas.stream()
                .mapToDouble(Reserva::getImportePrevisto)
                .sum();
    }

    /** 12. Estadísticas de comensales */
    public DoubleSummaryStatistics getEstadisticasNumPersonas(){
        return  reservas.stream()
                .mapToDouble(Reserva::getNumPersonas)
                .summaryStatistics();
    }


    /** 13. Clientes ordenados alfabéticamente */
    public List<Cliente> getClientes() {
        return reservas.stream()
                .map(Reserva::getCliente)
                .sorted(Comparator.comparing(Cliente::getNombre))
                .toList();
    }

    /** 14. Crear un mapa donde la clave sea la fecha y el valor sea la lista de reservas de ese día,
     * para las reservas a partir de hoy. Las reservas deben estar previamente ordenadas por fecha.*/
    public Map<LocalDate, List<Reserva>> getReservasFuturasAgrupadasPorFecha() {
        return reservas.stream()
                .filter(r -> r.getFecha().isAfter(LocalDate.now()) || r.getFecha().isEqual(LocalDate.now()))
                .sorted(Comparator.comparing(Reserva::getFecha))
                .collect(Collectors.groupingBy(Reserva::getFecha));
    }

    /** 15. Calcular qué porcentaje del total de reservas están canceladas. */

    public double getPorcentajeCanceladas() {
        long canceladas = reservas.stream()
                .filter(r -> r.getEstado() == EstadoReserva.CANCELADA)
                .count();

        return (canceladas * 100.0) /  reservas.size();
    }
}


