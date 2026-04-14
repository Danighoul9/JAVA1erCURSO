package Tema7.Tema7_III.EjemploPOO;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class App {

    static void main() {
        Path archivo = Paths.get("src/Tema7/Tema7_III/EjemploPOO/agenda.txt");
        Set<Contacto> contactos = new HashSet<>();

        try {
            List<String> agenda = Files.readAllLines(archivo);
            agenda.forEach(l -> {
                List<String> atributos = List.of(l.split(","));
                Contacto c = new Contacto(
                        Integer.parseInt(atributos.get(0)),
                        atributos.get(1),
                        atributos.get(2),
                        atributos.get(3));
                contactos.add(c);
            });

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        contactos.stream()
                .sorted(Comparator.comparing(Contacto::getNombre))
                .forEach(System.out::println);

        //Borrar ids menores de 10
        contactos.removeIf(c -> c.getId() < 10);

        //GRABAR ARCHIVO
        try {
            BufferedWriter bw = Files.newBufferedWriter(archivo);
            contactos.stream()
                    .sorted(Comparator.comparing(Contacto::getId))
                    .forEach(c -> {
                        try {
                            bw.write(c.getId() + "," + c.getNombre() + "," + c.getEmail() + "," + c.getTelefono());
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