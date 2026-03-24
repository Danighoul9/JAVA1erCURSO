package Tema7.TareasTema7.GestionBiblioteca.Services;


import Tema7.TareasTema7.GestionBiblioteca.Entities.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;
import java.util.*;

@Getter
@Setter
@ToString
@EqualsAndHashCode(of = "name")
public class Biblioteca {

    private String name;
    private String address;
    private String phoneNumber;
    private String email;
    private Map<String, Book> catalog;
    private Map<String, User> users;
    private Map<User, HashSet<Loan>> loans; //Key: User, Value: HashSet<Loan>

    public Biblioteca(String name, String address, String phoneNumber, String email) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.catalog = new HashMap<>();
        this.users = new HashMap<>();
        this.loans = new TreeMap<>(Comparator.comparing(User::getLastName).thenComparing(User::getName));
    }

    public void addBook(Book book) {
        this.catalog.put(book.getIsbn(), book); //key-value
    }

    public void addUser(User user) {
        this.users.put(user.getDni(), user); //key-value
    }

    /**
     * Comprobamos que el libro esté en la biblioteca
     * Comprobamos que no esté prestado a ningún usuario
     * @param isbn
     * @return
     */
    public boolean isBookAvailable(String isbn) {
        if (this.catalog.containsKey(isbn)) {
            for(User user : this.loans.keySet()) { //Recorre todos los usuarios que hayan hecho préstamos
                for(Loan loan : this.loans.get(user)) { //this.loans.get(user) -> HashSet<Loan>
                    if (loan.getBook().getIsbn().equals(isbn)) {
                        if (loan.isActive()) {
                            return false;
                        }
                    }
                }
            }
            return true; //El libro no está prestado
        } else {
            return false; //No está en el catálogo
        }
    }

    /**
     * Añadir préstamo:
     * - Comprobar que el dni es de un usuario del sistema
     * - Comprobar que el isbn es de un libro no prestado: isBookAvailable
     * - Crear préstamo con: user, book, loanDate=ahora, null
     * @param dni
     * @param isbn
     */
    public void addLoan(String dni, String isbn) {
        if (users.containsKey(dni)) {
            if (isBookAvailable(isbn)) {
                //Crear el nuevo préstamo User, Book, loanDate, returnDate
                Loan loan = new Loan(users.get(dni), catalog.get(isbn), LocalDate.now(), null);
                //Ver que el usuario no tenga préstamos, habría que crear el HashSet
                HashSet<Loan> userLoans = loans.get(users.get(dni));
                if (userLoans == null) {
                    userLoans = new HashSet<Loan>();
                }
                //Añadimos a los préstamos del usuario el nuevo préstamo
                userLoans.add(loan);
                //Añadimos key-value al mapa con todos los préstamos de todos los usuarios
                loans.put(users.get(dni), userLoans);
            }
        } else {
            throw new IllegalArgumentException("El usuario no existe");
        }
    }

    /**
     * Devolver libro:
     * - Comprobar que el dni es de un usuario del sistema
     * - Sacar todos los préstamos del usuario
     * - Nos recorremos todos sus préstamos y actualizamos el returnDate
     * del libro que tenga el isbn del parámetro
     *
     * @param dni
     * @param isbn
     */
    public void returnBook(String dni, String isbn) {
        if (users.containsKey(dni)) {
            HashSet<Loan> userLoans = loans.get(users.get(dni));
            for(Loan loan : userLoans) {
                if (loan.getBook().getIsbn().equals(isbn)) {
                    loan.setReturnDate(LocalDate.now()); //Actualizamos el returnDate
                }
            }
        }
    }

    /**
     * Devuelve todos los préstamos de un usuario
     * @param dni
     * @return
     */
    public HashSet<Loan> findLoansByUser(String dni) {
        if (users.containsKey(dni)) {
            return loans.get(users.get(dni));
        } else
            return null;
    }

    /**
     * Muestra todos los libros no prestados
     * Nos recorremos el catálogo de libros
     * Para cada libro comprobamos que esté disponible, o sea que no esté en ningún préstamos sin returnDate
     */
    public void printBooksAvailable() {
        IO.println("--- Libros disponibles ---");
        for(Book book: catalog.values()) {
            if (isBookAvailable(book.getIsbn())) {
                IO.println(book);
            }
        }
    }



}
