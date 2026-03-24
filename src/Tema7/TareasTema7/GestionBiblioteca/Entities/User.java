package Tema7.TareasTema7.GestionBiblioteca.Entities;

import lombok.*;

@AllArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode( of = "dni" )
public class User {
    private String dni;
    private String name;
    private String lastName;
    private String address;
    private String phoneNumber;
    private String email;


}