import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    static ArrayList<Book> bookArrayList = new ArrayList<>();
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        Library library=new Library();
        library.createdBooks();
        int choice=0;
        while(choice!=6) {
            System.out.println();
            System.out.println("Pick a choice! 1,2,3,4,5 or 6");
            System.out.println("1. Add a book to the library");
            System.out.println("2. Search for a book by name");
            System.out.println("3. List all available books");
            System.out.println("4. Loan a book");
            System.out.println("5. Return a book");
            System.out.println("6. Quit");
            choice = scan.nextInt();
            switch (choice) {
                case 1:
                    library.addBook();
                    break;
                case 2:
                    library.searchBook();
                    break;
                case 3:
                    library.listAvailableBooks();
                    break;

                case 4:
                    library.loanBook();
                    break;

                case 5:
                    library.returnBook();
                case 6:
                    System.out.println("6. Quit");
                    break;
            }
        }
    }
}