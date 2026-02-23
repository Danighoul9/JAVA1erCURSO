package Tema6.Fechas;


import java.time.Duration;
import java.time.Instant;
import java.time.LocalTime;
import java.util.ArrayList;

public class IntervalosHoras {
    static void main() {

        Instant instante = Instant.ofEpochSecond(1000000000l);
        IO.println(instante);

        Instant ahora = Instant.now();
        IO.println(ahora);

        //Calcula el tiempo transcurrido al ejecutar un código
        Instant a1 = Instant.now();
        ArrayList<Long> numeros = new ArrayList<>();
        for(long i=0; i < 100000000L; i++) {
            numeros.add(i);
        }
        Instant a2 = Instant.now();

        //Para conocer el tiempo transcurrido entre horas hay dos formas:

        //1. Restando milisengundos
        long tiempoTranscurrido = a2.toEpochMilli() - a1.toEpochMilli();
        IO.println(tiempoTranscurrido);

        //2. Usando la clase Duration
        Duration duracion = Duration.between(a1, a2);
        IO.println(duracion);

        //Ejemplo de duración con más de una hora
        LocalTime h1 = LocalTime.now();
        LocalTime h2 = LocalTime.now()
                .plusHours(10)
                .plusMinutes(10);

        Duration duracionHora = Duration.between(h1, h2);
        IO.println(duracionHora);
        IO.println(duracionHora.toHours()); //El total de horas de la duración
        IO.println(duracionHora.toMinutes()); //El total de minutos de la duración









    }
}
