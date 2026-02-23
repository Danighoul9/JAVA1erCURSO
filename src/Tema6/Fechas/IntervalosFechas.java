package Tema6.Fechas;

import java.time.Duration;
import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class IntervalosFechas {
    static void main() {

        LocalDate ahora = LocalDate.now();
        LocalDate pasadoManana = ahora.plusDays(325);

        Period periodo = Period.between(ahora, pasadoManana);
        IO.println(periodo);
        IO.println("Años: " + periodo.getYears());
        IO.println("Meses: " + periodo.getMonths()); //Los meses entre las fechas
        IO.println("Días: " + periodo.getDays()); //El pico de días del periodo
        IO.println("Total de meses: " + periodo.toTotalMonths());

        //De esta forma no podemos saber el total de días
        IO.println("Total días " + ChronoUnit.DAYS.between(ahora, pasadoManana));
        IO.println("Total HORAS " + (ChronoUnit.DAYS.between(ahora, pasadoManana) * 24));

        //PARA SACAR TOTALES ENTRE MOMENTOS USAMOS LA CLASE ChronoUnit

    }
}
