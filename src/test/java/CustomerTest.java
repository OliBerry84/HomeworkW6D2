import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class CustomerTest {

    private Customer customer;
    private Book book;

    @Before
    public void before(){
        customer = new Customer();
        book = new Book();
    }

    @Test
    public void canAddToBorrowed(){
        customer.addBook(book);
        assertEquals(1, customer.getBookCount());
    }

    @Test
    public void canRemoveFromBorrowed(){
        customer.addBook(book);
        Book removed = customer.removeBook();
        assertNotNull(removed);
        assertEquals(0, customer.getBookCount());
    }
}