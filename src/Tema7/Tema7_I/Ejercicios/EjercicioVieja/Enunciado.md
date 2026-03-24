### EJERCICIO COLECCIONES LISTAS Y CONJUNTOS

1. Crea una clase Libro con:
- Long id, String isbn, String titulo, String autor, int anioPublicacion
- Constructor
- Getters y Setters
- toString
- equals por isbn
2. Subclase LibroDigital con:
- double sizeMB
- Constructor
- Get y Set
- toString
3. Subclase LibroFisico con:
- int numPaginas
- Constructor
- Get y Set
- toString
4. Crea una clase Tienda con:
- Set<Libro> libros -> utiliza de implementación HashSet
- Métodos:
    - Agregar libro
    - Borrar libro
    - Buscar libro por isbn
    - Buscar libro por titulo
    - Mostrar todos los libros
    - Mostrar todos los libros ordenados por autor
    - Mostrar todos los libros ordenados por año de publicación
    - Mostrar todos los libros ordenados por título
    - Mostrar todos los libros ordenados por título y dentro por año publicación

5. Clase Principal
- Crea un objeto de la clase Tienda
- Agrega 12 libros, 6 digitales y 6 físicos
- Menú con opciones:
    1. Mostrar todos los libros
    2. Mostrar todos los libros ordenados por autor
    3. Mostrar todos los libros ordenados por título
    3. Mostrar todos los libros ordenados por título y año
    4. Borrar libro (isbn)
    5. Buscar libro por isbn
    6. Buscar libro por titulo
    7. Salir

### Notas
- Estructura las clases en paquetes
- Para ordenar por autor utiliza ArrayList.sort(Comparator)
- Para ordenar por año de publicación utiliza ArrayList.sort(Comparator)
- Para ordenar por título utiliza ? (decide tú)
- Para ordenar por título y año de publicación utiliza TreeSet
- Para buscar por titulo utiliza un bucle for
- Para buscar por isbn utiliza Collections.binarySearch
- Añade comentarios a los métodos
- ¿Para ordenar por autor usarías TreeSet? ¿Por?