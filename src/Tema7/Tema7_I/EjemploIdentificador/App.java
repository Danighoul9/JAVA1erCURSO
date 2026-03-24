package Tema7.Tema7_I.EjemploIdentificador;

public class App {
    static void main() {

        //Algo tiene que implementar/heredar de Identificable
        Repositorio<Producto> repo = new Repositorio<>();

        repo.agregar(new Producto("Mesa cocina", 250.0));
        repo.agregar(new Producto("Juego de sillas", 350.0));

        IO.println(repo);

    }
}
