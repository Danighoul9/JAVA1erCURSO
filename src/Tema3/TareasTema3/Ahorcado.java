package Tema3.TareasTema3;

import java.util.Scanner;

public class Ahorcado {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] palabras = {"JAVA", "PROGRAMACION", "ESCUELA", "INFORMATICA", "INTERNET", "APLICACION", "REDES",
                "DOCENTE", "ESTUDIANTE", "CLASE", "CURSO", "TAREA", "MURCIELAGO", "FILTRO", "CONSTITUCION",
                "REFRIGERADOR", "PLAYA", "VENTANA", "CEBRA", "GUITARRA", "INVIERNO", "CRUZAR","BOTELLA", "CASTILLO",
                "CAMISETA", "AVION", "COMETA", "PUEBLO", "PARAGUAS", "EXTRAVAGANTE", "PARALELOGRAMO", "TELEVISION",
                "EMERGENCIAS", "FANTASMA", "ABOGADO", "RESPONSABLE", "IMAGINAR", "PROHIBIDO", "SUSTITUIR", "DIFICIL",
                "CULTURA", "SENTIMIENTO", "DISFRAZ", "NIEVE", "BRAZO", "RELOJ", "TEMPERATURA", "ARROYO", "IMPOSIBLE",
                "POSIBILIDAD", "DEPENDENCIA", "SENSACION", "INVESTIGAR"};

        int jugarDeNuevo = 0;
        
        do {
            int vidas = 6;
            boolean cambio;

            // Seleccionar palabra secreta
            int aleatorio = (int) (Math.random() * palabras.length);
            String palabraSecreta = palabras[aleatorio];

            StringBuffer sb = new StringBuffer(palabraSecreta);
            for (int i = 0; i < palabraSecreta.length(); i++) {
                sb.setCharAt(i, '_');
            }

            // Juego principal
            do {
                System.out.println(sb);
                System.out.println("Te quedan " + vidas + " vidas");
                System.out.println("Dime una letra para colocar en el ahorcado:");
                String letraUser = sc.nextLine().toUpperCase();

                if (letraUser.isEmpty()) {
                    System.out.println("Debes ingresar al menos una letra.");
                    continue;
                }

                cambio = false;
                for (int i = 0; i < palabraSecreta.length(); i++) {
                    if (letraUser.charAt(0) == palabraSecreta.charAt(i)) {
                        sb.setCharAt(i, palabraSecreta.charAt(i));
                        cambio = true;
                    }
                }

                if (!cambio) {
                    vidas--;
                }

            } while (sb.toString().contains("_") && vidas > 0);

            System.out.println("La palabra secreta era: " + palabraSecreta);
            if (vidas > 0) {
                System.out.println("🎉 ¡Felicidades! Has adivinado la palabra. 🥳");
            } else {
                System.out.println("❌ Te has quedado sin oportunidades. ¡Para la próxima será! 💔");
            }

            ////////////////////////////////////////////////////////////////////////////////////////////////////////
            // Preguntar si quiere jugar de nuevo
            System.out.println("¿Quieres jugar de nuevo?");
            System.out.println("1. Sí");
            System.out.println("2. No");
            do{

                try{

                    jugarDeNuevo = sc.nextInt();

                }catch (Exception e){

                    System.out.println("Entrada inválida. Debes ingresar 1 o 2.");
                    System.out.println("1 = SI");
                    System.out.println("2 = NO");
                    jugarDeNuevo = 0;
                    sc.nextLine();
                    continue;

                }

                if(jugarDeNuevo < 1 || jugarDeNuevo > 2){

                    System.out.println("Opción no válida.");
                    System.out.println("1 = SI");
                    System.out.println("2 = NO");
                    System.out.println("Selecciona una de esas opciones por favor");

                }

            }while (jugarDeNuevo != 1 && jugarDeNuevo != 2);
            ////////////////////////////////////////////////////////////////////////////////////////////////////////

        } while (jugarDeNuevo == 1);

        System.out.println("¡Gracias por jugar!");
    }
}
