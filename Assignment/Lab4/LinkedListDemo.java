package Assignment.Lab4;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> fruits = new LinkedList<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Orange");
        fruits.add("Guava");

        System.out.println("Fruits in the LinkedList:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}