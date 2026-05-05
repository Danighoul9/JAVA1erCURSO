package Entidades;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@Setter
@ToString

public class Cliente {

    private String dni;
    private String nombre;
    private String telefono;
    private String email;
    private String ciudad;


    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("|| DNI: ");
        sb.append(dni);
        sb.append("| Nombre: ").append(nombre);
        sb.append("| Email:  ").append(email);
        sb.append("| Tlf: ").append(telefono);
        sb.append("| Ciudad: ").append(ciudad + " ||").append('\n');
        return sb.toString();
    }
}
