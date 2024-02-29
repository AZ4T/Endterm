import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main  {
    public static void main(String[] args) {
        // Create a book store
        BookStore bookstore = new BookStore();
        // Add books to the store
        Book book1 = new Book("Python Programming", "John Smith", 30);
        Book book2 = new Book("Data Science Handbook", "Alice Johnson", 25);
        Book book3 = new Book("pride and prejudice", "Jane Austen", 30);
        Book book4 = new Book("Abai joly", "M.Auezov", 35);
        Book book5 = new Book("Abay joly 2", "M.Auezov", 45);
        Book book6 = new Book("War and peace", "L.Tolstoy", 45);
        Book book7 = new Book("Player", "Ostin", 55);


        bookstore.addBook(book1);
        bookstore.addBook(book2);
        bookstore.addBook(book3);
        bookstore.addBook(book4);
        bookstore.addBook(book5);
        bookstore.addBook(book6);
        bookstore.addBook(book7);

        Scanner scanner = new Scanner(System.in);


        int choice = scanner.nextInt();

        while (true){
            if(choice == 1) {
                String a = scanner.next();
                String b = scanner.next();
                int c = scanner.nextInt();

                bookstore.addBook(new Book(a,b,c));

            }
            if(choice == 2) {

                bookstore.displayBooks();

            }
            if(choice == 3){
                String a = scanner.next();
                bookstore.deleteBook(a);
            }
            if(choice == 4){
                String t = scanner.next();
                String a = scanner.next();
                String b = scanner.next();
                int c = scanner.nextInt();

                bookstore.updateBook(t,a,b,c);

            }
            if(choice == 5) {
                System.exit(0);
            }
        }


     
    }
}
