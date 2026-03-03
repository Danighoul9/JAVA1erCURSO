package Tema6.TareaRepaso.Entidades;

public class RopaDeportiva extends ProductoBase {

    private String talla;

    public RopaDeportiva(String nombre, Double precio, Integer stock, String talla) {
        super(nombre, precio, stock);
        this.talla = talla;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("RopaDeportiva{");
        sb.append("codigo='").append(codigo).append('\'');
        sb.append(", nombre='").append(nombre).append('\'');
        sb.append(", precio=").append(precio);
        sb.append(", stock=").append(stock);
        sb.append(", talla='").append(talla).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public String getInfo() {
        final StringBuffer sb = new StringBuffer("Ropa Deportiva: ");
        sb.append(nombre).append(" ").append(talla);
        sb.append(" -> precio: ").append(precio);
        sb.append(" -> stock: ").append(stock);
        sb.append("\n").append(codigo);
        return sb.toString();
    }


}
