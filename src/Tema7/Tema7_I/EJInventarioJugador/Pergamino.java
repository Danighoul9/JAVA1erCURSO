package Tema7.Tema7_I.EJInventarioJugador;

public class Pergamino  implements Pesable {
    private String nombre;
    private Double peso;
    private String magia;

    public Pergamino(String nombre, Double peso, String magia) {
        this.nombre = nombre;
        this.peso = peso;
        this.magia = magia;
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

    public String getMagia() {
        return magia;
    }

    public void setMagia(String magia) {
        this.magia = magia;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Pergamino{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", peso=").append(peso);
        sb.append(", magia='").append(magia).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
