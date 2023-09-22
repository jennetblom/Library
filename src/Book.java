import java.util.Scanner;

public class Book {
////    I denna uppgift ska vi skapa ett enkelt bokningssystem för ett bibliotek. Vi ska börja med
//    att skapa en klass som heter Book. Varje bok ska ha:
// - Ett namn
//- En författare
//- Ett år
//- En upplaga
//- Status: tillgänglig eller inte

    //    Status ska vara tillgänglig by default när en bok skapas.
//    En metod loan som kollar om en bok går att låna eller inte(dvs tillgänglig eller inte) och göra följande:
//    Om boken är tillgänglig, då ska bokens status ändras till otillgänglig och metoden ska returnera true. Annars returnera false
//
//    En metod returnBook som gör motsatsen till loan.
//    En toString metod som returnerar en sträng med bokinformationen.
    Scanner scan1 = new Scanner(System.in);

    private String name;
    private String author;
    private int year;
    private int edition;
    boolean available;

    public Book(String name, String author, int year, int edition, boolean available) {
        this.name = name;
        this.author = author;
        this.year = year;
        this.edition = edition;
        this.available = available;
    }

    public Book(String name, String author) {
        this.name = name;
        this.author = author;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return this.author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getEdition() {
        return this.edition;
    }

    public void setEdition(int edition) {
        this.edition = edition;
    }

    public boolean loan() {
        if (this.available == true) {
            this.available = false;
            return true;
        } else {
            return false;
        }
    }

    public boolean returnBook() {
        this.available = true;
        return true;
    }

    public String scanMethod() {
        return scan1.nextLine();
    }

    public String toString() {
        if (available == true) {
            return "Name: " + name + " Author: "+ author +" Year: " + year + " Edition: " + edition + " Available: yes";
        } else {
            return "Name: " + name + " Author: "+ author+ " Year: " + year + " Edition: " + edition + " Available: no";
        }
    }
}


