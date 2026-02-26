## Comparación ArrayList y LinkedList

### Creación de clase Cancion
- titulo
- artista
- duracionSegundos
- equals por titulo+artista

### Medición de tiempo
long t1 = System.nanoTime();
long t2 = System.nanoTime();
IO.println(t2-t1);

### Creación de generador de números aleatorios
Random rand = new Random();
int randInt = rand.nextInt(TOTAL);

### Creación de clase ComparacionListas con un main
1. Crear una lista de Canciones con ArrayList
2. Crear una lista de Canciones con LinkedList
3. Cada una con TOTAL=100000 elementos. Para ello créalas con un for
   y añade el index 'i' al título y artista. Duración aleatoria entre 1 y 100 segundos.
4. Mide el tiempo de creación de ambas listas.
5. Vuelve a crear ambas listas pero ahora añade las canciones por el principio.
6. Mide el tiempo de creación de ambas listas.
7. Prueba acceder a 10000 elementos de forma aleatoria con lista.get(rand.nextInt(TOTAL))
8. Mide el tiempo de acceso aleatorio en cada una de las listas.
9. Elimina de cada lista 1000 elementos al inicio de cada una.
10. Mide el tiempo que tarda en eliminar elementos cada lista.
11. Busca con indexOf 100 canciones aleatorias en cada lista.
12. Mide el tiempo que tarda en buscar elementos cada lista.