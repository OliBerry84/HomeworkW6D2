import java.util.ArrayList;

public class Customer {
    private ArrayList<Book> book;

    public Customer(){
        this.book = new ArrayList<>();
    }

    public int getBookCount(){
        return this.book.size();
    }

    public void addBook(Book borrower){
        this.book.add(borrower);
    }

    public Book removeBook(){
        return this.book.remove(0);
    }
}
