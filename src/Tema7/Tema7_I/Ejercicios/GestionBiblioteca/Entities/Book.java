package Tema7.Tema7_I.Ejercicios.GestionBiblioteca.Entities;

import lombok.*;

@AllArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode( of = "isbn" )
public class Book {

    private String isbn;
    private String title;
    private String author;
    private GeneroLiterario genre;
    private int publishYear;
}