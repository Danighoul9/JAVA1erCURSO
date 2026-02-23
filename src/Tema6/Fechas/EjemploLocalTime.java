package Tema6.Fechas;


import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class EjemploLocalTime {
    static void main() {

        //Crea objeto hora con la hora 12:30
        LocalTime hora = LocalTime.of(16, 30, 15, 1111);
        IO.println(hora);

        //Crea objeto hora con la hora actual
        hora = LocalTime.now();
        IO.println(hora);

        //Getter
        IO.println("Hora: " + hora.getHour());
        IO.println("Minutos: " + hora.getMinute());
        IO.println("Segundos: " + hora.getSecond());
        IO.println("Nanosegundos: " + hora.getNano());

        //Modificar una hora/minutos/segundos with,plus,minus
        hora = hora.plusHours(2);
        IO.println(hora);
        hora = hora.minusMinutes(30)
                .withSecond(10)
                .plusHours(2);
        IO.println(hora);

        //Pintar con otro formato
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH.mm.ss");
        IO.println(hora.format(formatter));



    }
}