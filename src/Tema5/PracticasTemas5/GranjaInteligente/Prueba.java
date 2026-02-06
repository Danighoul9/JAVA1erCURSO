package Tema5.PracticasTemas5.GranjaInteligente;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Prueba {
    public static void llamarmenu(){
        IO.println("1. Imprimir datos de la granja");
        IO.println("2. Añadir una máquina (se piden sus datos)");
        IO.println("3. Añadir horas de operación máquina (se pide id maquina y horas trabajadas)");
        IO.println("4. Calcular el total de horas de operación");
        IO.println("5. Listar todas las máquinas");
        IO.println("6. Salir");
    }
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        /**
         * En una clase de prueba, en un método main:
         * Crear una granja.
         * Añadir máquinas de distintos tipos a la granja.
         * Permitir al usuario interactuar con un menú que incluya las siguientes opciones:
         * 1. Imprimir datos de la granja
         * 2. Añadir una máquina (se piden sus datos)
         * 3. Añadir horas de operación máquina (se pide id maquina y horas trabajadas)
         * 4. Calcular el total de horas de operación
         * 5. Listar todas las máquinas
         * 6. Salir
         */

        //Creamos la granja
        Granja ranchoDeJuan = new Granja("Rancho-Juan", "Pileta de Ubeda");
        //Creamos 3 distintas maquinas
        Maquina dron4k = new DronRiego("Dron 4K Full Resolution", 2, 12, 10, 25);
        Maquina tractorMini = new TractorAutonomo("Tractor mini", 1, 54, 5, 35);
        Maquina cosechadoraMonster = new CosechadoraAutonoma("Cosechadora Big A46", 0, 234, 120, 6);

        //Añadimos las maquinas a la granja
        ranchoDeJuan.addMaquina(dron4k);
        ranchoDeJuan.addMaquina(tractorMini);
        ranchoDeJuan.addMaquina(cosechadoraMonster);


        int respuesta = -1;
        do {
            llamarmenu();
            do {
                //Hago un try/catch para controlar las respuestas incorrectas como palabras
                try {
                    IO.println("¿Que deseas hacer?");
                    respuesta = sc.nextInt();
                } catch (InputMismatchException exc) {
                    sc = new Scanner(System.in); //Para volver a pedir datos
                    respuesta = -1;

                }
            }while (respuesta < 1 || respuesta > 6) ;

                switch (respuesta) {
                    //1. Imprimir datos de la granja
                    case 1 -> ranchoDeJuan.imprimirDatosGranja();

                    //2. Añadir una máquina (se piden sus datos)
                    case 2 -> {
                        sc.nextLine();
                        IO.println("Dime el modelo de la máquina: ");
                        String machModel = sc.nextLine();

                        IO.println("Dime el estado de la máquina (0-APAGADA 1-ENCENDIDA 2-MANTENIMIENTO: ");
                        Integer machStatus = sc.nextInt();

                        IO.println("¿Cuantas horas de uso tiene la maquina?");
                        float machHours = sc.nextFloat();

                        IO.println("¿Que tipo de maquina es? (1-Dron de Riego 2-Cosechadora 3-Tractor)");
                        int machType = sc.nextInt();
                        switch (machType) {

                            //Si el jugador quisiera añadir un DRON DE RIEGO usariamos este caso
                            case 1 -> {
                                //Atributos propos del DRON
                                IO.println("Dado que tu maquina es un DRON te pediremos la informacion" +
                                        "de tu maquina basada en ese tipo concreto");
                                IO.println("¿Capacidad del tanque de agua o sustancia?");
                                Integer machCapacity = sc.nextInt();

                                IO.println("¿Distancia máxima de vuelo?");
                                float machMet = sc.nextFloat();

                                //Creamo la maquina con los datos especificos de la maquina
                                Maquina machineNew = new DronRiego(machModel, machStatus, machHours, machCapacity, machMet);
                                ranchoDeJuan.addMaquina(machineNew);
                                IO.println(machineNew + " ha sido añadido con exito al grupo de maquinas de la granja!");
                            }

                            //Si el jugador quisiera añadir una COSECHADORA usariamos este caso
                            case 2 -> {
                                //Atributos propos de la cosechadora
                                IO.println("¿Ancho de corte en metros?");
                                float machAnchura = sc.nextFloat();

                                IO.println("Cantidad de producto cosechado por hora");
                                float machCosechado = sc.nextFloat();

                                //Creamo la maquina con los datos especificos de la maquina
                                Maquina machineNew = new CosechadoraAutonoma(machModel, machStatus, machHours, machAnchura, machCosechado);
                                ranchoDeJuan.addMaquina(machineNew);
                                IO.println(machineNew + " ha sido añadido con exito al grupo de maquinas de la granja!");
                            }

                            //Si el jugador quisiera añadir un TRACTOR usariamos este caso
                            case 3 -> {
                                //Atributos propos del TRACTOR
                                IO.println("Dado que tu maquina es un TRACTOR te pediremos la informacion" +
                                        "de tu maquina basada en ese tipo concreto");

                                IO.println("Potencia del motor en caballos de vapor");
                                float machCV = sc.nextFloat();

                                IO.println("Consumo de combustible por hora (litros/hora)?");
                                float machConsumo = sc.nextFloat();

                                //Creamo la maquina con los datos especificos de la maquina
                                Maquina machineNew = new TractorAutonomo(machModel, machStatus, machHours, machCV, machConsumo);
                                ranchoDeJuan.addMaquina(machineNew);
                                IO.println(machineNew + " ha sido añadido con exito al grupo de maquinas de la granja!");
                            }
                        }


                    }

                    //3. Añadir horas de operación máquina (se pide id maquina y horas trabajadas)
                    case 3 -> {
                        IO.println("Dime el id de la maquina a la que quieres añadir horas trabajadas");
                        int idRes = sc.nextInt();
                        Maquina encontrada = ranchoDeJuan.buscarMaquinaPorId(idRes);
                        IO.println("Ahora las horas que quieres añadirle a esta maquina");
                        int horasExtra = sc.nextInt();
                        encontrada.trabajar(horasExtra);
                    }

                    //4. Calcular el total de horas de operación
                    case 4 -> IO.println("Total de horas de operación: " + ranchoDeJuan.calcularTotalHoras() + "h.");

                    //5. Listar todas las máquinas
                    case 5 -> {
                        IO.println("Maquinas de la granja: " + ranchoDeJuan.getNombre());
                        ranchoDeJuan.listarMaquina();
                    }

                    //6.Terminar el programa
                    case 6 -> IO.println("GRACIAS POR USAR NUESTRO PROGRAMA");
                }
            } while (respuesta != 6);
        }
    }