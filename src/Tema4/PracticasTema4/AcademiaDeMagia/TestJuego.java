package Tema4.PracticasTema4.AcademiaDeMagia;

import java.util.Scanner;

public class TestJuego {

    /**
     * Crea una aplicación TestJuego que se cree un Mago con 100 de energía.
     *
     * Debes añadirle tres Hechizos:
     * bola de fuego(20 energía y 7 potencia),
     * escudo mágico(15 de energía y 5 de potencia),
     * rayo eléctrico (25 de energía y 9 de potencia).
     *
     * Luego crea tres Pruebas:
     * romper muro (5 dificultad y 10 de recompensa),
     * derrotar orco (8 dificultad y 15 recompensa),
     * derrotar elfo oscuro (10 dificultad y 20 de recompensa).
     *
     * Haz que el mago se enfrente a las tres pruebas con un hechizo cada vez a tu elección,
     * comprueba si puede hacerlo y si se queda sin energía.
     *
     * Se valorará el uso de excepciones, la claridad del código, el uso de comentarios explicativos al principio de los
     * métodos, etc. Si se pega código de IA no se superará el ejercicio.
     */

    //metodo para llamar al menu el cual nos mostrara los ataques disponibles de nuesro personaje
    public static void llamarMenu(){
        System.out.println("1. Bola de fuego, 20pts de energia, potencia = 7" );
        System.out.println("2. Escudo mágico, 15pts de energia, potencia = 5" );
        System.out.println("3. Rayo eléctrico, 25pts de energia, potencia = 9" );
    }

    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //Nuestro ataque
        int h = 0;


        //Construimos al mago
        Mago m1 = new Mago("Ezequiel", 100);

        //Hacemos los hechizos solicitados
        Hechizo fireBall = new Hechizo("Bola de fuego", 20, 7);
        Hechizo magicShield = new Hechizo("Escudo Mágico", 15, 5);
        Hechizo electricRay = new Hechizo("Rayo Eléctrico", 25, 9);


        //El mago aprende los hechizos
        m1.aprenderHechizo(fireBall);
        m1.aprenderHechizo(magicShield);
        m1.aprenderHechizo(electricRay);

        //Creamos las pruebas
        Prueba p1 = new Prueba("Romper muro", 5,10);
        Prueba p2 = new Prueba("Derrotar orco", 8,15);
        Prueba p3 = new Prueba("Derrotar elfo oscuro", 10,20);


        //PRIMERA PRUEBA -------------------------------------------------------------------------------------------


        //Enfrentamos a nuestro mago con las pruebas
        //Primero mostrare al personaje
        System.out.println(m1);

        //Voy a mostrar tambien los detalles de la prueba
        System.out.println("-----------------------------------------------------------------------------");
        //Descripción de la prueba
        p1.descPrueba();

        //Elegimos el hechizo que queremos lanzar
        System.out.println("¿QUE HECHIZO QUIERES LANZAR?");
        llamarMenu();
        try {
            while (h > 3 || h < 1){
                h = sc.nextInt();
                if (h > 3 || h < 1){
                    System.out.println("Ingresa una opcion correcta");
                }
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
            sc.nextLine();
            System.out.println("Opción incorrecta (Ingresa un numero)");
        }

        //Hacemos un switch con todos los posibles casos
        switch (h){
            case 1 -> m1.lanzarHechizo(fireBall.getNombre(), p1);
            case 2 -> m1.lanzarHechizo(magicShield.getNombre(), p1);
            case 3 -> m1.lanzarHechizo(electricRay.getNombre(), p1);
        }

        //Si el hechizo es efectivo, el jugador ganara los puntos de energia que da la prueba como recompensa,
        // si no, pierde -5pts de energía (ya programados en la clase mago)

        switch (h){
            case 1 :
                if (fireBall.esEfectivo(p1)){
                    System.out.println(m1.getNombre() + " gana " + p1.getRecompensa() + "pts de magia.");
                    m1.recargarEnergia(p1.getRecompensa());
                    System.out.println("Puntos de magia restantes: " + m1.getEnergia() +"pts");
                    break;
                }else{
                    System.out.println("Puntos de magia restantes: " + m1.getEnergia() +"pts");
                        break;
                }

            case 2 :
                if (magicShield.esEfectivo(p1)){
                    System.out.println(m1.getNombre() + " gana " + p1.getRecompensa() + "pts de magia.");
                    m1.recargarEnergia(p1.getRecompensa());
                    System.out.println("Puntos de magia restantes: " + m1.getEnergia() +"pts");
                    break;
                }else{
                    System.out.println("Puntos de magia restantes: " + m1.getEnergia() +"pts");
                    break;
                }
            case 3 :
                if (electricRay.esEfectivo(p1)){
                    System.out.println(m1.getNombre() + " gana " + p1.getRecompensa() + "pts de magia.");
                    m1.recargarEnergia(p1.getRecompensa());
                    System.out.println("Puntos de magia restantes: " + m1.getEnergia() +"pts");
                    break;
                }else{
                    System.out.println("Puntos de magia restantes: " + m1.getEnergia() +"pts");
                    break;
                }
        }

        sc.nextLine();
        h = 0;

        //Segunda PRUEBA -------------------------------------------------------------------------------------------

        System.out.println("-----------------------------------------------------------------------------");
        //Descripción de la prueba
        p2.descPrueba();

        //Elegimos el hechizo que queremos lanzar
        System.out.println("¿QUE HECHIZO QUIERES LANZAR?");
        llamarMenu();
        try {
            while (h > 3 || h < 1){
                h = sc.nextInt();
                if (h > 3 || h < 1){
                    System.out.println("Ingresa una opcion correcta");
                }
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
            sc.nextLine();
            System.out.println("Opción incorrecta (Ingresa un numero)");
        }

        //Hacemos un switch con todos los posibles casos
        switch (h){
            case 1 -> m1.lanzarHechizo(fireBall.getNombre(), p2);
            case 2 -> m1.lanzarHechizo(magicShield.getNombre(), p2);
            case 3 -> m1.lanzarHechizo(electricRay.getNombre(), p2);
        }

        //Si el hechizo es efectivo, el jugador ganara los puntos de energia que da la prueba como recompensa,
        // si no, pierde -5pts de energía (ya programados en la clase mago)

        switch (h){
            case 1 :
                if (fireBall.esEfectivo(p2)){
                    System.out.println(m1.getNombre() + " gana " + p2.getRecompensa() + "pts de magia.");
                    m1.recargarEnergia(p2.getRecompensa());
                    System.out.println("Puntos de magia restantes: " + m1.getEnergia() +"pts");
                    break;
                }else{
                    System.out.println("Puntos de magia restantes: " + m1.getEnergia() +"pts");
                    break;
                }

            case 2 :
                if (magicShield.esEfectivo(p2)){
                    System.out.println(m1.getNombre() + " gana " + p2.getRecompensa() + "pts de magia.");
                    m1.recargarEnergia(p2.getRecompensa());
                    System.out.println("Puntos de magia restantes: " + m1.getEnergia() +"pts");
                    break;
                }else{
                    System.out.println("Puntos de magia restantes: " + m1.getEnergia() +"pts");
                    break;
                }
            case 3 :
                if (electricRay.esEfectivo(p2)){
                    System.out.println(m1.getNombre() + " gana " + p2.getRecompensa() + "pts de magia.");
                    m1.recargarEnergia(p2.getRecompensa());
                    System.out.println("Puntos de magia restantes: " + m1.getEnergia() +"pts");
                    break;
                }else{
                    System.out.println("Puntos de magia restantes: " + m1.getEnergia() +"pts");
                    break;
                }
        }

        sc.nextLine();
        h = 0;

        //Tercera PRUEBA -------------------------------------------------------------------------------------------

        System.out.println("-----------------------------------------------------------------------------");
        //Descripción de la prueba
        p3.descPrueba();

        //Elegimos el hechizo que queremos lanzar
        System.out.println("¿QUE HECHIZO QUIERES LANZAR?");
        llamarMenu();
        try {
            while (h > 3 || h < 1){
                h = sc.nextInt();
                if (h > 3 || h < 1){
                    System.out.println("Ingresa una opcion correcta");
                }
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
            sc.nextLine();
            System.out.println("Opción incorrecta (Ingresa un numero)");
        }

        //Hacemos un switch con todos los posibles casos
        switch (h){
            case 1 -> m1.lanzarHechizo(fireBall.getNombre(), p3);
            case 2 -> m1.lanzarHechizo(magicShield.getNombre(), p3);
            case 3 -> m1.lanzarHechizo(electricRay.getNombre(), p3);
        }

        //Si el hechizo es efectivo, el jugador ganara los puntos de energia que da la prueba como recompensa,
        // si no, pierde -5pts de energía (ya programados en la clase mago)

        switch (h){
            case 1 :
                if (fireBall.esEfectivo(p3)){
                    System.out.println(m1.getNombre() + " gana " + p3.getRecompensa() + "pts de magia.");
                    m1.recargarEnergia(p3.getRecompensa());
                    System.out.println("Puntos de magia restantes: " + m1.getEnergia() +"pts");
                    break;
                }else{
                    System.out.println("Puntos de magia restantes: " + m1.getEnergia() +"pts");
                    break;
                }

            case 2 :
                if (magicShield.esEfectivo(p3)){
                    System.out.println(m1.getNombre() + " gana " + p3.getRecompensa() + "pts de magia.");
                    m1.recargarEnergia(p3.getRecompensa());
                    System.out.println("Puntos de magia restantes: " + m1.getEnergia() +"pts");
                    break;
                }else{
                    System.out.println("Puntos de magia restantes: " + m1.getEnergia() +"pts");
                    break;
                }
            case 3 :
                if (electricRay.esEfectivo(p3)){
                    System.out.println(m1.getNombre() + " gana " + p3.getRecompensa() + "pts de magia.");
                    m1.recargarEnergia(p3.getRecompensa());
                    System.out.println("Puntos de magia restantes: " + m1.getEnergia() +"pts");
                    break;
                }else{
                    System.out.println("Puntos de magia restantes: " + m1.getEnergia() +"pts");
                    break;
                }
        }

    }

}
