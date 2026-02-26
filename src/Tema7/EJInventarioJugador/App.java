package Tema7.EJInventarioJugador;


public class App {

    static void main() {

        Inventario<Pesable> inventario = new Inventario<>("Inventario de prueba");
        try {
            inventario.addItem(new Pergamino("Bola de fuego", 0.5, "Te quema vivo"));
            IO.println("Añadido pergamino");
            inventario.addItem(new Espada("Espadón bestial", 55.0, 1000.0, "Espada a dos manos", 200.0));
            IO.println("Añadida espada bestial");
            inventario.addItem(new Espada("Espada de la maldición", 50.0, 2000.0, "Espada maldita", 300.0));
            IO.println("Añadida espada maldita");
        } catch (Exception e) {
            IO.println("OJO ---- " + e.getMessage());
        }

        IO.println(inventario);

    }
}
