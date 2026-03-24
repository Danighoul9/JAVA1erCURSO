package Tema7.Tema7_I.Mapas;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class EjemploMapa {
    static void main(String[] args) {
        //Creación del mapa -> HashMap
        Map<String, String> diccionario = new HashMap<>();

        //Insertar pares clave-valor
        diccionario.put("dog", "perro");
        diccionario.put("house", "casa");
        diccionario.put("cat", "gato");
        diccionario.put("blade", "espada");
        diccionario.put("laptop", "portátil");

        //Pintar diccionario
        IO.println(diccionario);

        //Eliminar por clave
        diccionario.remove("dog");
        IO.println(diccionario);

        //Obtener valor por clave
        IO.println(diccionario.get("house"));

        //Preguntar si existe una clave
        IO.println(diccionario.containsKey("house"));
        IO.println(diccionario.containsKey("dog"));

        //Recorrer el mapa con for -> map.keySet() nos devuelve un Set con las claves Set<Clave>
        //Para cada clave sacamos su valor con diccionario.get(clave)
        IO.println("--- Claves ---");
        for(String clave : diccionario.keySet()) {
            IO.println(clave + " -> " + diccionario.get(clave));
        }

        //Pintar el diccionario ordenado por claves
        IO.println("--- Ordenado por claves ---");
        Set<String> clavesOrdenadas = new TreeSet<>(diccionario.keySet());
        for(String clave : clavesOrdenadas) {
            IO.println(clave + " -> " + diccionario.get(clave));
        }

        //Mostrar todos los valores
        IO.println("--- Valores ---");
        for(String valor : diccionario.values()) {
            IO.println(valor);
        }

        //Mostrar los pares clave-valor como Entry<Clave, Valor>
        //entrySet() me devuelve un Set<Entry<Clave, Valor>>
        IO.println("--- Entries ---");
        for(Map.Entry<String,String> entrada : diccionario.entrySet()) {
            IO.println(entrada.getKey() + " -> " + entrada.getValue());
        }


    }
}
