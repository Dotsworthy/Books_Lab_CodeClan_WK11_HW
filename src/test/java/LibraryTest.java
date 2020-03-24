import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    Library library;
    Book book;

    @Before
    public void before() {
        library = new Library(1);
        book = new Book("Vietnam War", "Max Hastings","History");
    }

    @Test
    public void canGetBookCount() {
        assertEquals(0, library.getBookCount());
    }

    @Test
    public void canAddBook() {
        library.addBook(book);
        assertEquals(1,library.getBookCount());
    }

    @Test
    public void cantAddBookWhenFull() {
        library.addBook(book);
        library.addBook(book);
        assertEquals(1, library.getBookCount());
    }

}
