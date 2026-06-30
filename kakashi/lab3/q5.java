package kakashi.lab3;

import java.util.Scanner;

class Book {
    String title;
    String author;
    boolean available;

    Book(String title, String author, boolean available) {
        this.title = title;
        this.author = author;
        this.available = available;
    }
}

class Library {
    void issueBook(Book b) {
        if (b.available) {
            System.out.println("Book Issued");
        } else {
            System.out.println("Book Not Available");
        }
    }
}

public class q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Book Title:");
        String title = sc.nextLine();

        System.out.println("Enter Author:");
        String author = sc.nextLine();

        System.out.println("Is Book Available? (true/false):");
        boolean available = sc.nextBoolean();

        Book b = new Book(title, author, available);
        Library l = new Library();

        l.issueBook(b);
    }
}
