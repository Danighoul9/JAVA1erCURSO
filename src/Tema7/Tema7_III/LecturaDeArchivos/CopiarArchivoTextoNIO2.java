package Tema7.Tema7_III.LecturaDeArchivos;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class CopiarArchivoTextoNIO2 {
    static void main()  {



        try {
            BufferedWriter bw = Files.newBufferedWriter(Paths.get("src/tema7_files/nuevo.txt"));

            //LEER TODAS LAS LÍNEAS DE UN ARCHIVO
            List<String> lineas = Files.readAllLines(Paths.get("src/tema7_files/lectura.txt"));
            lineas.forEach(System.out::println);

            //ESCRIBIR TODAS LAS LÍNEAS EN OTRO FICHERO
            lineas.forEach(l -> {
                try {
                    bw.write(l);
                    bw.newLine();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            });

            bw.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }




    }
}