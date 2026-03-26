package Tema7.Tema7_II.Ejercicios.Canciones;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@Setter
@ToString
public class Cancion {
    private String titulo;
    private Artista artista;
    private int anioLanzamiento;
    private int duracionSegs;
    private double popularidad;
    private Genero genero;
}