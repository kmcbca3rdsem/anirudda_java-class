package Assignment.Lab3;

public class ThrowKeywordDemo {
    static void checkAge(int age) {
        if (age < 18) {
            throw new ArithmeticException("Access denied - Age must be at least 18.");
        } else {
            System.out.println("Access granted - Age: " + age);
        }
    }

    public static void main(String[] args) {
        try {
            checkAge(15);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }

        checkAge(20);
    }
}