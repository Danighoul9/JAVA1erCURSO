package Tema7.Tema7_II.Ejercicios.Pedidos;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Cliente {

    private Long id;
    private String nombre;
    private Integer nivel;
}