package lab2;

class Books {
    String title;
    String author;
    double price;

    Books(String t, String a, double p) {
        title = t;
        author = a;
        price = p;
    }

    void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }
}

public class bookdemo {
    public static void main(String[] args) {

        Books[] b = new Books[5];

        b[0] = new Books("Hidden Forest", "Alex", 420);
        b[1] = new Books("Digital Storm", "Dipesh", 510);
        b[2] = new Books("Rise of Logic", "Supreme", 680);
        b[3] = new Books("Quantum Dreams", "Aniruddha", 590);
        b[4] = new Books("Neon Shadows", "Matrix", 640);

        Books max = b[0];

        for(int i = 1; i < 5; i++) {
            if(b[i].price > max.price) {
                max = b[i];
            }
        }

        System.out.println("Book with Highest Price:");
        max.display();
    }
}
