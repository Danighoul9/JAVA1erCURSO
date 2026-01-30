package MisProyectos;

import java.util.Scanner;

public class Piedra_Papel_TIjera {

    static Scanner sc = new Scanner(System.in);

    // Muestra el menú
    public static void llamarMenuJuego() {
        System.out.println("1.🪨 Piedra");
        System.out.println("2.📄 Papel");
        System.out.println("3.✂️ Tijera");
        System.out.println("4.Salir");
    }

    // Muestra lo que escogió el usuario
    public static int llamarRespuestaUser(int respuestaUsuario) {
        if (respuestaUsuario == 1) {
            System.out.println("Has escogido 🪨");
        } else if (respuestaUsuario == 2) {
            System.out.println("Has escogido 📄");
        } else if (respuestaUsuario == 3) {
            System.out.println("Has escogido ✂️");
        }
        return respuestaUsuario;
    }

    // Genera la elección del PC
    public static int llamarRespuestaPC() {
        int eleccionRandom = (int) (Math.random() * 3) + 1;
        System.out.println(obtenerEmoji(eleccionRandom));
        return eleccionRandom;
    }

    // Devuelve el emoji correspondiente a la elección
    public static String obtenerEmoji(int opcion) {
        switch (opcion) {
            case 1:
                return "🪨";
            case 2:
                return "📄";
            case 3:
                return "✂️";
            default:
                return "❓";
        }
    }

    public static void main(String[] args) {

        int puntosRequeridos = 0;
        int respuestaUsuario = 1;
        int puntosUser = 0;
        int puntosPC = 0;

        try {
            do {
                System.out.println("¿Al mejor de cuántas rondas quieres jugar?");
                puntosRequeridos = sc.nextInt();
                if (puntosRequeridos <= 0) {
                    System.out.println("No puedes jugar 0 o rondas negativas");
                }
            } while (puntosRequeridos <= 0);

            System.out.println("Al mejor de: " + puntosRequeridos);

        } catch (Exception e) {
            System.out.println(e.getMessage());
            sc.nextLine();
        }

        do {
            try {
                llamarMenuJuego();

                do {
                    System.out.println("¿Qué quieres sacar?");
                    respuestaUsuario = sc.nextInt();
                    llamarRespuestaUser(respuestaUsuario);
                } while (respuestaUsuario > 4 || respuestaUsuario <= 0);

                if (respuestaUsuario == 4) {
                    System.out.println("Gracias por usar mi programa, saliendo...");
                    break;
                }

                System.out.println("Turno del PC:");
                System.out.print("PC ha sacado: ");
                int respuestaDelPC = llamarRespuestaPC();

                // Determina quién gana
                if (respuestaUsuario == respuestaDelPC) {
                    System.out.println("Empate 🤝");
                } else if (respuestaUsuario == 1 && respuestaDelPC == 3 ||
                           respuestaUsuario == 2 && respuestaDelPC == 1 ||
                           respuestaUsuario == 3 && respuestaDelPC == 2) {
                    System.out.println("+1 Punto para ti 🎉");
                    puntosUser++;
                } else {
                    System.out.println("+1 Punto para el PC 💻");
                    puntosPC++;
                }

                // Mostrar marcador con emojis
                System.out.println("--------------");
                System.out.println("|  TU    PC  |");
                System.out.println("|  " + obtenerEmoji(respuestaUsuario) + "  vs  " + obtenerEmoji(respuestaDelPC) + "  |");
                System.out.println("|   " + puntosUser + " - " + puntosPC + "    |");
                System.out.println("--------------");

            } catch (Exception e) {
                System.out.println(e.getMessage());
                sc.nextLine();
            }

        } while (puntosUser < puntosRequeridos && puntosPC < puntosRequeridos);

        if (puntosUser == puntosRequeridos) {
            System.out.println("🎊 ¡Has ganado, Enhorabuena!");
        } else if (puntosPC == puntosRequeridos) {
            System.out.println("💻 JAJA LA MAKINA TE HA GANADO SUKABLIAT");
        }
    }
}

