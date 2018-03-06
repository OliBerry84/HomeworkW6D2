import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {
    Library library;
    Book book;

    @Before
    public void before() {
        library = new Library(50);
        book = new Book();
    }

    @Test
    public void libraryBooksCount() {
        assertEquals(0, library.bookCount());
    }

    @Test
    public void canAddBook() {
        library.addBook(book);
        assertEquals(1, library.bookCount());
    }

    @Test
    public void cantAddBookIfMaxCapacity(){
        for (int i = 0; i<65; i++){
            library.addBook(book);
        }
        assertEquals(50, library.bookCount());
    }
}

