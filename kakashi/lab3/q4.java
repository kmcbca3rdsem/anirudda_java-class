package kakashi.lab3;

import java.util.Scanner;

class Product {
    String name;
    double price;
    String category;

    Product(String name, double price, String category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }
}

class Shop {
    void applyDiscount(Product p) {
        if (p.price > 5000) {
            p.price = p.price - (p.price * 0.15);
        }
        System.out.println("Final Price: " + p.price);
    }
}

public class q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Product Name:");
        String name = sc.nextLine();

        System.out.println("Enter Price:");
        double price = sc.nextDouble();
        sc.nextLine();

        System.out.println("Enter Category:");
        String category = sc.nextLine();

        Product p = new Product(name, price, category);
        Shop s = new Shop();

        s.applyDiscount(p);
    }
}
