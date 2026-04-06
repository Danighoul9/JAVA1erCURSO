package Tema7.Tema7_I.Practica1Tema7.Entities;

import lombok.*;
import org.jetbrains.annotations.NotNull;

import java.time.LocalDate;
import java.util.Comparator;

@AllArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode(of = "dni")

public class Socio implements Comparable<Socio> {

    /**
     * Socio
     * Atributos: dni, nombre, apellidos, email, telefono, fechaAlta (LocalDate), cuota (enum: BASICA, PREMIUM, FAMILIAR).
     * Constructor, getters, setters, toString(), equals(dni), hashCode(dni).
     * Implementa Comparable<Socio> ordenando por apellidos y nombre (orden alfabético).
     */

    private String dni;
    private String nombre;
    private String apellidos;
    private String email;
    private String telefono;
    private LocalDate fechaAlta;
    private Cuota cuota;

    @Override
    public int compareTo(Socio o) {
        return Comparator.comparing(Socio::getApellidos)
                .thenComparing(Socio::getNombre)
                .compare(this, o);
    }
}
