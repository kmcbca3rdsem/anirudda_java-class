package lab3;

public class Main {
    public static void main(String[] args) {

        // Create object using parameterized constructor
        Animal animal1 = new Animal("Dog", 3);

        // Access methods
        System.out.println("Name: " + animal1.getName());
        System.out.println("Age: " + animal1.getAge());

        // Call birthday method
        animal1.birthday();
    }
}
