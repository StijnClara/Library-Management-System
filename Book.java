public class Book {
    private int id;
    private String title;
    private String author;
    private boolean isBorrowed;

    public Book(int id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.isBorrowed = false;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isBorrowed() {
        return isBorrowed;
    }
    public void borrowBook(){
        if(!isBorrowed) {
            isBorrowed = true;
        } else {
            System.out.println("The book is already borrowed.");
        }
    }
    public void returnBook() {
        if (isBorrowed) {
            isBorrowed = false;
        } else {
            System.out.println("The book was not borrowed.");
        }
    }

    @Override
    public String toString() {
        return "Book ID: " + id + ", Title: " + title + ", Author: " + author + ", Borrowed: " + isBorrowed;
    }
}