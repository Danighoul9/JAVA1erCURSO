package Tema5.TareasTema5.Spotify;
import java.util.Scanner;

public class Test {
    static void main(String[] args) {


        //1. Crea una lista de Spotify de 10 canciones
        //2. Píntala
        //3. Recorre la lista con un for y pinta cada canción su título y autor solo
        //4. Pide por teclado un título y un autor
        //5. Elimina la canción de la lista con ese título y ese autor

        //Hacer dos listas mediante constructor copia,
        //eliminar una canción de una lista, y ver qué pasa en la otra lista

        Scanner sc = new Scanner(System.in);

        ListaSpotify l1 = new ListaSpotify("Lista programar");
        l1.addCancion(new Cancion("Black in black", "AC/DC",200));
        l1.addCancion(new Cancion("Killing in the name", "Rage against the machine", 300));
        l1.addCancion(new Cancion("Enter Sandman", "Metallica", 400));

        for(Cancion c: l1.getCanciones()) {
            System.out.println(c.getTitulo() + " - " + c.getArtista());
        }

        System.out.println("Dime título");
        String titulo = sc.nextLine();
        System.out.println("Dime artista");
        String artista = sc.nextLine();

        l1.removeCancion(new Cancion(titulo, artista, 0));

        System.out.println(l1);

        //Crear una lista nueva con el constructor copia
        ListaSpotify l2 = new ListaSpotify(l1);
        l2.removeCancion(new Cancion("Killing in the name", "Rage against the machine", 300));

        System.out.println(l1);
        System.out.println("---------");
        System.out.println(l2);
    }
}
