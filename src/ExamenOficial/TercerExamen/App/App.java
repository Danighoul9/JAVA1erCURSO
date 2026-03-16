package ExamenOficial.TercerExamen.App;

import ExamenOficial.TercerExamen.Entidades.*;
import ExamenOficial.TercerExamen.Servicio.Clinica;

import java.time.LocalDate;

public class App {
    public static void llamarMenu(){
        IO.println("¿Que deseas hacer?\n" +
                    "1. Listar animales registrados\n" +
                    "2. Buscar propietario por DNI\n" +
                    "3. Registrar consulta\n" +
                    "4. Ver consultas de un animal\n" +
                    "5. Ver consultas de hoy\n" +
                    "6. Calcular ingresos totales\n" +
                    "7. Salir");
    }

    /**
     * Metodo de precargar los 8 animales para que el main no tenga tanto código.
     */
    public static void precargarAnimales(Clinica c, Propietario p1, Propietario p2, Propietario p3, Propietario p4){

        //Animales Domesticos
        c.addAnimal(new AnimalDoméstico("Princesa", TipoAnimal.GATO,"Mixta",
                LocalDate.of(2009,10,20),5.5,p1,true,true));
        c.addAnimal(new AnimalDoméstico("Rufus", TipoAnimal.PERRO,"Pitbull",
                LocalDate.of(2001,2,26),25.2,p3,false,true));
        c.addAnimal(new AnimalDoméstico("Carolina", TipoAnimal.AVE,"Loro premium",
                LocalDate.of(2006,3,24),7.5,p1,false,false));
        c.addAnimal(new AnimalDoméstico("Terry", TipoAnimal.PERRO,"Pastor Alemán",
                LocalDate.of(2019,2,10),30.5,p4,true,true));

        //Animales Exóticos
        c.addAnimal(new AnimalExotico("Cerdo Vietnamita", TipoAnimal.EXOTICO,"Asfurmus",
                LocalDate.of(1999,1,1),85.2,p4,"Canadá",true));
        c.addAnimal(new AnimalExotico("Perola", TipoAnimal.REPTIL,"Tortuga Marina",
                LocalDate.of(2004,6,15),3.4,p2,"España",false));
        c.addAnimal(new AnimalExotico("Carson", TipoAnimal.GATO,"Gato Egipcio",
                LocalDate.of(2016,7,12),4.7,p3,"Canadá",true));
        c.addAnimal(new AnimalExotico("Jolteon", TipoAnimal.PERRO,"Husky",
                LocalDate.of(2019,11,29),25.0,p1,"Rusia",false));

    }

    static void main(String[] args) {
        //Creamos la clinica
        Clinica c = new Clinica("Clinica DoggiCat");

        //Creamos los propietarios
        Propietario p1 = new Propietario("Daniel","Diaz Campoy","23335437M","danielddc270606@gmail.com",
                "677 17 19 21", "Guazamara C/Constitución n16");
        Propietario p2 = new Propietario("Mirian","Gonzalez Rodriguez","25679845D","miiriangrr@gmail.com",
                "611 45 78 32", "Cuevas del Almanzora C/Lola Bernal n12");
        Propietario p3 =new Propietario("Hugo","Cayuela Egea","29044742H","hcayege742@gmail.com",
                "611 99 03 45", "Guazamara Los Guiraos C/Aquenomencuentras n9");
        Propietario p4 = new Propietario("Eustabio","Parra Jimenez","25788490E","eustabio99@gmail.com",
                "609 89 22 34", " Murcia C/Guijón n3");

        //Añadimos los propietarios
        c.addPropietario(p1);
        c.addPropietario(p2);
        c.addPropietario(p3);
        c.addPropietario(p4);

        //Precargamos los animales ya hechos anteriormente
        precargarAnimales(c,p1,p2,p3,p4);

        int opcion = 0;
        do {
            llamarMenu();
            try {
                opcion = Integer.parseInt(IO.readln());
                if (opcion < 1 || opcion > 7){
                    IO.println("ERROR: Introduce un numero dentro del rango");
                }
                switch (opcion) {
                    case 1 -> c.listarAnimales();
                    case 2 -> {
                        IO.println("Introduzca DNI del propietario");
                        String dniProp = IO.readln();
                        IO.println(c.buscarPropietarioPorDni(dniProp));
                    }
                    case 3 -> {
                        IO.println("Introduce ID de un animal");
                        Long idAnimal = Long.valueOf(IO.readln());
                        IO.println("Introduce el nombre del veterinario");
                        String  nomVet = IO.readln();
                        IO.println("Introduce el tipo de consulta |-REVISION-| |-VACUNA-| |-CIRUGIA-| |-URGENCIA-|");
                        TipoConsulta tipo = TipoConsulta.valueOf(IO.readln().toUpperCase());
                        IO.println("Introduce el diagnóstico");
                        String diag = IO.readln();
                        IO.println("Introduce el tratamiento");
                        String trat = IO.readln();
                        IO.println("Consulta registrada: " + c.registrarConsulta(idAnimal,nomVet,LocalDate.now(),tipo,diag,trat));
                    }
                    case 4 ->{
                        IO.println("Introduce ID de un animal");
                        Long idAnimal = Long.valueOf(IO.readln());
                        IO.println(c.buscarConsultasPorAnimal(idAnimal));
                    }
                    case 5 -> c.listarConsultasDeHoy();
                    case 6 -> IO.println("Los ingresos totales de la clinica son " + c.calcularIngresosTotales() + "€.");
                    case 7 -> IO.println("GRACIAS POR USAR NUESTRO PROGRAMA");
                }
            } catch (Exception e) {
                IO.println("ERROR: " + e.getMessage());
            }

        } while (opcion != 7);
    }
}
