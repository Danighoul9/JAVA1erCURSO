package Tema5.TareasTema5.Videojuego;

public class TestTiendaAlquilerVideojuegos {
    static void main(String[] args) {

        TiendaAlquilerVideojuego game = new TiendaAlquilerVideojuego("GameStop");

        game.agregarVideojuego(new Videojuego("Mario Bros", "Nintendo 64", Videojuego.CategoriaVideojuego.AVENTURA));
        game.agregarVideojuego(new Videojuego("Street fighter II", "NES", Videojuego.CategoriaVideojuego.ACCION));
        game.agregarVideojuego(new Videojuego("Final Fantasy", "PS4", Videojuego.CategoriaVideojuego.ACCION));

        for(int i = 0; i < 25; i++){
            game.alquilarJuego("Mario Bros","Nintendo 64");
            game.devolverJuego("Mario Bros","Nintendo 64");
        }

        for(int i = 0; i < 25; i++){
            game.alquilarJuego("Final Fantasy","PS4");
            game.devolverJuego("Final Fantasy","PS4");
        }

        System.out.println("Hay " + game.getNumeroVideojuegos() + " videojuegos distintos.");
        System.out.println("Videojuegos en el catalogo: ");
        game.mostrarVideojuegos();
        System.out.println("He ganado: " + game.calcularGananciasTotales() + "€");

    }
}
