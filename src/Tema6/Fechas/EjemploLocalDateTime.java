package Tema6.Fechas;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class EjemploLocalDateTime {

    static void main() {

        //FechaHora actual
        LocalDateTime fecha = LocalDateTime.now();
        IO.println(fecha);

        //Creación con of
        fecha = LocalDateTime.of(2026, 10, 9, 12, 30);
        IO.println(fecha);
        fecha = LocalDateTime.of(LocalDate.of(2000,1,1),
                LocalTime.of(22,22));
        IO.println(fecha);

        //DateTimeFormatter
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy - HH:mm:ss");
        IO.println(fecha.format(dtf));

        //Getter
        IO.println("Hora: " + fecha.getHour());
        IO.println("Año: " + fecha.getYear());

        //Modificadores de LocalDateTime
        //with minus plus -> year,month,dayOfMonth,hour,minute,second
        fecha = fecha.plusDays(10);
        fecha = fecha.withSecond(39);
        IO.println(fecha);

        IO.println(
                LocalDateTime.now()
                        .plusYears(2)
                        .plusHours(2)
                        .withMinute(58)
        );

        //LocalDateTime, a partir de una fecha con un hora
        LocalDate mañana = LocalDate.now().plusDays(1);
        LocalDateTime mañanaDiez = mañana.atTime(22,0);
        IO.println(mañanaDiez);

    }
}