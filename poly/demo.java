package poly;

public class demo {
    public static void main(String[] args) {
        animal a;          // parent class reference

        a = new animal();
        a.sound();         // calls Animal sound

        a = new cat();
        a.sound();         // calls Cat sound (polymorphism)
    }
}
