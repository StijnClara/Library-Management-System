import java.util.ArrayList;
import java.util.List;

public class User {
    private int id;
    private String name;
    private List<Book> borrowedBooks;

    public User(int id, String name) {
        this.id = id;
        this.name = name;
        this.borrowedBooks = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<Book> getBorrowedBooks() {
        return borrowedBooks;
    }
    public void borrowBook(Book book) {
        if (!book.isBorrowed()) {
            book.borrowBook();
            borrowedBooks.add(book);
        } else {
            System.out.println("The book is already borrowed by someone else.");
        }
    }
    public void returnBook(Book book){
        if (borrowedBooks.contains(book)) {
            book.returnBook();
            borrowedBooks.remove(book);
        } else {
            System.out.println("This book was not borrowed by the user.");
        }
    }

    @Override
    public String toString() {
        return "User ID: " + id + ", Name: " + name + ", Borrowed Books: " + borrowedBooks.size();
    }
}
