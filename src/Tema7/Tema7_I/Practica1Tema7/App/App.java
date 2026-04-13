package Tema7.Tema7_I.Practica1Tema7.App;


import Tema7.Tema7_I.Practica1Tema7.Entities.*;
import Tema7.Tema7_I.Practica1Tema7.Services.*;

import java.time.LocalDate;
import java.time.LocalTime;

public class App {

     static void main(String[] args) {

        // 1. Crea el gimnasio "FitZone Murcia" con su dirección, teléfono y email.
        Gimnasio gym = new Gimnasio("FitZone Murcia", "C/ A k no me encuentras", "666111623",
                "fitfitgenerations@gmail.com"
        );

        // 2. Añade 6 socios con distintos tipos de cuota (BASICA, PREMIUM, FAMILIAR).
        gym.addSocio(new Socio("27399714p", "Juanjo", "Parlopo", "juanyo@gmail.com",
                "619874556", LocalDate.now(), Cuota.BASICA));

        gym.addSocio(new Socio("27039814y", "Marieta", "Lojanmilla", "mariaet@gmail.com",
                "699023466", LocalDate.now(), Cuota.PREMIUM));

        gym.addSocio(new Socio("21877654l", "Pedro", "Picapiedra", "pedro@gmail.com",
                "677453622", LocalDate.now(), Cuota.FAMILIAR));

        gym.addSocio(new Socio("29766412m", "Estefania", "Tetris", "estefaniaTT@gmail.com",
                "678922113", LocalDate.now(), Cuota.BASICA));

        gym.addSocio(new Socio("23784134s", "Mark", "Evans", "porteroD´Oro@gmail.com",
                "722345556", LocalDate.now(), Cuota.PREMIUM));

        gym.addSocio(new Socio("26544739k", "Axel", "Blaze", "goleadorDeFuego@gmail.com",
                "688924534", LocalDate.now(), Cuota.FAMILIAR));


        // 3. Añade 8 actividades variadas con distintos días, horas y aforos.
        // Incluye alguna actividad con aforo reducido (2 o 3 plazas) para poder probar la restricción de aforo.
         gym.addActividad(new Actividad("1", "Yoga Vinyasa", "Movilidad y respiración",
                 diaSemana.LUNES, LocalTime.of(9, 0), 60, 3, "Laura Méndez"));

         gym.addActividad(new Actividad("2", "Cycling Intenso", "Bici indoor alta intensidad",
                 diaSemana.MARTES, LocalTime.of(18, 0), 45, 10, "Carlos Navarro"));

         gym.addActividad(new Actividad("3", "Pilates Suelo", "Core y postura",
                 diaSemana.MIERCOLES, LocalTime.of(10, 0), 50, 2, "Marta Ríos"));

         gym.addActividad(new Actividad("4", "Cross Training", "Fuerza funcional",
                 diaSemana.JUEVES, LocalTime.of(19, 0), 60, 8, "Javier Ortega"));

         gym.addActividad(new Actividad("5", "Zumba Dance", "Cardio con baile",
                 diaSemana.VIERNES, LocalTime.of(17, 30), 60, 15, "Sofía Herrera"));

         gym.addActividad(new Actividad("6", "AquaGym", "Ejercicio en piscina",
                 diaSemana.SABADO, LocalTime.of(10, 0), 60, 6, "Daniel Cruz"));

         gym.addActividad(new Actividad("7", "Boxeo Técnico", "Golpeo y defensa",
                 diaSemana.LUNES, LocalTime.of(20, 0), 60, 3, "Iván Morales"));

         gym.addActividad(new Actividad("8", "Mindfulness", "Relajación y meditación guiada",
                 diaSemana.DOMINGO, LocalTime.of(11, 0), 30, 12, "Elena Vargas"));

        // 4. Realiza reservas de actividades para los distintos socios. Intenta reservar una
        // actividad llena para que salte la restricción de aforo y se muestre un mensaje informativo.
        IO.println("||----------------------- RESERVAS ------------------------------||");
        IO.println("||-----------------------------------------------------------------||");
        gym.reservarActividad("27399714p", "1");
        IO.println("||-----------------------------------------------------------------||");
        gym.reservarActividad("27039814y", "1");
        IO.println("||-----------------------------------------------------------------||");
        gym.reservarActividad("21877654l", "1");
        IO.println("||-----------------------------------------------------------------||");
        gym.reservarActividad("27399714p", "2");
        IO.println("||-----------------------------------------------------------------||");
        gym.reservarActividad("27039814y", "2");
        IO.println("||-----------------------------------------------------------------||");
        gym.reservarActividad("21877654l", "3");
        IO.println("||-----------------------------------------------------------------||");
        gym.reservarActividad("29766412m", "3");
        IO.println("||-----------------------------------------------------------------||");
        gym.reservarActividad("23784134s", "4");
        IO.println("||-----------------------------------------------------------------||");
        gym.reservarActividad("26544739k", "5");
        IO.println("||---------------------------------------------------------------||");
        IO.println("||---------------RESERVA CON AFORO AL MÁXIMO---------------------||");
        gym.reservarActividad("27399714p", "3");

        // 5. Confirma la asistencia de al menos dos reservas usando confirmarAsistencia().
        IO.println("||------------------- Confirmas asistencia ----------------------||");
        //Sera una chorrada pero no tengo ni idea de como hacerlo tenia una idea más o menos haciendo un booleano
        // y luego buscando en reservas haciendo un equals y comprobar con el metodo de confirmar asistencia pero no me
        // sale :(

        // 6. Cancela alguna reserva con cancelarReserva().
        IO.println("||------------------- Cancelar reserva ----------------------||");
        gym.cancelarReserva("27399714p", "2");
        // 7. Actividades de un socio
        IO.println("||------------------- Actividades de Juanjo ----------------------||");
        IO.println(gym.getActividadesSocio("27399714p"));

        // 8. Actividades llenas
        IO.println("||------------------- Actividades LLENAS ----------------------||");
        IO.println(gym.getActividadesLlenas());

        // 9. Ranking socios
        IO.println("||------------------- Ranking socios ----------------------||");
        IO.println(gym.getRankingSocios());

        // 10. Reservas por fecha
        IO.println("||------------------- Reservas por fecha ----------------------||");
        IO.println(gym.getReservasOrdenadasPorFecha());

        // 11. Reservas por actividad
        IO.println("||------------------- Reservas por actividad ----------------------||");
        IO.println(gym.getReservasOrdenadasPorActividad());

        // 12. Reservas por socio y fecha
        IO.println("||------------------- Reservas por socio y fecha ----------------------||");
        IO.println(gym.getReservasOrdenadasPorSocioYFecha());

        // 13. Reservas por duración
        IO.println("||------------------- Reservas por duración ----------------------||");
        IO.println(gym.getReservasOrdenadasPorDuracion());

        // 14. Reservas futuras
        IO.println("||------------------- Reservas activas (futuras) ----------------------||");
        IO.println(gym.getReservasPendientesOrdenadasPorFecha());
    }
}