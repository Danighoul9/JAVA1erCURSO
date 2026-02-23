package Tema6.Fechas;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class ComparacionFechas {

    static void main() {

        //Comparación fechas: isAfter, isBefore, isEqual
        LocalDateTime fecha = LocalDateTime.now().plusDays(1);

        IO.println("Mañana es posterior a hoy " + fecha.isAfter(LocalDateTime.now()));

        IO.println("Hoy es anterior a dentro de tres días " +
                (LocalDate.now()).isBefore(LocalDate.now().plusDays(3)));


    }
}