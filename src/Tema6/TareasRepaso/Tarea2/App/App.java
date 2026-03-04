package Tema6.TareasRepaso.Tarea2.App;

import Tema6.TareasRepaso.Tarea2.Entidades.CategoriaPlan;
import Tema6.TareasRepaso.Tarea2.Entidades.Participante;
import Tema6.TareasRepaso.Tarea2.Entidades.PlanEstandar;
import Tema6.TareasRepaso.Tarea2.Entidades.TipoVoto;
import Tema6.TareasRepaso.Tarea2.Servicios.GrupoPlanes;

import java.time.LocalDate;
import java.util.InputMismatchException;
import java.util.Scanner;

public class App {

    public static void llamarMenu(){
        IO.println("1. Listar todos los planes\n" +
                   "2. Listar planes por categoría\n" +
                   "3. Votar un plan\n" +
                   "4. Ver resultado de votación de un plan\n" +
                   "5. Ver plan ganador actual\n" +
                   "6. Cerrar votación y elegir ganador\n" +
                   "7. Salir");
    }
    public static void precargarPlanes(GrupoPlanes gp, Participante p1, Participante p2, Participante p3 ,
                                       Participante p4){
        gp.addPlan(new PlanEstandar(
                "Escapada rural",
                "Fin de semana en casa rural con barbacoa.",
                CategoriaPlan.VIAJE,
                LocalDate.of(2026, 3, 10),
                LocalDate.of(2026, 3, 20),
                300.0,
                p1,
                6,
                true
        ));

        gp.addPlan(new PlanEstandar(
                "Cena japonesa",
                "Reserva en restaurante japonés premium.",
                CategoriaPlan.GASTRONOMIA,
                LocalDate.of(2026, 3, 12),
                LocalDate.of(2026, 3, 25),
                150.0,
                p2,
                4,
                false
        ));

        gp.addPlan(new PlanEstandar(
                "Partido de fútbol",
                "Entrada para ver partido en el estadio.",
                CategoriaPlan.DEPORTE,
                LocalDate.of(2026, 3, 15),
                LocalDate.of(2026, 4, 1),
                80.0,
                p3,
                8,
                false
        ));

        gp.addPlan(new PlanEstandar(
                "Ruta senderismo",
                "Ruta de montaña con picnic incluido.",
                CategoriaPlan.DEPORTE,
                LocalDate.of(2026, 4, 1),
                LocalDate.of(2026, 4, 15),
                0.0,
                p4,
                10,
                false
        ));

        gp.addPlan(new PlanEstandar(
                "Viaje a Roma",
                "Escapada cultural de 3 días.",
                CategoriaPlan.VIAJE,
                LocalDate.of(2026, 5, 1),
                LocalDate.of(2026, 6, 1),
                700.0,
                p1,
                5,
                true
        ));

        gp.addPlan(new PlanEstandar(
                "Taller de cocina",
                "Aprender a hacer sushi desde cero.",
                CategoriaPlan.OTRO,
                LocalDate.of(2026, 4, 5),
                LocalDate.of(2026, 4, 25),
                60.0,
                p2,
                12,
                false
        ));
    }
    static void main(String[] args) {

        GrupoPlanes gp = new GrupoPlanes("Vacaciones de chill");

        //Participantes
        Participante p1 = new Participante("Daniel","Diaz Campoy", "danielddc270606@gmail.com","Dani");
        Participante p2 = new Participante("Mirian","Gonzalez Rodriguez", "miiriangrr@gmail.com","Miri");
        Participante p3 = new Participante("Hugo","Cayuela Egea", "delcampopakito@gmail.com","Hugo");
        Participante p4 = new Participante("Jose","Asensio Parra", "dipsy@gmail.com","Ñose");

        gp.addParticipante(p1);
        gp.addParticipante(p2);
        gp.addParticipante(p3);
        gp.addParticipante(p4);

        //Cargar planes
        precargarPlanes(gp,p1,p2,p3,p4);
        int opcion = -1;
        do {
            try {
                llamarMenu();

                try {
                    System.out.print("Elige una opción: ");
                    opcion = Integer.parseInt(IO.readln());
                } catch (InputMismatchException e) {
                    System.out.println("Debes introducir un número.");
                    opcion = -1;
                }

                switch (opcion) {

                    case 1 -> gp.listarPlanes();

                    case 2 -> {
                        System.out.println("Introduce categoría:");
                        for (CategoriaPlan c : CategoriaPlan.values()) {
                            System.out.println("- " + c);
                        }
                        try {
                            CategoriaPlan cat = CategoriaPlan.valueOf(IO.readln().toUpperCase());
                            gp.listarPlanesPorCategoria(cat);
                        } catch (IllegalArgumentException e) {
                            System.out.println("Categoría no válida.");
                        }
                    }

                    case 3 -> {
                        System.out.print("ID del plan: ");
                        long idPlan = Long.parseLong(IO.readln());

                        System.out.print("Email participante: ");
                        String email = IO.readln();

                        System.out.println("Tipo voto (POSITIVO, NEGATIVO, NEUTRO): ");
                        TipoVoto tipo = TipoVoto.valueOf(IO.readln().toUpperCase());

                        System.out.print("Comentario (opcional): ");
                        String comentario = IO.readln();

                        gp.registrarVoto(idPlan, email, tipo, comentario);
                    }

                    case 4 -> {
                        System.out.print("ID del plan: ");
                        long idResultado = Long.parseLong(IO.readln());
                        gp.getResultadoVotacion(idResultado);
                    }

                    case 5 -> gp.getPlanGanador();

                    case 6 -> {
                        System.out.print("¿Estás seguro? (1.Si / 2.No): ");
                        int confirmacion = Integer.parseInt(IO.readln());
                        if (confirmacion == 1) {
                            gp.cerrarVotacionYElegirGanador();
                        } else {
                            IO.println("La votación continua");
                        }
                    }

                    case 7 ->System.out.println("GRACIAS POR USAR NUESTRO PROGRAMA");

                    default -> System.out.println("Opción no válida.");
                }

            } catch (NumberFormatException e) {
                System.out.println("Entrada numérica inválida.");
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }

        } while (opcion != 7);
    }

}
