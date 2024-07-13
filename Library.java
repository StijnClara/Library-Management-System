import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;
    private List<User> users;

    public Library() {
        this.books = new ArrayList<>();
        this.users = new ArrayList<>();
    }
    public void addBook(Book book) {
        books.add(book);
    }
    public void viewBooks() {
        for (Book book : books) {
            System.out.println(book);
        }
    }
    public void addUser(User user){
        users.add(user);
    }

    public User getUser(int userId) {
        for(User user: users){
            if (user.getId() == userId){
                return user;
            }
        }
        return null;
    }

    public Book getBook(int bookId) {
        for (Book book : books) {
            if (book.getId() == bookId){
                return book;
            }
        }
        return null;
    }
    public void borrowBook(int userId, int bookId){
        User user = getUser(userId);
        Book book = getBook(bookId);

        if(user != null && book != null) {
            user.borrowBook(book);
        } else {
            System.out.println("Invalid user or book ID.");
        }
    }
    public void returnBook(int userId, int bookId) {
        User user = getUser(userId);
        Book book = getBook(bookId);

        if (user != null && book != null) {
            user.returnBook(book);
        } else {
            System.out.println("Invalid user or book ID.");
        }
    }
}
