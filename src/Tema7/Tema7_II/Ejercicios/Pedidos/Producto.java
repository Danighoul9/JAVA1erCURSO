package Tema7.Tema7_II.Ejercicios.Pedidos;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Producto {

    private Long id;
    private String nombre;
    private CategoriaProducto categoria;
    private Double precio;

}