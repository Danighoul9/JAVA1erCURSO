package EjerciciosPuntuables.Tema5.Aplicacion;

import EjerciciosPuntuables.Tema5.Entidades.Apoyo;
import EjerciciosPuntuables.Tema5.Entidades.Asesino;
import EjerciciosPuntuables.Tema5.Entidades.Tanque;
import EjerciciosPuntuables.Tema5.Entidades.Jugador;
import EjerciciosPuntuables.Tema5.Servicio.Equipo;
import java.util.Scanner;

public class Prueba {
    /**
     * En el método main , se debe:
     * 1. Crear un equipo.
     * 2. Añadir jugadores de diferentes tipos (Tanque, Apoyo, Asesino).
     * 3. Permitir al usuario interactuar mediante un menú con las siguientes opciones:
     * - Imprimir datos del equipo
     * - Añadir un jugador (se piden sus datos)
     * - Añadir puntos a un jugador tras una partida (id, puntos)
     * - Calcular el total de puntos del equipo
     * - Listar todos los jugadores
     * - Buscar un jugador (por identificador)
     * - Salir
     */
    public static void llamarMenu(){
        IO.println("1.- Imprimir datos del equipo");
        IO.println("2.- Añadir un jugador (se piden sus datos)");
        IO.println("3.- Añadir puntos a un jugador tras una partida (id, puntos)");
        IO.println("4.- Calcular el total de puntos del equipo");
        IO.println("5.- Imprimir datos del equipo");
        IO.println("6.- Buscar un jugador (por identificador)");
        IO.println("7.- Salir");
    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        //Generamos el equipo
        Equipo espada_Sagrada = new Equipo("Espada-Sagrada", "Madagascar");

        //Generamos 3 jugadores para añadirlos al equipo
        Jugador emilio = new Apoyo("Emilio",10,7,"5%");
        Jugador ornaldo = new Tanque("Ornaldo",5,130,255);
        Jugador jeff = new Asesino("Jeff the Killer",24,"70%",4);

        //Añadimos los jugadores al equipo
        espada_Sagrada.nuevoJugador(emilio);
        espada_Sagrada.nuevoJugador(ornaldo);
        espada_Sagrada.nuevoJugador(jeff);


        /**
         * Ahora vayamos con lo tocho de esta aplicacion en la que permitiremos:
         *
         * - Imprimir datos del equipo
         * - Añadir un jugador (se piden sus datos)
         * - Añadir puntos a un jugador tras una partida (id, puntos)
         * - Calcular el total de puntos del equipo
         * - Listar todos los jugadores
         * - Buscar un jugador (por identificador)
         * - Salir
         */
        int respuesta = 0;
        do {
            IO.println("¿Que deseas hacer?");
            try{
                //Controlamos que solo pueda elegir entre 1-7
                do{
                    llamarMenu();
                    respuesta = sc.nextInt();
                }while(respuesta < 1 && respuesta > 7);
                //Controlamos que no pueda poner carácteres el usuario
            }catch (Exception e){
                System.out.println("Introduzca un numero válido");
            }

            switch (respuesta){
                case 1 -> espada_Sagrada.imprimirDatosEquipo();

                //Este caso sera mas largo puesto que hay que pedirle los datos del jugador y el jugador
                // puede ser 3 roles distintos con datos distintos
                case 2 -> {
                    sc.nextLine();
                    IO.println("Digame los datos del jugador para añadirlo al equipo");

                    IO.println("Nombre del jugador: ");
                    String nomJ = sc.nextLine();

                    IO.println("¿Que rol es su jugador? (1-Tanque 2-Apoyo 3-Asesino)");
                    int rolJugador = sc.nextInt();
                    switch (rolJugador){

                        //Si el jugador quisiera añadir un TANQUE usariamos este caso
                        case 1 -> {
                            IO.println("Dado que tu jugador es un TANQUE te pediremos la informacion" +
                                    "de tu jugador basada en ese rol");
                            IO.println("Puntuación acumulada en el torneo: ");
                            int pA = sc.nextInt();

                            IO.println("Cantidad media de daño bloqueado por partida: ");
                            int danioblock = sc.nextInt();

                            IO.println("Daño promedio recibido por partida:");
                            int danioRecibido = sc.nextInt();

                            //Creamo el jugador con la informacion que nos ha dado el usuario y lo
                            // añadimos al equipo
                            Jugador tanqueNuevo = new Tanque(nomJ,pA,danioblock,danioRecibido);
                            espada_Sagrada.nuevoJugador(tanqueNuevo);
                            IO.println(tanqueNuevo + " ha sido añadido con exito al equipo!");
                        }

                        //Si el jugador quisiera añadir un APOYO usariamos este caso
                        case 2 ->{

                            IO.println("Dado que tu jugador es APOYO te pediremos la informacion" +
                                "de tu jugador basada en ese rol");
                            IO.println("Puntuación acumulada en el torneo: ");
                            int pA = sc.nextInt();

                            IO.println("Número medio de curaciones otorgadas en cada partida.: ");
                            int curaciones = sc.nextInt();

                            IO.println("Eficacia global del jugador en asistencias (ej: 5%):");
                            String eficacia = sc.nextLine();

                            //Creamo el jugador con la informacion que nos ha dado el usuario y lo
                            // añadimos al equipo
                            Jugador apoyoNuevo = new Apoyo(nomJ,pA,curaciones,eficacia);
                            espada_Sagrada.nuevoJugador(apoyoNuevo);
                            IO.println(apoyoNuevo + " ha sido añadido con exito al equipo!");
                        }

                        //Si el jugador quisiera añadir un ASESINO usariamos este caso
                        case 3 ->{
                            IO.println("Dado que tu jugador es un ASESINO te pediremos la informacion" +
                                "de tu jugador basada en ese rol");
                            IO.println("Puntuación acumulada en el torneo: ");
                            int pA = sc.nextInt();

                            IO.println("Nivel medio de acierto en ataques (ej:5%): ");
                            String ataquesAciertos = sc.nextLine();

                            IO.println("Número promedio de eliminaciones por encuentro:");
                            int eliminacionesPromedio = sc.nextInt();

                            //Creamo el jugador con la informacion que nos ha dado el usuario y lo
                            // añadimos al equipo
                            Jugador asesinoNuevo = new Asesino(nomJ,pA,ataquesAciertos,eliminacionesPromedio);
                            espada_Sagrada.nuevoJugador(asesinoNuevo);
                            IO.println(asesinoNuevo + " ha sido añadido con exito al equipo!");
                        }
                    }
                }
                case 3 ->{
                    /**
                     *  Añadir puntos a un jugador tras una partida (id, puntos)
                     */
                    IO.println("Dime el id del jugador al que quieras añadir puntos");
                    int idRes = sc.nextInt();
                    Jugador encontrado = espada_Sagrada.buscarJugadorPorId(idRes);
                    IO.println("Ahora dine los puntos que quieres añadirle a este jugador");
                    int puntosExtra = sc.nextInt();
                    encontrado.addPuntos(puntosExtra);

                }
                case 4 -> IO.println("Los puntos totales de todo el equipo es de: "
                        + espada_Sagrada.calcularTotalPuntos() + "ptos.");

                case 5 -> espada_Sagrada.listarJugadores();

                case 6 ->{
                    IO.println("Introduzca el identificador del jugador: " );
                    int resId = sc.nextInt();
                    System.out.println(espada_Sagrada.buscarJugadorPorId(resId));
                }

                case 7 -> IO.println("GRACIAS POR USAR NUESTRO PROGRAMA");
            }
        }while (respuesta != 7);

    }
}
