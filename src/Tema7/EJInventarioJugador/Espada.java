package Tema7.EJInventarioJugador;

public class Espada implements Pesable {

    private String nombre;
    private Double peso;
    private Double precio;
    private String tipo;
    private Double danio;

    public Espada(String nombre, Double peso, Double precio, String tipo, Double danio) {
        this.nombre = nombre;
        this.peso = peso;
        this.precio = precio;
        this.tipo = tipo;
        this.danio = danio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Double getDanio() {
        return danio;
    }

    public void setDanio(Double danio) {
        this.danio = danio;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Espada{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", peso=").append(peso);
        sb.append(", precio=").append(precio);
        sb.append(", tipo='").append(tipo).append('\'');
        sb.append(", danio=").append(danio);
        sb.append('}');
        return sb.toString();
    }
}
