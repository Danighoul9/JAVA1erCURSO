package Tema7.Tema7_I.Ejercicios.EjercicioCola;

public class App {
    static void main() {

        ColaMensaje<Notificacion> cola = new ColaMensaje<>();
        cola.insertar(new Notificacion("Nuevo email", 5.0));
        cola.insertar(new Notificacion("Dentista", 2.0));
        cola.insertar(new Notificacion("Jugar online", 3.0));
        cola.pintar();
        IO.println(cola.sacar());
        cola.pintar();


    }
}
