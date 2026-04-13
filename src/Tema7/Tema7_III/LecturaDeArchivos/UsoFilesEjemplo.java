package Tema7.Tema7_III.LecturaDeArchivos;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class UsoFilesEjemplo {
    static void main() {


        Path ruta = Paths.get("src","tema7_files","lectura.txt");
        Path ruta2 = Paths.get("src/tema7_files/lectura2.txt");
        Path carpeta = Paths.get("src/tema7_files/savedGames");

        try {
            //Files.copy(ruta, ruta2);
            //Files.createDirectory(carpeta);
            Files.delete(ruta2);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
