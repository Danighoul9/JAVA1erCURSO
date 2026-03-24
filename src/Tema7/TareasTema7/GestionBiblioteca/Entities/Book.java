package Tema7.TareasTema7.GestionBiblioteca.Entities;

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