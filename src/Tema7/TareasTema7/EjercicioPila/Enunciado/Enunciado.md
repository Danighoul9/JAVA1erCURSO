## Crea una clase genérica PilaNumerica de números

```java
class PilaNumerica<T extends Number> 
```

### Internamente será un ArrayList de tipo T.
### Métodos:
- apilar(T): añade un elemento al final de la lista.
- T desapilar(): devuelve el elemento al final de la lista y lo elimina.
- Double suma(): devuelve la suma de todos los elementos de la lista.
- pintar(): imprime todos los elementos de la lista.

### Ejemplo main:
- Crea una Pila de enteros y otra de doubles
- Añádeles algunos números y muestra su suma y su contenido.
- Elimina algún elemento de las pilas y vuelve a mostrar su contenido.