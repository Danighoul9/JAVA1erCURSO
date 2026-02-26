package Tema6.PracticaTema6;

import Tema6.PracticaTema6.Entidades.*;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {

    private static final DateTimeFormatter FORMATO_FECHA = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public static void main(String[] args) {
        Agencia agencia = new Agencia();
        precargarCoches(agencia);

        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            mostrarMenu();
            try {
                System.out.print("Elige una opción: ");
                opcion = sc.nextInt();
                sc.nextLine(); // limpiar buffer
            } catch (InputMismatchException e) {
                System.out.println("Debes introducir un número.");
                sc.nextLine();
                opcion = -1;
            }

            switch (opcion) {
                case 1 -> agencia.listarCochesDisponibles();
                case 2 -> agencia.listarAlquileresActivos();
                case 3 -> realizarAlquiler(sc, agencia);
                case 4 -> mostrarIngresosTotales(agencia);
                case 5 -> System.out.println("Saliendo del programa...");
                default -> System.out.println("Opción no válida.");
            }

        } while (opcion != 5);

        sc.close();
    }

    private static void mostrarMenu() {
        System.out.println("\n--- Menú Agencia de Alquiler ---");
        System.out.println("1. Listar Coches disponibles");
        System.out.println("2. Listar Alquileres activos");
        System.out.println("3. Realizar alquiler");
        System.out.println("4. Mostrar ingresos totales");
        System.out.println("5. Salir");
    }

    private static void precargarCoches(Agencia agencia) {
        agencia.addCoche(new CocheEstandar("Toyota", "Corolla", "1111AAA", 2020,
                TipoCombustible.GASOLINA, TipoCoche.SEDAN, 40.0, true));
        agencia.addCoche(new CocheEstandar("Honda", "Civic", "2222BBB", 2019,
                TipoCombustible.DIESEL, TipoCoche.SEDAN, 38.0, false));
        agencia.addCoche(new CocheEstandar("Nissan", "Qashqai", "3333CCC", 2021,
                TipoCombustible.GASOLINA, TipoCoche.SUV, 55.0, true));
        agencia.addCoche(new CocheEstandar("Kia", "Sportage", "4444DDD", 2022,
                TipoCombustible.HIBRIDO, TipoCoche.SUV, 60.0, true));
        agencia.addCoche(new CocheEstandar("Seat", "León", "5555EEE", 2018,
                TipoCombustible.DIESEL, TipoCoche.SEDAN, 35.0, false));

        agencia.addCoche(new CochePremium("BMW", "Serie 3", "6666FFF", 2022,
                TipoCombustible.GASOLINA, TipoCoche.DEPORTIVO, 90.0, true, true));
        agencia.addCoche(new CochePremium("Audi", "A4", "7777GGG", 2021,
                TipoCombustible.DIESEL, TipoCoche.DEPORTIVO, 85.0, true, false));
        agencia.addCoche(new CochePremium("Mercedes", "Clase C", "8888HHH", 2020,
                TipoCombustible.GASOLINA, TipoCoche.DEPORTIVO, 95.0, false, true));
        agencia.addCoche(new CochePremium("Volkswagen", "Transporter", "9999III", 2019,
                TipoCombustible.DIESEL, TipoCoche.FURGONETA, 70.0, true, true));
        agencia.addCoche(new CochePremium("Ford", "Transit", "1010JJJ", 2018,
                TipoCombustible.DIESEL, TipoCoche.FURGONETA, 65.0, false, false));

        // Añadimos algunos duplicados con variaciones para llegar a 20
        agencia.addCoche(new CocheEstandar("Renault", "Mégane", "1212LLL", 2020,
                TipoCombustible.GASOLINA, TipoCoche.SEDAN, 39.0, true));
        agencia.addCoche(new CocheEstandar("Peugeot", "3008", "1313MMM", 2021,
                TipoCombustible.DIESEL, TipoCoche.SUV, 58.0, true));
        agencia.addCoche(new CocheEstandar("Hyundai", "Tucson", "1414NNN", 2022,
                TipoCombustible.HIBRIDO, TipoCoche.SUV, 62.0, true));
        agencia.addCoche(new CocheEstandar("Citroën", "C4", "1515OOO", 2019,
                TipoCombustible.GASOLINA, TipoCoche.SEDAN, 37.0, false));
        agencia.addCoche(new CocheEstandar("Opel", "Astra", "1616PPP", 2018,
                TipoCombustible.DIESEL, TipoCoche.SEDAN, 34.0, false));

        agencia.addCoche(new CochePremium("Tesla", "Model S", "1717QQQ", 2022,
                TipoCombustible.ELECTRICO, TipoCoche.DEPORTIVO, 120.0, true, true));
        agencia.addCoche(new CochePremium("Fiat", "Ducato", "1818RRR", 2020,
                TipoCombustible.DIESEL, TipoCoche.FURGONETA, 68.0, false, true));
        agencia.addCoche(new CochePremium("Volkswagen", "Caravelle", "1919SSS", 2021,
                TipoCombustible.DIESEL, TipoCoche.FURGONETA, 72.0, true, false));
        agencia.addCoche(new CochePremium("Porsche", "911", "2020TTT", 2022,
                TipoCombustible.GASOLINA, TipoCoche.DEPORTIVO, 150.0, true, true));
    }

    private static void realizarAlquiler(Scanner sc, Agencia agencia) {
        try {
            System.out.println("Datos del cliente:");
            System.out.print("Nombre: ");
            String nombre = sc.nextLine();
            System.out.print("Apellidos: ");
            String apellidos = sc.nextLine();
            System.out.print("DNI: ");
            String dni = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.nextLine();
            System.out.print("Dirección: ");
            String direccion = sc.nextLine();
            System.out.print("Teléfono: ");
            String telefono = sc.nextLine();
            System.out.print("Licencia de conducir: ");
            String licencia = sc.nextLine();
            System.out.print("Fecha de obtención de licencia (dd/MM/yyyy): ");
            LocalDate fechaLicencia = leerFecha(sc);

            Cliente cliente = new Cliente(nombre, apellidos, dni, email, direccion,
                    telefono, licencia, fechaLicencia);

            System.out.println("Tipo de coche deseado (SEDAN, SUV, FURGONETA, DEPORTIVO): ");
            String tipoStr = sc.nextLine().trim().toUpperCase();
            TipoCoche tipo = TipoCoche.valueOf(tipoStr);

            System.out.print("Fecha de inicio del alquiler (dd/MM/yyyy): ");
            LocalDate fechaInicio = leerFecha(sc);
            System.out.print("Fecha de fin del alquiler (dd/MM/yyyy): ");
            LocalDate fechaFin = leerFecha(sc);

            boolean exito = agencia.realizarAlquiler(cliente, tipo, fechaInicio, fechaFin);
            if (!exito) {
                System.out.println("No se pudo realizar el alquiler.");
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Error en los datos introducidos: " + e.getMessage());
        }
    }

    private static LocalDate leerFecha(Scanner sc) {
        while (true) {
            String entrada = sc.nextLine();
            try {
                return LocalDate.parse(entrada, FORMATO_FECHA);
            } catch (DateTimeParseException e) {
                System.out.print("Formato de fecha inválido. Usa dd/MM/yyyy: ");
            }
        }
    }

    private static void mostrarIngresosTotales(Agencia agencia) {
        LocalDate hoy = LocalDate.now();
        double total = 0.0;
        for (Alquiler a : agencia.getAlquileres()) {
            if (a.getFechaFin().isBefore(hoy)) {
                total += a.getPrecioTotal();
            }
        }
        System.out.println("Ingresos totales por alquileres completados: " + total + " €");
    }
}

