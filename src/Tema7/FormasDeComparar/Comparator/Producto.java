package Tema7.FormasDeComparar.Comparator;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@Setter
@ToString

public class Producto {

    private String nombre;
    private String categoria;
    private String descripcion;
    private Double precio;

}
