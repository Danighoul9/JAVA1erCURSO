package Tema6.TareaRepaso.Entidades;


public class Equipamiento extends ProductoBase {

    private String deporte;

    public Equipamiento(String nombre, Double precio, Integer stock, String deporte) {
        super(nombre, precio, stock);
        this.deporte = deporte;
    }

    public String getDeporte() {
        return deporte;
    }

    public void setDeporte(String deporte) {
        this.deporte = deporte;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Equipamiento{");
        sb.append("codigo='").append(codigo).append('\'');
        sb.append(", nombre='").append(nombre).append('\'');
        sb.append(", precio=").append(precio);
        sb.append(", stock=").append(stock);
        sb.append(", deporte='").append(deporte).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public String getInfo() {
        final StringBuffer sb = new StringBuffer("Equipamiento: ");
        sb.append(nombre).append(" ").append(deporte);
        sb.append(" -> precio: ").append(precio);
        sb.append(" -> stock: ").append(stock);
        sb.append("\n").append(codigo);
        return sb.toString();
    }


}
