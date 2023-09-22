import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    static ArrayList<Book> bookArrayList = new ArrayList<>();
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        Book book1 = new Book("Harry potter", "JK Rowling", 1998, 10, true);
        Book book2 = new Book("Mumindalen", "Tove Jansson", 1967, 2, true);
        Book book3 = new Book("Låg affektivt bemötande", "Bo hejlskog", 1996, 3, true);
        Book book4 = new Book("Mera självkänsla", "Mia törnblom", 2001, 3, true);
        Book book5 = new Book("Kurts äventyr", "Ragnar Ragnarsson", 2009, 4, true);

        bookArrayList.add(book1);
        bookArrayList.add(book2);
        bookArrayList.add(book3);
        bookArrayList.add(book4);
        bookArrayList.add(book5);
        for (Book book : bookArrayList) {
            System.out.println(book);
        }
        int choice=0;
        while(choice!=6) {
            System.out.println();
            System.out.println("Pick a choice! 1,2,3,4 or 5");
            System.out.println("1. Add a book to the library");
            System.out.println("2. Search for a book by name");
            System.out.println("3. List all available books");
            System.out.println("4. Loan a book");
            System.out.println("5. Return a book");
            System.out.println("6. Quit");
            choice = scan.nextInt();
            switch (choice) {
                case 1:
                    addBook();
                    break;
                case 2:
                    searchBook();
                    break;
                case 3:
                    listAvailableBooks();
                    break;

                case 4:
                    loanBook();
                    break;

                case 5:
                    returnBook();
                case 6:
                    System.out.println("6. Quit");
                    break;
            }
        }
    }

    public static void addBook() {
        System.out.println("1. Add a book to the library");
        scan.nextLine();
        System.out.println("Whats the name of the book?");
        String name = scan.nextLine();
        System.out.println("Whats the name of the author");
        String author = scan.nextLine();
        System.out.println("Which year is it from?");
        int year = scan.nextInt();
        System.out.println("How many editions of the book are there?");
        int edition = scan.nextInt();
        Book newBook = new Book(name, author, year, edition, true);
        bookArrayList.add(newBook);
        for (Book book : bookArrayList) {
           System.out.println(book);
        }

    }
    public static void searchBook() {
        System.out.println("2. Search for a book by name");
        scan.nextLine();
        String input = scan.nextLine();
        System.out.println("Books that that contain \"" + input + "\":");

        for (Book book : bookArrayList) {
            if (book.getName().contains(input) || book.getName().toLowerCase(Locale.ROOT).contains(input)) {
                System.out.println(book);
            } else {

            }
        }
    }
        public static void listAvailableBooks(){
            System.out.println("3. List all available books");
            scan.nextLine();
            System.out.println("List all available books");
            for (Book book : bookArrayList) {
                    if (book.available) {
                        System.out.println(book);
                    }
        }
    }
    public static void returnBook(){
        System.out.println("5. Return a book");

        scan.nextLine();
        for(int i=0;i<bookArrayList.size();i++) {
            System.out.println((i + 1) + ": " + bookArrayList.get(i));
        }
        System.out.println();
        System.out.println("Which book do you want to return?");
        int whichBooktoreturn= scan.nextInt()-1;
        for(int i =0; i<bookArrayList.size();i++)
        {
            bookArrayList.get(whichBooktoreturn).returnBook();
            System.out.println((i + 1) + ": " + bookArrayList.get(i));
        }
        System.out.println();
        System.out.println("You have returned: ");
        System.out.println(bookArrayList.get(whichBooktoreturn));
    }
    public static void loanBook(){
        System.out.println("4. Loan a book");
        scan.nextLine();
        for(int i=0;i<bookArrayList.size();i++) {
            System.out.println((i + 1) + ": " + bookArrayList.get(i));
        }
        System.out.println();
        System.out.println("Which book do you want to loan?");
        int whichBooktoloan= scan.nextInt()-1;
        for(int i =0; i<bookArrayList.size();i++)
        {
            bookArrayList.get(whichBooktoloan).loan();
            System.out.println((i + 1) + ": " + bookArrayList.get(i));
        }
        System.out.println();
        System.out.println("You have loaned: ");
        System.out.println(bookArrayList.get(whichBooktoloan));
    }
}