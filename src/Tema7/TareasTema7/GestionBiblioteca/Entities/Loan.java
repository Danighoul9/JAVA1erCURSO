package Tema7.TareasTema7.GestionBiblioteca.Entities;

import lombok.*;

import java.time.LocalDate;
import java.util.Objects;

@AllArgsConstructor
@Getter
@Setter
@ToString
public class Loan {

    private User user;
    private Book book;
    private LocalDate loanDate;
    private LocalDate returnDate;


    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Loan loan = (Loan) o;
        return Objects.equals(user, loan.user) && Objects.equals(book, loan.book);
    }

    @Override
    public int hashCode() {
        return Objects.hash(user, book);
    }

    /**
     * Devolvemos el libro poniendo la fecha de devolución
     */
    public void returnBook() {
        this.returnDate = LocalDate.now();
    }

    /**
     * Indica si el préstamo ha finalizado, el libro ha sido devuelto o no
     * @return
     */
    public boolean isActive() {
        return returnDate == null;
    }

}
