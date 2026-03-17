package Tema7.TareasTema7.PracticaMavenMapas.Entidades;

import java.util.*;

import lombok.Getter;

@Getter
public class Personaje {

    private String nombre;
    private Map<String, Item> inventario;
    private Map<TipoEquipamiento, Item> equipamiento;

    public Personaje(String nombre) {
        this.nombre = nombre;
        this.inventario = new HashMap<>();
        this.equipamiento = new TreeMap<>(Comparator.comparing(TipoEquipamiento::toString));
    }

    /**
     * Añadir item al inventario
     * @param item
     */
    public void addItem(Item item){
        this.inventario.put(item.getNombre(), item);
    }

    /**
     * Borrar un item del inventario
     * @param nombreItem
     */
    public void removeItem(String nombreItem){
        this.inventario.remove(nombreItem);
    }

    /**
     * Mostrar todos los objetos del inventario por medio de una lista
     * @return
     */
    public List<Item> getInventario(){
        return new ArrayList<>(inventario.values());
    }

    /**
     * Buscar un item en el inventario del personaje por su nombre
     * @param nombreItem
     * @return Item o null si no se encuentra
     */
    public Item buscarItem(String nombreItem){
        return inventario.get(nombreItem);
    }

    /**
     * 🛡️ Equipamiento
     * Equipar un objeto desde el inventario.
     * Desequipar un objeto (y devolverlo al inventario).
     * Mostrar el equipamiento actual.
     * Evitar equipar objetos incompatibles con el slot.
     */
    public void agregarEquipo(TipoEquipamiento tipo,Item item){

        //No vamos a comprobar que el item este en el inventario

        //Verificar que el item no este ya en el equipo
        if (equipamiento.containsKey(tipo)){
            //Mover el item al inventario y poner el nuevo
            Item antiguo = equipamiento.get(tipo);
            inventario.put(antiguo.getNombre(),antiguo);
        }

        //Poner el nuevo
        //toDO - Habria que comprobar TipoItem para ver si puedo verlo donde corresponde
        equipamiento.put(tipo, item);
        //Eliminar el nuevo item del inventario
        inventario.remove(item.getNombre());



    }

    /**
     *
     * @param tipo
     */
    public void removeEquipo(TipoEquipamiento tipo){
        Item item = equipamiento.get(tipo);
        equipamiento.remove(tipo);
        inventario.put(item.getNombre(),item);
    }

    /**
     * Devolvemos una lista con todos el equipaje del personaje
     * @return <Map.Entry<TipoEquipamiento,Item>
     */
    public List<Map.Entry<TipoEquipamiento,Item>> getEquipo(){
        return new ArrayList<>(equipamiento.entrySet());
    }


}
