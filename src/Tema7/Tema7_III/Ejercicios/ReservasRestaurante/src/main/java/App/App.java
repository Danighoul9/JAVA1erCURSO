package App;

import Entidades.Cliente;
import Entidades.EstadoReserva;
import Entidades.Reserva;
import Entidades.Restaurante;
import Servicios.RestauranteService;

import java.time.LocalDate;
import java.time.LocalTime;

public class App {

    public static void cargarClientes(Restaurante restaurante) {
        restaurante.addCliente(new Cliente("29055641J", "Juan", "677182945",
                "Juanonmoc@email.com", "Sevilla"));
        restaurante.addCliente(new Cliente("27881928P", "Leticia", "622894531",
                "Leti@email.com", "Madrid"));
        restaurante.addCliente(new Cliente("20123994K", "Eustabio", "722934055",
                "Eustak@email.com", "Valencia"));
        restaurante.addCliente(new Cliente("23044981M", "Mark", "788923412",
                "GodHand@email.com", "Sevilla"));
        restaurante.addCliente(new Cliente("28358109OS", "Alex", "655243644",
                "AleXander@email.com", "Málaga"));
        restaurante.addCliente(new Cliente("21777839N", "Marina", "788987645",
                "Marinette@email.com", "Granada"));
        restaurante.addCliente(new Cliente("23492019X", "Arthur", "699087623",
                "ArthurBoyle@email.com", "Cádiz"));
        restaurante.addCliente(new Cliente("27637891A", "Fernanda", "622453376",
                "laFerni@email.com", "Córdoba"));
    }

    public static void cargarReservas(Restaurante restaurante) {
        restaurante.addReserva(new Reserva(
                restaurante.getClientePorDni("29055641J"),
                LocalDate.now().plusDays(1),
                LocalTime.of(21, 30),
                4,
                80.0,
                EstadoReserva.CONFIRMADA,
                "terraza"));

        restaurante.addReserva(new Reserva(
                restaurante.getClientePorDni("27881928P"),
                LocalDate.now().plusDays(2),
                LocalTime.of(20, 0),
                2,
                40.0,
                EstadoReserva.PENDIENTE,
                "interior"));

        restaurante.addReserva(new Reserva(
                restaurante.getClientePorDni("20123994K"),
                LocalDate.now(),
                LocalTime.now(),
                6,
                120.0,
                EstadoReserva.CONFIRMADA,
                "salón"));

        restaurante.addReserva(new Reserva(
                restaurante.getClientePorDni("23044981M"),
                LocalDate.now().plusDays(1),
                LocalTime.of(14, 30),
                3,
                60.0,
                EstadoReserva.ATENDIDA,
                "terraza"));

        restaurante.addReserva(new Reserva(
                restaurante.getClientePorDni("28358109OS"),
                LocalDate.now(),
                LocalTime.now(),
                5,
                100.0,
                EstadoReserva.CANCELADA,
                "interior"));

        restaurante.addReserva(new Reserva(
                restaurante.getClientePorDni("21777839N"),
                LocalDate.now().plusDays(2),
                LocalTime.of(15, 0),
                2,
                35.0,
                EstadoReserva.CONFIRMADA,
                "barra"));

        restaurante.addReserva(new Reserva(
                restaurante.getClientePorDni("23492019X"),
                LocalDate.now().plusDays(5),
                LocalTime.of(22, 30),
                8,
                200.0,
                EstadoReserva.PENDIENTE,
                "salón"));

        restaurante.addReserva(new Reserva(
                restaurante.getClientePorDni("27637891A"),
                LocalDate.now().plusDays(1),
                LocalTime.of(13, 30),
                2,
                30.0,
                EstadoReserva.ATENDIDA,
                "terraza"));

        restaurante.addReserva(new Reserva(
                restaurante.getClientePorDni("29055641J"),
                LocalDate.now().plusDays(6),
                LocalTime.of(21, 0),
                3,
                70.0,
                EstadoReserva.CONFIRMADA,
                "interior"));

        restaurante.addReserva(new Reserva(
                restaurante.getClientePorDni("27881928P"),
                LocalDate.now(),
                LocalTime.of(22, 0),
                4,
                90.0,
                EstadoReserva.PENDIENTE,
                "terraza"));

        restaurante.addReserva(new Reserva(
                restaurante.getClientePorDni("20123994K"),
                LocalDate.now().plusDays(3),
                LocalTime.of(14, 0),
                2,
                45.0,
                EstadoReserva.ATENDIDA,
                "barra"));

        restaurante.addReserva(new Reserva(
                restaurante.getClientePorDni("23044981M"),
                LocalDate.now().plusDays(2),
                LocalTime.of(21, 30),
                6,
                150.0,
                EstadoReserva.CONFIRMADA,
                "salón"));

        restaurante.addReserva(new Reserva(
                restaurante.getClientePorDni("28358109OS"),
                LocalDate.now(),
                LocalTime.now(),
                2,
                50.0,
                EstadoReserva.CANCELADA,
                "interior"));

        restaurante.addReserva(new Reserva(
                restaurante.getClientePorDni("21777839N"),
                LocalDate.now(),
                LocalTime.now(),
                4,
                85.0,
                EstadoReserva.CONFIRMADA,
                "terraza"));

        restaurante.addReserva(new Reserva(
                restaurante.getClientePorDni("23044981M"),
                LocalDate.now(),
                LocalTime.now(),
                5,
                110.0,
                EstadoReserva.PENDIENTE,
                "salón"));
    }
    static void main(String[] args) {
        Restaurante r = new Restaurante("Restaurante AcalaMama");

        // CLIENTES
        cargarClientes(r);
        // RESERVAS
        cargarReservas(r);

        //Creamos el servicio
        RestauranteService rs = new RestauranteService(r.getReservas());


        //Consultas
        /** 1. Reservas confirmadas de una fecha concreta */
        IO.println("---------------------- 1. -------------------------");
        IO.println(rs.getReservasConfirmadas(LocalDate.now()));

        /** 2. Reservas de más de X personas */
        IO.println("---------------------- 2. -------------------------");
        IO.println(rs.getReservasGrandes(2));

        /** 3. Primera reserva cancelada */
        IO.println("---------------------- 3. -------------------------");
        IO.println(rs.getPrimeraCancelada());

        /** 4. Reservas ordenadas por número de personas */
        IO.println("---------------------- 4. -------------------------");
        IO.println(rs.getReservasOrdenadas(LocalDate.now()));

        /** 5. Clientes con reservas grandes */
        IO.println("---------------------- 5. -------------------------");
        IO.println(rs.getClientesReservasGrandes());

        /** 6. Total previsto de reservas atendidas */
        IO.println("---------------------- 6. -------------------------");
        IO.println(rs.getTotalPrevistoAtendidas() + "€");

        /** 7. Número de reservas por estado */
        IO.println("---------------------- 7. -------------------------");
        IO.println(rs.getReservasPorEstado());

        /** 8. Número de reservas por zona */
        IO.println("---------------------- 8. -------------------------");
        IO.println(rs.getReservasPorZona());

        /** 9. Reservas agrupadas por fecha */
        IO.println("---------------------- 9. -------------------------");
        IO.println(rs.getReservasAgrupadasPorFecha());

        /** 10. Cliente con más reservas */
        IO.println("---------------------- 10. -------------------------");
        IO.println(rs.getClienteTop());

        /** 11. Recaudación prevista por fecha */
        IO.println("---------------------- 11. -------------------------");
        IO.println(rs.getTotalPrevistoAgrupadoPorFecha() + "€");

        /** 12. Estadísticas de comensales */
        IO.println("---------------------- 12. -------------------------");
        IO.println(rs.getEstadisticasNumPersonas());

        /** 13. Clientes ordenados alfabéticamente */
        IO.println("---------------------- 13. -------------------------");
        IO.println(rs.getClientes());

        /** 14. Reservas futuras agrupadas por fecha */
        IO.println("---------------------- 14. -------------------------");
        IO.println(rs.getReservasFuturasAgrupadasPorFecha());

        /** 15. Porcentaje de reservas canceladas */
        IO.println("---------------------- 15. -------------------------");
        IO.println("Porcentaje reservas canceladas: " + rs.getPorcentajeCanceladas() + "%");

    }




}

