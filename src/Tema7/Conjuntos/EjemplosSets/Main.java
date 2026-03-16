package Tema7.Conjuntos.EjemplosSets;


import java.time.LocalDate;

public class Main {
    static void main() {

        Curso daw1 = new Curso("1DAW");
        daw1.addAlumno(new Alumno("Pepe", "García", "pepe@garcia.com",
                "34434234A", LocalDate.of(2000,9,6)));
        daw1.addAlumno(new Alumno("María", "Gómez", "mariag@garcia.com",
                "11434234A", LocalDate.of(2000,7,6)));
        daw1.addAlumno(new Alumno("Sonia", "Avila", "soniaa@garcia.com",
                "22434234A", LocalDate.of(2000,6,6)));
        daw1.addAlumno(new Alumno("Javier", "Avila", "javierr@garcia.com",
                "33434234A", LocalDate.of(2000,9,6)));
        daw1.addAlumno(new Alumno("Laura", "Sánchez", "lauras@garcia.com",
                "44434234A", LocalDate.of(2000,5,16)));

        daw1.mostrarAlumnos();

        IO.println("Buscando a: " + "22434234A");
        IO.println(daw1.buscarAlumno("22434234A"));

        IO.println("--- Pintar alumnos ordenados por apellido ---");
        for(Alumno a: daw1.ordenarAlumnosPorApellido()) {
            IO.println(a);
        }

        IO.println("--- Pintar alumnos ordenados por fecha nacimiento ---");
        for(Alumno a: daw1.ordenarAlumnosPorFechaNac()) {
            IO.println(a);
        }



    }
}
