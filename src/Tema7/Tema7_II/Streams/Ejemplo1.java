package Tema7.Tema7_II.Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Ejemplo1 {

    static void main() {

        List<String> palabras = new ArrayList<>(Arrays.asList("Java", "Hola", "Mundo", "JavaScript", "sueño", "PHP"));
        //Imprimir esas palabras en mayúsculas
        for(String palabra : palabras) {
            if (palabra.length() > 5)
                IO.println(palabra.toUpperCase());
        }

        IO.println("---------------");

        //Programación funcional
        //Streams -> no modifican la colección original, solo el flujo
        palabras.stream() //Convertir a un flujo
                .filter(palabra -> palabra.length() > 5)
                .filter(x -> x.startsWith("s"))  //String -> boolean
                .peek(IO::println) //String -> nada
                .map(String::toUpperCase)
                .forEach(IO::println);


        IO.println("---------------");
        //Pintar "palabras"
        palabras.forEach(IO::println);
        IO.println("---------------");
        palabras.removeIf(palabra -> palabra.length() > 5); //Sí modifica la colección
        palabras.forEach(IO::println);

        List<String> pls = List.of("Uno", "Dos", "Tres");


    }

}
