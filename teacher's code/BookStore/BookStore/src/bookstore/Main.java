package bookstore;

import java.time.Year;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Main.
 *
 * @author hasu
 */
public class Main {

    private BookStore bookStore = new BookStore();

    private void stubData() {
        try {
            bookStore.add(new Book(
                    "B001",
                    "Book 1",
                    List.of(new Author("A001", "Author 1")),
                    Category.LITERARY,
                    120000F,
                    new Publisher("P001", "Publisher 1", "phone 1", "address 1"),
                    Year.of(2000)));

            bookStore.add(new Book(
                    "B002",
                    "Book 2",
                    List.of(new Author("A002", "Author 2")),
                    Category.CHILDREN,
                    130000F,
                    new Publisher("P002", "Publisher 2", "phone 2", "address 2"),
                    Year.of(2001)));

            bookStore.add(new Book(
                    "B003",
                    "Book 3",
                    List.of(new Author("A003", "Author 3")),
                    Category.CHILDREN,
                    120000F,
                    new Publisher("P003", "Publisher 3", "phone 3", "address 3"),
                    Year.of(2003)));

            bookStore.add(new Book(
                    "B004",
                    "Book 4",
                    List.of(new Author("A001", "Author 1")),
                    Category.NOVEL,
                    120000F,
                    new Publisher("P001", "Publisher 1", "phone 1", "address 1"),
                    Year.of(2000)));

            bookStore.add(new Book(
                    "B005",
                    "Book 5",
                    List.of(new Author("A002", "Author 2")),
                    Category.NOVEL,
                    130000F,
                    new Publisher("P002", "Publisher 2", "phone 2", "address 2"),
                    Year.of(2001)));

            bookStore.add(new Book(
                    "B006",
                    "Book 6",
                    List.of(new Author("A003", "Author 3")),
                    Category.NOVEL,
                    120000F,
                    new Publisher("P003", "Publisher 3", "phone 3", "address 3"),
                    Year.of(2003)));

        } catch (BookStoreException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        for (IBook book : bookStore.getBookList()) {
            book.output();
        }
    }

    private void filterByAuthor() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Author id: ");
        String authorId = sc.nextLine();
        List<IBook> filterList = this.bookStore.filterByAuthor(authorId);
        for (IBook iBook : filterList) {
            iBook.output();
        }
    }

    private void filterByCategory() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Category id: ");
        String category = sc.nextLine();
        List<IBook> filterList = this.bookStore.filterByCategory(Category.valueOf(category.toUpperCase()));
        for (IBook iBook : filterList) {
            iBook.output();
        }
    }

    private void filterByPublisher() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Publisher id: ");
        String publisherId = sc.nextLine();
        List<IBook> filterList = this.bookStore.filterByPublisher(publisherId);
        for (IBook iBook : filterList) {
            iBook.output();
        }
    }

    private void shopwMenu() {
        System.out.println("(1) -> Filter by author");
        System.out.println("(2) -> Filter by category");
        System.out.println("(3) -> Filter by publisher");
        System.out.println("(0) -> Exit");
    }

    private void run() {
        stubData();
        
        Scanner sc = new Scanner(System.in);
        int option;
        do {
            shopwMenu();
            System.out.print("Please enter your choie:");
            option = sc.nextInt();
            switch (option) {
                case 1:
                    filterByAuthor();
                    break;
                case 2:
                    filterByCategory();
                    break;
                case 3:
                    filterByPublisher();
                    break;
                default:
                    option = 0;
            }

        } while (option != 0);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new Main().run();
    }
}
