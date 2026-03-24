package Tema7.Tema7_II.Streams;


import java.util.function.Supplier;

public class EjemploSupplier_I {
    static void main() {

        Supplier<String> supplier = () -> { return new String("Hola Mundo!"); };
        //Supplier<String> supplier3 = () -> "Hola Mundo!";
        String valor = supplier.get();
        System.out.println("Obtención de un valor nuevo: " + valor);


    }
}
