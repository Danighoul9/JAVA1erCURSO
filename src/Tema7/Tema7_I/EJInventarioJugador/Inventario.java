package Tema7.Tema7_I.EJInventarioJugador;


import java.util.HashSet;
import java.util.Set;

public class Inventario<T extends Pesable> {

    private static final double PESO_MAXIMO = 100.0;

    private String nombre;
    private Set<T> items; //No repetidos

    public Inventario(String nombre) {
        this.nombre = nombre;
        this.items = new HashSet<>();
    }

    public String getNombre() {
        return nombre;
    }

    public Set<T> getItems() {
        return items;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Añadimos un item al inventario si no va a superar el peso máximo
     * @param item
     */
    public void addItem(T item) throws Exception {
        if (! (getPesoTotal() + item.getPeso() > PESO_MAXIMO))
            items.add(item);
        else throw new Exception("Peso máximo superado");
    }

    public void removeItem(T item){
        items.remove(item);
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Inventario{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", items=").append('\n');
        for(T item : items)
            sb.append(item).append('\n');
        sb.append('}');
        return sb.toString();
    }

    public double getPesoTotal() {
        double pesoTotal = 0;
        for(T item : items)
            pesoTotal += item.getPeso(); //Lo que se usa del interfaz
        return pesoTotal;
    }
}