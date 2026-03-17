package Tema7.TareasTema7.PracticaMavenMapas.Entidades;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@Setter
@ToString

public class Item {
    private String nombre;
    private String descripcion;
    private int nivelRequerido;
    private TipoItem tipo;

}
