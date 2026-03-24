package Tema7.Tema7_II.Streams;


public class Tarjeta implements Conversor{

    private String nombre;
    private String email;
    private String telefono;

    public Tarjeta(String nombre, String email, String telefono) {
        this.nombre = nombre;
        this.email = email;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Tarjeta{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", email='").append(email).append('\'');
        sb.append(", telefono='").append(telefono).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public void toPDF() {
        IO.println("PDF de tarjeta");
    }

    @Override
    public void toText(Object o) {
        IO.println("Convertir tarjeta a texto:");
        IO.println(this);
    }

    static void main() {
        Tarjeta t = new Tarjeta("Pepe", "pepe@gmail.com", "666666666");
        t.toPDF();
        t.toText(t.email);

    }
}
