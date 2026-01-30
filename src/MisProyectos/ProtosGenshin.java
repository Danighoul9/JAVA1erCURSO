package MisProyectos;

import java.util.Scanner;

public class ProtosGenshin {
    public static void main(String[] args) {

        // Quiero saber cuantas protogemas sere capaz de obtener al final del banner de neffer para obtener
        // su arma y con cuantas protogemas podria quedamer contando la version que viene para columbina


        Scanner sc = new Scanner(System.in);

        char si = 's';
        char no = 'n';

        //////////////////////////////////////////////////////////////////////////////////////////
        //EMPEZAMOS PREGUNTANDO EL NUMERO ACTUAL DE PROTOGEMAS QUE TIENE EL USER
        System.out.println("Dime tus protogemas actuales: ");
        int nProtosActuales = sc.nextInt();

        //Y si el numero de protogemas es negativo (imposible) repetimos pregunta
        while (nProtosActuales < 0) {
            System.out.println("Ingrese un numero entero valido de protogemas: ");
            nProtosActuales = sc.nextInt();
        }

        //////////////////////////////////////////////////////////////////////////////////////////
        System.out.println("Excelente ahora vamos a relizar el calculo para final de versión, di si o no a las " +
                "siguientes preguntas");
        //////////////////////////////////////////////////////////////////////////////////////////

        //////////////////////////////////////////////////////////////////////////////////////////
        //Preguntamos por los dias que le quedan a la version para calcular las protos que podría
        // sacar el usuario teniendo en cuenta si hace diarias y tiene bendi
        System.out.println("¿Cuantos dias le quedan a la versión?");
        int diasRestantes = sc.nextInt();

        //EL gacha de cada personaje no dura mas de 20 dias ni menos de 0 dias por lo tanto
        // si la respuesta es errónea pedimos que repita el numero introducido
        while (diasRestantes < 0 || diasRestantes > 20) {
            System.out.println("Ingrese un numero valido de dias restantes de la version: ");
            diasRestantes = sc.nextInt();
        }
        //////////////////////////////////////////////////////////////////////////////////////////

        //////////////////////////////////////////////////////////////////////////////////////////
        //Preguntamos si el user hace las misiones diarias del juego
        System.out.println("¿Haces las misiones diarias? (s/n)");
        String daily = sc.next();

        boolean dailysn = false;

        //El usuario solo puede responder s/n para que el programa funcione por o tanto si pone otro
        // caracter que no sea la S o la N, le decimos que repita respuesta SOLO CON S/N
        while (!dailysn) {
            if (daily.equals("s") || daily.equals("n")) {
                dailysn = true; // condición afirmativa: ya es válido
            } else {
                System.out.println("⚠️ Escribe solo 's' o 'n':");
                daily = sc.next().toLowerCase();
            }
        }

        //Hacemos el calculo de las misiones diarias por los dias restantes de la version
        int dailyRewards = 60;

        int resDailyXDiasRestantesVersion = 0;
        if (daily.equals("s")) {
            resDailyXDiasRestantesVersion = dailyRewards * diasRestantes;
        } else {
            System.out.println("No tienes bendición lunar.");
        }
        //////////////////////////////////////////////////////////////////////////////////////////
        //Preguntamos al user si tiene bendidion lunar que ofrece una cantidad de 90
        //protogemas diarias
        System.out.println("¿Tienes bendicion lunar? (s/n)");
        String bendi = sc.next();
        int bendicion = 90;

        boolean bendiOFC = false;

        //El usuario solo puede responder s/n para que el programa funcione por o tanto si pone otro
        // caracter que no sea la S o la N, le decimos que repita respuesta SOLO CON S/N
        while (!bendiOFC) {
            if (bendi.equals("s") || bendi.equals("n")) {
                bendiOFC = true; // condición afirmativa: ya es válido
            } else {
                System.out.println("⚠️ Escribe solo 's' o 'n':");
                bendi = sc.next().toLowerCase();
            }
        }

        int resBendiXDiasRestantesVersion = 0;
        if (bendi.equals("s")) {
            resBendiXDiasRestantesVersion = bendicion * diasRestantes;
        } else {
            System.out.println("No haces misiónes diarias, que mal.");
        }
        //////////////////////////////////////////////////////////////////////////////////////////
        //Ahora preguntamos por el abismo/teatro/confragacion
        // MENÚ DE ABISMO / TEATRO / CONFLAGRACIÓN ESTIGIA
        System.out.println("\nAhora vamos con el contenido de final de versión:");
        System.out.println("Presiona el número según lo disponible:");
        System.out.println("1️⃣  - Solo Abismo");
        System.out.println("2️⃣  - Solo Teatro Imaginario");
        System.out.println("3️⃣  - Solo Conflagración Estigia");
        System.out.println("4️⃣  - Abismo + Teatro");
        System.out.println("5️⃣  - Abismo + Conflagración");
        System.out.println("6️⃣  - Teatro + Conflagración");
        System.out.println("7️⃣  - Abismo + Teatro + Conflagración");
        System.out.println("PRESIONE CUALQUIER NÚMERO QUE NO ESTE DENTRO DE ESTE MENU PARA SALTAR ESTA PARTE");
        System.out.println( "(solo en caso de que no puedas realizar ningun contenido)");

        int opcion = sc.nextInt();
        int protosExtra = 0;

        switch (opcion) {
            case 1:
                // SOLO ABISMO
                System.out.println("¿Puedes pasar el Abismo con todas las estrellas? (s/n)");
                String fullAbyss = sc.next().toLowerCase();

                while (!fullAbyss.equals("s") && !fullAbyss.equals("n")) {
                    System.out.println("⚠️ Escribe solo 's' o 'n':");
                    fullAbyss = sc.next().toLowerCase();
                }

                if (fullAbyss.equals("s")) {
                    protosExtra += 800;
                } else {
                    System.out.println("¿Cuántas protogemas crees que obtendrás del Abismo?");
                    protosExtra += sc.nextInt();
                    while (protosExtra < 0 || protosExtra > 800) {
                        System.out.println("Ingresa un numero correcto de protogemas (0-800) {ABISMO}");
                        protosExtra += sc.nextInt();
                    }
                }
                break;

            case 2:
                // SOLO TEATRO
                System.out.println("¿Completarás el Teatro Imaginario entero? (s/n)");
                String fullTeatro = sc.next().toLowerCase();

                while (!fullTeatro.equals("s") && !fullTeatro.equals("n")) {
                    System.out.println("⚠️ Escribe solo 's' o 'n':");
                    fullTeatro = sc.next().toLowerCase();
                }

                if (fullTeatro.equals("s")) {
                    protosExtra += 800;
                } else {
                    System.out.println("¿Cuántas protogemas obtendrás del Teatro?");
                    protosExtra += sc.nextInt();
                    while (protosExtra < 0 || protosExtra > 800) {
                        System.out.println("Ingresa un numero correcto de protogemas (0-800) {TEATRO}");
                        protosExtra += sc.nextInt();
                    }
                }
                break;

            case 3:
                // SOLO CONFLAGRACIÓN
                System.out.println("¿Harás toda la Conflagración Estigia? (s/n)");
                String fullConfl = sc.next().toLowerCase();

                while (!fullConfl.equals("s") && !fullConfl.equals("n")) {
                    System.out.println("⚠️ Escribe solo 's' o 'n':");
                    fullConfl = sc.next().toLowerCase();
                }

                if (fullConfl.equals("s")) {
                    protosExtra += 450;
                } else {
                    System.out.println("¿Cuántas protogemas obtendrás de la Conflagración?");
                    protosExtra += sc.nextInt();
                    while (protosExtra < 0 || protosExtra > 450) {
                        System.out.println("Ingresa un numero correcto de protogemas (0-450) {CONFLAGRACIÓN}");
                        protosExtra += sc.nextInt();
                    }
                }
                break;

            case 4:
                // ABISMO + TEATRO
                System.out.println("¿Pasas el Abismo full estrellas? (s/n)");
                String full1 = sc.next().toLowerCase();
                if (full1.equals("s")){
                    protosExtra += 800;
                } else {
                    System.out.println("¿Cuántas protogemas del Abismo?");
                    protosExtra += sc.nextInt();
                    while (protosExtra < 0 || protosExtra > 800) {
                        System.out.println("Ingresa un numero correcto de protogemas (0-800) {ABISMO}");
                        protosExtra += sc.nextInt();
                    }
                }

                System.out.println("¿Completas el Teatro entero? (s/n)");
                String full2 = sc.next().toLowerCase();
                if (full2.equals("s")){
                    protosExtra += 800;
                } else {
                    System.out.println("¿Cuántas protogemas del Teatro?");
                    protosExtra += sc.nextInt();
                    while (protosExtra < 0 || protosExtra > 800) {
                        System.out.println("Ingresa un numero correcto de protogemas (0-800) {TEATRO}");
                        protosExtra += sc.nextInt();
                    }
                }
                break;

            case 5:
                // ABISMO + CONFLAGRACIÓN
                System.out.println("¿Pasas el Abismo full estrellas? (s/n)");
                String full3 = sc.next().toLowerCase();
                if (full3.equals("s")){
                    protosExtra += 800;
                } else {
                    System.out.println("¿Cuántas protogemas del Abismo?");
                    protosExtra += sc.nextInt();

                    while (protosExtra < 0 || protosExtra > 800) {
                        System.out.println("Ingresa un numero correcto de protogemas (0-800) {ABISMO}");
                        protosExtra += sc.nextInt();
                        while (protosExtra < 0 || protosExtra > 800) {
                            System.out.println("Ingresa un numero correcto de protogemas (0-800) {ABISMO}");
                            protosExtra += sc.nextInt();
                        }
                    }
                }

                System.out.println("¿Haces toda la Conflagración Estigia? (s/n)");
                String full4 = sc.next().toLowerCase();
                if (full4.equals("s")){
                    protosExtra += 450;
                } else {
                    System.out.println("¿Cuántas protogemas de la Conflagración?");
                    protosExtra += sc.nextInt();
                    while (protosExtra < 0 || protosExtra > 450) {
                        System.out.println("Ingresa un numero correcto de protogemas (0-800) {CONFLAGRACIÓN}");
                        protosExtra += sc.nextInt();
                    }
                }
                break;

            case 6:
                // TEATRO + CONFLAGRACIÓN
                System.out.println("¿Completas el Teatro entero? (s/n)");
                String full5 = sc.next().toLowerCase();
                if (full5.equals("s")){
                    protosExtra += 800;
                } else {
                    System.out.println("¿Cuántas protogemas del Teatro?");
                    protosExtra += sc.nextInt();
                    while (protosExtra < 0 || protosExtra > 800) {
                        System.out.println("Ingresa un numero correcto de protogemas (0-800) {TEATRO}");
                        protosExtra += sc.nextInt();
                    }
                }

                System.out.println("¿Haces toda la Conflagración Estigia? (s/n)");
                String full6 = sc.next().toLowerCase();
                if (full6.equals("s")){
                    protosExtra += 450;
                } else {
                    System.out.println("¿Cuántas protogemas de la Conflagración?");
                    protosExtra += sc.nextInt();
                    while (protosExtra < 0 || protosExtra > 450) {
                        System.out.println("Ingresa un numero correcto de protogemas (0-450) {CONFLAGRACIÓN}");
                        protosExtra += sc.nextInt();
                    }
                }
                break;

            case 7:
                // ABISMO + TEATRO + CONFLAGRACIÓN
                System.out.println("¿Pasas el Abismo full estrellas? (s/n)");
                String full7a = sc.next().toLowerCase();
                if (full7a.equals("s")){
                    protosExtra += 800;
                } else {
                    System.out.println("¿Cuántas protogemas del Abismo?");
                    protosExtra += sc.nextInt();
                    while (protosExtra < 0 || protosExtra > 800) {
                        System.out.println("Ingresa un numero correcto de protogemas (0-800) {ABISMO}");
                        protosExtra += sc.nextInt();
                    }
                }

                System.out.println("¿Completas el Teatro entero? (s/n)");
                String full7b = sc.next().toLowerCase();
                if (full7b.equals("s")) protosExtra += 800;
                else {
                    System.out.println("¿Cuántas protogemas del Teatro?");
                    protosExtra += sc.nextInt();
                    while (protosExtra < 0 || protosExtra > 800) {
                        System.out.println("Ingresa un numero correcto de protogemas (0-800) {TEATRO}");
                        protosExtra += sc.nextInt();
                    }

                }

                System.out.println("¿Haces toda la Conflagración Estigia? (s/n)");
                String full7c = sc.next().toLowerCase();
                if (full7c.equals("s")){
                    protosExtra += 450;
                } else {
                    System.out.println("¿Cuántas protogemas de la Conflagración?");
                    protosExtra += sc.nextInt();
                    while (protosExtra < 0 || protosExtra > 800) {
                        System.out.println("Ingresa un numero correcto de protogemas (0-800) {CONFLAGRACIÓN}");
                        protosExtra += sc.nextInt();
                    }
                }
                break;

            default:
                System.out.println("⚠️ Opción no válida, se asume 0 protogemas extra.");
                break;
        }

        //////////////////////////////////////////////////////////////////////////////////////////
        // TOTAL FINAL
        int totalFinal = nProtosActuales + resDailyXDiasRestantesVersion + resBendiXDiasRestantesVersion + protosExtra;

        System.out.println("\n══════════════════════════════════════");
        System.out.println("🧮 RESUMEN DE PROTOGEMAS:");
        System.out.println("Protogemas actuales: " + nProtosActuales);
        System.out.println("De misiones diarias: " + resDailyXDiasRestantesVersion);
        System.out.println("De bendición lunar: " + resBendiXDiasRestantesVersion);
        System.out.println("De contenido final de versión (Abismo/Teatro/Conflagración): " + protosExtra);
        System.out.println("--------------------------------------");
        System.out.println("✨ Total estimado al final de versión: " + totalFinal + " protogemas ✨");
        System.out.println("✨ En total se transforma en unas " + totalFinal/160 + " tiradas ✨");
        System.out.println("══════════════════════════════════════");
    }
}

























