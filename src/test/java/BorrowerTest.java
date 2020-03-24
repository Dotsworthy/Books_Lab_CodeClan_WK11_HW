import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    Borrower borrower;
    Book book;
    Library library;

    @Before
    public void before() {
        borrower = new Borrower("Clive");
        book = new Book("Vietnam War", "Max Hastings", "History");
        library = new Library(2);
    }
    @Test
    public void getBorrowedBooks() {
        assertEquals(0, borrower.getBookCount());

    }

}
