package Tema4.PracticasTema4.BladeOfDarkness;

public class TestBladeOfDarkness {
    public static void main(String[] args) {
        /**
         * Crea una aplicación TestJuego, crea un Jugador, equípalo con las armas que desees. Luego crea cuatro monstruos
         * diferentes con niveles y puntos de daño diferentes, y prueba a que combatan contra el jugador. Prueba que
         * algunos monstruos sean fáciles para ver como el jugador sube su experiencia y nivel.
         */

        int contadorRonda = 1;

        //Jugador
        Jugador jugador = new Jugador("Conan", Jugador.Clase.CABALLERO);

        //Armas de Conan
        Arma arco = new Arma("Arco de fuego encantado", 45, Arma.Tipo.ARCO,true);
        Arma hacha = new Arma("Hacha", 30, Arma.Tipo.HACHA, false);


        //Equipar armas
        jugador.equiparArma(arco);
        jugador.equiparArma(hacha);


        System.out.println("PJ:");
        System.out.println("Nombre: " + jugador.getNombre());
        System.out.println("Clase: " + jugador.getClase());
        System.out.println("Nivel: " + jugador.getNivel());
        System.out.println("Salud: " + jugador.getSalud());
        System.out.println("ARMAS: ");

        //Comprobacion de las armas que tiene en las manos, debe de sdalir arco pq ocupa dos manos
        System.out.println("Arma derecha: " + jugador.getArmaDerecha());
        System.out.println("Arma izquierda: " + jugador.getArmaIzquierda());

        System.out.println("-----------------------------------------------------------------------------");

        //MONSTRUOS
        Monstruo lanzadardos = new Monstruo("Lanzadardos", 5, Monstruo.Clase.GOBLIN);
        // Nivel 1

        Monstruo gengar = new Monstruo("Gengar", 8,Monstruo.Clase.FANTASMA);
        gengar.subirNivel(); // Nivel 2
        gengar.subirNivel(); // Nivel 3

        Monstruo frankenstein = new Monstruo("Frankenstein", 15,Monstruo.Clase.TROLL);
        frankenstein.subirNivel(); // Nivel 2
        frankenstein.subirNivel(); // Nivel 3
        frankenstein.subirNivel(); // Nivel 4

        Monstruo asta = new Monstruo("Asta", 25,Monstruo.Clase.DEMONIO);
        asta.subirNivel(); // Nivel 2
        asta.subirNivel(); // Nivel 3
        asta.subirNivel(); // Nivel 4
        asta.subirNivel(); // Nivel 5


        System.out.println("------------------------------------------------------------------------------");
        System.out.println("Combate contra: ");
        System.out.println("Monstruo: " + lanzadardos.getNombre());
        System.out.println("Clase: " + lanzadardos.getClase());
        System.out.println("Salud: " + lanzadardos.getSalud());
        System.out.println("------------------------------------------------------------------------------");


        //Combate contra el goblin:
        while (lanzadardos.getSalud() > 0 || jugador.getSalud() > 0){
            //Contador de rondas
            System.out.println("*** Ronda " + contadorRonda++ + " ***");

            //Jugador golpea a enemigo
            System.out.println(jugador.getNombre() + " hace " + arco.getPuntosD() + " de daño a " + lanzadardos.getNombre());
            jugador.golpear(lanzadardos);
            if (lanzadardos.getSalud() > 0){
                System.out.println("PS restante del enemigo: " + lanzadardos.getSalud());
            }
            //Si la salud del enemigo es 0 o menos salimos del combate y ganamos
            if (lanzadardos.getSalud() <= 0){
                break;
            }

            //Enemigo golpea a jugador
            System.out.println(lanzadardos.getNombre() + " hace " + lanzadardos.getPuntosD() + " de daño a " + jugador.getNombre());
            lanzadardos.golpear(jugador);
            if (jugador.getSalud() > 0){
                System.out.println("Tus PS restantes: " + jugador.getSalud());

            }

            //Si la salud del jugador es 0 o menos salimos del combate y perdemos
            if (jugador.getSalud() <= 0){
                break;
            }
            System.out.println("------------------------------------------------------------------------------");

        }

        System.out.println("------------------------------------------------------------------------------");
        System.out.println("------------------------------------------------------------------------------");
        System.out.println("------------------------------------------------------------------------------");


        //OTRO COMBATE
        contadorRonda = 1;

        System.out.println("------------------------------------------------------------------------------");
        System.out.println("Combate contra: ");
        System.out.println("Monstruo: " + gengar.getNombre());
        System.out.println("Clase: " + gengar.getClase());
        System.out.println("Salud: " + gengar.getSalud());
        System.out.println("------------------------------------------------------------------------------");
        contadorRonda = 1; //actualizamos el contadora 1 pq es un nuevo combate

        //Combate contra el fantasma:
        while (gengar.getSalud() > 0 || jugador.getSalud() > 0){
            //Contador de rondas
            System.out.println("*** Ronda " + contadorRonda++ + " ***");

            //Jugador golpea a enemigo
            System.out.println(jugador.getNombre() + " hace " + arco.getPuntosD() + " de daño a " + gengar.getNombre());
            jugador.golpear(gengar);
            if (gengar.getSalud() > 0){
                System.out.println("PS restante del enemigo: " + gengar.getSalud());
            }
            //Si la salud del enemigo es 0 o menos salimos del combate y ganamos
            if (gengar.getSalud() <= 0){
                break;
            }

            //Enemigo golpea a jugador
            System.out.println(gengar.getNombre() + " hace " + gengar.getPuntosD() + " de daño a " + jugador.getNombre());
            lanzadardos.golpear(jugador);
            if (jugador.getSalud() > 0){
                System.out.println("Tus PS restantes: " + jugador.getSalud());

            }

            //Si la salud del jugador es 0 o menos salimos del combate y perdemos
            if (jugador.getSalud() <= 0){
                break;
            }
            System.out.println("------------------------------------------------------------------------------");

        }

        System.out.println("------------------------------------------------------------------------------");
        System.out.println("------------------------------------------------------------------------------");
        System.out.println("------------------------------------------------------------------------------");

        //OTRO COMBATE
        contadorRonda = 1;

        System.out.println("------------------------------------------------------------------------------");
        System.out.println("Combate contra: ");
        System.out.println("Monstruo: " + frankenstein.getNombre());
        System.out.println("Clase: " + frankenstein.getClase());
        System.out.println("Salud: " + frankenstein.getSalud());
        System.out.println("------------------------------------------------------------------------------");


        //Combate contra el Troll:
        while (frankenstein.getSalud() > 0 || jugador.getSalud() > 0){
            //Contador de rondas
            System.out.println("*** Ronda " + contadorRonda++ + " ***");

            //Jugador golpea a enemigo
            System.out.println(jugador.getNombre() + " hace " + arco.getPuntosD() + " de daño a " + frankenstein.getNombre());
            jugador.golpear(frankenstein);
            if (frankenstein.getSalud() > 0){
                System.out.println("PS restante del enemigo: " + frankenstein.getSalud());
            }
            //Si la salud del enemigo es 0 o menos salimos del combate y ganamos
            if (frankenstein.getSalud() <= 0){
                break;
            }

            //Enemigo golpea a jugador
            System.out.println(frankenstein.getNombre() + " hace " + frankenstein.getPuntosD() + " de daño a " + jugador.getNombre());
            frankenstein.golpear(jugador);
            if (jugador.getSalud() > 0){
                System.out.println("Tus PS restantes: " + jugador.getSalud());

            }

            //Si la salud del jugador es 0 o menos salimos del combate y perdemos
            if (jugador.getSalud() <= 0){
                break;
            }
            System.out.println("------------------------------------------------------------------------------");

        }

        System.out.println("------------------------------------------------------------------------------");
        System.out.println("------------------------------------------------------------------------------");
        System.out.println("------------------------------------------------------------------------------");


        //OTRO COMBATE
        contadorRonda = 1;

        System.out.println("------------------------------------------------------------------------------");
        System.out.println("Combate contra: ");
        System.out.println("Monstruo: " + asta.getNombre());
        System.out.println("Clase: " + asta.getClase());
        System.out.println("Salud: " + asta.getSalud());
        System.out.println("------------------------------------------------------------------------------");


        //Combate contra el Demonio:
        while (asta.getSalud() > 0 || jugador.getSalud() > 0){
            //Contador de rondas
            System.out.println("*** Ronda " + contadorRonda++ + " ***");

            //Jugador golpea a enemigo
            System.out.println(jugador.getNombre() + " hace " + arco.getPuntosD() + " de daño a " + asta.getNombre());
            jugador.golpear(asta);
            if (asta.getSalud() > 0){
                System.out.println("PS restante del enemigo: " + asta.getSalud());
            }
            //Si la salud del enemigo es 0 o menos salimos del combate y ganamos
            if (asta.getSalud() <= 0){
                break;
            }

            //Enemigo golpea a jugador
            System.out.println(asta.getNombre() + " hace " + asta.getPuntosD() + " de daño a " + jugador.getNombre());
            asta.golpear(jugador);
            if (jugador.getSalud() > 0){
                System.out.println("Tus PS restantes: " + jugador.getSalud());

            }

            //Si la salud del jugador es 0 o menos salimos del combate y perdemos
            if (jugador.getSalud() <= 0){
                break;
            }
            System.out.println("------------------------------------------------------------------------------");

        }














    }
}
