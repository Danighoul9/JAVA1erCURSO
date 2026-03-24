package Tema7.TareasTema7.GestionBiblioteca.App;

import Tema7.TareasTema7.GestionBiblioteca.Entities.*;
import Tema7.TareasTema7.GestionBiblioteca.Services.*;

public class App {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca("Biblioteca", "Calle 123", "123456789", "");

        for(int i = 0; i < 10; i++) {
            biblioteca.addBook(new Book("isbn-"+i, "Titulo-"+i, "Autor-"+i, null, 2020+i));
        }

        for(int i = 0; i < 4; i++) {
            biblioteca.addUser(new User("dni-"+i, "Nombre-"+i, "Apellido-"+i, "Direccion-"+i, "Telefono-"+i, "email-"+i+"@example.com"));
        }

        biblioteca.addLoan("dni-0", "isbn-1");
        biblioteca.addLoan("dni-0", "isbn-3");
        biblioteca.addLoan("dni-1", "isbn-1");
        biblioteca.addLoan("dni-1", "isbn-4");
        biblioteca.addLoan("dni-1", "isbn-5");
        biblioteca.addLoan("dni-2", "isbn-4");
        biblioteca.addLoan("dni-2", "isbn-6");
        biblioteca.addLoan("dni-2", "isbn-8");


        IO.println("--- Pŕestamos de dni-1 ---");
        biblioteca.printBooksAvailable();
        for(Loan loan : biblioteca.findLoansByUser("dni-1")) {
            IO.println(loan);
        }

    }
}
