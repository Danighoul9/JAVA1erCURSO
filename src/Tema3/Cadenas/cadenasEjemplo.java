package Tema3.Cadenas;

public class cadenasEjemplo {
    public static void main(String[] args) {

        char[] texto2 = {'H','o','l','a',' ','m','u','n','d','o'};
        System.out.println(texto2[2]);

        //              0123456789
        String texto = "Hola mundo";
        System.out.println(texto.charAt(2));

        //Pintar String con un for
        System.out.println("String con for");
        for(int i=0; i < texto.length(); i++) {
            System.out.print(texto.charAt(i));
        }
        System.out.println();

        //Creación de un String
        String cadena = new String("Hola mundo");
        String cadena2 = "Hola mundo"; //Equivalente a lo de arriba
        String cadenaVacia = "";

        //Longitud de la cadena
        System.out.println("Longitud de '" + cadena + "' es " + cadena.length());

        //Empieza con
        System.out.println("Empieza con 'Ho'? " + cadena.startsWith("Ho"));

        //Termina con
        System.out.println("Termina con 'do'? " + cadena.endsWith("do"));

        //Subcadena --> cadena.substring(inicio, fin), finMaximo = longitud + 1
        System.out.println("Subcadena: " + cadena.substring(6, 10));
        System.out.println("Subcadena: " + cadena.substring(8));

        //Convertir números a String -- String.valueOf(numero)
        int numero = 12345;
        String numeroString = String.valueOf(numero);
        System.out.println(numeroString + 2);

        //Convertir String que representa un número a número -- Integer.parseInt(cadena)
        //Double.parseDouble(cadena)
        //Long.parseLong(cadena)
        int otroNumero = Integer.parseInt(numeroString);
        System.out.println(otroNumero + 99);

        //Quitar espacios en blanco delante y detrás --> cadena.trim()
        String cadena3 = "   Tiene  espacios   ";
        System.out.println(cadena3);
        System.out.println(cadena3.trim());

        //Imprimir con formato
        //printf
        /*
            %s: Para cadenas de texto (String).
            %d: Para números enteros (int, long, etc.).
            %f: Para números decimales (float, double).
            %n: Para un salto de línea (es preferible a \n en printf).
         */
        System.out.printf("%.2f %n", 10.045);
        System.out.printf("%s %5.3f en el año %d %n",
                "El precio del producto es ",
                249.595,
                2025);

        System.out.printf("%-10s | %5d%n", "Producto", 150);
        System.out.printf("%-10s | %5d%n", "Sal", 5);

        //Comparación de cadenas
        //obj1.equals(obj2) --> Comprobar que dos objetos son iguales
        String cad1 = "Programación";
        String cad2 = "Programación";
        if (cad1.equals(cad2)) {
            System.out.println("Son iguales");
        } else {
            System.out.println("No son iguales");
        }

        //Otra manera de comparar cadenas
        //compareTo
        // negativo si cad1 < cad2 lexicográficamente
        // positivo si cad1 > cad2 lexicográficamente
        // 0 si cad1 == cad2
        System.out.println(cad1.compareTo(cad2));
        if (cad1.compareTo(cad2) == 0) {
            System.out.println("Son iguales");
        } else {
            System.out.println("No son iguales");
        }

        //Cortar una cadena con una expresión --> cadena.split(expresión)
        String cadena4 = "192.168.1.250";
        String[] trocitos = cadena4.split("\\.");
        for(int i=0; i < trocitos.length; i++) {
            System.out.println(trocitos[i]);
        }

        //Pasar cadena a minúsculas --> cadena.toLowerCase()
        String cadena5 = "HOLA MUNDO";
        System.out.println(cadena5.toLowerCase());

        //Pasar cadena a mayúsculas --> cadena.toUpperCase()
        String cadena6 = "hola mundo";
        System.out.println(cadena6.toUpperCase());



    }

}
