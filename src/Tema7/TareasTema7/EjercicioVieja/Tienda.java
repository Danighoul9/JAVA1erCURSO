package Tema7.TareasTema7.EjercicioVieja;


import java.util.*;

public class Tienda {

    private Set<Libro> libros = new HashSet<>();

    public Set<Libro> getLibros() {
        return libros;
    }

    /**
     * HashSet, no va a permitir duplicados por isbn
     * @param libro
     */
    public void agregarLibro(Libro libro) {
        libros.add(libro);
    }

    /**
     * Eliminar un libro
     * @param libro
     */
    public void eliminarLibro(Libro libro) {
        libros.remove(libro);
    }

    /**
     * Buscar un libro por ISBN (binarySearch)
     * SI QUEREMOS USAR BINARYSEARCH EN ARRAYLIST, DEBEMOS ORDENAR LA LISTA
     * CADA VEZ QUE AÑADAMOS UN NUEVO ELEMENTO, NO JUSTO ANTES DE BUSCAR <- INEFICIENTE
     * @param isbn
     * @return
     */
    public Libro buscarLibroByIsbn(String isbn) {
        //Collections.binarySearch(List, Object, Comparator)
        List<Libro> librosList = new ArrayList<>(libros);
        //La lista debe estar ordenador con el mismo comparador que binarySearch
        librosList.sort(Comparator.comparing(Libro::getIsbn));
        //Si justo antes de buscar tengo que ordenadar, pierdo la mejora en velocidad
        int index = Collections.binarySearch(librosList, new Libro(isbn,"","",0),
                Comparator.comparing(Libro::getIsbn));
        //Si la posición es negativa, no hay Libro con ese ISBN
        if (index >= 0)
            return librosList.get(index); //Elemento en la posición index
        else
            return null;
    }

    /**
     * Buscar un libro por título
     * @param titulo
     * @return
     */
    public Libro buscarLibroByTitulo(String titulo) {
        for(Libro l : libros) {
            if(l.getTitulo().equals(titulo))
                return l;
        }
        return null;
    }

    public void mostrarLibros() {
        IO.println("--- LIBROS ---");
        for(Libro l : libros) {
            IO.println(l);
        }
    }

    /**
     * Devolver los libros ordenados por autor
     * @return List<Libro>
     */
    public List<Libro> getLibrosOrdenadosPorAutor() {
        List<Libro> librosOrdAutor = new ArrayList<>(libros);
        librosOrdAutor.sort(Comparator.comparing(Libro::getAutor));
        return  librosOrdAutor;
    }

    /**
     * Devolver los libros ordenados por año de publicación
     * @return List<Libro>
     */
    public List<Libro> getLibrosOrdenadorPorAnioPublicacion() {
        List<Libro> librosOrdAnio = new ArrayList<>(libros);
        librosOrdAnio.sort(Comparator.comparing(Libro::getAnioPublicacion).reversed());
        return  librosOrdAnio;
    }

    /**
     * Devolver libros ordenados por título
     * @return Set<Libro>
     */
    public Set<Libro> getLibrosOrdenadosPorTitulo() {
        Set<Libro> librosOrdTitulo = new TreeSet<>(Comparator.comparing(Libro::getTitulo));
        librosOrdTitulo.addAll(libros);
        return librosOrdTitulo;
    }

    /**
     * Devolver libros ordenados por título y año
     * @return
     */
    public Set<Libro> getLibrosOrdenadosPorTituloYAnio() {
        Set<Libro> librosOrdTituloAnio = new TreeSet<>(
                Comparator.comparing(Libro::getTitulo)
                        .thenComparing(Libro::getAnioPublicacion)
        );

        librosOrdTituloAnio.addAll(libros);
        return librosOrdTituloAnio;
    }

}
