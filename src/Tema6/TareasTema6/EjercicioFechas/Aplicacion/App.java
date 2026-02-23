package Tema6.TareasTema6.EjercicioFechas.Aplicacion;

import Tema6.TareasTema6.EjercicioFechas.Entidades.Examen;
import Tema6.TareasTema6.EjercicioFechas.Entidades.Curso;
import Tema6.TareasTema6.EjercicioFechas.Entidades.Sesion;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class App {

    /**
     * Parte 4: Programa principal
     * En la clase Main, crea:
     *
     * Un curso que dure desde el 1 de septiembre de 2025 hasta el 30 de junio de 2026
     * Tres sesiones de clase: 9:00-11:00, 11:30-13:30, 15:00-17:00
     * Dos exámenes: uno el 15 de diciembre de 2025 a las 10:00 y otro el 15 de junio de 2026 a las 16:00
     * Muestra por pantalla:
     *
     * Duración total del curso
     * Duración de cada sesión
     * Tiempo de descanso entre sesiones
     * Tiempo que falta/ha pasado para cada examen
     * Requisitos
     * Utiliza LocalDate.of(), LocalTime.of() y LocalDateTime.of() para crear las fechas
     * Usa LocalDate.now(), LocalTime.now() y LocalDateTime.now() cuando necesites la fecha/hora actual
     * Utiliza Period.between() para calcular diferencias entre fechas
     * Utiliza Duration.between() para calcular diferencias entre tiempos u horas
     * Formatea las salidas de manera clara y legible
     */

    static void main(String[] args) {
// Parte 1: Curso ------------
        // Un curso que dure desde el 1 de septiembre de 2025 hasta el 30 de junio de 2026
        Curso c1 = new Curso("IA para principiantes",
                LocalDate.of(2025, 9, 1),
                LocalDate.of(2026, 6, 30));

        IO.println("--- INFORMACIÓN DEL CURSO ---");
        IO.println("Curso: " + c1.getNombre());
        IO.println("Duración total del curso (Period): " + c1.duracion());
        IO.println("Total de días (ChronoUnit): " + c1.totalDias());
        IO.println("Días desde el inicio (a hoy): " + c1.diasDesdeInicio());
        IO.println("¿Está activo hoy?: " + c1.estaActivo());


        // Parte 2: Sesiones ------------
        // Tres sesiones de clase: 9:00-11:00, 11:30-13:30, 15:00-17:00
        Sesion s1 = new Sesion(LocalTime.of(9, 0),
                LocalTime.of(11, 0));
        Sesion s2 = new Sesion(LocalTime.of(11, 30),
                LocalTime.of(13, 30));
        Sesion s3 = new Sesion(LocalTime.of(15, 0),
                LocalTime.of(17, 0));

        IO.println();
        IO.println("--- DURACIÓN DE CADA SESIÓN ---");
        IO.println("Sesión 1: " + s1.duracion().toMinutes() + " minutos");
        IO.println("Sesión 2: " + s2.duracion().toMinutes() + " minutos");
        IO.println("Sesión 3: " + s3.duracion().toMinutes() + " minutos");

        IO.println();
        IO.println("--- TIEMPO DE DESCANSO ENTRE SESIONES ---");
        IO.println("Descanso entre s1 y s2: " + s1.tiempoDescanso(s2).toMinutes() + " minutos");
        IO.println("Descanso entre s2 y s3: " + s2.tiempoDescanso(s3).toMinutes() + " minutos");

        IO.println();
        IO.println("--- COMPROBACIÓN DE SOLAPAMIENTO ---");
        IO.println("¿Se solapan s1 y s3?: " + (s1.estanSolapadas(s3)));
        Sesion s4 = new Sesion(LocalTime.of(10, 30), LocalTime.of(12, 0));
        IO.println("¿Se solapan s1 y s4?: " + (s1.estanSolapadas(s4)));

        // Parte 3: Examenes ------------
        // uno el 15 de diciembre de 2025 a las 10:00
        // y otro el 15 de junio de 2026 a las 16:00
        Examen ex1 = new Examen("Machine Learning Supervisado",
                LocalDateTime.of(2025, 12, 15, 10, 0));
        Examen ex2 = new Examen("Machine Learning No Supervisado",
                LocalDateTime.of(2026, 6, 15, 16, 0));

        IO.println();
        IO.println("--- INFORMACIÓN DE LOS EXÁMENES ---");
        IO.println("Examen 1: " + ex1.getNombre());
        IO.println("Fecha y hora: " + ex1.getFechaHora());
        IO.println("¿Ha pasado el examen 1?: " + ex1.haPasado());
        IO.println("Tiempo relativo al examen 1: " + ex1.tiempoRelativo().toDays() + " días " +
                ex1.tiempoRelativo().toHoursPart() + " horas " +
                ex1.tiempoRelativo().toMinutesPart() + " minutos");

        IO.println();
        IO.println("Examen 2: " + ex2.getNombre());
        IO.println("Fecha y hora: " + ex2.getFechaHora());
        IO.println("¿Ha pasado el examen 2?: " + (ex2.haPasado() ? "Sí" : "No"));
        IO.println("Tiempo relativo al examen 2: " + ex2.tiempoRelativo().toDays() + " días " +
                ex2.tiempoRelativo().toHoursPart() + " horas " +
                ex2.tiempoRelativo().toMinutesPart() + " minutos");

        IO.println(Utils.esFinDeSemana(LocalDate.of(2026, 2, 14)));


    }
}
