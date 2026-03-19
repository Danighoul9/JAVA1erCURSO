package Tema7.Comparable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.jetbrains.annotations.NotNull;

@AllArgsConstructor
@Getter
@Setter
@ToString

public class Personaje implements Comparable<Personaje> {
    private String nombre;
    private String clase;
    private Integer nivel;
    private Integer vida;

    @Override
    public int compareTo(@NotNull Personaje o) {
        //Ordenamos por nombre alfabéticamente
        return this.nombre.compareTo(o.nombre);
    }
}
