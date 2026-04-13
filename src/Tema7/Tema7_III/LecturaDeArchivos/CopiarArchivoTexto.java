package Tema7.Tema7_III.LecturaDeArchivos;


import java.io.*;

public class CopiarArchivoTexto {
    static void main()  {

        try {
            BufferedReader br = new BufferedReader(new FileReader("src/tema7_files/lectura.txt"));
            BufferedWriter bs = new BufferedWriter(new FileWriter("src/tema7_files/lectura.bak"));
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