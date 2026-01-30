package ExamenesDePrueba.SegundoExamen;


import java.util.Scanner;

public class Ejercicio2_DadosMagicos {

    // Procedimiento de tirada Dado
    public static int tiradaDado(int num) {
        return (int) (Math.random() * num + 1);
    }

    // Procedimiento de Seleccion aleatoria de las reglas
    public static int seleccionAleatoria(String reglasMagicas[]) {
        return (int) (Math.random() * reglasMagicas.length);
    }

    // Procedimiento para mostrar las reglas según el índice
    public static void mostrarReglasMagicas(String reglasMagicas[], int reglaDeEstaRonda) {
        System.out.println("Las reglas de esta ronda son: " + reglasMagicas[reglaDeEstaRonda]);
        switch (reglaDeEstaRonda) {
            case 0:
                System.out.println("El perdedor (menor resultado) de la ronda pierde" +
                        " tantos puntos de vida como la diferencia entre ambos resultados.");
                break;
            case 1:
                System.out.println("Ambos jugadores suman el resultado de su dado a su vida.");
                break;
            case 2:
                System.out.println("El jugador con el dado más alto roba puntos de vida al " +
                        "otro igual a la mitad de su resultado (redondeado hacia abajo).");
                break;
            case 3:
                System.out.println("Si un jugador saca un 6, el otro pierde automáticamente 10 puntos de vida. " +
                        "Si ambos sacan 6, se anula el efecto.");
                break;
            case 4:
                System.out.println("Ningún jugador pierde puntos de vida, pero el ganador recibe " +
                        "un escudo que le protege de daño en la siguiente ronda.");
                break;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //2. [3 puntos] El Reino de los Dados Mágicos

        //Dos jugadores se enfrentan en un duelo usando dados mágicos con poderes especiales.

        //Cada ronda introduce una regla especial que puede cambiar la puntuación o las
        //condiciones del duelo.


        //Preparación inicial:

        //• Ambos jugadores comienzan con 40 puntos de vida.

        //• Se decide el número de rondas (mínimo 5).

        //• Los jugadores usan dados de 6 caras.


        //Desarrollo de cada ronda:

        //• Antes de lanzar los dados, se selecciona una regla mágica de forma aleatoria.

        //• Ambos jugadores lanzan su dado, y el resultado se interpreta según la regla mágica
        //de esa ronda.

        //• Según el resultado, los jugadores pueden ganar o perder puntos de vida.
        //Reglas mágicas posibles (se elige una al azar en cada ronda):

        //• Dado de Fuego: El perdedor (menor resultado) de la ronda pierde tantos puntos de
        //vida como la diferencia entre ambos resultados.

        //• Dado de Curación: Ambos jugadores suman el resultado de su dado a su vida.

        //• Dado de Robo: El jugador con el dado más alto roba puntos de vida al otro igual a la
        //mitad de su resultado (redondeado hacia abajo).

        //• Dado Explosivo: Si un jugador saca un 6, el otro pierde automáticamente 10 puntos
        //de vida. Si ambos sacan 6, se anula el efecto.

        //• Dado de Escudo: En esta ronda, ningún jugador pierde puntos de vida, pero el
        //ganador (mayor puntuación) recibe un "escudo" que le protege de daño en la
        //siguiente ronda.


        //Final del juego:

        //• El duelo termina si uno de los jugadores llega a 0 puntos de vida. El otro será el
        //ganador.

        //• Si se completan todas las rondas y ambos siguen vivos, gana el jugador con más
        //puntos de vida.

        // Vida de los jugadores
        int psJ1 = 40;
        int psJ2 = 40;

        //Vida inicial de cada jugador
        System.out.println("Vida Jugador 1: " + psJ1);
        System.out.println("Vida Jugador 2: " + psJ2);

        // Número de rondas a jugar
        int rondas = 0;
        do {
            System.out.println("¿Cuántas rondas se van a jugar? (mínimo 5)");
            try {
                rondas = sc.nextInt();
            } catch (Exception e) {
                System.out.println("Introduce un número válido.");
                sc.nextLine();
            }

            if (rondas < 5) {
                System.out.println("INSERTA UN MÍNIMO DE 5 RONDAS");
            }
        } while (rondas < 5);

        // Reglas mágicas
        String[] reglasMagicas = {"Dado de Fuego", "Dado de Curación", "Dado de Robo", "Dado Explosivo", "Dado de Escudo"};


        for (int i = 1; i <= rondas; i++) {
            System.out.println("Ronda: " + i);

            //Tirada J1
            int dadoJ1 = tiradaDado(6);
            System.out.println("Jugador 1 ha sacado un: " + dadoJ1);

            //Tirada J2
            int dadoJ2 = tiradaDado(6);
            System.out.println("Jugador 2 ha sacado un: " + dadoJ2);


            // Selección de regla
            int reglaDeEstaRonda = seleccionAleatoria(reglasMagicas);

            mostrarReglasMagicas(reglasMagicas, reglaDeEstaRonda);

            // Aplicar efectos según la regla
            switch (reglaDeEstaRonda) {
                case 0: // Dado de Fuego
                    if (dadoJ1 > dadoJ2) {
                        psJ2 -= (dadoJ1 - dadoJ2);
                    }else if (dadoJ2 > dadoJ1) {
                        psJ1 -= (dadoJ2 - dadoJ1);
                    }
                    break;

                case 1: // Dado de Curación
                    psJ1 += dadoJ1;
                    psJ2 += dadoJ2;
                    break;

                case 2: // Dado de Robo
                    if (dadoJ1 > dadoJ2) {
                        int robo = dadoJ1 / 2;
                        psJ1 += robo;
                        psJ2 -= robo;
                    }else if (dadoJ2 > dadoJ1) {
                        int robo = dadoJ2 / 2;
                        psJ2 += robo;
                        psJ1 -= robo;
                    }
                    break;

                case 3: // Dado Explosivo
                    if (dadoJ1 == 6 && dadoJ2 != 6){
                        psJ2 -= 10;
                    }else if (dadoJ2 == 6 && dadoJ1 != 6){
                        psJ1 -= 10;
                    }
                    // Si ambos sacan 6, no pasa nada
                    break;

                case 4: // Dado de Escudo
                    //Preguntar al maestro
                    break;
            }

            // Comprobar final de juego
            if (psJ1 <= 0 && psJ2 <= 0) {
                System.out.println("EMPATE");
                break;
            }else if (psJ1 <= 0) {
                System.out.println("Jugador 2 ha ganado");
                break;
            }else if (psJ2 <= 0) {
                System.out.println("Jugador 1 ha ganado");
                break;
            }

            //Vida actual de cada jugador
            System.out.println("Vida Jugador 1: " + psJ1);
            System.out.println("Vida Jugador 2: " + psJ2);
        }

        // Mostrar ganador si no hubo muerte durante las rondas
        if (psJ1 > 0 && psJ2 > 0) {
            if (psJ1 > psJ2){
                System.out.println("Enhorabuena Jugador 1 ha ganado");
            }else if (psJ2 > psJ1){
                System.out.println("Enhorabuena Jugador 2 ha ganado");
            }else{
                System.out.println("EMPATE");
            }
        }
    }
}
