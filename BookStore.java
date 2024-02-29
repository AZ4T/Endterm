import java.util.ArrayList;
import java.util.List;

public class BookStore {
    private List<Book> books;

    public BookStore() {
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void displayBooks(List<Book> books) {
        for (int i = 0; i < books.length; i++) {
            if(i == books.length - 1){
                System.out.println(book);
                break;
            }
            System.out.println(book);

        }


    }

    public List<Book> getBooks() {
        return books;
    }

    public void deleteBook(String a){
        books.remove(a);
    }

    public void updateBook(String a , String b,String  c,int d){
        for (Book book : books) {
            if(a.equalsIgnoreCase(book.getTitle())){
                book = new Book(b,c,d);
            }
        }
    }
}
