package MisProyectos;

import java.util.Scanner;

public class ExamenMatemáticas {
    public static void main(String[] args) {

        // Voy a realizar un programa que te permita hacer un examen de matematicas en java y te diga tu nota

        Scanner sc = new Scanner(System.in); //Crea el objeto para leer de teclado

        double r1,r2,r3,r4,r5,r6,r7,r8,r9,r10;
        double notaExamen = 0;

        System.out.println("===============================================");
        System.out.println("  Bienvenid@ a tu primer examen hecho en JAVA  ");
        System.out.println("===============================================");
        System.out.println("La puntuación máxima es de 10 puntos.");
        System.out.println("Tienes 15 minutos para completar el examen.");
        System.out.println("Presiona ENTER cuando quieras comenzar...");
        sc.nextLine(); // Espera a que el usuario presione Enter

        // Mostrar contador solo una vez
        System.out.println("\n⏳ Tiempo asignado: 15:00 minutos");
        System.out.println("El temporizador ya está corriendo, ¡empieza el examen!\n");

        // === INICIAR HILO DEL CONTADOR (invisible, sin imprimir) ===
        Thread contador = new Thread(() -> {
            try {
                Thread.sleep(15 * 60 * 1000); // Espera 15 minutos
                System.out.println("\n⏰ ¡Se acabó el tiempo!");
                System.exit(0);
            } catch (InterruptedException e) {
                // examen finalizado antes del tiempo
            }
        });
        contador.start();

        System.out.println("1.Un granjero tiene 2 arboles, cada árbol tiene 12 manzanas pero a cada árbol se le" +
                " han caido 4 manzanas y ya no son comestibles. ¿Cuantas manzanas le quedan al granjero? ");
        r1= sc.nextInt(); //Leer de teclado un entero

        if(r1 == 18){
            notaExamen += 1;
        }else{
            notaExamen +=0;
        }

        System.out.println("2.Tengo 17 años y mi hermana 6 menos que yo, ¿cuantos años tendrá mi hermana en 29 años? ");
        r2= sc.nextInt(); //Leer de teclado un entero

        if(r2 == 40){
            notaExamen += 1;
        }else{
            notaExamen +=0;
        }

        System.out.println("3.Ayer compre la PS5 y me costo 562€ sin IVA por ser socio,¿cuanto me hubiera costado " +
                "esta misma consola con el 21% de IVA? ");
        r3= sc.nextInt(); //Leer de teclado un entero

        if(r3 == 608.02){
            notaExamen += 1;
        }else{
            notaExamen +=0;
        }

        System.out.println("4.Ayer recorri 376km con mi coche, sabiendo que mi coche gasta 6L/100km,¿cuantos litros " +
                "de gasoil he gastado? ");
        r1= sc.nextInt(); //Leer de teclado un entero

        if(r1 == 22.56){
            notaExamen += 1;
        }else{
            notaExamen +=0;
        }

        System.out.println("5.");
        r1= sc.nextInt(); //Leer de teclado un entero

        if(r1 == 18){
            notaExamen += 1;
        }else{
            notaExamen +=0;
        }

        System.out.println("1.Un granjero tiene 2 arboles, cada árbol tiene 12 manzanas pero a cada árbol se le" +
                "han caido 4 manzanas y ya no son comestibles. ¿Cuantas manzanas le quedan al granjero? ");
        r1= sc.nextInt(); //Leer de teclado un entero

        if(r1 == 18){
            notaExamen += 1;
        }else{
            notaExamen +=0;
        }

        System.out.println("1.Un granjero tiene 2 arboles, cada árbol tiene 12 manzanas pero a cada árbol se le" +
                "han caido 4 manzanas y ya no son comestibles. ¿Cuantas manzanas le quedan al granjero? ");
        r1= sc.nextInt(); //Leer de teclado un entero

        if(r1 == 18){
            notaExamen += 1;
        }else{
            notaExamen +=0;
        }

        System.out.println("1.Un granjero tiene 2 arboles, cada árbol tiene 12 manzanas pero a cada árbol se le" +
                "han caido 4 manzanas y ya no son comestibles. ¿Cuantas manzanas le quedan al granjero? ");
        r1= sc.nextInt(); //Leer de teclado un entero

        if(r1 == 18){
            notaExamen += 1;
        }else{
            notaExamen +=0;
        }

        System.out.println("1.Un granjero tiene 2 arboles, cada árbol tiene 12 manzanas pero a cada árbol se le" +
                "han caido 4 manzanas y ya no son comestibles. ¿Cuantas manzanas le quedan al granjero? ");
        r1= sc.nextInt(); //Leer de teclado un entero

        if(r1 == 18){
            notaExamen += 1;
        }else{
            notaExamen +=0;
        }

        System.out.println("1.Un granjero tiene 2 arboles, cada árbol tiene 12 manzanas pero a cada árbol se le" +
                "han caido 4 manzanas y ya no son comestibles. ¿Cuantas manzanas le quedan al granjero? ");
        r1= sc.nextInt(); //Leer de teclado un entero

        if(r1 == 18){
            notaExamen += 1;
        }else{
            notaExamen +=0;
        }

        System.out.println("Tu nota final es un: ");

        contador.interrupt(); // Detiene el hilo del contador si acabas antes

    }
}
