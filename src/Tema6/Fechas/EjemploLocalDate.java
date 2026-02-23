package Tema6.Fechas;

import javax.swing.text.DateFormatter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.util.Locale;

public class EjemploLocalDate {

    private Integer dia;

    static void main() {

        //Fecha actual
        var fecha = LocalDate.now();
        System.out.println(fecha);

        //Construir fecha con of(año, mes, dia)
        fecha = LocalDate.of(2026, 10, 9);
        System.out.println(fecha);

        //Pintar fecha con format()
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        IO.println(fecha.format(formatter));

        //Get de cada elemento
        IO.println("Año: " + fecha.getYear());
        IO.println("Mes: " + fecha.getMonthValue()); //Mes en número
        IO.println("Mes: " + fecha.getMonth()); //Mes en texto
        IO.println("Día: " + fecha.getDayOfMonth());

        //Modificar una fecha cambiando un elemento
        fecha = fecha.withDayOfMonth(15);
        IO.println(fecha);
        fecha = fecha.withYear(1990);
        IO.println(fecha + " - cayó " + fecha.getDayOfWeek());

        //Sumar o restar días/meses/años a una fecha
        fecha = fecha.plusDays(10);
        IO.println(fecha);
        fecha = fecha.minusMonths(2);
        IO.println(fecha);

        //Encadenar métodos que modifican una fecha
        fecha = fecha.minusYears(1)
                .plusDays(1)
                .minusWeeks(3);
        IO.println(fecha);

        //Comprobar si es bisiesto
        IO.println(fecha.plusYears(3).isLeapYear());

        //Chronofield
        IO.println(fecha.get(ChronoField.MONTH_OF_YEAR));

        //Día de la semana en español
        IO.println(fecha.getDayOfWeek()
                .getDisplayName(java.time.format.TextStyle.FULL,
                        Locale.of("es", "ES")));
        IO.println(fecha.getDayOfWeek()
                .getDisplayName(java.time.format.TextStyle.FULL,
                        Locale.of("kr", "KR")));
        IO.println(fecha.getDayOfWeek()
                .getDisplayName(java.time.format.TextStyle.FULL,
                        Locale.of("ja", "JP")));


    }

}