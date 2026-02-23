package Tema6.Fechas;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class EjemploFormater {
    static void main() {

        //Leer de teclado una hora con formato HH-mm
        DateTimeFormatter formatoHora = DateTimeFormatter.ofPattern("HH-mm");
        String hora = IO.readln();

        //Convertimos String a LocalTime, si no cumple el formato petardazo
        try {
            LocalTime horaTeclado = LocalTime.parse(hora, formatoHora);
            IO.println(horaTeclado);
        } catch (Exception exc) {
            IO.println(exc.getMessage());
        }

        //Leer de teclado una fecha con formato dd/MM/yyyy
        DateTimeFormatter formatoFecha = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String fecha = IO.readln();

        try {
            //Parsea el mes del 1 al 31, si el mes correspondiente tiene 30
            //y pones 31, te lo convierte automáticamente
            LocalDate fechaTeclado = LocalDate.parse(fecha, formatoFecha);
            IO.println(fechaTeclado);
        } catch (Exception exc) {
            IO.println(exc.getMessage());
        }


        //Pintar con otro formateador
        LocalDateTime ahora = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MM -> HH:mm");
        IO.println(ahora.format(formatter));

        //Fecha íntegra en español
        DateTimeFormatter formatter2 = DateTimeFormatter
                .ofPattern("EEEE, dd 'de' MMMM yyyy",
                        Locale.of("es", "ES"));
        IO.println(ahora.format(formatter2));

        //Fecha íntegra en inglés
        DateTimeFormatter formatter3 = DateTimeFormatter
                .ofPattern("yyyy MMMM EEEE",
                        Locale.of("de", "DE"));
        IO.println(ahora.format(formatter3));

    }
}