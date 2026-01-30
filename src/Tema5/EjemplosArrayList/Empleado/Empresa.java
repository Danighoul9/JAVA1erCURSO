package Tema5.EjemplosArrayList.Empleado;

import java.util.ArrayList;

public class Empresa {

    private String nombre;
    private ArrayList<Empleado> empleados;

    //En el constructor no se suele pasar el ArrayList, se inicializa dentro
    public Empresa(String nombre) {
        this.nombre = nombre;
        empleados = new ArrayList<>(); //Se inicializa el ArrayList
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //No se suele añadir el setter de la propiedad que tenga ArrayList. En su lugar:
    //Métodos para añadir y eliminar empleados en el ArrayList

    /**
     * Añade un empleado al ArrayList, al final
     * @param empleado
     */
    public void addEmpleado(Empleado empleado) {
        empleados.add(empleado);
    }

    /**
     * Busca un empleado en el ArrayList y lo elimina
     * @param empleado
     */
    public void removeEmpleado(Empleado empleado) {
        //No utiliza la posición para eliminar un empleado, lo que hace
        //es ir buscando el empleado en el ArrayList, si lo encuentra lo borra
        //sino, no hace nada
        empleados.remove(empleado);
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Empresa{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", empleados=").append('\n');
        //Generar un string para los objetos del ArrayList separados por un salto
        for(Empleado empleado : empleados)
            sb.append(empleado).append('\n');
        sb.append('}');
        return sb.toString();
    }
}
