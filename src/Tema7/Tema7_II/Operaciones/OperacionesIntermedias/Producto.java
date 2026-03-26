package Tema7.Tema7_II.Operaciones.OperacionesIntermedias;

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
    private String descripcion;
    private double precio;
    private CategoriaProducto categoria;
}
