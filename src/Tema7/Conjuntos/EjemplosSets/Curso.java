package Tema7.Conjuntos.EjemplosSets;

import java.util.*;

public class Curso {

    private String nombre;
    private Set<Alumno> alumnos = new HashSet<>();

    public Curso(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Set<Alumno> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(Set<Alumno> alumnos) {
        this.alumnos = alumnos;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Curso{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", alumnos=").append('\n');
        for(Alumno alumno : alumnos)
            sb.append(alumno).append('\n');
        sb.append('}');
        return sb.toString();
    }


    //1. Añadir alumno: no se repita el email
    public void addAlumno(Alumno alumno){
        alumnos.add(alumno);
    }

    //2. Eliminar alumno
    public boolean removeAlumno(Alumno alumno){
        return alumnos.remove(alumno);
    }

    //3. Mostrar alumnos
    public void mostrarAlumnos() {
        IO.println("--- ALUMNOS ---");
        for(Alumno alumno : alumnos)
            IO.println(alumno);
    }

    //4. Buscar por dni
    public Alumno buscarAlumno(String dni) {
        for(Alumno alumno: alumnos) {
            if (alumno.getDni().equals(dni)) {
                return alumno;
            }
        }
        return null;
    }

    //5. Ordenar alumnos por apellido
    public Set<Alumno> ordenarAlumnosPorApellido() {
        //Elimina repetidos en la ordenación
        Set<Alumno> ordenados = new TreeSet<>(
                Comparator.comparing(Alumno::getApellidos));
        ordenados.addAll(alumnos);
        return ordenados;
    }

    //6. Ordenar por fecha de nacimiento
    public List<Alumno> ordenarAlumnosPorFechaNac() {
        List<Alumno> ordenados = new ArrayList<>(alumnos);
        ordenados.sort(Comparator.comparing(Alumno::getFechaNacimiento).reversed());
        return ordenados;
    }


}
