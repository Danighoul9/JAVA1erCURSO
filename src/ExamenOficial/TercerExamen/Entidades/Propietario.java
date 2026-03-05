package ExamenOficial.TercerExamen.TercerExamen.Entidades;

import java.util.ArrayList;

public class Propietario extends Persona {

     private String direccion;
     private ArrayList<Animal> animales;

    public Propietario(String nombre, String apellidos, String dni, String email,
                       String telefono, String direccion) {
        super(nombre, apellidos, dni, email, telefono);
        this.direccion = direccion;
        this.animales = new ArrayList<>();
    }

    //Constructor copia
    public Propietario(Propietario otro) {
        super(otro.nombre, otro.apellidos, otro.dni, otro.email, otro.telefono);
        this.direccion = otro.direccion;
        this.animales = new ArrayList<>();
    }


    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public ArrayList<Animal> getAnimales() {
        return animales;
    }

    /**
     * Añade un animal a la lista del propietario
     * @param a
     */
    public void addAnimales(Animal a) {
        if (a != null){
            animales.add(a);
        }
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Propietario{");
        sb.append("direccion='").append(direccion).append('\'');
        sb.append(", animales=").append('\n');
        for(Animal a : animales){
            sb.append(a).append('\n');
        }
        sb.append(", id='").append(id).append('\'');
        sb.append(", nombre='").append(nombre).append('\'');
        sb.append(", apellidos='").append(apellidos).append('\'');
        sb.append(", dni='").append(dni).append('\'');
        sb.append(", email='").append(email).append('\'');
        sb.append(", telefono='").append(telefono).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
