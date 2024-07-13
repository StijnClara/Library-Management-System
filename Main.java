import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Library library = new Library();

        while (true) {
            System.out.println("Library Management System:");
            System.out.println("1: Add Book");
            System.out.println("2: View Books");
            System.out.println("3: Add User");
            System.out.println("4: Borrow Book");
            System.out.println("5: Return Book");
            System.out.println("6: Exit");
            int choice = scanner.nextInt();

            switch(choice) {
                case 1:
                    System.out.println("Enter Book ID:");
                    int bookId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Enter Book Title:");
                    String bookTitle = scanner.nextLine();
                    System.out.println("Enter Book Author:");
                    String bookAuthor = scanner.nextLine();
                    library.addBook(new Book(bookId, bookTitle, bookAuthor));
                    break;
                case 2:
                    library.viewBooks();
                    break;
                case 3:
                    System.out.println("Enter User ID:");
                    int userId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Enter User Name:");
                    String userName = scanner.nextLine();
                    library.addUser(new User(userId, userName));
                    break;
                case 4:
                    System.out.println("Enter User ID:");
                    userId = scanner.nextInt();
                    System.out.println("Enter Book ID:");
                    bookId = scanner.nextInt();
                    library.borrowBook(userId, bookId);
                    break;

                case 5:
                    System.out.println("Enter User ID:");
                    userId = scanner.nextInt();
                    System.out.println("Enter Book ID:");
                    bookId = scanner.nextInt();
                    library.returnBook(userId, bookId);
                    break;

                case 6:
                    System.out.println("Exiting the system. Goodbye!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice! Please select the valid option.");
            }
        }
    }
}