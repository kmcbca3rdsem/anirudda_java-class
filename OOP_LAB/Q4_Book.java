package OOP_LAB;

class Book {
    String title;
    String author;
    double price;

    void applyDiscount(double discountPercent) {
        price = price - (price * discountPercent / 100);
    }

    void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }

    public static void main(String[] args) {
        Book book = new Book();
        book.title = "Java Programming";
        book.author = "aniruddha";
        book.price = 500;

        book.applyDiscount(10);
        book.display();
    }
}
