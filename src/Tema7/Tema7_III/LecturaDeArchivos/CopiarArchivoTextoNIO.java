package Tema7.Tema7_III.LecturaDeArchivos;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class CopiarArchivoTextoNIO {
    static void main()  {

        try {
            BufferedReader br = Files.newBufferedReader(Paths.get("src/tema7_files/lectura.txt"));
            BufferedWriter bs = Files.newBufferedWriter(Paths.get("src/tema7_files/lectura.bak"));
            String linea = null;
            while((linea = br.readLine()) != null) {
                IO.println(linea);
                bs.write(linea);
                bs.newLine();
            }
            br.close(); //Importante
            bs.close(); //Importante
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException ex) {
            IO.println(ex.getMessage());
        }


    }
}
